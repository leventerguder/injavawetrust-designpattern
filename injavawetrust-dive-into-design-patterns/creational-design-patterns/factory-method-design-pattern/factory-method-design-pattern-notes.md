# Factory Method

Factory Method is a creational design pattern that provides an interface for creating objects in a superclass, but allows
subclasses to alter the type of objects that will be created.

The Factory Method pattern suggests that you replace direct object construction calls(using the new operator) with calls to
a special factory method. Don't worry : the objects are still created via the new operator , but it's being called from within
the factory method. Objects returned by a factory method are often referred to as "products."

As long as all product classes implement a common interface, you can pass their objects to the client code without breaking it.

## Applicability
    
- Use the Factory Method when you don't know beforehand the exact types and dependencies of the objects your code should work with.

    The Factory Method separates product construction code from the code that actually uses the product. Therefore it's easier to extend
    the product construction code independently from the rest of the code.
    For example , to add a new product type  to the app , you'll only need to create a new creator subclass and override the factory method in it.
