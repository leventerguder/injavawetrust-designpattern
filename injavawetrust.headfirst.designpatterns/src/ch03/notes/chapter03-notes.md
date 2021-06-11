
# Decorating Objects

## The Open-Closed Principle
Classes should be open for extension, but closed for modification.

Our goal is to allow classes to be easily extended to incorporate new behavior
without modifying existing code. What we do we get if we accomplish this ?
Designs that are resilient to change and flexible enough to take on new functionality to meet
changing requirements.

While it may seem like a contradiction, there are techniques for allowing code to be extended
without direct modification.

Be careful when choosing the areas of code that need to be extended :
applying the Open-Closed Principle EVERYWHERE is wasteful and unnecessary, and can lead to complex,
hard-to-understand code.

## Meet the Decorator Pattern

- Decorators have the same supertype as the objects they decorate.
You can use one or more decorators to wrap an object.
- Given that the decorator has the same supertype as the object it decorates ,
we can pass around a decorated object in place of the original (wrapped) object.
- The decorator adds its own behavior before and/or after delegating to the object it
decorates to do the rest of the job.
- Objects can be decorated at any time , so we can decorate objects dynamically at runtime
with as many decorators as we like.

## The Decorator Pattern defined

The Decorator Pattern attaches additional responsibilities to an object dynamically.
Decorators provide a flexible alternative to subclassing for extending functionality.


## Real-World Decorators : Java I/O

The I/O classes should make more sense since the java.io package is largely based on Decorator.

## OO Principles
Classes should be open for extension but closed for modification.

## OO Patterns
Decorator - Attach additional responsibilities to an object dynamically.
Decorators provide a flexible alternative to subclassing for extending functionality.

## Bullet Points
- Inheritance is one form of extension , but not necessarily the best way to achieve flexibility in our design.
- In our designs we should allow behavior to be extended without the need to modify existing code
- Composition and delegation can often be used to add new behaviors at runtime.
- The Decorator Pattern provides an alternative to subclassing for extending behavior.
- The Decorator Pattern involves a set of decorator classes that are used to wrap concrete components.
- Decorator classes mirror the type of the components they decorate. 
  (In fact, they are the same type as the components they decorate, either through inheritance or interface implementation.)
- Decorators change the behavior of their components by adding new functionality before and/or after (or even in place of)
method calls to the component.
- You can wrap a component with any number of decorators. 
- Decorators are typically transparent to the client of the component—that is, unless the client is relying on the component’s concrete type
- Decorators can result in many small objects in our design, and overuse can be complex.
