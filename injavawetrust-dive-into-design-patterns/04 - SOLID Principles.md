# SOLID Principles

SOLID is a mnemonic for five design principles intended to make software designs more understandable, flexible and maintainable.

As with everything in life, using these principles mindlessly can cause more harm than good. The cost of applying these principles into a program’s architecture might be making it more complicated than it should be. Striving for these principles is good, but always try to be pragmatic and don’t take everything writ- ten here as dogma.

## Single Responsibility Principle

A class should have just one reason to change.

Try to make every class responsible for a single part of the functionality provided by the software, and make that responsibility entirely encapsulated by (you can also say hidden within) the class.

The main goal of this principle is reducing complexity. You don’t need to invent a sophisticated design for a program that only has about 200 lines of code. Make a dozen methods pretty, and you’ll be fine.

The real problems emerge when your program constantly grows and changes. At some point classes become so big that you can no longer remember their details. Code navigation slows down to a crawl, and you have to scan through whole classes or even an entire program to find specific things. The number of entities in program overflows your brain stack, and you feel that you’re losing control over the code.


There's more: if a class does too many things, you have to change it every time one of these things changes. While doing that, you’re risking breaking other parts of the class which you didn’t even intend to change.

If you feel that it's becoming hard to focus on specific aspects of the program one at a time, remember the single responsibility principle and check whether it’s time to divide some classes into parts.

## Open/Closed Principle

Classes should be open for extension but closed for modification.

The main idea of this principle is to keep existing code from breaking when you implement new features.

A class is open if you can extend it , produce a subclass and do whatever you want with it - add new methods or fields,
override base behavior, etc. Some programming languages let you restrict further extension of a class with special keywords, such as final. After this, the class is no longer open. At he same time, the class is closed if its' 100% ready to be used by other classes - its interface is clearly defined and won't be changed in the future.

If a class is already developed, tested, reviewed, and includ- ed in some framework or otherwise used in an app, trying to mess with its code is risky. Instead of changing the code of the class directly, you can create a subclass and override parts of the original class that you want to behave differently. You’ll achieve your goal but also won’t break any existing clients of the original class.

This principle isn’t meant to be applied for all changes to a class. If you know that there’s a bug in the class, just go on and fix it; don’t create a subclass for it. A child class shouldn’t be responsible for the parent’s issues.

## Liskov Substitution Principle

When extending a class, remember that you should be able to pass objects of the subclass in place of objects of the parent class without breaking the client code.

This means that the subclass should remain compatible with the behavior of the superclass. When overriding a method, extend the base behavior rather than replacing it with something else entirely.

The substitution principle is a set of checks that help pre- dict whether a subclass remains compatible with the code that was able to work with objects of the superclass. This concept is critical when developing libraries and frameworks because your classes are going to be used by other people whose code you can’t directly access and change.


Unlike other design principles which are wide open for inter- pretation, the substitution principle has a set of formal requirements for subclasses, and specifically for their methods.

- Parameter types in a method of a subclass should match or be more absract than parameter types in the method of the superclass.

Say there’s a class with a method that’s supposed to feed cats: feed(Cat c) . Client code always passes cat objects into this method.

- The return type in a method of a subclass should match or be a subtype of the return type in the method of the superclass.

As you can see, requirements for a return type are inverse to requirements for parameter types.

- A method in a subclass shouldn’t throw types of exceptions which the base method isn’t expected to throw.

In other words, types of exceptions should match or be subtypes of the ones that the base method is already able to throw. This rule comes from the fact that try-catch blocks in the client code target specific types of exceptions which the base method is likely to throw. Therefore, an unexpected exception might slip through the defensive lines of the client code and crash the entire application.

In most modern programming languages, especially sta- tically typed ones (Java, C#, and others), these rules are built into the language. You won’t be able to compile a program that violates these rules.

- A subclass shouldn’t strengthen pre-conditions

For example, the base method has a parameter with type int . If a subclass overrides this method and requires that the value of an argument passed to the method should be positive (by throwing an exception if the value is negative), this strengthens the preconditions. The client code, which used to work fine when passing negative numbers into the method, now breaks if it starts working with an object of this subclass.

- A subclass shouldn’t weaken post-conditions

Say you have a class with a method that works with a database. A method of the class is supposed to always close all opened database con- nections upon returning a value.
You created a subclass and changed it so that database connections remain open so you can reuse them. But the client might not know anything about your intentions. Because it expects the methods to close all the connections, it may simply terminate the program right after calling the method, pol- luting a system with ghost database connections.

- Invariants of a superclass must be preserved

This is probably the least formal rule of all. Invariants are conditions in which an object makes sense.

The rule on invariants is the easiest to violate because you might misunderstand or not realize all of the invariants of a complex class. Therefore, the safest way to extend a class is to introduce new fields and methods, and not mess with any existing members of the superclass. Of course, that’s not always doable in real life.

- A subclass shouldn’t change values of private fields of the superclass.

What? How’s that even possible? It turns out some programming languages let you access private members of a class via reflection mechanisms. Other languages (Python, JavaScript) don’t have any protection for the private members at all.

## Interface Segregation Princinple

Client should'nt be forced to depend on methods they do not use.

Try to make your interfaces narrow enough that client classes don't have to implement behaviors they don't need.

According to the interface segregation principle, you should break down "fat" interfaces into more granular and specific ones. Clients should implement only those methods that they really need. Otherwise, a change to a "fat" interface would break even clients that don’t use the changed methods.


Class inheritance lets a class have just one superclass, but it doesn’t limit the number of interfaces that the class can implement at the same time. Hence, there’s no need to cram tons of unrelated methods to a single interface.
Break it down into several more refined interfaces you can implement them all in a single class if needed. However, some classes may be fine with implementing just one of them.

## Dependency Inversion Princinple

High-level classes shouldn't depend on low-level classes. Both should depend on abstractions. Abstractions shouldn't depend on low-level classes. Abstractions shouldn't depend on details. Details should depend on abstractions.

Usually when designing software, you can make a distinction between two levels of classes.

Low-level classes implement basic operations such as working with a disk, transferring data over a network, connecting to a database, etc.

High-level classes contain complex business logic that directs low-level classes to do something.

Sometimes people design low-level classes first and only then start working on high-level ones. This is very common when you start developing a prototype on a new system, and you’re not even sure what’s possible at the higher level because low-level stuff isn’t yet implemented or clear. With such an approach business logic classes tend to become dependent on primitive low-level classes.

- For starters, you need to describe interfaces for low-level operations that high-level classes rely on, preferably in business terms. For instance, business logic should call a method openReport(file) rather than a series of methods
openFile(x) , readBytes(n) , closeFile(x) . These interfaces count as high-level ones.

- Now you can make high-level classes dependent on those interfaces, instead of on concrete low-level classes. This dependency will be much softer than the original one.

- Once low-level classes implement these interfaces, they become dependent on the business logic level, reversing the direction of the original dependency.

The dependency inversion principle often goes along with the open/closed principle: you can extend low-level classes to use with different business logic classes without breaking existing classes.

As a result, the direction of the original dependency has been inverted: low-level classes are now dependent on high-level abstractions.
