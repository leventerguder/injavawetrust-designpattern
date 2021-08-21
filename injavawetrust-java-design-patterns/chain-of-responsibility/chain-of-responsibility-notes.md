# GoF Definition

Avoid coupling the sender of a request to its receiver by giving more than one object a chance to handle the request. 
Chain the receiving objects and pass the request along the chain until an object handles it.

## Concept

In this pattern, you form a chain of objects where each object in the chain handles a particular kind of request. 
If an object cannot handle the request fully, it passes the request to the next object in the chain. 
The same process may follow until the end of a chain is reached. This kind of request handling mechanism gives you 
the flexibility to add a new processing object (handler) at the end of the chain.

## Computer World Example

Consider a software application (e.g., a printer) that can send emails and faxes. 
So, customers can report faxing issues or email issues. Let’s assume that these issues
are handled by handlers. So, you introduce two different types of error handlers: EmailErrorHandler and FaxErrorHandler. 
You can assume that EmailErrorHandler handles email errors only; it cannot fix the fax errors. 
In a similar manner, FaxErrorHandler handles fax errors and does not care about email errors.

So, you may form a chain like this: whenever the application finds an error, 
it raises a ticket and forwards the error with a hope that one of the handlers will handle it. 
Let’s assume that the request first comes to FaxErrorhandler. 
If this handler agrees that the error is a fax issue, it handles it; otherwise, 
the handler forwards the issue to EmailErrorHandler.

Note that the chain ends with EmailErrorHandler. 
But if you need to handle a different type of issue—for example, authentication issues 
(which can occur due to security vulnerabilities), you can make a handler called AuthenticationErrorHandler 
and place it after EmailErrorHandler. Now if an EmailErrorHandler cannot fix the issue completely, 
it forwards the issue to AuthenticationErrorHandler, and the chain ends there.

you are free to place these handlers in any order you choose in your application.

- Any of these handlers could process the request completely and control comes back.
- A handler cannot handle the request completely, so it passes the request to the next handlers. 
This way, you reach the end of the chain. So, the request is handled there. 
But if the request cannot be processed there, you cannot pass it further. 
(You may need to take special care for such a situation.)

You notice a similar mechanism when you are implementing an exception handling mechanism with 
multiple catch blocks in your Java application. 
If an exception occurs in a try block, the first catch block tries to handle it. If it cannot handle that type of exception, 
the next catch block tries to handle it, and the same mechanism is followed until the exception is handled properly by handlers 
(catch blocks). If the last catch block in your application is unable to handle it, an exception is thrown outside of this chain.

in java.util.logging.logger, you can see a different overloaded version of log() methods that supports a similar concept.
another built-in support can be seen in the dofilter (ServletRequest request, ServletResponse response, filterChain chain) 
interface method in javax.servlet.filter.

## Questions & Answers

1 -  In the example, what is the purpose of message priorities?

Good catch. Actually, you could ignore them because, for simplicity in the handlers, 
you are just searching for the words email or fax. 
These priorities are added to beautify the code. But instead of using separate handlers for email and fax, 
you could make a different kind of chain that handles the messages based on the priorities. 
In such a case, these priorities can be used more effectively.

2 - What are the advantages of using a chain-of-responsibility design pattern?

- You can have more than one object to handle a request. 
(Notice that if a handler cannot handle the whole request, it may forward the responsibility to the next handler in the chain).

- The nodes of the chain can be added or removed dynamically. 
Also, you can shuffle the order. For example, if you notice that the majority of issues are with email processing, 
then you may place EmailErrorHandler as the first handler in the chain to save the average processing time of the application.

- A handler does not need to know how the next handler in the chain will handle the request. It focuses only on its own handling mechanism.

- In this pattern, you are promoting loose coupling because it decouples the senders (of requests) from the receivers.

3 - What are the challenges associated with using the chain-of-responsibility design pattern?

- There is no guarantee that the request will be handled (fully or partially) because you may reach the end of the chain; 
but it is possible that you have not found any explicit receiver to handle the request.
- Debugging may become tricky with this kind of design.

4 - How can you handle the scenario where you have reached at the end of chain, but the request is not handled at all?

One simple solution is to use try/catch (or try/finally or try/catch/finally) blocks. 
You may put the handlers in these constructs. 
You may notice that a try block can be associated with multiple catch blocks also.


In the end, if no one can handle the request, you may raise an exception with the appropriate messages 
and catch the exception in your intended catch block to draw your attention (or handle it in some different way).

The GoF talked about Smalltalk’s automatic forwarding mechanism, doesNotUnderstand, in a similar context. 
If a message cannot find a proper handler, it is caught in doesNotUnderstand implementations that can be overridden 
to forward the message in the object’s successor, log it in a file, and store it in a queue for later processing, 
or you can simply perform any other intended operations. But you must make a note that by default, 
this method raises an exception that needs to be handled in a proper way.

5 - In short, if a handler cannot handle the request fully, it will pass it to the next handler. Is this correct?
Yes

6 - It appears that there are similarities between the observer pattern and the chain-of-responsibility pattern. Is this correct?

In an observer pattern, all registered users get notifications in parallel; but in a chain-of-responsibility pattern, 
objects in the chain are notified, one by one, in a sequential manner. 
This process continues until an object handles the notification fully (or you reach the end of the chain). 
