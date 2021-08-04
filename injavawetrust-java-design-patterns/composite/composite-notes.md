# Composite Pattern

## GoF Definition

Compose objects into tree structures to represent part-whole hierarchies.
Composite lets clients treat individual objects and compositions of objects uniformly.

## Concept

To help you understand this concept, I will start with an example. 
Consider a shop that sells different kinds of dry fruits and nuts; let’s say cashews, dates, and walnuts. 
Each of these items is associated with a certain price. Let’s assume that you can purchase any of these 
individual items, or you can purchase “gift packs” (or boxed items) that contain different items. 
In this case, the cost of a packet is the sum of its component parts. 
The composite pattern is useful in a similar situation, 
where you treat both the individual parts and the combination of 
the parts in the same way so that you can process them uniformly.

## Computer-World Example

Any tree data structure can follow this concept. 
Clients can treat the leaves of the tree and the non-leaves (or branches of the tree) in the same way.

This pattern is commonly seen in various UI frameworks. In Java, the generic Abstract Window Toolkit (AWT) container object 
is a component that can contain other AWT components.

## Questions & Answers

1 - What are the advantages of using composite design patterns ?
In a tree-like structure, you can treat both the composite objects (branches) 
and the individual objects (leaf-nodes) uniformly.
Notice that in this example, I have used two common methods: printStructures() and getEmployeeCount() 
to print the structure and get the employee count from both the composite object structure (principal 
or HODs) and the single object structure (i.e., leaf nodes like Math Teacher 1.)

It is very common to implement a part-whole hierarchy using this design pattern.

You can easily add a new component to an existing architecture or delete an existing component from your architecture.

2 - What are the challenges associated with using composite design patterns?

If you want to maintain the ordering of child nodes (e.g., if parse trees are represented as components), 
you may need to use additional efforts.

If you are dealing with immutable objects, you cannot simply delete those.

You can easily add a new component but that kind of support can cause maintenance overhead in the future. 
Sometimes, you want to deal with a composite object that has special components. 
This kind of constraint can cause additional development
costs because you may need to implement a dynamic checking mechanism to support the concept.

3 - In this example, you have used list data structure. But I prefer to use other data structures. Is this okay?

Absolutely. There is no universal rule. You are free to use your preferred data structure. 
GoF confirmed that it is not necessary to use any general-purpose data structure.

4 -  How can you connect the iterator design pattern to a composite design pattern?

Go through our example once again. If you want to examine composite object architecture, 
you may need to iterate over the objects. In other words, 
if you want to do special activities with branches, you may need to iterate over its leaf nodes and non-leaf nodes. 
Iterator patterns are often used with composite patterns.

5 - In the interface of your implementation, you defined only two methods: printStructures() and getEmployeeCount(). 
But you are using other methods for the addition and removal of objects in the Composite class (CompositeEmployee). 
Why didn’t you put these methods in the interface?

Nice observation. GoF discussed this. Let’s look at what happens if you put the addEmployee (...) and removeEmployee (...) 
methods in the interface. The leaf nodes need to implement the addition and removal operations. 
But will it be meaningful in this case? The obvious answer is no. 
It may appear that you lose transparency, but I believe that you have more safety because I have blocked
the meaningless operations in the leaf nodes. 
This is why the GoF mentioned that this kind of decision involves a trade-off between safety and transparency.

6 - I want to use an abstract class instead of an interface. Is this allowed?

In most of the cases, the simple answer is yes. 
But you need to understand the difference between an abstract class and an interface. 
In a typical scenario, you find one of them more useful than the other one. 
Since I am presenting only simple and easy to understand examples, 
you may not see much difference between the two. 
