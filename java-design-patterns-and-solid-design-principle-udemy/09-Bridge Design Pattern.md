# Bridge Design Pattern

Our implementations & abstractions are generally coupled to each other in normal inheritance.

Using bridge pattern we can decouple them so they can botch change without affecting each other.

We achieve this feat by creating two separate inheritance hierarchies; one for implementation and another for
abstraction.

We use composition to bridge these two hierarchies.

## Implement a Bridge

We start by defining our abstraction as needed by client.

- We determine common base operations and define them in abstraction.
- We can optionally also define a refined abstraction & provide more specialized operations.
- Then we define our implementor next. Implementor methods do not have to match with abstractor.
  However, abstraction can carry out its works by using implementor methods.
- Then we write one or more concrete implementor providing implementation.

Abstractions are created by composing them with an instance of concrete implementor which is used by methods in
abstraction.

## Implementation Considerations

- In case we are ever going to have a single implementation then we can skip creating abstract implementor.
- Abstraction can decide on its own which concrete implementor to use in its constructor or we can delegate that
  decision to a third class. In last approach abstraction remains unaware of concrete implementors & provides greater
  de-coupling.

## Design Considerations

- Bridge provides great extensibility by allowing us to change abstraction and implementor independently. You can build
  & package them separately to modularize overall system.
- By using abstract factory pattern to create abstraction objects with correct implementation you can de-couple concrete
  implementors from abstractions.

## Example of a Bridge

An example of bridge pattern often given is the JDBC API. The java.sql.DriverManager class with the java.sql.Driver
interface form a bridge pattern.

An example of bridge pattern often given is the Collections.newSetFromMap() method.

## Compare & Contrast with Adapter

Bridge;

- Intent is to allow abstraction and implementation to vary independently.
- Bridge has to be designed up fron then only we can have varying abstractions & implementations.

Adapter;

- Adapter is meant to make unrelated classes work together.
- Adapter finds its usage typically where a legacy system is to be integrated with new code.

## Pitfalls

- It is fairly complex to understand & implement bridge design pattern.
- You need to have a well thought & fairly comprehensive design in front of you before you can decide on bridge pattern.
- Needs to be designed up front. Adding bridge to legacy code is difficult. Even for ongoing project adding bridge at
  later time in development may require fair amount of rework.

## Summary

We use bridge pattern when we want our abstractions and implementations to be decoupled.

Bridge pattern defines separate inheritance hierarchies for abstraction & implementations and bridge these two together
using composition.

Implementation do not have to define methods that match up with methods in abstraction.
It is fairly common to have primitive methods; methods which do small work; in implementor. Abstraction uses these
methods to provide its functionality.

We separate the abstraction used by client code from the actual implementation of that functionality so they can change
independently.

The "bridge" in Bridge pattern is this composition relationship between two separate inheritance hierarchies.

Always prefer to composition over inheritance as it allows greater de-coupling of code. We can easily switch the
implementation due to composition.