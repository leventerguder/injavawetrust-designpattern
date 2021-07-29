# Abstract Factory Pattern

## GoF Definition

Provide an interface for creating families of related or dependent objects without specifying
their concrete classes.

## Concept

This is basically a factory of factories that provides one level of higher abstraction than
the factory method pattern.
This patterns helps us to interchange specific implementations without changing the code
that uses them,even at runtime.

This pattern provides a way to encapsulate a group of individual factories that have a common theme.
Here a class does not create the objects directly; instead, it delegates the task to a factory object.

The simple factory pattern creates a set of related objects. In a similar way , since an abstract factory
is basically a factory of factories, it returns factories that create a set of related objects.

## Computer-World Example

To understand this pattern , I'll extend the requirement in the factory method pattern.
In factory method pattern , we had two factories : one created dogs and the other created tigers.
But now , you want to categorize dogs and tigers further.
You may choose a domestic animal (dog or tiger) or a wild animal (dog or tiger) through these factories.
To fulfill that demand , I introduce two concrete factories : WildAnimalFactory and PetAnimalFactory.

The newInstance() method of javax.xml.parsers.DocumentBuilderFactory
is an example of the abstract factory pattern in JDK. The newInstance() method
of javax.xml.transform.TransformerFactory is another such example in this context.

## Questions & Answers

1 - I am seeing that both the dog and the tiger interfaces contain methods 
that have the same names (both interfaces contain the speak() and the preferredAction() methods.
Is it mandatory?

No. You can use different names for your methods.
Also, the number of methods can be different in these interfaces.

2 - What are the challenges of using an abstract factory like this ?
Any change in the abstract forces us to propagate the modification of the concrete factories.
If you follow the design philosophy that says program to an interface, not to an implementation , you need to prepare
for this.
This is one of the key principles that developers always keep in mind.
In most scenarios , developers do not want to change their abstract factories.

The overall architecture may look complex. Also, debugging becomes tricky in some scenarios.

3 - How can you distinguish a simple factory pattern from a factory method pattern or an abstract factory pattern ?

Simple Factory Pattern Code Snippet

<pre>
Animal preferredType=null;
SimpleFactory simpleFactory = new SimpleFactory();
// The code that will vary based on users preference.
preferredType = simpleFactory.createAnimal();

</pre>

Factory Method Pattern Code Snippet

<pre>
// Creating a Tiger Factory
AnimalFactory tigerFactory =new TigerFactory();
// Creating a tiger using the Factory Method
Animal aTiger = tigerFactory.createAnimal();
//...Some code in between...
// Creating a DogFactory
AnimalFactory dogFactory = new DogFactory();
// Creating a dog using the Factory Method
Animal aDog = dogFactory.createAnimal();
</pre>


Abstract Factory Pattern Code Snippet

<pre>
AnimalFactory myAnimalFactory;
Dog myDog;
Tiger myTiger;
System.out.println("***Abstract Factory Pattern Demo***\n"); 
//Making a wild dog through 
WildAnimalFactory myAnimalFactory = new WildAnimalFactory();
myDog = myAnimalFactory.createDog();
//Making a wild tiger through WildAnimalFactory
myTiger = myAnimalFactory.createTiger();
//Making a pet dog through PetAnimalFactory
myAnimalFactory = new PetAnimalFactory();
myDog = myAnimalFactory.createDog();
//Making a pet tiger through PetAnimalFactory
myTiger = myAnimalFactory.createTiger();
myTiger.speak();
myTiger.preferredAction();
</pre>

With simple factory , you can separate the code that varies from the rest of the code , (basically, you decouple the client codes)
This approach helps you easily manage your code. Another key advantage of this approach is that 
the client is unaware of how the objects are created.
So, it promotes both security and abstraction.
But it can violate the open-close principle.

You can overcome this drawback using the factory method pattern that allows subclasses to decide how the instantiation
process is completed. In other words, you delegate the objects creation to the subclasses that implement the factory method to create objects.

The abstract factory is basically a factory of factories. It creates the family of related objects but it does not depend on
the concrete classes.

The factory method promotes inheritance ; their subclasses need to implement the factory method to create objects.
The abstract factory pattern promotes object composition, where you compose classes using the concrete instances of an abstract factory.

Each of these factories promote loose coupling by reducing the dependencies on concrete classes.
