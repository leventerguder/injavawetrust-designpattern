# Software Design Principles

## Features of Good Design

Before we proceed to the actual patterns , let's discuss the process of designing software architecture : things to aim for and things you'd better avoid.

### Code Reuse

Cost and time are two of the most valuable metrics when developing any software product.
Less time in development means entering the market earlier than competitors.
Lower development costs mean more money is left for marketing and a broader reach to potential customers.

Code reuse is one of the most common ways to reduce development costs. The intent is pretty obvious : instead of developing something over and over from scratch, why don't we reuse existing code in new projects ?

The idea great on paper , but it turns out that making existing code work in a new context usually takes extra effort. Tight coupling between components , dependencies on concrete classes instead of interfaces , hardcodede operations - all of this reduces flexibility of the code and makes it harder to reuse it.

Using design patterns is one way to increase flexibility of software components and make them easier to reuse.
However, this sometimes comes at the price of making the components more complicated.

Here's a piece of wisdom from Erich Gamma , one of the founding fathers of design patterns , about the role of design patterns in code reuse : 

I see three levels of reuse.
At the lowest level, you reuse classes : class libraries, containers , maybe some class "teams" like container/iterator.

Frameworks are at the highest level. They really try to distill your design decisions. They identify the key abstractions for solving a problem , represent them by class and define relationships between them. JUnit is a small framework, for example. It is the "Hello, world" of frameworks. It has Test, TestCase , TestSuite and relationships defined.

A framework is typically larger-grained that just a single class. Also , you hook into frameworks by subclassing somewhere. They use the so-called Hollywood principle of "don't call us , we'll call you.". The framework lets you define your custom behavior, and it will call you when it's your turn to do something. Same with Junit, right ? It calls you when it wants to execute a test for you, but the rest happens in the framework.

There also is a middle level. This is where I see patterns. Design patterns are both smaller and more abstract that frameworks. They're really a description about how a couple of classes can relate to and interact with each other. The level of reuse increases when you move from classes to patterns and finally frameworks.

What is nice about this middle layer is that patterns offer reuse in a way that is less risky than frameworks. Building a framework is high risk and a significant investmen. Patterns let you reuse design ideas and concepts independently of concreate code.

### Extensibility

Change is the only constant thing in a programmer's life.

- You released a video game for Windows, but now people ask for a macOS version.
- You created a GUI framework with square buttons , but several months later round buttons become a trend.
- You designed a brilliant e-commerce website architecture, but just a month later customers ask for a feature that would let them accept phone orders.

Each software developer has dozens of similar stories. There are several reasons why this happens. 
First, we understand the problem better once we start to solve it. Often by the time you finish the first version of app, you are ready to rewrite it from scratch because now you understand many aspects of the problem much better. You have also grown professionally, and you own code now looks like crap.

Something beyond your control has changed. This is why so many dev teams pivot from their original ideas into something new. Eveyone who relied on Flas in an online application has been reworking or migrating their code as browser after browser drops support for Flash.

The third reason is that the goalposts move. Your client was delighted with the current version of application, but now sees eleven "little" changes he'd like so it can do other things he never mentioned in the original planning sessions these aren't frivolous changes : your excellent first versio has shown him that even more is possible.

There is a bright side : if someone asks you yo change something in your app, that means someone stil cares about it.

That is why all seasoned developers try to provide for possible future changes when designing an application's architecture.

## Design Principles

What is good software design ? How would you measure it ? What practices would you need to follow to achieve it ? How can you make your architecture flexible , stable and easy to understand ? 

These are the great questions; but, unfortunately , the answers are different depending on the type of application you're building. Nevertheless, there are sevral universal princinples of software design that might help you answer these questions for your own project. Most of the design patterns listed in this books are based on these principles.

## Encapsulate What Varies

Identify the aspects of your application that vary and separate them from what stays the same.

The main goal of this principle is to minimize the effect caused by changes.
Imagine that your program is a ship, and changes are hideous mines that linger under water.
Struck by the mine, the ship sinks.

Knowing this, you can divide the ship’s hull into independent compartments that can be safely sealed to limit damage to a single compartment. Now, if the ship hits a mine, the ship as a whole remains afloat.

In the same way, you can isolate the parts of the program that vary in independent modules, protecting the rest of the code from adverse effects. As a result, you spend less time getting the program back into working shape, implementing and testing the changes. The less time you spend making changes, the more time you have for implementing features.

### Encapsulation on a method level

Say you’re making an e-commerce website. Somewhere in your code, there’s a getOrderTotal method that calculates a grand total for the order, including taxes.

We can anticipate that tax-related code might need to change in the future. The tax rate depends on the country, state or even city where the customer resides, and the actual formula may change over time due to new laws or regulations. As a result, you’ll need to change the getOrderTotal method quite often. But even the method’s name suggests that it doesn’t care about how the tax is calculated.

You can extract the tax calculation logic into a separate method, hiding it from the original method.
Tax-related changes become isolated inside a single method. Moreover, if the tax calculation logic becomes too complicat- ed, it’s now easier to move it to a separate class.

### Encapsulation on a class level

Over time you might add more and more responsibilities to a method which used to do a simple thing. These added behaviors often come with their own helper fields and methods that eventually blur the primary responsibility of the containing class. Extracting everything to a new class might make things much more clear and simple.


## Program to an Interface, not an Implementation

Program to an interface, not an implementation. Depend on abstractions, not on concrete classes.

You can tell that the design is flexible enough if you can easily extend it without breaking any existing code. 

When you want to make two classes collaborate, you start by making one of them dependent on the other.

- Determine what exactly one object needs from the other: which methods does it execute?
- Describe these methods in a new interface or abstract class.
- Make the class that is a dependency implement this interface.
- Now make the second class dependent on this interface rather than on the concrete class. You still can make it work with objects of the original class, but the connection is now much more flexible.


## Favor Composition Over Inheritance

Inheritance is probably the most obvious and easy way of reusing code between classes. You have two classes with the same code. Create a common base class for these two and move the similar code into it. Piece of cake!

Unfortunately, inheritance comes with caveats that often become apparent only after your program already has tons of classes and changing anything is pretty hard.

- A subclass can't reduce the interface of the superclass.
You have to implement all abstract methods of the parent class even if you wont't be using them.

- When overriding methods you need to make sure that the new behavior is compatible with the base one.
It’s important because objects of the subclass may be passed to any code that expects objects of the superclass and you don’t want that code to break.

- Inheritance breaks encapsulation of the superclass
The internal details of the parent class become available to the subclass. There might be an opposite situation where a programmer makes a superclass aware of some details of sub- classes for the sake of making further extension easier.

- Subclasses are tightly coupled to superclasses.
Any changes in a superclass may break the functionality of subclasses.

- Trying to reuse code through inheritance can lead to creating parallel inheritance hierarchies

Inheritance usually takes place in a single dimension. But whenever there are two or more dimensions , you have to create lots of class combinations, bloating the class hierarchy to a ridiculous size.

There’s an alternative to inheritance called composition. Whereas inheritance represents the "is a" relationship between classes (a car is a transport), composition represents the “has a” relationship (a car has an engine).

I should mention that this principle also applies to Aggregation - a more relaxed variant of composition where one object may have a reference to the other one but doesn't manage its lifecycle. Here's an example : a car has a driver , but he or she may use another car or just walk without the car.
