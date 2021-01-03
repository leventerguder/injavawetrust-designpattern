
## Welcome to Design Patterns ##

Someone has already solved your problems.
The best way to use patterns is to load your brain with them and then recognize places in your designs 
and existing applications where you can apply them.
Instead of code reuse , with pattern you get experience reuse.


HAS-A can be better than IS-A
The HAS-A relationship is an interesting one : 
each duck has a FlyBehavior and QuackBehavior to which it delegates flying and quacking

When you put two classes together like this you are using composition.
Instead of inheriting their behavior , the ducks get their behavior by being composed with the right behavior object.


##### Design Principle #####
Favor composition over inheritance


The Strategy Pattern defines a family of algorithms , encapsulates each one , and makes them interchangeable.
Strategy lets the algorithm vary independently from clients that use it.

Design Patterns give you a shared vocabulary with other developers.
Once you have got the vocabulary you can more easily communicate with other developers and 
inspire those who don't know patterns to start learning them.

It also elevates your thinking about architectures by letting you think at the pattern level , 
not the nitty gritty object level.

##### The power of a shared pattern vocabulary #####
When you communicate using patterns you are doing more than just sharing LINGO.

- Shared pattern vocabularies are POWERFUl
When you communicate with another developer or your team using patterns , you are communicating not just a
pattern name but a whole set of qualities , characteristics and constraints that the pattern represents.

- Patterns allow you to say more with less.
When you use a pattern in a description , other developers quickly know precisely the design you have in mind.

- Talking at the pattern level allows you to stay "in the design" longer
Talking about software systems using patterns allows you to keep the discussion at the design level
without having to dive down to the nitty gritty details of implementing objects and classes.

- Shared vocabularies can turbo charge your development team.
A team well versed in design patterns can move more quickly with less room for misunderstanding.

- Shared vocabularies encourage more junior developers to get up to speed.
When senior developers make use of design patterns , junior developers also become motivated to learn them.


#####
Desing Patterns are higher level than libraries.
Design Patterns tell us how to structure classes and objects to solve certain problems.

Remember , knowing concept like abstraction , inheritance and polymorphism do not make you a good object oriented designer.
A design guru thinks about how to create flexible designs that are maintainable and that can cope with change.

##### OO Basics #####
Abstraction
Epcasulation
Polymorphism
Inheritance

##### OO Principles #####
Encapsulate what varies
Favor composition over inheritance
Program to interfaces not implementations

##### OO Patterns #####

Strategy - defines a family of algorithms , encapsulate each one , and makes them inerchangeable
Strategy lets the algorithm vary independently from clients that use it.

##### Bullet Points #####
- Knowing the OO basics does not make you a good OO designer.
- Good OO designs are reusable , extensible and maintainable.
- Patterns show you how to build systems with good OO design qualities
- Patterns are proven object-oriented experience
- Patterns don't give you code , they give you general solutions to design problems.
- Patterns aren't invented , they are discovered.
- Most patterns and principles address issues of change in software
- Most patterns allow some part of a system to vary independently of all other parts.
- We often try to take what varies in a system and encapsulate it.
- Patterns provide a shared language that can maximize the value of your communication with other developers.
