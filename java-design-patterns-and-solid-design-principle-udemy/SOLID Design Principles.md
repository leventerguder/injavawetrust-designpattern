# SOLID Design Principles

## Single Responsibility Principle

There should never be more than one reason for a class to change.

- focused, single functionality.

## Open - Closed Principle

Software entities (Classes, Modules, Methods ,etc.) should be open for extension, but closed for modification.

- Open for Extension : Extend existing behavior.
- Closed for Modification : Existing code remains unchanged.

## Liskov Substitution Principle

We should be to substitute base class objects with child class objects & this should not alter behavior/characteristics
of program.

## Interface Segregation Principle

Clients should not be forced to depend upon interfaces that they do not use.

Violation of Interface Segregation Principle

Interface Pollution; Large Interfaces , Unrelated Methods

Signs of Interface Pollution ;

- Classes have empty method implementations.
- Method implementations throw UnsupportedOperationException (or similar).
- Method implementations return null or default/dummy values.

Write Highly Cohesive Interfaces!

## Dependency Inversion Principle

High Level Modules should not depend upon low level modules. Both should depend upon abstractions.
Abstraction should not depend upon details. Details should depend upon abstractions.