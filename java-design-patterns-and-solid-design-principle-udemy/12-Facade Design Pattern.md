# Facade Design Pattern

Client has to interact with a large number of interfaces and classes in a subsystem to get result.
So clients get tightly coupled with those interfaces & classes. Facade solves this problem.

Facade provides a simple and unified interface to a subsystem. Client interacts with just the facade now to get same
result.

Facade is not just one to one method forwarding to other classes.

## Implement a Facade

We start by creating a class that will server as a facade.

- We determine the overall "use cases" / tasks that the subsystem is used for.
- We write a method that exposes each "use case" or task.
- This method takes care of working with different classes of subsystem.

## Implementation Considerations

- A Facade should minimize the complexity of subsystem and provide usable interface.
- You can have an interface or abstract class for facade an client can use different subclasses to talk to different
  subsystem implementations.
- A facade is not replacement for regular usage of classes in subsystem. Those can be still used outside of facade. YOur
  subsystem class implementations should not make assumptions of usage of facade by client code.

## Design Considerations

- Facade is a great solution to simplify dependencies. It allows you to have a weak coupling between subsystem.
- If your only concern is coupling of client code to subsystem specific classes and not worried about simplification
  provided by a facade, then you can use abstract factory pattern in place of facade.

## Example of a Facade

The java.net.URL class is a great example of facade. Ths class provides a simple method called as openStream() and we
get an InputStream to the resource pointed at by the URL object.

This class takes care of dealing with multiple classes from the java.net package as well as some internal sun packages.

## Compare & Contrast with Adapter

Facade :

- Intent is to simplify the usage of subsystem for client code.
- Facade is not restricted by any existing interface. It often defines simple methods which handle complex interactions
  behind scenes.

Adapter :

- Adapter is meant to simply adapt an object to different interface.
- Adapter is always written to confirm to a particular interface expected by client code. It has to implement all the
  methods from interface and adapt them using existing object.

## Pitfalls

- Not a pitfall of the pattern itself but needing a facade in a new design should warrant another look at API design.
- It is often overused or misused pattern & can hide improperly designed API. A common misuse is to use them as "
  containers of related methods." So be on the lookout for such cases during code reviews.

## Summary

We use facade when using our subsystem requires dealing with lots of classes & interfaces for client. Using facade we
provide a simple interface which provides same functionality.

Facade is not a simple method forwarding but facade methods encapsulate the subsystem class interactions which otherwise
would have been done by client code.

A Facade should simplify the usage of a subsystem in application.
Role of facade is to simplify the usage of a subsystem and to decouple client code from other subsystem classes as much
as possible. Client code gets a simplified API.

Each method should correspond to use-case which client code can use.

Facade does not have to implement any specific interface, adapter must implement interface expected by client code. 