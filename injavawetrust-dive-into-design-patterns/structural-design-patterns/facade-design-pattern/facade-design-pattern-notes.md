# Facade Design Pattern

Facade is a structural design pattern that provides a simplified interface to a library, a framework , or any other complex
set of classes.


A Facade is a class that provides a simple interface to a complex subsystem which contains lots of moving parts.
A facade might provide limited functionality in comparison to working with subsystem directly.
However, it includes only those features that clients really care about.

## Identification

Facade can be recognized in a class that has a simple interface, but delegates most of the work other classes.
Usually, facades manage the full life cycle of objects they use.

## Real World Analogy

When you call a shop to place a phone order, an operator is your facade to all services and departments of the shop.
The operator provides you with a simple voice interface to the ordering system, payment gateways, and various delivery services.


## Applicability

- Use the Facade when you need to have a limited but straightforward to a complex subsystem.

Often, subsystems get more complex over time. Even apply design pattern typically leads to creating more classes.
A subsystem may become more flexible and easier to reuse in various contexts, but the amount of configuration and boilerplate
code it demands from a client grows ever larger.

- Use the Facade when you want to structure a subsystem into layers

Create a facades to define entry points to each level of a subsystems. You can reduce coupling between multiple subsystems
by requiring them to communicate only through facades.

## Pros and Cons

- (+) You can isolate your code from the complexity of a subsystem
- (-) A facade can become a Good Object couple to all classes of an app.


## Relations with Other Patterns

- Facade defines a new interface for existing objects, whereas Adapter tries to make the existing interface usable.
Adapter usually wraps just one object, while Facade works with an entire subsystem of objects.

- Abstract Factory can serve as an alternative to Facade when you only want to hide the way the subsystem objects are created
from the client code.

- Flyweight shows how to make a lots of little objects whereas Facade shows how to make a single object that represents an entire subsystem.

- Facade and Mediator have similar jobs : they try to organize collaboration between lots of tightly couple classes.

   - Facade defines a simplified interface to a subsystem of objects, but it doesn't introduce any new functionality.
   The subsystem itself is unaware of the facade. Objects within the subsystem can communicate directly.
   - Mediator centralizes communication between components of the system. The components only know the mediator object
    and don't communicate directly.

- A Facade class can often be transformed into a Singleton since a single facade object is sufficient in most cases.

- Facade is similar to Proxy in that both buffer a complex entity and initialize it on its own. Unlike Facade, Proxy has the same
interface as its service object, which makes them interchangeable.

## Usage Examples

The Facade pattern is common used in apps written in Java. It's especially handy when working with complex libraries.

javax.faces.context.FacesContext uses LifeCycle , ViewHandler, NavigationHandler classes under the hood, 
but most clients aren't aware of that.

javax.faces.context.ExternalContext uses ServletContext , HttpSession, HttpServletRequest, HttpServletResponse and others inside.


