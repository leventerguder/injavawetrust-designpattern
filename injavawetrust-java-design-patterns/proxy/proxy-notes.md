# Proxy Pattern

## GoF Definition

Provide a surrogate or placeholder for another object to control access to it.

## Concept

A proxy is a basically a substitute for an intended object. Access to the original object is not always possible
due to many factors. For example , it is expensive to create, it is in need of being secured , it resides in 
a remote location, and so forth.
The proxy pattern helps us in similar context. When a client deals with a proxy object , it assumes that it is talking
to actual object. So, in this pattern , you may want to use a class that can perform as an interface to something else.

## Computer-World Example

In the programming world, to create multiple instances of a complex object (heavy object) is costly . 
So, whenever you are in need, you can create multiple proxy
objects that point to the original object. This mechanism can also help save your system/application memory. 
An ATM can implement this pattern to hold proxy objects for bank information that may exist on a remote server.

In the java.lang.reflect package , you can have a Proxy class and an InvocationHandler interface 
that supports a similar concept.

The java.rmi.* package also provides methods through which an object on one Java virtual machine can invoke methods
on an object that resides in a different Java virtual machine.

## Questions & Answers

1 - What are the different types of proxies ?

These are the common types :
- Remote proxies : Hide the actual object that stays in a different address space.
- Virtual proxies : Perform optimization techniques, such as the creation of a heavy object on a demand basis.
- Protection proxies : Deal with different access rights.
- Smart reference : Performs additional housekeeping work when an object is accessed by a client.
A typical operation is counting the number of references to the actual object at a particular moment.


2 - You could create the ConcreteSubject instance in the proxy class constructor ,

<pre>
class Proxy extends Subject {
    static Subject cs;

    public Proxy() {
        //Instantiating inside the constructor
        cs = new ConcreteSubject();
    }

    @Override
    public void doSomeWork() {
        System.out.println("Proxy call happening now...");
        cs.doSomeWork();
    }
}

</pre>

is this correct ?
Yes , you could do that. But if you follow this design , whenever you instantiate a proxy object,
you need to instantiate an object of the ConcreteSubject class also.
So , this process may end up creating unnecessary objects.


3 - But in this lazy instantiation technique, you may create unnecessary objects in a multithread application.
Is this correct?

Yes. In the discussions on the singleton pattern, I analyzed some alternative approaches to deal with
a multithreaded environment. You can always refer to those discussions in situations like this. 
(For example, in this particular scenario, you can implement a synchronization technique, 
or a locking mechanism, or a smart proxy, and so forth to ensure that a particular object is locked 
before you grant access to the object.)


4 - Can you give an example of a remote proxy ?

Suppose , you want to call a method of an object , but the object is running in a different address space
(different locations or different computers).
How do you proceed ? With the help of remote proxies , you can call the method on the proxy object
which in turn forwards the call the actual object that is running on the remote machine.
(Java RMI / Remote Method Invocation)

5 - When can you use a virtual proxy ?

It can be used to avoid multiple loadings of an extremely large image.

6 - When can you use a protection proxy ?

The security team in an organization can implement a protection
proxy to block Internet access to specific websites.

For simplicity, let’s assume that at present, we have only three registered users 
who can exercise the doSomeWork() proxy method.
You must agree, when the system will reject this kind of unwanted access; 
there is no point in making a proxy object. 
So, if you avoid instantiating an object of ConcreteSubject in the Proxy class constructor, 
you can easily avoid these kinds of additional objects creation.

7 - Proxies act like decorators. Is this correct ?

You can implement a protection proxy similar to decorators but you should not forget the intent.
Decorators focus on adding responsibilities , but proxies focus on controlling the access to an object.
Proxies differ from each other with their types and implementations. 
Also, in general, proxies work on the same interface but decorators can work on extended interfaces.
So, if you can remember their purposes , in most cases, you can clearly distinguish them from decorators.

8 - What are the cons associated with proxies ?

If you are careful enough in your implementation, the pros are much greater than cons , but

- You can raise your concern about the response time.
Since you are not directly talking to the actual object , it is possible that the response time through these proxies is longer.
  
- You need to maintain additional code for the proxies.
- A proxy cna hide the actual responses from objects, which may create confusion in special scenarios.
