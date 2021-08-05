# Bridge Pattern

## GoF Definition

Decouple an abstraction from its implementation so that the two can vary independently.

## Concept

This pattern is also known as handle/body pattern, in which you separate an implementation
from its abstraction and build  separate inheritance structures for them.
Finally , you connect them through a bridge.

You must note that the abstraction and the implementation cna be represented either
through an interface or an abstract class, but the abstraction contains a reference to 
its implementer. 

Normally , a child of an abstraction is called a refined abstraction and a child of
an implementation is called a concrete implementation.

This bridge interface makes the functionality of concrete classes independent from
the interface implementer classes.
You can alter different kinds of classes structurally without affecting each other.

## Computer-World Example

GUI frameworks can use the bridge pattern to separate abstraction from platform 
specific implementation.

In Java, you may notice the use of JDBC, which provides a bridge between your
application and a particular database.
For example, the java.sql.DriverManager class and the java.sql.Driver interface
can form a bridge pattern where the first one plays the role of abstraction and the
second one plays the role of implementor.

## Questions & Answers

1 - This pattern looks similar to a state pattern. Is this correct ?

No. The state pattern falls into the behavioral pattern and its intent is different.
In this chapter , you have seen an example where the electronic items
can be in different states, but the key intent was to show that

- How you can avoid tight coupling between the items and their states.
- How you can maintain two different hierarchies and both of them 
can extend without making an impact to each other.


In addition to these points, you are dealing with multiple objects 
in which implementations are shared among themselves.

For a better understanding, go through the comments that are attached with this implementation. 
I am also drawing your attention to the DVD-specific doublePress() method. 
Notice that it is constructed with superclass methods, 
which in turn delegate the implementation to the implementor object (a state object in this case). 
This approach allows you to vary the abstraction and implementation independently, 
which is the key objective of the bridge pattern.

2 - You could use simple subclassing instead of this kind of design. Is this correct?

No. With simple subclassing, your implementations cannot vary dynamically. 
It may appear that the implementations behave differently with subclassing techniques, 
but actually, those kinds of variations are already bound to the abstraction at compile time.

3 - In this example, I see lots of dead code. Why are you keeping those?

Some developers prefer constructors over Getter/Setter methods. 
You can see the variations in different implementations. 
I am keeping those for your ready reference. You are free to use any of them.

4 - What are key advantages of using a bridge design pattern?

- The implementations are not bound to the abstractions.
- Both the abstractions and the implementations can grow independently.
- Concrete classes are independent from the interface implementer classes 
(i.e., changes in one of these does not affect the other). 
You can also vary the interface and the concrete implementations in different ways.

5 - What are the challenges associated with this pattern?
- The overall structure may become complex.
- Sometimes it is confused with the adapter pattern. 
(The key purpose of an adapter pattern is to deal with incompatible interfaces only.)

6 - Suppose I have only one state; for example, either OnState or OffState. 
In this case, do I need to use the State interface? 

No, it is not mandatory. GoF classified this case as a degenerate case of the bridge pattern.

7 - In this example, an abstract class is used to represent an abstraction and an interface is used for an implementation. 
Is it mandatory?

No. You can also use an interface for abstraction. 
Basically, you can use either of an abstract class or an interface for any of the abstractions 
or implementations.
