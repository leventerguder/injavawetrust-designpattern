# Memento Pattern

## GoF Definition
Without violating encapsulation, capture and externalize an object’s internal state 
so that the object can be restored to this state later.

## Concept

In your application, you may need to support “undo” operations. 
To achieve this, you need to record the internal state of an object. 
So, you must save this state information in a place that can be referred again to revert back the old state of the object. 
But in general, objects encapsulate their states, and those states are inaccessible to the outer world.
So, if you expose the state information, then you violate encapsulation.
The dictionary meaning of memento is reminder (of past events). 
So, you can guess that using this pattern, you can restore an object to its previous state, 
but it ensures that you achieve your goal without violating the encapsulation.

## Computer-World 

In a drawing application, you may need to revert back to a prior state.

## Questions & Answers

1 - I can restore the previous snapshot/restore point. But in a real- life scenario, 
I may have multiple restore points. How can you implement that using this design pattern?


You can use an ArrayList in such a case. Consider the following program.
The Originator class and Memento class are same as before, so I am presenting the modified Caretaker class only. 
I am using the following line of code in the upcoming implementation.

2 - In many applications, I notice that the memento class is presented as an inner class of Originator. 
Why are you not following that approach?

The memento design pattern can be implemented in many different ways (for example, 
using package-private visibility or using object serialization techniques). 
But in each case, if you analyze the key aim, you find that once the memento instance is created by an originator, 
no one else besides its creator is allowed to access the internal state (this includes the caretaker/client).
A caretaker’s job is to store the memento instance (restore points in our example) and supply them back when you are in need.
So, there is no harm if your memento class is public. You can just block the public setter method for the memento. 
I believe that it is sufficient enough.
