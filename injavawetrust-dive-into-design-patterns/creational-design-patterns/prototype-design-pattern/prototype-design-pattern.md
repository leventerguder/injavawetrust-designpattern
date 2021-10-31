# Prototype

Prototype is a creational design pattern that lets you copy existing objects without making your code dependent
on their classes.

Say you have an object, and you want to create an exact copy of it. How would you do it ?
First, you have to create a new object of the same class. Then you have to go through all the fields of the original
object and copy their values over to the new object.

Nice ! But there's a catch. Not all objects can be copied that way because of the object's fields may be private and not
visible from outside of the object itself.

The Prototype pattern delegates the cloning process to the actual objects that are being cloned.
The pattern declares a common interface for all objects that support cloning. This interface lets you clone an object
without coupling your code to the class of that object. Usually, such an interface contains just a single clone method.

The implementation of the clone method is very similar in all classes. The method creates an object of the current class
and carries over all of the field values of the old object into the new one. You can even copy private fields because most
programming languages let objects access private fields of other objects that belong to the same class.

An object that supports cloning is called a prototype. When your objects have dozens of fields and hundreds of possible
configurations, cloning them might serve as an alternative to subclassing.

Here's how it works : you create a set of objects, configured in various ways. When you need an object like the one 
you've configured, you just clone a prototype instead of constructing a new object from scratch.


## Intent

- Specify the kinds of objects to create using a prototypical instance, and create new objects by copying this prototype.
- Co-opt one instance of a class for use as a breeder of all future instances.
- The new operator considered harmful.

## Problem

Application "hard wires" the class of object to create in each "new" expression.

## Discussion 

Declare an abstract base class that specifies a pure virtual "clone" method, and , maintains a dictionary of all "cloneable"
concrete derived classes. Any class that needs a "polymorphic constructor" capability: derives itself from the abstract base class
registers its prototypical instance, and implements the clone() operation.

The client then, instead of writing code that invokes the "new" operator on a hard-wired class name, calls a "clone" 
operation on the abstract base class, supplying a string or enumerated data type that designates the particular 
concrete derived class desired.

## Rules of thumb

- Sometimes creational patterns are competitors : there are cases when either Prototype or Abstract Factory could be
used properly. At other times they are complementary : Abstract Factory might store a set of Prototypes from which to clone
and return product objects. Abstract Factory , Builder , and Prototype can use Singleton in their implementations.

- Abstract Factory classes are often implemented with Factory Methods, but they can be implemented using Prototype.

- Factory Method : creation through inheritance. Prototype : creation through delegation.

- Often, design start out using Factory method (less complicated , more customizable, subclasses proliferate) and evolve
towards Abstract Factory , Prototype , or Builder (more flexible, more complex) as the designer discovers where more flexibility
is needed.

- Prototype doesn't require subclassing, but it does require an "initialize" operation. 
Factory Method requires subclassing, but doesn't require Initialize.

- Designs that make heavy use of the Composite and Decorator patterns often can benefit from Prototype as well.

- Prototype co-opts one instance of a class for use as a breeder of all future instances.

- Prototypes are useful when object initialization is expensive, and you anticipate few variations on the initialization parameters. 
In this context, Prototype can avoid expensive "creation from scratch", and support cheap cloning of a pre-initialized prototype.

- Prototype is unique among the other creational patterns in that it doesn't require a class – only an object. 
Object-oriented languages like Self and Omega that do away with classes completely rely on prototypes for creating new objects.

