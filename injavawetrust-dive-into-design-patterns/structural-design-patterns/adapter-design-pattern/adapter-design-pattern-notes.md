# Adapter Design Pattern

Also known as : Wrapper

Adapter is a structural design pattern that allows objects with incompatible interfaces to collaborate.

An adapter wraps one of the objects to hide the complexity of conversion happening behind the scenes.
The wrapped object isn't even aware of the adapter.

Adapters can not only convert data into various formats but can also help objects with different interfaces collaborate.

1 - The adapter gets an interface, compatible with one of existing objects.
2 - Using this interface , the existing object can safely call the adapter's methods.
3 - Upon receiving a call, the adapter passes the request to the second object , but in a format
and order that the second object expects.

## Applicability

Use the Adapter class when you want to use some existing class, but its interface isn't compatible with the rest of your code.

The Adapter pattern lets you create a middle-layer class that serves as a translator between your code and a legacy class
a 3rd-party class or any other class with a weird interface.

Use the pattern when you want to reuse several existing subclasses that lack some common functionality that can't be added
to the superclass.

You could extend each subclass and put the missing functionality into new child classes.
However, you'll need to duplicate the code across all of these new classes, which smelly really bad.

The much more elegant solution would be put the missing functionality into an adapter class.
Then you would wrap objects with missing features inside the adapter, gaining needed features dynamically.
For this to work , the target classes must have a common interface, and the adapter's field should follow that interface.
This approach looks very similar to the Decorator pattern.

## Pros and Cons

- Single Responsibility Principle = You can separate the interface or data conversion code from the primary business logic of the program.
- Open/Closed Principle. You can introduce new types of adapters into the program without breaking the existing client code,
as long as they work with the adapters through the client interface.
- The overall complexity of the code increases because you need to introduce a set of new interfaces and classes.
Sometimes it's simpler just to change the service class so that it matches the rest of your code.

## Relations with Other Patterns

- Bridge is usually designed up-front, letting you develop parts of an application independently of each other.
On the other hand, Adapter is commonly used with an existing app to make some  otherwise-incompatible classes work together nicely.
- Adapter changes the interface of an existing object, while Decorator enhances an object without changing its interface.
In addition, Decorator supports recursive composition, which isn't possible when you use Adapter.
- Adapter provides a different interface to the wrapped object, Proxy provides it with same interface, and Decorator provides
it with an enhanced interface.
- Facade defines a new interface for existing objects, whereas Adapter tries to make the existing interface usable.
Adapter usually wraps just one object, while Facade works with an entire subsystem of objects.
- Bridge, State, Strategy (and to some degree Adapter) have very similar structures.
Indeed, all of these patterns are based on composition, which is delegating work to other objects.
However, they all solve different problems. A pattern isn't just a recipe for structuring your code in a specific way.
It can also communicate to other developers the problem the pattern solves.

## Adapter in Java

Adapter is a structural design pattern, which allows incompatible objects to collaborate.
The Adapter acts as a wrapper between two objects. It catches call for one object and transforms them to format
and interface recognizable by the second object.

The Adapter pattern is pretty common in Java code. It's very often used in systems based on some legacy code.
In such cases, Adapters make legacy code work with modern classes.

There are some standard Adapters in Java core libraries ;

- java.util.Arrays#asList()
- java.util.Collections#list
- java.util.Collections#enumeration()
- java.io.InputStreamReader(InputStream)
- java.io.OutputStreamWriter(OutputStream)
- javax.xml.bind.annotation.adapters.XmlAdapter#marshall()

Identification : Adapter is recognizable by a constructor which takes an instance of a different abstract/interface type
When the adapter receives a call to any of its methods, it translates parameters to the appropriate format and then directs 
the call one or several methods of wrapped object.


