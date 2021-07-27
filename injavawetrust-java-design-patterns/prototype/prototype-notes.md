# Prototype Pattern

## GoF Definition

Specify the kind of objects to create using a prototypical instance , 
and create new objects by copying this prototype.

## Concept

In general , creating a new instance from scratch is a costly operation.
Using tye prototype pattern , you can create new instances by copying or cloning an instance of an existing one.
This approach saves both time and money in creating a new instance from scratch.

## Computer-World Example

Consider the Object.clone() method as an example of a prototype.

## Questions & Answers Session

1 - What are the advantages of using prototype design patterns ?

- It is useful when creating an instance of a class is a complicated (or boring process)
Instead, you can focus on other key activities.
  
- You can include or discard products at runtime.
- You can create new instances at a cheaper cost.

2 - What are the challenges associated with using prototype design patterns ?

- Each subclass needs to implement the cloning or copying mechanism.
- Sometimes creating a copy from an existing instance is not simple.
For example, implementing a cloning mechanism can be challenging if the objects under consideration 
do not support copying/cloning or if there are circular references.
For example , in Java , a class with the clone() method needs to implement the Cloneable marker interface;
otherwise, it will throw a CloneNotSupportedException.  

- If you need a deep copy for your application , that can be expensive.

3 - Can you please elaborate the difference between a shallow copy and a deep copy ?

A shallow copy creates a new object then copies various field values from the original object to the new object.
So , it is also known field-by-field copy. 
If the original object contains any references to other objects as fields, then the references of those objects are copied
into the new object.

In a deep copy , the new object is totally separated from the original one.
Any changes made in one object should not be reflected on the other one.
To create a deep copy in Java, you may need to override the clone() method and then proceed.
Also, a deep copy is expensive because you need to create additional objects.

4 - When do you choose a shallow copy over a deep copy ? and vice versa ?

A shallow copy is faster and less expensive. It is always better if your target object has the 
primitive fields only.

A deep copy is expensive and slow. But it is useful if your target object contains many fields that
have references to other objects.

5 - When I copy an object in Java , I need to use the clone() method.
Is this understanding correct?

No. There are alternatives available , and one of them is to use the serialization mechanism.
But you can always define your own copy constructor and use it.

6 - Can you give a simple example that demonstrates a user-defined copy constructor ?

Java does not support a default copy constructor. You may need to write your own.


