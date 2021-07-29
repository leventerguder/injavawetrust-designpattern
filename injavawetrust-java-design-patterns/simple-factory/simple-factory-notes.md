## Simple Factory Pattern

In object oriented programming , a factory is a special kind of object that can create other objects.
A factory can be invoked in many ways , but most often , it uses a method that can return objects with varying prototypes.

Any subroutine that can help create these new objects is a considered a factory. The ultimate purpose of using a factory
method is to abstract the object creational mechanism (or process) from consumers of the application.

## Computer - World Example

The simple factory pattern is very common to software applications , but before we proceed further, 
you must remember these points.

- A simple factory is not treated as a standard design pattern in the GoF's famous book , but the approach is common
to any application that you write where you want to separate the code that varies a lot from the part of code that does not vary.
  
- A simple factory is considered the simple form of factory method patterns (or abstract factory patterns).
So, you can assume that any application that follows either the factory method pattern or the abstract factory pattern
also supports the concept of simple factory pattern's design goals.
  
The static getInstance() method of the java.text.NumberFormat class is an example of this category.

## Questions & Answers

1 - In this example, the clients are delegating the objects' creations through the SimpleFactory.
But instead , they could directly create the objects with the new operator. Is this correct ?

No. These are the key reasons behind the preceding design.

- An important object-oriented design principle is to separate the part of your code that 
is most likely to change from the rest.
  
- In this case, only "the objects creational part" varies.
  I assume that these animals must speak and perform actions, and I do
  not need to vary that portion of code inside the client. 
  So, in the future, if you need to modify the creational process, you need to change only the createAnimal() method 
  of SimpleFactory class. This client code is unaffected due to those modifications.
  
2 - What are the challanges associated with this pattern ?

- Deciding which object to instantiate becomes complex over time.
In those cases, you should prefer the factory method pattern.
  
- If you want to add a new animal or delete an existing one , you need to modify createAnimal method
of the factory class. This approach clearly violates the open-closed principle (which basically says that
  your code should be open for extension but closed for modification) of SOLID principles.
  
3 - I learned that programming with an abstract class or interface is always a better practice.
So, to make a better implementation , you could write something like this:

<pre>
abstract class ISimpleFactory
   {
       public abstract IAnimal createAnimal() throws IOException;
   }
   class SimpleFactory extends ISimpleFactory
   {
       //rest of the code
   }

</pre>

Is this correct ?

Yes. Programming with the abstract class or an interface is always a better practice.
This approach can prevent you from future changes because any newly added classes can simply implement the interface
and settle down in the architecture through polymorphism.

But if you solely depend on concrete classes, you need to change your code when you want to integrate 
a new class in the architecture, and in such a case, 
you violate the rule that says that your code should be closed for modifications.

4 - Can you make the factory class (SimpleFactory) static ?

No. In java , you are not allowed to tag the word static with a top-level class.
In other words , by design , the compiler always complains about the top-level static classes in Java.
