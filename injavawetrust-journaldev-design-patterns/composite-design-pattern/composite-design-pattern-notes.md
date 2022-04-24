# https://www.journaldev.com/1535/composite-design-pattern-in-java

# Composite Design Pattern

Composite Design Pattern is one of the Structural Design Pattern. Composite Design Pattern is used when we have to
represent a part-whole hierarchy.

When we need to create structure in a way that the objects in the structure has to be treated the same way, we can apply
composite design pattern.

Composite Pattern consist of following objects.

- Base Component - Base component is the interface for all objects in the composition, client program uses base
  component to work with the objects in the composition. It can be an interface or an abstract class with some methods
  common to all the objects.
- Leaf - Defines the behavior for the elements in the composition. It is the building block for the composition and
  implements base component. It doesn't have references to other Components.
- Composite - It consists of leaf elements and implements the operations in base component.

## Composite Object

A composite object contains group of leaf objects and we should provide some helper methods to add or delete leafs from
the group.

## Composite Pattern Important Points

- Composite design pattern should be applied only when the group of objects should behave as the single object.
- Composite design pattern can be used to create a tree like structure.
