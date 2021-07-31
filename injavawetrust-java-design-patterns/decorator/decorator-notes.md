# Decorator Pattern

## GoF Definition

Attach additional responsibilities to an object dynamically.
Decorators provide a flexible alternative to subclassing for extending functionality.


## Concept

This pattern says that the class must be closed for modification but open for extension;
that is, a new functionality can be added without disturbing existing functionalities.
The concept is very useful when we want to add special functionalities to a specific object 
instead of the whole class.

In this pattern , we try to use the concept of object composition instead of inheritance.
So, when we master this technique, we can add new responsibilities 
to an object without affecting the underlying classes.

## Computer-World Example

Suppose that in a GUI-based toolkit, we want to add some border properties.
We can do this with inheritance. But it can not be treated as an ultimate solution because the user
cannot have absolute control over this creation from the beginning.
So, the core choice is static in this case.

Decorators come into picture with a flexible approach. They promote the concept of dynamic choices
for example , we can surround the component in another object.
The enclosing object is called a decorator. It must conform to the interface of the component that is decorates.
It forwards the requests to the component. It can perform additional operations before or after the forwarding.

An unlimited number of responsibilities can be added with this concept.

java.io.BufferedOutputStream class can decorate any java.io.OutputStream object.
 
## Questions & Answers

1 -  Can you explain how composition is promoting a dynamic behavior that inheritance cannot ?

We know that when a derived class inherits from a parent class, it inherits the behavior of the base class at that time only.
Though different subclasses can extend tha base/parent class in different ways , this type of binding is known in compile-time
so the choice is static in nature. But the way that you used the concept of composition in the example lets you experiment with
dynamic behavior.

When we design a parent class , we may not have enough visibility about what kind of additional responsibilities our clients may
want in later phases. And our constraint is that we should not modify the existing code frequently.
In such a case , object composition not only outclasses inheritances, it also ensures that we are not introducing bugs 
to the existing architecture.

Lastly, in this context, you must remember on of the key design principles :
Classes should be open for extension but closed for modification.

2 - What are the key advantages of using a decorator ?
The existing structure is untouched, so that you are not intoducing bugs there.
New functionalities can be easily added to an existing object.
You do not need to predict/implement all the supported functionalities at the initial design phase.
You can develop incrementally ( add decorator objects one by one to support incremental needs)
You must acknowledge tha fact that if you make a complex class first, and then you try to extend the functionalities 
it will be a tedious process.

3 - How is the overall design pattern different from inheritance ?

You can add or remote responsibilities by simply attaching or detaching decorators.
But with a simple inheritance mechanism, you ned to create a new class for the new responsibilities.
So, it is possible that you may end up with a complex system.

Consider the example again. Suppose that you want to adda new floor, paint the house , and do some extra work.
To fullfill this need, you start with decorator2 because it is already providing the support add a floor to the existing
architecture, and then you can paint it.
So, you can add a simple wrapper to complete those additional responsibilities.

But if you start with inheritance from beginning, then you may have multiple subclasses.

In this context, even if you consider multilevel inheritance , you discover that overall the inheritance mechanism is much more
challenging and time-consuming than the decorator pattern, and it may promote duplicate code in your application.

Lastly, you must remember that inheritance mechanism is promoting only compile-time binding(not the dynamic binding)

4 - Why can't multilevel score higher in previous context ?

Let's assume that the Paint class is derived from Additional Floor,
which in turn is derived from the Core Architecture.
Not if your client wants to paint the house without creating an additional floor,
the decorator pattern surely outclasses the inheritance mechanism because you can simply add a decorator to the existing
system that supports the paint only.

5 - Why are you creating a class with a single responsibility? 
You could make a subclass that can simply add a floor and then paint. 
In that case, you end up with fewer subclasses. Is this understanding correct?

if you are familiar with SOLID principles, you know that there is a principle called single responsibility.
The idea behind this principle is that each class should have a responsibility over a single part of the functionality
in the software.
The decorator pattern is very much effective when you use the single responsibility principle because you can simply 
add/remove responsibilities dynamically.

6 - What are the disadvantages associated with this pattern?
I believe that if you are careful enough, there is no significant disadvantage. 
But you must be aware of the fact that if you create too many decorators in the system, 
it will be hard to maintain and debug. So, in that case, it can create unnecessary confusion.

7 - In the example, there is no abstract method in the AbstractDecorator class. How is this possible?

In Java, you can have an abstract class without any abstract method in it, but the reverse is not true; that is, 
if a class contains at least one abstract method, 
then the class itself is incomplete and you are forced to mark it with the abstract keyword.

8 - In your example, instead of using concrete decorators, you could use the concept of polymorphism 
in the following way to generate the same output.

<pre>
System.out.println("Using a Floor decorator now."); 
//FloorDecorator floorDecorator = new FloorDecorator(); 
AbstractDecorator floorDecorator = new FloorDecorator(); 
floorDecorator.setTheComponent(withoutDecorator); 
floorDecorator.makeHouse();

</pre>

Is this correct?

Yes

9 - Is it mandatory to use decorators for dynamic binding only?

No. You can use both static and dynamic binding.
But dynamic binding is its strength , so I concentrated on it.
YOu may notice that the GoF definition also focused on dynamic binding only.

10 - You are using decorators to wrap your core architecture. Is this correct?

Yes. The decorators are wrapper code to extend the core functionalities of the application.
But the core architecture is untouched when you use them.
