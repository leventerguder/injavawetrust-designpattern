# Composite Design Pattern

Composite (Also known as : Object Tree) is a structural design pattern that lets you compose objects into tree
structures and then work with these structures as if they wre individual objects.

## Problem

Using the Composite pattern makes sense only when the core model of your app can be represented as a tree.

For example , imagine that you have two types ob objects : Products and Boxes. A Box can contain several Products as
well as a number of smaller Boxes. These little Boxes can also hold some Products or even smaller Boxes, and so on.

## Solution

The Composite pattern suggest that you work with Products and boxes through a common interface which declares a method
for calculating the total price.

How would this method work ? For a product, it'd simply return the product's price. For a box, it'd go over each item
the box contains, ask its price and then return a total for this box. If one of these items were a smaller box, that box
would also start going over its contents and so on until the prices of all inner components were calculated. A box could
even add some extra cost to the final price , such as packaging cost.

The Composite pattern lets you run a behavior recursively over all components of an object tree.

The greatest benefit of this approach is that you don't need to care about the concrete classes of objects that compose
the tree. You dont need to know whether an object is a simple product or a sophisticated box. You can treat them all the
same via the common interface.

## Real World Analogy

Armies of most countries structured as hierarchies. An army consists of several divisions ; a division is a set of
brigades, and a brigade consist of platoons, which can be broken down into squads.

## Applicability

- Use the Composite pattern when you have to implement a tree-like object structure

The Composite pattern provides you with two basic element types that share a common interface : simple leaves and
complex containers. A container can be composied of both leaves and other containers. This lets you construct a nested
recursive object structure that resembles a tree.

- Use the pattern when you want the client code treat both simple and comlex elements uniformly.

All elements defined by the Composite pattern share a common interface. Using this interface, the client doesn't have to
worry about the concrete class of the objects it works with.

## Pros and Cons

- You can work with complex tree structures more conveniently : use polymorphism and recursion to your advantage.
- Open/Closed Principle. You can introduce new element types into the app without breaking the existing code , which now
  works with the object tree.
- It might be difficult to provide a common interface for classes whose functionality differs too much. In certain
  scenarios, you'd need to overgeneralize the component interface, making it harder to comprehend.

## Relations with Other Patterns

- You can use Builder when creating complex Composite trees because you can program its construction steps to work
  recursively.
- Chain of Responsibility is often used in conjunction with Composite. In this case, when a leaf components get a
  request, it may pass it through the chain of all of the parent components down to the root of the object tree.
- You can use Iterators to traverse Composite trees.
- You can use Visitor to execute an operation over an entire Composite tree.
- You can implement shared leaf nodes of the Composite tree as Flyweights to save some RAM.
- Composite and Decorator have similar structure diagrams since both rely on recursive composition to organize an
  open-ended number of objects. A Decorator is like a Composite but only has one child component. There's another
  significant difference : Decorator adds additional responsibilities to the wrapped object while Composite just "sums
  up" its children's results. However, the patterns can also cooperate : you can use Decorator to extend the behavior of
  a specific object in the Composite tree.
- Designs that make heavy use of Composite and Decorator can often benefit from using Prototype. Applying the pattern
  lets you clone complex structures instead of reconstructing them from scratch.


