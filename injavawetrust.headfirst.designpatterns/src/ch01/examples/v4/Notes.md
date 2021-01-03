
So we know using inheritance hasn't worked out very well, since the duck
behavior keeps changing across the subclasses , and it's not appropriate for all subclasses 
to have those behaviors.

##### Design Principle #####
Identify the aspects of your application that vary and separate them from what stays the same.

in other words , if you've got some aspect of your code that is changing , say with every new requirement ,
then you know you've got a behavior that needs to be pulled out and separated from all the stuff that doesnt change.

Here's another way to thinkg about this principle :
take the parts that vary and encapsulate them, so that later you can alter or extend the parts that vary without affecting
those that don't.

All patterns provide a way to let some part of a system vary independently of all other parts.

Take what varies and "encapsulate" it so it won't affect the rest of your code.
Fewer unintended consequences from code changes and more flexibility in your systems!


##### Separating what changes from what stays the same #####

We know that fly() and quack() are the parts of the Duck class that vary across ducks
To separate these behaviors from the Duck class , we'll pull both methods out of the Duck class and create a new set
of classes to represent each behavior.

The Duck class is still the superclass of all ducks , but we are pulling out the fly and quack behaviors and putting
them into another class structure.

Now flying and quacking each get their own set of classes.

##### Designing the Duck Behaviors ##### 
We should include behavior setter methods in the Duck classes so that we can , say , 
change  MallardDuck's flying behavior  at runtime

##### Design Principle #####
Program to an interface , not an implementation
We will use an interface to represent each behavior - FlyBehavior , QuackBehavior

So this time it won't be the Duck classes that will implement the flying and quacking interfaces.
Instead, we'll make a set of classes whose entire reason for living is to represent a behavior
and it's behavior class , rather than the Duck class , that will implement the behavior interface.

the Duck subclasses will use a behavior represented by an interface (FlyBehavior , QuackBehavior)
so that the actual implementation of the behavior (in other words , the specific concrete behavior coded in the
class that implements the FlyBehavior or QuackBehavior) won't be locked into the Duck subclass.

## Program to an interface , really means Program to a supertype ##
The point is to exploit polymorphism by programming to a supertype so that the actual runtime object
isn't locked into the code.
Program to a supertype as the declared type of the variables should be a supertype , usually an abstract class or interface
so that the objects assigned to those variables can be of any concrete implementation of the supertype,
which means the class declaring them doesn't have to know about the actual object types!


Programming to an implementation 

Dog d = new Dog();
d.bark();


But programming to an interface/supertype

Animal animal = new Dog();
animal.makeSound();

We know it's a Dog , but we can now use the animal reference polymorphically.

Even better, rather than hard-coding the instantiation of the subtype like new Dog(), into the code
assign the concrete implementation object at runtime :

Animal animal = getAnimal();
animal.makeSound();

##### Implementing the Duck Behaviors #####
With this design(diagram3) , other types of objects can reuse our fly and quack behaviors 
because these behaviors are no longer hidden  away in our Duck classes.

And we can add new behaviors without modifying any of our existing behavior classes or touching any of the Duck classes
that use flying behaviors.

##### Integrating the Duck Behavior #####
The key is that a Duck will now delegate its flying and quacking behavior , 
instead of using quacking and flying methods defined in the Duck class (or subclass)

1 - First we'll add two instance variables to the Duck class callsed flyBehavir and quackBehavior
that are declared as the interface type.
Each duck object will set these variables polymorphically to reference the specifi behavior type it would like at runtime

We'll also remove the fly() and quack() methods from the Duck class (and any subclasses)
because we have moved this behavior out into the FlyBehavior and QuackBehavior classes.

We'll replace fly() and quack() in the Duck class with two similar methods , called performFly() and performQuack()
