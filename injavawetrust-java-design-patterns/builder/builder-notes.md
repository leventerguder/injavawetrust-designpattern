# Builder Pattern

## GoF Definition

Separate the construction of a complex object from its representation so that the same construction
processes can create different representations.

## Concept

The builder pattern is useful for creating complex objects that have multiple parts.
The creational mechanism of an object should be independent of these parts.
The construction process does not care about how these parts are assembled.
The same construction process must allow us to create different representations of the objects.

## Questions & Answers Session

1 - What are the advantages of using a builder pattern ?

- You can create a complex object, step by step , and vary the steps.
You promote encapsulation by hiding the details of the complex construction process.
The director can retrieve the final product from the builder when the whole construction is over.
In general, at a high level, you seem to have only one method that makes the complete product.
Other internal methods only involve partial creation.
So , you have finer control over the construction process.

- Using this pattern , the same construction process can produce different products.
- Since you can vary the construction steps , you can vary product's internal representation.

2 - What are the drawbacks/pitfalls associated with the builder pattern ?

- It is not suitable if you want to deal with mutable objects.
- You may need to duplicate some portion of the code. These duplications may have significant impact
in some context and turn into an antiparttern.
- A concrete builder is dedicated to a particular type of product.
So, to create different type of products , you may need to come up with different concrete builders.
- The approach makes more sense if the structure is very complex.

- The approach makes more sense if the structure is very complex.

3 - Can I use an abstract class instead of the interface in the illustration of this pattern ? 

Yes. You can use an abstract class instead of an interface in this example.

4 - How do i decide whether I should use an abstract class or an interface in an application ?

I believe that if you want to have some centralized or default behavior, the abstract class is better choice.
In those case , you can provide some default implementation.
On the other hand , interface implementation starts from scratch.
They indicate some kind of rules/contracts on what is to be done.

You should prefer the abstract class in the following scenarios :

- You want to share code among multiple closely related classes.
- The classes that extend the abstract class can have many common methods or fields 
or they require non-public access modifiers inside them.

- You want to use non-static / and non-final fields, which enables us to define methods that can access and modify
the state of the object to which they belong.
  
On the other hand , you should prefer interfaces for these scenarios :

- You expect that several unrelated classes are going to implement your interface.
  (Comparable interface can be implemented by many unrelated classes)
- You specify the behavior or a particular data type , but it does not matter how the implementer 
implements that.

- You want to use the concept of multiple inheritance in your application.  


5 - I am seeing that in cars, model names are added in the beginning, but for motorcycles, 
model names are added at the ends. is it intentional ?

Yes. It was used to demonstrate the fact that each of the concrete builders can decide how they want to produce the final
products.
They have this freedom.

6 - Why are you using a separate class for director ? You should use the client code top play the role of the director.

No one restricts you to do that. In the preceding implementation, I wanted to separate this role from the client code in the 
implementation. But in the upcoming/modified implementation, I have used the client as a director.

7 - What do you mean by client code ?

The class that contains the main() method is the client code. In most parts of the book, client code means the same.

8 - You mentioned varying steps several times. 
Can you demonstrate an implementation where the final product is created with different variations and steps?

Good catch. You asked for a demonstration of the real power of the builder pattern. So, let us consider another example.
(demo.v2)


## Modified Illustration

- In this modified implementation , I consider only cars as the final products.
- I create custom cars that have the following attributes.
- The client code is playing the role of a director in this implementation.
- I have renamed the builder interface as ModifierBuilder.


9 - I am seeing the use of final keywords in client codes.

But you have not used those for ProductClass attributes. What is the reason for that ?
In the client code , I used the final keywords to promote immutability. But in the ProductClass 
the attributes are already marked with private keywords and there are no setter methods , so these are already immutable.

10 - What is the key benefit of immutable objects ?
Once constructor , they can be safely shared , and most importantly , they are thread safe ,
so you save lots in synchronization costs in a multithreaded environment.

11 - When should i consider using a builder pattern ?

If you need to make a complex object that involves various steps in the construction process , and at the same time ,
the products need to be immutable , the builder pattern is a good choice.
