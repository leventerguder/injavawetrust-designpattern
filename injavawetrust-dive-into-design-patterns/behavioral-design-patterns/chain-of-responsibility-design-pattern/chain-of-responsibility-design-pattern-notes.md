# Chain of Responsibility

Also known as : CoR , Chain of Command

Chain of Responsibility is a behavioral design pattern that lets you pass request along a chain of handlers. Upon
receiving a request, each handler decides either to process the request or to pass it to next handler in the chain.

This pattern allows multiple objects to handle the request without coupling sender class to concrete classes of the
receivers. The chain can be composed dynamically at runtime with any handler that follows a standard handler interface.

## Usage of the pattern in Java

The Chain if Responsibility pattern isn't a frequent guest in Java program since it's only relevant when code operates
with chains of objects.

javax.servlet.Filter#doFilter()
java.util.logging.Logger#log()

### Identification

The pattern is recognizable by behavioral methods of one group of objects tha indirectly call the same methods in other
projects, while all the objects follow the common interface.

## Solution

Like many other behavioral design patterns, the Chain of Responsibility relies on transforming particular behaviors into
stand-alone objects called handlers. In our case, each check should be extracted to its own class with a single method
that performs the check. The request, along with its data, is passed to this method an argument.

The pattern suggests that you link these handlers into a chain. Each linked handler has a field for storing a reference
o the next handler in the chain. In addition to processing a request handlers pass the request further along the chain.
The request travels along the chain until all handler have a chance to process it.

## Applicability

Use the Chain of Responsibility pattern when your program is expected to process different kinds of request in various
ways but the exact types of requests and their sequences are unknown beforehand.

The pattern lets you link several handlers into one chain and, upon receiving a request "ask" each handler whether it
can process it. This way all handlers get a chance to process the request.

Use the pattern when it's essential to execute several handlers in a particular order.

Since you can link the handlers in the chain in any order, all requests will get through the chain exactly as you
planned.

Use the CoR pattern when the set of handlers and their order are supposed to change at runtime.

If you provide setters for a reference field inside the handler classes, you'll be able to insert, remove or reorder
handlers dynamically.

## Pros and Cons

- You can control the order of request handling.
- Single Responsibility Principle. You can decouple classes that invoke operations from classes that perform operations.
- Open/Closed Principle. You can introduce new handlers into the app without breaking the existing client code.
- (-) Some requests may end up unhandled.

## Relations with Other Patterns

Chain of Responsibility, Command , Mediator and Observer address various ways of connecting senders and receivers of
requests:

- Chain of Responsibility passes a request sequentially along a dynamic chain of potential receivers until one of them
  handles it.
- Command establishes unidirectional connections between senders and receivers.
- Mediator eliminates direct connections between senders and receivers , forcing them communicate indirectly via
  mediator object.
- Observer lets receiver dynamically subscribe to and unsubscribe from receiving requests.

Chain of Responsibility is often used in conjuction with Composite. In this case, when a leaf component gets a request,
it may pass it through the chain of the parent components down to the root of the object tree.

Handlers in Chain of Responsibility can be implemented as Commands. In this case, you can execute a lot of different
operations over the same context object, represented by a request.

However, there's another approach where the request itself is a Command object. In this case, you can execute the same
operations in a series of different contexts linked into a chain.

Chain of Responsibility and Decorator have very similar class structures. Both patterns rely on recursive composition to
pass the execution through a series of objects. However, there are several crucial differences. The CoR handlers can
execute arbitrary operations independently of each other. They can also stop passing the request further at any point.
On the other hand, various Decorator can extend the object's behavior while keeping it consistent with the base
interface. In addition, decorators aren't allowed to break the flow of the request.
