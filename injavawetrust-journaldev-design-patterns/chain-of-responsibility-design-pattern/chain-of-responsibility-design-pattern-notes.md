# Chain of Responsibility Design Pattern

Chain of Responsibility Design Pattern is one of the behavioral design pattern.

Chain of Responsibility Pattern is used to achieve loose coupling in software design where a request from client is
passed to a chain of objects to process them.Then the object in the chain will decide themselves who will be processing
the request and whether the request is required to be sent to the next object in the chain or not.

## Chain of Responsibility Design Pattern Important Points

- Client doesn’t know which part of the chain will be processing the request and it will send the request to the first
  object in the chain. For example, in our program ATMDispenseChain is unaware of who is processing the request to
  dispense the entered amount.
- Each object in the chain will have it’s own implementation to process the request, either full or partial or to send
  it to the next object in the chain.
- Every object in the chain should have reference to the next object in chain to forward the request to, its achieved by
  java composition.
- Creating the chain carefully is very important otherwise there might be a case that the request will never be
  forwarded to a particular processor or there are no objects in the chain who are able to handle the request. In my
  implementation, I have added the check for the user entered amount to make sure it gets processed fully by all the
  processors but we might not check it and throw exception if the request reaches the last object and there are no
  further objects in the chain to forward the request to. This is a design decision.
- Chain of Responsibility design pattern is good to achieve lose coupling but it comes with the trade-off of having a
  lot of implementation classes and maintenance problems if most of the code is common in all the implementations.


## Chain of Responsibility Pattern Examples in JDK

- java.util.logging.Logger#log
- javax.servlet.Filter#doFilter