# Abstract Factory

Abstract Factory is a creational design pattern that lets you produce of families of related objects without specifying 
their concrete classes.

The first thing the Abstract Factory pattern suggests is to explicitly declare interfaces for each distinct product of the product
family. Then you can make all variants of products follow those interfaces.
For example, all chair variants can implement the Chair interface , all coffee table variants can implement the CoffeeTable interface
and so on.

The next move is to declare the Abstract Factory- an interface with a list of creation methods for all products that are part of
the product family. These methods must return abstract product types represented by the interfaces we extracted previously :
Chair, Sofa , CoffeeTable and so on.

The clients shouldn't care about the concrete class of the factory it works with.

The client doesn't have to be aware of the factory's class , nor does it matter what kind of chair it gets.
Whether it's a Modern model or a Victorian-style chair , the client must treat all chairs in the same manner, using the abstract Chair
interface. With this approach , the only thing that the client knows about the chair is that it implements the sitOn method in some way.

## Applicability

Use the Abstract Factory when your code needs to work with various families of related products, but you don't want it to depend on
the concrete classes of those products - they might be unknown beforehand or you simply want to allow for future extensibility.

The Abstract Factory provides you with an interface for creating objects from each class of the product family.
As long as your code creates objects via this interface, you don't have to worry about creating the wrong variant of a product
which doesn't match the products already created by your app.

Consider implementing the Abstract Factory when you have a class with a set of Factory Methods that blur its primary responsibility.

In a well-designed program each class is responsible only for one thing. When a class deals with multiple product types,
it may be worth extracting its factory methods into a stand-alone factory class or a full-blown Abstract Factory implementation.

## Pros and Cons

- You can be sure that the products you're getting from a factory are compatible with each other.
- You avoid tight coupling between concrete products and client code.
- Single Responsibility Principle. You can extract the product creation code into one place, making the code easier to support.
- Open/Closed Principle. You can introduce new variants of products without breaking existing client code.
- The code may become more complicated that it should be, since a lot of new interfaces and classes are introduced along with the pattern.

## Relations with Other Patterns

- Many designs start by using Factory Method (less complicated and more customizable via subclasses) and evolve toward Abstract Factory
Prototype or Builder (more flexible , but more complicated)
- Builder focuses on constructing complex objects step by step. Abstract Factory specializes in creating families of related objects.
Abstract Factory returns the product immediately, whereas Builder lets you run some additional construction steps before fetching the product.
- Abstract Factory classes are often based on a set of Factory Methods , but you can also use Prototype to compose the methods on these classes.
- Abstract Factory can server as an alternative to Facade when you only want to hide the way the subsystem objects are created from the client code.
- You can use Abstract Factory along with Bridge. This pairing is useful when some abstractions defined by Bridge can only with specific implementations.
In this case, Abstract Factory can encapsulate these relations and hide the complexity from the client code.
- Abstract Factories , Builders and Prototypes can all be implemented as Singletons.
