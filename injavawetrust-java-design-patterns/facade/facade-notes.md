# Facade Pattern

## GoF Definition
Provide a unified interface to set of interfaces in a subsystem.
Facade defines a higher level interface that makes the subsystem easier to use.

## Concept

Facades make a client's life easier.
Suppose that there is a complex system where multiple objects need to perform a series of tasks ,
and you need to interact with the system.

In a situation like this, facade can provide you a simplified interface that takes care of everything
As a result, instead of interacting with multiple objects in a complicated way, you just interact with a single object.

It is one of those patterns that supports loose coupling.
Here you emphasize the abstraction and hide the complex details by exposing a simple interface.
As a result, the code becomes clearer and more attractive.

## Computer World Example

Think about a situation where you use a method from a library.
You do not care how the method is implemented in the library.
You just call the method to experiment the easy usage of it.

You can use the concept of facade design pattern effectively to make your JDBC application attractive.
You can consider the java.net.URL class as an example of a facade pattern implementation.
Consider the shorthand openStream() or getContent() methods in this class. 
The openStream() method returns openConnection().getInputStream() and the getContent() method returns 
openConnection.getContent().The getInputStream() and getContent() methods are further defined 
in the URLConnection class.

## Questions & Answers

1 - What are key advantages of using a facade pattern?

If a system consists of many subsystems, managing all those subsystems becomes very tough and clients
may find their life difficult to communicate seperately with each of these subsystems.
In this scenario , facade patterns are very much handy.
It provides a simple interface to clients.
In simple words, instead of presenting complex subsystems, you present one simplified interface to clients.
This approach also promotes weak coupling by separating a client from the subsystems.

It can also helpy you to reducte the number of objects that a client needs to deal with.

2 - I see the facade class is using compositions. Is this intentional ?

Yes. With this approach, you can easily access the methods in each subsystem.

3 - It appears to me that facades do not restrict us to directly connect with subsystems.
Is this understanding correct?

Yes. A facade does not encapsulate the subsystem classes or interfaces.
It just provides a simple interface(or layer) to make your life easier.
You are free to expose any functionality of the subsystem , but in those cases
your code may look dirty , and at the same time , you lose all the benefits associated with this pattern.

4 - How is it different from adapter design pattern?

In the adapter pattern , you try to alter an interface so that the clients do not feel the difference
between the interfaces.
The facade pattern simplifies the interface. They present the client a simple interface to interact with
(instead of a complex subsystem).

5 - There should be only one facade for a complex subsystem. Is this correct ?

Not at all. You can create any number of facades for a particular subsystem.

6 -  Can I add more stuffs/logic with a facade?

Yes , you can.

7 - What are the challenges associated with a facade pattern?

Subsystems are connected with the facade layer.
So, you need to take care of an additional layer of coding

When the internal structure of a subsystem changes , you need to incorporate 
the changes in the facade layer also.

Developers need to learn about this new layer, whereas some of them may already
be aware of how to use the subsystems/APIs efficiently.

8 - How is it different from the mediator design pattern?

In a mediator pattern implementation, subsystems are aware of the mediator.
They talk to each other.
But in a facade, subsystems are not aware of the facade and the one-way communication is provided 
from facade to the subsystem(s)


9 - It appears to me that to implement a facade pattern, I have to write lots of code. 
Is this understanding correct? 

Not at all. It depends on the system and corresponding functionalities. 
For example, in the preceding implementation, if you consider only one type of robot (either Milano or Robonaut), 
and if you do not want to provide the destruction mechanism
of robots, and if you want to ignore the instruction manuals
(two static methods in this example), your code size will drop significantly. 












