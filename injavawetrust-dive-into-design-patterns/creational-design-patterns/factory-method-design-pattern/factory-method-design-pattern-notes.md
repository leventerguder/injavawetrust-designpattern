# Factory Method

Factory Method is a creational design pattern that provides an interface for creating objects in a superclass, but allows
subclasses to alter the type of objects that will be created.

The Factory Method pattern suggests that you replace direct object construction calls(using the new operator) with calls to
a special factory method. Don't worry : the objects are still created via the new operator , but it's being called from within
the factory method. Objects returned by a factory method are often referred to as "products."

As long as all product classes implement a common interface, you can pass their objects to the client code without breaking it.

## Applicability
    
- Use the Factory Method when you don't know beforehand the exact types and dependencies of the objects your code should work with.

    The Factory Method separates product construction code from the code that actually uses the product. Therefore, it's easier to extend
    the product construction code independently from the rest of the code.
    For example , to add a new product type  to the app , you'll only need to create a new creator subclass and override the factory method in it.

- Use the Factory Method when you want to provide users of your library of framework with a way to extend its internal components.
    
    Inheritance is probably the easiest way to extend the default behavior of a library or framework. But how would the framework recognize that your
    subclass should be used instead of a standard component?

    The solution is to reduce the code that constructs components across the framework into a single factory method and 
    let anyone override this method in addition to extending the component itself.

- Use The Factory Method when you want to save system resources by reusing existing objects instead of rebuilding them each time.

  You often experience this need when dealing with large, resource-intensive objects such as database connections, file systems, and network resources

## Pros and Cons

- You avoid tight coupling between the creator and the concrete products.
- Single Responsibility Principle. You can move the product creation code into one place in the program making the code easier to support
- Open/Closed Principle. You can introduce new types of products into the program without breaking existing client code.
- The code may become more complicated since you need to introduce a lot of new subclasses to implement the pattern. The best case scenario is when you're
  introducing the pattern into existing hierarchy of creator classes.
  
## Relations with Other Patterns

- Many designs start by using Factory Method and evolve toward AbstractFactory, Prototype or Builder.
- Abstract Factory classes are often based on a set of Factory Methods, but you can also use Prototype to compose the methods on these classes.
- You can use Factory Method along with Iterator to let collection subclasses return different types of iterators that are compatible with the collections.
- Prototype isn't based on inheritance, so it doesn't have its drawbacks. On the other hand, Prototype requires a complicated initialization of the clonen object.
Factory Method is based on inheritance but doesn't require an initialization step.
- Factory Method is a specialization of Template Method. At the same time , a Factory Method may serve as a step in a large Template Method.

## Usage of the pattern in Java

Factory Method is a creational design pattern which solves the problem of creating product objects without specifying their concrete classes.


Factory Method defines a method, which should be used for creating objects instead of direct constructor call (new operator).
Subclasses can override this method to change the class of objects that will be created.

The Factory Method pattern is widely used in Java code. It’s very useful when you need to provide a high level of flexibility for your code.

The pattern is present in core Java libraries:

- java.util.Calendar#getInstance()
- java.util.ResourceBundle#getBundle()
- java.text.NumberFormat#getInstance()
- java.nio.charset.Charset#forName()
- java.net.URLStreamHandlerFactory#createURLStreamHandler(String)
- java.util.EnumSet#of()
- javax.xml.bind.JAXBContext#createMarshaller()
