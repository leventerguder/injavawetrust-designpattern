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

3 - But you are still using the getter method getStateId(). Does it not violate the encapsulation?
There is a lot of discussion and debate around this area—whether you should use getter/setter or not, 
particularly when you consider encapsulation. I believe that it depends on the amount of strictness that you want to impose. 
For example, if you just provide getter/setters for all fields without any reason, that is surely a bad design. 
The same thing applies when you use all the public fields inside the objects. 
But sometimes the accessor methods are required and useful. 
In this book, my aim is to encourage you learn design patterns with simple examples. 
If I need to consider each and every minute detail such as this, you may lose interest. 
So, in these examples, I show a simple way to promote encapsulation using the memento pattern. 
But, if you want to be stricter, you may prefer to implement the memento class as an inner class of the originator 
and modify the initial implementation, like in the following.

4 - What are the key advantages of using a memento design pattern?

The biggest advantage is that you can always discard the unwanted changes and restore it to an intended or stable state.
You do not compromise the encapsulation associated with the key objects that are participating in this model.
Maintains high cohesion
Provides an easy recovery technique.

5 - What are key challenges associated with a memento design pattern?

A high number of mementos require more storage. At the same time, they put additional burdens on a caretaker.
The preceding point increases maintenance costs in parallel.
You cannot ignore the time to save these states. The additional time to save the states decreases the overall performance of the system.

6 - In these implementations, if you make the originator’s state public, 
then our clients also could directly access the states. Is this correct?

Yes. But you should not try to break the encapsulation. 
Notice the GoF definition that begins “without violating encapsulation...”

7 - In these implementations, the memento class does not have a public setter method. What is the reason behind this?

Go through the answer of question 2 again. And read the comment in the code that says, 
“Only the originator that created a memento is allowed to access it.” 
So, if you do not provide a public setter method for your memento class, 
the caretaker or client cannot modify the memento instances that are created by an originator.

8 - In these implementations, you could ignore the getter method of the memento by using package-private 
visibility for stateId. For example, you could code memento class like the following.

<pre>
class Memento {
    //private int stateId;
    int stateId;//←-Change is here public
     Memento(int stateId)
    {
        this.stateId = stateId;
    }
    ....
}
</pre>

So, this kind of visibility is slightly more open than private visibility and other classes in the same package 
can access a class member. So, in this case, the intended classes need to be placed inside the same package. 
At the same time, you need to accept that all other classes inside the same package will have the direct 
access to this state. So, you need to be careful enough when you place the classes in your special package.

9 - I am confused. To support undo operations, which pattern should I prefer—memento or command?

The GoF told us that these are related patterns. It primarily depends on how you want to handle the situation. 
For example, suppose that you are adding 10 to an integer. After this addition, you want to undo the operation by doing 
the reverse operation (i.e., 50 + 10 = 60, so to go back, you do 60 –10 = 50). In this type of operation, 
we do not need to store the previous state.

But consider a situation where you need to store the state of your objects prior to the operations. 
In this case, memento is your savior. So, in a paint application, you can avoid the cost of undoing a paint operation. 
You can store the list of objects prior to executing the commands. 
This stored list can be treated as a memento in this case. You can keep this list with the associated commands. 
I suggest that you read the nice online article at www. developer.com/design/article.php/3720566/Working-With- Design-Patterns-Memento.htm.

So, an application can use both patterns to support undo operations.

Finally, you must remember that storing a memento object is mandatory in a memento pattern, 
so that you can roll back to a previous state; but in a command pattern, it is not necessary to store the commands. 
Once you execute a command, its job is done. If you do not support “undo” operations, 
you may not be interested in storing these commands at all.

10 - You talked about deep copy after the first implementation. Why do I need that?

In Chapter 2 (the prototype pattern), I discussed shallow copy and deep copy. 
You can refer to this discussion for your reference. To answer your question, let’s analyze what is special about 
deep copy with a simple example. Consider the following example.

Shallow Copy vs. Deep Copy in Java
You clone with the clone() method in Java, but at the same time, you need to implement the Cloneable interface 
(which is a marker interface) because the Java objects that implement this Cloneable interface are only eligible for cloning. 
The default version of clone()creates a shallow copy. To create the deep copy, you need to override the clone() method.

