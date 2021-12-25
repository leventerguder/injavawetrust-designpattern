# Decorator Design Pattern 

Also known as Wrapper

Decorator is a structural design pattern that lets you attach new behaviors to objects by placing these objects inside
special wrapper objects that contain the behaviors.

Extending a class is the first thing that comes to mind when you need to alter an object's behavior.
However, inheritance has several serious caveats that you need to be aware of.

- Inheritance is static. You can't alter the behavior of an existing object at runtime.
You can only replace the whole object with another one that's created from a different subclass.
- Subclasses can have just one paren class. In most languages, inheritance doesn't let a class inherit behaviors of
multiple classes at the same time.

One of the ways to overcome these caveats is by using Composition instead of Inheritance.
With composition one object has a reference to another and delegates it some work, whereas with inheritance, the object
itself is able to do that work, inheriting the behavior from its superclass.

With composition, you can easily substitute the linked "helper" object with another, changing the behavior of the container
at runtime. An object can use the behavior of various classes, having references to multiple objects and delegating them all kinds of work.

Composition is the key principle behind many design patterns including the Decorator.

Wrapper is the alternative nickname for the Decorator pattern that clearly expresses the main idea of the pattern.
A "wrapper" is an object that can be linked with some "target" object.
The wrapper contains the same set of methods as the target and delegates to it all requests it receives.
However, the wrapper may alter the result by doing something either before or after it passes the request to the target.

## Real-World Analogy

Wearing clothes is an example of using decorators. When you're cold, you wrap yourself in a sweater.
If you're still  cold with a sweater, you can wear a jacket on top.

If it's raining you can put on a raincoat. All of these garments "extend" your basic behavior but aren't part of you,
and you can easily take off any piece of clothing whenever you don't need it.

## Applicability

- Use the Decorator pattern when you need to be able to assign extra behaviors to objects at runtime without breaking the
code that uses these objects.

The Decorator lets you structure your business logic into layers, create a decorator for each layer and compose objects
with various combinations of this logic at runtime.

The client code can treat all these objects in the same way, since they all follow a common interface.

- Use the pattern when it's awkward or not possible to extend an object's behavior using inheritance.

Many programming languages have the final keyword that can be used to prevent further extension of a class. 
For a final class, the only way to reuse the existing behavior would be to wrap the class with your own wrapper, using
the Decorator pattern.

## How to Implement

1 - Make sure your business domain can be represented as a primary component with multiple optional layers over it.
2 - Figure out what methods are common to both the primary component and the optional layers. Create a component interface
and declare those methods there.
3 - Create a concrete component class and define the 
4 - Create a base decorator class. It should have a field for storing a reference to a wrapped object. The field should be declared
with the component interface type to allow linking to concrete components as well as decorators.
The base decorator must delegate all work to the wrapped object.
5 - Make sure all classes implement the component interface.
6 - Create concete decorators by extending them from the base decorator. A concrete decorator must execute its behavior
before or after the call to the parent method.
7 - The client code must be responsible for creating decorators and composing them in the way the client needs.

## Pros and Cons

- You can extend an object's behavior without making a new subclass.
- You can add or remove responsibilities from an object at runtime.
- You can combine several behaviors by wrapping an object into multiple decorators.
- Single Responsibility Principle. You can divide a monolithic class that implements many possible variants of behavior into
several smaller classes.
- (-) It is hard to remove a specific wrapper from the wrappers stack.
- (-) It's hard to implement a decorator in such a way that its behavior doesn't depend on the order in the decorators stack.
- (-) The initial configuration code of layers might look pretty ugly.

## Relations with other Patterns

Adapter changes the interface of an existing object, while Decorator enhances an object without changing its interface.
In addition, Decorator supports recursive composition , which isn't possible when you use Adapter.

Adapter provides a different interface to the wrapped object, Proxy provides it with the same interface, and Decorator
provides it with an enhanced interface.

Chain of Responsibility and Decorator have very similar class structures.
Both patterns rely on recursive composition to pass the execution through a series of objects.
However , there are several crucial differences.

The CoR handlers can execute arbitrary operations independently of each other. They can also stop passing the request
further at any point. On the other hand, various Decorators can extend the object's behavior while keepig it consistent with
the base interface. In addition , decorators aren't allowed to break the flow of the request.

Composite And Decorator have similar structure diagrams since both rely on recursive composition to organize an open-ended number of objects.
A Decorator is like a Composite but only has one child component. There's another significant difference :
Decorator adds additional responsibilities to the wrapped object, while Composite just "sums up" its children's result's.

However , the pattern can also cooperate : you can use Decorator to extend the behavior of a specific object in the Composite tree.

Designs that make heavy of Composite and Decorator can often benefit from using Prototype.
Applying the pattern lets you clone complex structures instead of re-constructing them from scratch.

Decorator lets you change the skin of an object, while Strategy lets you change the guts.

Decorator and Proxy have similar structures, but very different intents. Both patterns are built on the composition principle
where one object is supposed to delegate some of the work to another.
The difference is that a Proxy usually manages the life cycle of its service object on its own, whereas the composition 
of Decorators is always controlled by the client.

# Usage of the pattern in Java

The Decorator is pretty standard in Java code, especially in code related to streams.

- All subclasses of java.io.InputStream, OutputStream  Reader and Writer have constructors that accept objects of their own type.
- java.util.Collections , methods checkedXXX() , synchronizedXX() and unmodifiableXXX().
- java.servlet.http.HttpServletRequestWrapper and HttpServletResponseWrapper

Identification : Decorator can be recognized by creation methods or constructor that accept objects of the same class or 
interface as a current class.

