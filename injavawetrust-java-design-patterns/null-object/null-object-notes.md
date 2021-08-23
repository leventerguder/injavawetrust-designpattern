# Null Object Pattern


Wikipedia says, “In object-oriented computer programming, a null object is an object with no referenced value or 
with defined neutral (null) behavior. The null object design pattern describes the uses of such objects and their 
behavior (or lack thereof ). It was first published in the Pattern Languages of Program Design book series.” 
The Hillside Group sponsors Pattern Languages of Programs (PLoP) annual conferences.
The pattern can implement a “do-nothing” relationship or it can provide a default behavior when an application encounter 
with a null object instead of a real object.

In simple words, the core aim is to make a better solution by avoiding “null objects check” or “null collaborations check”
through if blocks. Using this pattern, you try to encapsulate the absence of an object by providing a default behavior that does nothing.

## Concept

The notable characteristic of this pattern is that you do not need to do anything (or store nothing) 
when you invoke an operation on a null object. 

## Computer World Example

Assume that in a client server architecture, the server does some kinds of processing based on the client input. 
The server should be intelligent enough, so that it does not initiate any calculation unnecessarily. 
Prior processing the input, it may want to do a cross verification to ensure whether it needs to start 
the process at all or it should ignore an invalid input. You may notice the use of the command pattern with 
a null object pattern in such a case.
Basically, in an enterprise application, you can avoid a large number of null checks and if/else blocks using this design pattern. 
The following implementation can give you a nice overview about this pattern.


## Questions & Answers

1 - At the beginning, I see that an additional object is created. Is it intentional?
To save memory, I followed a singleton design pattern mechanism that supports 
early initialization in the structure of the NullVehicle class. 
I do not want to create a NullVehicle object for each invalid input. 
It is very likely that the application may need to deal with a larger number of invalid input. If you do not guard this situation,
a large number of NullVehicle objects reside in the system (which are basically useless) and those occupy more memory. 
As a result, you may notice some typical side effects (for example, the system becomes slow, etc.).

2 -  To implement a simple null object pattern, I can ignore different object counters(that used in the prior example) 
and reduce lots of code. Is this correct?

Yes. Ideally, consider the following code segment.

<pre>
List<Vehicle> vehicleList=new ArrayList<Vehicle>(); 
vehicleList.add(new Bus());
vehicleList.add(new Train()); 
//vehicleList.add(null);
vehicleList.add(new NullVehicle());

for( Vehicle vehicle : vehicleList)
{
 vehicle.travel();
}
</pre>

3 - When should I use this pattern?

- The pattern is useful if you do not want to encounter with a NullPointerException in Java in some typical scenarios.
(For example, if by mistake, you try to invoke a method of a null object.)
- You can ignore lots of “null checks” in your code.
- Absence of these null checks make your code cleaner and easily maintainable.

4 - What are the challenges associated with null object patterns?

- In some cases, you may want to get closure to the root cause of failure. So, if you throw a NullPointerException 
- that makes more sense to you, you can always handle those exceptions 
- in a try/catch or in a try/catch/finally block and update the log information accordingly.

- The null object pattern basically helps us to implement a default behavior when you unconsciously want to deal 
- with an object that is not present at all. But this approach may not suite every possible object in a system.

- Incorrect implementation of a null object pattern can suppress true bags that may appear as normal in your program execution.
- Creating a proper null object in every possible scenario may not be easy. In some classes, this may cause a change that influences the class methods.

5 - Null objects work like proxies. Is this correct?
No. In general, proxies act on real objects at some point of time and they may also provide some behavior. But a null object should not do any such thing.

6 - The null object pattern is always associated with NullPointerException. Is this correct?

The concept is same, but the exception name can be different or language specific. 
For example, in Java, you are using it to guard java.lang.NullPointerException but in a language like C#, 
you may use this pattern to guard System.NullReferenceException
