
# Keeping Your Objects in the know #

The Observer Pattern is one of the most heavily used patterns in the JDK, and it's incredibly useful.

## Meet the Observer pattern ##
You know how newspaper or magazine subscriptions work : 

- A newspaper publisher goes into business and begins publishing newspapers.
- You subscribe to a particular publisher , and every time there's a new edition it gets delivered to you. As long as you remain a subscriber , you get new newspapers.
- You unsubscribe when you dont want papers anymore, and they stop being delivered.
- While the publisher remains in business, people,hotels, airlines and other businesses constantly subscribe and unsubscribe to the newspaper.

Publishers + Subscribers = Observer Pattern
if you understand newspaper subscriptions , you pretty much understand the Observer Pattern , only we call the publisher the SUBJECT and the subscribers the OBSERVERS.

## The Observer Pattern defined ##

When you are trying to picture the Observer Pattern , a newspaper subscription service with its publisher and subscribers is a good way to visualize the pattern.
 
In the real world however , you'll typically see the Observer Pattern defined like this.

The Observer Pattern defines a one-to-many dependency between objects so that when one object change state , all of its dependents are notified and updated automatically.

- The Observer Pattern defines a one-to-many relationship between a set ob objects.
- When the state of one object changes all of its dependents are notified.

The subject and observers define the one to many relationship.
The observers are dependent on the subject such that when the subject's state changes , the observers get notified.
Depending on the style of notification , the observer may also be updated with new values.

## The Power of Loose Coupling ##

When two objects are loosely coupled , they can interact , but have very little knowledge of each other.

The Observer Pattern provides an object design where subjects and observers are loosely coupled.

Why ?

- The only thing the subject knows about an observer is that it implements a certain interface (the Observer interface)
It doesn't need to know the concrete class of the observer , what it does , or anything else about it.
  
- We can add new observers at any time.

- We never need to modify the subject to add new types of observers.

- We can reuse subjects or observers independently of each other.

- Changes to either the subject or an observer will not affect the other.

## Design Principle ##
Strive for loosely coupled designs between objects that interact.

Loosely coupled designs allow us to build flexible OO systems that can handle change because they minimize the interdependency between objects.
