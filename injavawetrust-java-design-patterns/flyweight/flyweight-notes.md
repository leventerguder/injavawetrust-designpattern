
# Flyweight Pattern

## GoF Definition

Use sharing to support large numbers of fine-grained objects efficiently.

## Concept

A flyweight is a shared object that can be used in multiple contexts simultaneously.
The flyweight acts as an independent object in each context.
It is indistinguishable from an instance of the object that's not shared.
Flyweights cannot make assumptions about the context in which they operate.

When you consider flyweight pattern , you need to remember following points :
- The pattern is useful when you need a large number of similar objects that are unique in terms
of only a few parameters and most of the sutffs are common in general.
  
- A flyweight is an object. It tries to minimize memory usage by sharing data as much as possible with other
similar objects. Sharing objecst may allow their usage at fine granularities with minimum costs.
  
- Two common terms are used in this context : extrinsic and intrinsic
An intrinsic state is stored/shared in the flyweight object, and it is independent of flyweight's context.
  On the other hand, an extrinsic state varies with flyweight's context, which is why they cannot be shared.
Client objects maintain the extrinsic state, and they need to pass this to a flyweight.
Note tht, if required , clients can also computer the extrinsic state on the fly using flyweights. 
  
- Experts suggest that while implementing this pattern , we should make intrinsic states immutable.

## Computer World Example

Suppose that you want to make a website where different users can compile and 
execute the programs with their preferred computer languages, such as Java, C++, C#, and so forth.

If you need to set up a unique environment for each individual user within a short period of time, 
your site will overload and the response time of the server will become so slow 
that no one will be interested in using your site.

So, instead of creating a new programming environment for every user, 
you can make a common programming environment (which supports different programming language
with/without minor changes) among them. And to check the existing/available programming environment 
and to make decisions whether you need to create a new one or not, you can maintain a factory.

Consider another example. Suppose that in a computer game, 
you have large number of participants whose core structures are same, 
but their appearances vary (e.g., different states, colors, weapons, etc.)

Therefore, assume that if you need to create (or store) all of these objects with 
all of these variations/states, the memory requirement will be huge.

So, instead of storing all of these objects, you can design your application in such way 
that you create these instances with common properties (flyweights with
intrinsic state) and your client object maintains all of these variations (extrinsic states).

In Java, you may notice the use of this pattern when you use the wrapper classes , such as java.lang.Integer
java.lang.Short , where the static method valueOf() replicates a factory method.
(it is worth remembering that some of the wrapper classes,
such as java.lang.Double and java.lang.Float, do not follow this pattern.) 
The Spring pool is another example of a flyweight.
