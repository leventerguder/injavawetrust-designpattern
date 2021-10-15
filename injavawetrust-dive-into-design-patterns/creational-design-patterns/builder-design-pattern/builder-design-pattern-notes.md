# builders.Builder

builders.Builder is a creational design pattern that lets you construct complex objects step by step.
This pattern allows you to produce different types and representations of an object using the same construction code.

The constructor with lots of parameters has its downside ; not all the parameters are needed at all times.

In most cases most of the parameters will be unused, making the constructor calls pretty ugly.

The builders.Builder pattern suggests that you extract the object construction code out of its own class and move it to separete 
objects called builders.

The pattern organizes object construction into a set of steps. To create an object, you execute a series of these steps on
builder object. The important part is that you don't need to call al of the steps. You can call only those steps that are
necessary for producing a particular configuration of an objet.

## Director

You can go further and extract a series of calls to the builder steps you use to construct a product into a separate class 
called director. The director class defines the order in which to execute the building steps , while the builder provides
the implementation for those steps.

##  Applicability

### Use the builders.Builder pattern to get rid of a "telescopic construction"

Say you have a constructor with ten optional parameters. Calling such a beast is very inconvenient; therefore you overloaded
constructor and create several shorter versions with fewer parameters. These constructors still refer to the main one,
passing some default values into any omitted parameters.


The builders.Builder pattern lets you build objects step by step , using only those steps that you really need.

### Use the builders.Builder pattern when you want your code to be able to crete different representations of some product.

The builders.Builder pattern can be applied when construction of various representations of the product involves similar steps that
differ only in the details.

The base builder interface defines all possible construction steps , and concrete builders implement these steps to construct
particular representations of the product. Meanwhile , the director class guides the order of construction.

### Use the builders.Builder to construct Composite trees or other complex objects.

The builders.Builder pattern lets you construct products step-by-step.
You could defer execution of some steps without breaking the final product. You can even call steps recursively, which comes 
in handy when you need to build an object tree.

A builder doesn't expose the unfinished product while running construction steps. This prevents the client code from fetching
an incomplete result.

## Pros and Cons

- You can construct objects step-by-step , defer construction steps or run steps recursively.
- You can reuse the same construction code when building various representations of products.
- Single Responsibility Principle. You can isolate complex construction code from the business logic of the product.
- The overall complexity of the code increases since the pattern requires creating multiple new classes.

## Relations with Other Patterns

- Many designs start by using Factory Method (less complicated and more customizable via subclasses) and evolve toward
Abstract Factory, Prototype, or builders.Builder (more flexible, but more complicated)
- builders.Builder focuses on constructing complex objects step by step. Abstract Factory specializes in creating families of related objects.
Abstract Factor returns the product immediately, whereas builders.Builder lets you run some additional construction steps before fetching the product.
- You can use builders.Builder when creating complex Composite trees because you can program its construction steps to work recursively.
- You can combine builders.Builder with Bridge : the director class plays the role of the abstraction, while different builders act as implementations.
- Abstract Factories, Builders and Prototypes can all be implemented as Singletons.

## Usage of the pattern in Java

The Builder pattern is a well-known pattern in Java world.
It is especially useful when you need to create an object with lots of possible configuration options.

Builder is widely used in Java core libraries:

- java.lang.StringBuilder#append()
- java.lang.StringBuffer#append()
- java.nio.ByteBuffer#put() 
- javax.swing.GroupLayout.Group#addComponent()
- All implementations java.lang.Appendable

The Builder pattern can be recognized in a class, which has a single creation method and several methods to configure
the resulting object.
