# Observer Pattern

## GoF Definition

Define one-to-many dependency between objects so that when one object changes state,
all its dependents are notified and updated automatically.

## Concept

In this pattern, there are many observers(objects) that are observing a particular subject
(also an object). Observers register themselves to a subject to get a notification when there is a change made inside
that subject. 
When they lose interest of the subject , they simply unregister from the subject.
It is also referred to as the publish-subscribe pattern

The whole idea can be summarized as follows: Using this pattern, 
an object (subject) can send notifications to multiple observers (a set of objects) at the same time.

## Computer-World Example

In the world of computer science, consider a simple UI-based example. 
Let’s assume that this UI is connected to a database. 
A user can execute a query through that UI, and after searching the database, the result is returned in the UI. 
Here you segregate the UI from the database in such a way that if a change occurs in the database, the UI is notified, 
and it updates its display according to the change.

In Java, you can see the use of event listeners. these listeners are observers only. 
In Java, you have a ready-made class called Observable, which can have multiple observers. 
These observers need to implement the Observer interface.

The Observer interface has an “update” method: void update(Observable o,Object arg). 
This method is invoked whenever a change occurs in the observed object. 
Your application needs to call the Observable object’s notifyObservers method  to notify about the change to the observers.


## Questions & Answers

1 - If I have only one observer , then I may not need to set up the interface. Is this correct ?

Yes. But if you want to follow the pure object-oriented programming guidelines, 
programming to an interface/abstract class is always considered a better practice.
So, you should prefer interfaces (or abstract classes) over concrete classes.
Also, usually, you have multiple observers, and you want them to implement the methods in a systematic manner 
that follows the contract. You get benefit from this kind of design.

2 - Can you have different types of observers in the same application?

Yes. This is why I have played with three observers from two different classes. 
But you should not feel that for each observer; you need to create a different class.
Consider a real-world scenario. When a company releases or updates new software, 
the company business partners and the customers who purchased the software get notifications. 
In this case, the business partners and the customers are two different types of observers.

3 - Can I add or remove observers at runtime?

Yes. At the beginning our program, Roy registered to get
notifications; then he unregistered and later reregistered.

4 - It appears that there are similarities between the observer
pattern and the chain of responsibility pattern. Is this correct?

In an observer pattern, all registered users get notifications at the same time, 
but in a chain of responsibility pattern, objects in the chain are notified one by one, 
and this process continues until the object fully handles the notification

5 - This model supports one-to-many relationships. Is this correct?

Yes. Since a subject can send notifications to multiple observers, 
this kind of dependency is clearly depicting a one-to-many relationship

6 - If you already have these ready-made constructs, why are you writing your own code?

Changing the ready-made constructs to your preference is not always easy. 
In many cases, you cannot change the built-in functionalities at all. 
When you try to implement the concept yourself, you may have a better understanding of how to use those ready-made constructs.

Consider some typical scenarios.

In Java, Observable is a concrete class. It does not implement an interface. 
So, you can’t create your own implementation that works with Java’s built-in Observer API.

Java does not allow multiple inheritance. So, when you have to extend the Observable class, 
you have to keep in mind the restriction. This may limit the reuse potential.

The signature of the setChanged method in an Observable is as follows: protected void setChanged(). 
That means to use it, you need to subclass Observable class. 
This violates one of the key design principles, which basically says to prefer composition over inheritance.

7 - What are the key benefits of the observer pattern?

The subject and its registered users(observers) are making a loosely coupled system. 
They do not need to know each other explicitly.

No modification is required in subjects when you add or remove an observer from its notification lists.

Also, you can independently add or remove observers at any time.

8 - What are the key challenges associated with an observer pattern?

Undoubtedly, memory leak is the greatest concern when you deal with any event-based mechanism. 
An automatic garbage collector may not always help you in this context. 
You can consider such a case where the deregister/unregister operations are not performed properly.

The order of notification is not dependable.

Java’s built-in support for the observer pattern has some key restrictions, which I discussed earlier.

One of them forces you to prefer inheritance over composition, 
so it clearly violates one of the key design principles that prefers the opposite.
