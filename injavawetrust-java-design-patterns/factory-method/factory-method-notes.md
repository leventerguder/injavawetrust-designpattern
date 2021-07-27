# Factory Method Pattern

## GoF Definition

Define an interface for creating an object , but let subclasses decide which class to instantiate.
Factory method lets a class defer instantiation to subclasses.

## Concept

Here you start your development with an abstract creator class , that defines the basic structure of
the application. The subclasses that derive from this abstract class perform the actual instantiation
process.

## Computer World Example

Suppose that you are building an application that needs to support two different databases,
let's say Oracle and SQL Server.
So, whenever you insert a data into a database ,
you create a SQL Server–specific connection (SqlServerConnection) 
or an Oracle server–specific connection (OracleConnection) and then you can proceed.

If you put these codes into if-else (or switch) statements, you may need to repeat a lot of code.
This kind of code is not easily maintainable because whenever you need to 
support a new type of connection, you need to reopen your code and place the modifications. 
A factory method pattern focuses on solving similar problems in application development.


## Questions & Answers

1 - Why have you separated the createAnimal method from client code?

It is my true intention. I want the subclasses to create specialized objects.
If you look carefully , you will find that only this "creational part" is varying across the products.


2 - What are the advantages of using a factory like this ?

- You are separating code that can vary from the code that does not vary (i.e the advantages of using
  simple factory pattern is still present).
This technique helps you easily maintain code.

- Your code is not tighly coupled ; so , you can add new classes like Lion , Deer  and so forth,
at any time in the system without modifying the existing architecture.

So , you have followed the "closed for modification but open for extension" principle.

3 - What are the challenges of using a factory like this ?

If you need to deal with a large number of classes , then you may encounter maintenance overhead.

4 - I see that the factory pattern is supporting two parallel hierarchies. Is this correct ?

Good catch. So , in this example , AnimalFactory , DogFactory and TigerFactory are placed in one hierarchy
and Animal , Dog , and Tiger are placed in another hierarchy.
So, the creators and their creations/products are two hierarchies running in parallel.

5 - I should always mark the factory method with an abstract keyword so that subclasses can complete them.
Is this correct ?

No. You may be interested in a default factory method if the creator has no subclasses.
And in that case , you cannot mark the factory method with the abstract keyword.

To show the real power of the factory method pattern , you may need to follow a similar design ,
which is implemented here.

6 - It still appears to me that the factory method pattern is not much different from simple factory. Is this correct?

If you look at the subclasses in the examples in both chapters , you may find some similarities.
But you should not forget the key aim of the factory method pattern is that it is supplying the framework
through which different subclasses can make different products.

But in a simple factory, you cannot vary the products like you can with factory method pattern.
Think of simple factory as a one-time deal but most importantly , your creational part will not be closed for modification.
Whenever you want to add a new stuff ,you need to add an if/else block 
or a switch statement in the factory class of your simple factory pattern.

In this context , remember the GoF definition : the factory method lets a class defer instantiation to subclasses.
So, in our simple factory pattern demonstration, you used a concrete class only (SimpleFactory)
You did not need to override the createAnimal() method and there was no subclass that participated in the final decision/product
making process. But in you try to code to an abstract class ( or interface) , that is always considered a good practise , and this mechanism
provides you the flexibility to put some common behaviors in the abstract class.

In the simple factory pattern , you simply segregate the instantiation logic from client code.
In this case , it knows about all the classes whose objects it can create.
On the other hand , when using a factory method pattern , you delegate the object creation to subclasses.
Also , the factory method is not absolutely sure about the product subclasses in advance.

7 - In the factory method pattern , I can simply use a subclassing mechanism (i.e , using inheritance) and then implement the
factory method (that is defined in the parent class.) Is this correct ?

The answer to this questionis yes if you want to strictly follow the GoF definitions.
But it is important to note that in many applications/implementations, there is no use of an abstract class or interface ;
for example , In java , an XML reader object is used like this :

<pre>
// Some code before...
XMLReader xmlReader1 = XMLReaderFactory.createXMLReader();
// Some code after
</pre>

XMLReaderFactory is a final class in Java. So, you cannot inherit from it.

But when use SAXParserFactory , as follows , you are using an abstract class SAXParserFactory.

<pre>
SAXParserFactory factory = SAXParserFactory.newInstance();
              SAXParser parser = factory.newSAXParser();
              XMLReader xmlReader2 = parser.getXMLReader();
</pre>





