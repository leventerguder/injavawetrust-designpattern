# Bridge Design Pattern

Bridge is a structural design pattern that lets you split a large class or a set of closely related classes
into two separate hierarchies - abstraction and implementation - which can be developed independently of each other.


## Problem

Abstraction ? Implementation ? Sound scary ?

Say you have a geometric Shape class with a pair of subclasses: Circle and Square . 
You want to extend this class hierarchy to incorporate colors, so you plan to create Red and Blue shape subclasses. 
However, since you already have two subclasses, you’ll need to create four class combinations such as BlueCircle and RedSquare.

Adding new shape types and colors to the hierarchy will grow it exponentially.


## Solution

This problem occurs because we're trying to extend the shape classes in two independent dimensions : by form and by color.

The Bridge pattern attempts to solve this problem by switching from inheritance to composition.
What this means is that you extract one of the dimensions into a separate class hierarchy, so that the original classes will
reference an object of the new hierarchy, instead of having all of its state and behaviors within one class.

## Abstraction and Implementation

Abstraction (also called interface) is a high-level control layer for some entity.
This layer isn't supposed to do any real work on its own. It should delegate to work to the implementation layer.

Note that we'are not talking about interfaces or abstract classes from your programming language.
These aren't the same things.

The Abstraction provides high-level control logic. It relies on the implementation object to do the actual low-level work.

The Implementation declares the interface that's common for all concrete implementations. An abstraction can only communicate
with an implementation object via methods that are declared here.

Concrete Implementations contain platform-specific code.

Refined Abstraction provide variants of control logic. Like their parent, they work with different implementations via
the general implementation interface.

## Applicability

- Use the Bridge pattern when you want to divide and organize a monolithic class that has several variants of some functionality
(for example, if the class work with various database servers.)

The bigger a class becomes , the harder it is to figure out how it works, and the longer it makes to make a change.
The changes made to one of the variations of functionality may require making changes across the whole class, which often results 
in making errors or not addressing some critical side effects.

The Bridge pattern lets you split the monolithic class into several class hierarchies. After this, you can change the classes in 
each hierarchy independently of the classes in the others. 
This approach simplifies code maintenance and minimizes the risk of breaking existing code.

- Use the Bridge if you need to be able to switch implementations at runtime

Although it's optional, the Bridge pattern lets you replace the implementation object inside the abstraction.
It's as easy as assignning a new value to a field.

By the way, this last item is the main reason why so many people confuse the Bridge with the Strategy pattern.
Remember that a pattern is more than just a certain way to structure your classes. It may also communicate intent and a problem
being addressed.

## Pros and Cons

- You can create platform-independent classes and apps.
- The client code works with high-level abstractions. It isn't exposed to the platform details.
- Open/Closed Principle. You can introduce new abstractions and implementations independently from each other.
- Single Responsibility Principle. You can focus on high-level logic in the abstraction and on platform details 
in the abstraction and on platform details in the implementation.
-  You might make the code more complicated by applying the pattern to a highly cohesive class.

## Relations with Other Patterns

- Bridge is usually designed up-front, letting you develop parts of an application independently of each other. 
On the other hand , Adapter is commonly used with an existing app to make some otherwise incompatible classes work together nicely.

- Bridge, State , Strategy(and to some degree Adapter) have very similar structures. Indeed, all of these patterns are based on composition,
which is delegating work to other objects. However, they all solve different problems. A pattern isn't just a recipe for structuring your code in 
a specific way. It can also communicate to other developers the problem the pattern solves.
- You can use Abstract Factory along with Bridge. This pairing is useful when some abstractions defined by Bridge can only work with specific
implementations. In this case, Abstract Factory can encapsulate these relations and hide the complexity from the client code.
- You can combine Builder with Bridge : the director class plays the role of the abstraction, while different builders act as implementations.
