# Command Pattern

## GoF Definition

Encapsulate a request as an object, thereby letting you parameterize clients with different request
queues , or log requests , and supports undoable operations.

## Concept
Here you encapsulate a method invocation process.
In general, four terms are associated : invoker , client , command , receiver.

A command object can invoke a method of the receiver in a way that is specific to that receiver’s class.
The receiver then starts processing the job.
A command object is separately passed to the invoker object to invoke the command.
The client object holds the invoker object and the command objects.
The client only makes the decision—which commands to execute—and then 
it passes the command to the invoker object (for that execution).

## Computer World Example

The real-world scenario for painting applies to Microsoft Paint. 
You can use the Menu or Shortcut keys to perform the undo/redo operations in those contexts.
Microsoft used this pattern in Windows Presentation Foundation (WPF). 

When you implement the run method of java.lang.Runnable interface , you are basically using the command design pattern.

## Questions & Answers

1 - In this example, you are dealing with a single receiver only. 
How can you deal with multiple receivers? 
And the GoF definition says that this pattern supports undoable operations. 
Can you show an example with a true undo operation using this pattern?

(demo.v2)

2 - In this modified program, two receivers are doing different things. Is this intentional?

Yes. It shows the power and flexibilities provided by the command design pattern. 
You can see that performDo() in these receivers actually performs different actions. 
For Receiver1, it is adding 2 with an existing integer, and for Receiver2, it is switching on
a machine. So, you may think that some other names like addNumber() and powerOn() would be more appropriate for them.

But in this case, I needed to work with both the receivers and their corresponding methods. 
So, I needed to use a common interface and common names that could be used by both receivers.

So, if you need to work with two different receivers that have different method names, 
you can replace them with a common name, use a common interface, and through polymorphism, you can invoke those methods easily

3 - Why do you need the invoker?

Most of the time, programmers try to encapsulate data and corresponding methods in object-oriented programming. 
But if you look carefully, you find that in this pattern, you are trying to encapsulate command objects. 
In other words, you are implementing encapsulation from a different perspective.

This approach makes sense when you deal with a complex set of commands.

Now let’s review the terms again. You create command objects
to shoot them to receivers and invoke some methods. But you execute those commands through an invoker, 
which calls the methods of the command object (e.g., executeCommand). 
But for a simple case, this invoker class is not mandatory; for example, 
consider a case in which a command object has only one method to execute and you are trying to 
dispense with the invoker to invoke the method. But the invokers may play an important role 
when you want to keep track of multiple commands in a log file (or in a queue).

4 - Why are you interested in keeping track of these logs?

They are useful if you want to do the undo or redo operations.

5 - What are the key advantages associated with command patterns?

- Requests for creation and the ultimate execution are decoupled. Clients may not know how an invoker is performing the operations.
- You can create macros (sequence of commands).
- New commands can be added without affecting the existing system.
- Most importantly, you can support the undo/redo operations.

6 - What are the challenges associated with command patterns?

- To support more commands, you need to create more classes. So, maintenance can be difficult as time goes on.
- How to handle errors or make a decision about what to do with return values when an erroneous situation occurs becomes tricky. 
A client may want to know about those. But here you decouple the command with client codes, 
so these situations are difficult to handle. The challenge becomes significant in a multithreaded environment 
- where the invoker is also running in a different thread.
