# Introduction to OOP

## Basics of OOP

Object oriented programming is a paradigm based on the concept of wrapping pieces of data, and behavior related to
that data, into special bundles called objects , which are constructed from a set of "blueprints", defined by a programmer
called classes.

## Objects, Classes

Say you have a cat named Oscar. Oscar is an object, an instance of the Cat class. 
Every cat has a lot of standard attributes: name, sex, age, weight, color, favorite food, etc. 
These are the class’s fields.

All cats also behave similarly: they breathe, eat, run, sleep and meow. These are the class’s methods. 
Collectively, fields and methods can be referenced as the members of their class.

Data stored inside the object’s fields is often referenced as state, 
and all the object’s methods define its behavior.

So a class is like a blueprint that defines the structure for objects , which are concrete instances of that class.

## Class Hierarchies

Everything fine and dandy when we talk about one class. 
Naturally, a real program contains more than a single class. 
Some of these classes might be organized into class hierarchies. Let’s find out what that means.

Say your neighbor has a dog called Fido. It turns out, dogs and cats have a lot in common: 
name, sex, age, and color are attributes of both dogs and cats. 
Dogs can breathe, sleep and run the same way cats do. 
So it seems that we can define the base Animal class that would list the common attributes and behaviors.

A parent class, like the one we’ve just defined, is called a superclass. 
Its children are subclasses. Subclasses inherit state and behavior from their parent, 
defining only attributes or behaviors that differ. Thus, the Cat class would have the
meow method, and the Dog class the bark method.

Subclasses can override the behavior of methods that they inherit from parent classes. 
A subclass can either complete- ly replace the default behavior or just enhance it with some extra stuff.
