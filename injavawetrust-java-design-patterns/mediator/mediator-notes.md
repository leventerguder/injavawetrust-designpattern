# Mediator Pattern

## GoF Definition

Define an object that encapsulates how a set of objects interact. Mediator promotes loose coupling by keeping objects 
from referring to each other explicitly, and it lets you vary their interaction independently.

## Computer World Example

The execute() method inside the java.util.concurrent.Executor interface follows this pattern.
The different overloaded versions of various schedule() methods of the java.util.Times class also
can be considered to follow this pattern.


## Questions & Answers

1 - Why are you complicating the things? In the first example, each of the participants could talk to each other directly 
and you could bypass the use of mediator. Is this correct?

In this example, you have only three registered participants,
so it may appear that they can communicate with each other directly. 
But you may need to consider a relatively complicated scenario. 
For example, a participant can send a message to a target participant only if the target participant is in online mode 
(which is the common scenario for a chat server). So, with your proposed architecture, if they try to 
communicate with each other, each of them needs to maintain the status of all other participants before sending a message. 
And if the number of participants keeps growing, can you imagine the complexity of the system?

2 - What are advantages of using mediator patterns?

- You can reduce the complexity of objects’ communication in a system.
- The pattern promotes loose coupling.
- It reduces number of subclasses in the system.
- You can replace "many-to-many" relationship with “one-to- many” relationships, so it is much easier to read and understand. 
(Consider our first illustration in this context). And as an obvious effect, maintenance becomes easy.
- You can provide a centralized control through the mediator with this pattern.
- In short, it is always our aim to remove tight coupling (among objects) from our code and this pattern scores high in this context.

3 - What are the disadvantages of using mediator patterns?

- In some cases, implementing the proper encapsulation is tricky.
- The mediator object's architecture may become complex if you put too much logic inside it. 
An inappropriate use of the mediator pattern may end up with a "God Class" antipattern.
- Sometimes maintaining the mediator becomes a big concern.

4 - If you need to add a new rule or logic, you can directly add it to the mediator. Is this correct?
Yes

5 - I am finding some similarities in the facade pattern and the mediator pattern. Is this correct?
Yes. 

6 - In this pattern, you are reducing the number of interconnections among various objects. 
What key benefits have you achieved due to this reduction?

More interconnections among objects can make a monolithic system where the system’s behavior is difficult to change 
(the system’s behavior is distributed among many objects). As a side effect, you may need to 
create many subclasses to bring those changes in the system.

7 - In the modified implementations, you are using Thread. Sleep(1000). What is the reason for this?

You can ignore that. I used it to mimic a real-life scenario. 
I assume that participants are posting messages after reading a message properly and this activity takes a minimum of 1 second.

8 - In some applications, I have seen the use of a concrete mediator only. Is this approach OK?
The mediator pattern does not restrict you to use only a concrete mediator. 
But I like to follow the experts’ advice that says, “programming to the supertype (abstract class/interface) is a better approach,” 
and it can provide more flexibility in the long run.

9 - Can I simply say that if a class simply calls methods from multiple objects, it is a mediator?
Not at all. The key purpose of a mediator is to simplify the complex communications among objects in a system. 
I suggest that you always keep in mind the GoF definition and the corresponding concepts.

10 In the first implementation, both send methods (mediator and employees) are named sendMessage() but in the modified implementation, 
they are different—one is send() and the other is sendMessage(). Do I need to follow any specific naming convention?

No. Both are fine. It’s your choice.
