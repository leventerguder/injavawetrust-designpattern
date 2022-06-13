# Adapter Design Pattern

We have an existing object which provides the functionality that client needs. But client code can't use this object
because it expects an object with different interface.

Using adapter design pattern we make this existing object work with client by adapting the object to client's expected
interface.

This pattern is also called as wrapper as it "wraps" existing object.

## Implement an Adapter

We start by creating a class for Adapter

- Adapter must implement the interface expected by client.
- First we are going to try out a class adapter by also extending from our existing class.
- In the class adapter implementation we're simply going to forward the method to another method inherited from adaptee.
- Next for object adapter, we are only going to implement target interface and accept adaptee as constructor argument
  in adapter i.e make use of composition.

## Implementation Considerations

How much work the adapter does depends upon the differences between target interface and object being adapted. If method
arguments are same or similar adapter has very less work to do.

Using class adapter "allows" you to override some of the adaptee's behaviour. But this has to be avoided as you end up
with adapter that behaves differently than adaptee.Fixing defects is not easy anymore.

Using object adapter allows you to potentially change the adaptee object to one of its subclasses.

## Design Considerations

In java a "class adapter" may not be possible if both target and adaptee are concrete classes. In such cases the object
adapter is the only solution.Also since there is no private inheritance in Java, it's better to stick with object
adapter.

A class adapter is also called as two way adapter, since it can stand in for both the target interface and for the
adaptee. That is we can use object of adapter where either target interface is expected as well as where an adaptee
object is expected.

## Example of Adapter

The java.io.InputStreamReader and java.io.OutputStreamWriter classes are examples of object adapters.

These classes adapt existing InputStream/OutputStream to a Reader/Writer interface.

## Comparison with Decorator

Adapter ;

- Simply adapts an object to another interface without changing behaviour.
- Not easy to use recursive composition, that is an adapter adapting another adapter since adapters change interface.

Decorator;

- Enhances object behaviour without changing its interface.
- Since decorators do not change the interface, we can do recursive composition or in other words decorate a decorator
  with ease. Since a decorator is indistinguishable from main object.

## Benefits

Using target interface and adaptee class to extend our adapter we can create a "class adapter" in java.
However, it creates an object which exposes unrelated methods in parts of your code, polluting it. Avoid class adapters!
It is mentioned here only for sake of completeness.

It is tempting to do a lot of things in adapter besides simple interface translation. But this can result in an adapter
showing different behaviour than the adapter object.

## Summary

We have an existing object with required functionality but the client code is expecting a different interface than our
object.

A class adapter is one where adapter inherits from class of object which is to be adapted and implements the interface
required by client code. This adapter type should be avoided.

An object adapter uses composition. It'll implement the target interface and uses an adaptee object composition to
perform translation. This allows us to use subclasses of adaptee in adapter,

We have existing object that provides needed functionality but client code needs expects different interface.
Adapter works as interface translator. We adapt our object to new interface using Adapter.

A class adapter is also called as two way adapter.
Class adapters already extend from the original class and they also inherit from the target interface.
This means objects of such class can be used where either of those interface/class is expected.