# Singleton Pattern
## GoF Definition

Ensure a class only has one instance , and provide a global point of access it.

## Concept

A class cannot have multiple instances. Once created , the next time onward , you use only the existing instance.
This approach helps you restrict unnecessary object creations in a centralized system.
This approach also promotes easy maintenance.

## Computer-World Example

In some specific software systems , you may prefer to use only one file system for the centralized management of resources.
Also , this pattern can implement a caching mechanism.

You notice a similar pattern when you consider the getRuntime() method of the java.lang.Runtime class.
It is implemented as an eager initialization of a Singleton class.


## Illustration

There are the key characteristics in the following implementation.

- The constructor is private to prevent the use of a "new" operator
- You'll create an instance of the class , if you did not create any such instance earlier;
otherwise, you'll simply reuse the existing one.
- To take care of thread safety, I use the "synchronized" keyword.

## Discussion

- The constructor is private , so you cannot instantiate the Singleton class (Captain) outside.
It helps us to refer the only instance that can exists in the system , and at the same time , you restrict 
  the additional object creation of the Captain class.

- The private constructor also ensures that the Captain class cannot be extended.  
So , subclass cannot misuse the concept.
  
- I used the "synchronized" keyword. So , multiple threads cannot involve in the instantiation process at the same time.
I am forcing each thread to wait its turn to get the method , so thread-safety is ensured. But synchronization is a costly
  operation and once the instance is created, it is an additional overhead.

## Questions & Answers Session

1 - Why are you complicating the program? You could simply write the Singleton class as follows.

<pre>
public class Captain {

    private static Captain captain;

    // We make the constructor private to prevent the use of "new"

    private Captain() {

    }

    public static Captain getCaptain() {

        if (captain == null) {
            captain = new Captain();
            System.out.println("New captain is elected for your team.");
        } else {
            System.out.println("You already have a captain for your team.");
            System.out.println("Send him for the toss.");
        }

        return captain;
    }
}
</pre>

It can work in a single threaded environment only but it cannot be considered a thread-safe implementation in a multithreaded environment.
Consider the following case. Suppose , in a multithreaded environment , two(or more) threads try to evaulate this ;

<pre>
if(captain == null)
</pre>

And if they see that the instance is not created yet , each of them will try to create a new instance.
As a result , you may end up with multiple instance of the class.

2 - Why did you use the term lazy initialization in the code ?

Because the singleton instance will not be created until the getCaptain() method is called here.


3 - What do you mean by lazy initialization ?

In simple terms , lazy initialization is a technique through which you delay the object creation process.
It says that you should create an object only when it is required. This approach can be helpful when you deal with expensive
processes to create an object.

4 - Why are you making the class final ? You have a private constructor that could prevent the inheritance. Is this correct?

Subclassing can be prevented in various way. Yes, in this example since the constructor is already marked with the  "private" keyword,
it was not needed. But if you make the Captain class final , as shown in the example , that approach is considered a better practise.
It is effective when you consider a nested class.

5 -  Are there any alternative approaches for modelling singleton design patterns?

## Eager Initialization
An eager initialization approach has the following pros and cons.

Pros 
- It is straightforward and cleaner.
- It is the opposite of lazy initialization but still thread safe.
- It has a small lag time when the application is in execution mode because everything is already loaded in memory.

Cons
- The application takes longer to start because everything needs to be loaded first. 

## Bill Pugh's Solution

Bill Pugh cam up with a different approach using a static nested helper class.

<pre>
public class Captain {

    private Captain() {
        System.out.println("A captain is elected for your team.");
    }

    private static class SingletonHelper {
        /* Nested class is referenced after getCaptain() is called */
        private static final Captain captain = new Captain();
    }

    public static Captain getCaptain() {
        return SingletonHelper.captain;
    }
}
</pre>

This method does not use a synchronization technique and eager initialization.
Notice that the SingletonHelper class comes into consideration only when someone invokes the getCaptain() method.

## Double-Checked Locking

There is another popular approach, which is called double-checking locking.
if you notice our synchronized implementation of singleton pattern , you may find that synchronization operations are costly
in general and the approach is useful for some initial threads that might break the singleton implementation.
But in later phases, the synchronization operations might create additional overhead.
To avoid that problem, you can use a synchronized block inside an if condition, as shown in the following code, 
to ensure that no unwanted instance is created.

6 - In short , if I need to create synchronized code , I can use the synchronized keyword in Java.
Is this correct ?

Yes, JVM ensures this. Internally, it uses locks on a class or an object to ensure that only one thread is accessing the data.
In Java, you can apply this keyword to a method or statements (or , block of code)
In this chapter , I have exercised it in both ways.

In the initial implementation, you used the synchronized method , and in double-checked locking , you saw the use of the other version

7 - Why are multiple object creations a big concern?

- In real-world scenarios , object creations are treated as costly operations.
- Sometimes you need to implement a centralized system for easy maintenance , because it can help you provide
a global access mechanism.

8 - When should I consider singleton patterns ?

Use of a pattern depends on particular use cases. But in general, you can consider singleton patterns to implement 
a centralized management system, to maintain a common log file, to maintain thread pools in a multithreaded environment,
to implement caching mechanism or device drivers, and so forth.

9 - I have some concern about the eager initialization example.
Following the definition, it appears that it is not exactly eager initialization.
This class is loaded by the JVM only when it is referenced by code during execution of the application.
That means this is also lazy initialization. Is this correct ?

Yes, to some extent your observation is correct. 
There is a debate on this discussion. In short, it is eager compared to the previous approaches. 
You saw that when you called only the dummyMethod(); still, you instantiated the singleton, 
though you did not need it. So, in a context like this, it is eager but it is lazy in the sense that 
the singleton instantiation will not occur until the class is initialized. 
So, the degree of laziness is the key concern here.


