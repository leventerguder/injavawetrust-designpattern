# Visitor Pattern

## GoF Definition

Represent an operation to be performed on the elements of an object structure.
Visitor lets you define a new operation without changing the classes of the elements on which it operates.

## Concept

This pattern helps you add new operations on the objects without modifying the corresponding classes
especially when your operations change very often.

Ideally , visitors define class-specific methods, which work with an object of that class to support 
new functionalities.
Here you separate an algorithm from an object structure, and you add new operations using a new hierarchy.
Therefore, this pattern can support the open/ close principle (extension is allowed but modification is disallowed 
for entities like class, function, modules, etc.). The upcoming implementations will make the concept clearer to you.

## Computer-World Example

This pattern is very useful when public APIs need to support plugging operations.
Clients can then perform their intended operations on a class (with the visiting class)
without modifying the source.

In Java, you may notice the use of this pattern when you use the abstract class org.dom4j.VisitorSupport, 
which extends Object and implements the org. dom4j.Visitor interface

## Modified Illustration

You have already seen a very simple example of the visitor design pattern. 
But you can exercise the true power of this design pattern when you combine it with the composite pattern 
So, let’s examine a scenario where you need to combine both the composite pattern and the visitor pattern.

## Questions & Answers

1 - When should you consider implementing visitor desing patterns ?

You need to add new operations to a set of objects without changing their corresponding classes.
It is one of the primary aims to implement a visitor pattern.
When the operations change very often this approach can be your savior.
In this pattern encapsulation is not the primary concern.
If you need to change the logic of various operations, you can simply do it through visitor implementation.

2 - Are there any drawbacks associated with this pattern ?

Encapsulation is not its key concern. So, you can break the power
of encapsulation by using visitors.

If you need to frequently add new concrete classes to an existing architecture,
the visitor hierarchy becomes difficult to maintain.
For example , suppose you want to add another concrete class in the original hierarchy now.
Then in this case, you need to modify visitor class hierarchy accordingly to fulfill the purpose.

3 -  Why are you saying that a visitor class can violate the encapsulation?

In our illustration, I have tested a very simple visitor design pattern in which I show an updated integer value of 
myInt through the visitor class. Also, in many cases, you may see that the visitor needs to move around 
a composite structure to gather information from them, and then it can modify that information. 
So, when you provide this kind of support, you violate the core aim of encapsulation.

4 - Why does this pattern compromise the encapsulation?

Here you perform some operations on a set of objects that can
be heterogeneous. But your constraint is that you cannot change their corresponding classes. 
So, your visitor needs a way to access the members of these objects. 
As a result, you need to expose the information to the visitor.

5 - In the visitor interfaces of the modified implementation, you are using the concept of method overloading 
( i.e., method names are same). Is this mandatory?

No. Remember that these interface methods should target the specific classes, such as SimpleEmployee or CompositeEmployee.

6 - Suppose that in the modified implementation, I add a concrete subclass of Employee called UndefinedEmployee. 
How should I proceed? Should I have another specific method in the visitor interface?

Exactly. You need to define a new method that is specific to this new class. So, your interface may look like the following.

<pre>
interface Visitor {
    
    void visitTheElement(CompositeEmployee employees);

    void visitTheElement(SimpleEmployee employee);

    void visitTheElement(UndefinedEmployee employee);
}
</pre>

7 - Suppose that I need to support new operations in the existing architecture. How should I proceed with the visitor pattern?

For each new operation, create a new visitor subclass and implement the operation in it. 
Then, visit your existing structure the way that was shown in the preceding examples.

8 - In the client code, you made a container of employees first, and then it starts visiting. 
Is it mandatory to create such a structure?

No. It just helps clients to visit smoothly in one shot. If you do not create any such structure, 
you can always call it separately.
