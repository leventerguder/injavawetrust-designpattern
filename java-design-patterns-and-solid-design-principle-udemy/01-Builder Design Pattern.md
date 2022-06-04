# Builder Design Pattern

- We have a complex process to construct an object involving multiple steps, then builder design pattern can help us.
- In builder we remove the logic related to object construction from "client" code & abstract it in separate classes.

## Implement a Builder

We start by creating a builder

- Identify the "parts" of the products & provide methods to create those parts.
- It should provide a method to "assemble" or build the product/object.
- It must provide a way/method to get fully built object out. Optionally builder can keep reference to a product it has
  built so the same can be returned again in future.

A director can be a separate class or client can play the role of director.

## Implementation Considerations

- You can easily create an immutable class by implementing builder as an inner static class.
- You will find this type of implementation used quite frequently even if immutability is not a main concern.
- The director role is rarely implemented as separate class, typically the consumer of the object instance or the client
  handles that role.
- Abstract builder is also not required if "product" itself is not part of any inheritance hierarchy. You can directly
  create concrete builder.
- If you are running into a "too many constructor arguments" problem then it's a good indication that builder pattern
  may help.

## Example of a Builder Pattern

- The java.lang.StringBuilder class as well as various buffer classes in java.nio package like ByteBuffer, CharBuffer
  are often given as examples of builder pattern.
- In my humble opinion they can be given as examples of builder pattern, but with an understanding that they don't match
  100% with GoF definition. These classes do allow us to build final object in steps , providing only a part of final
  object in one step. In this way they can be thought of as an implementation of builder pattern.

- There is another great example of builder pattern in Java8. The java.util.Calendar.Builder class is a builder.

## Pitfalls

- A little bit complex for new comers mainly because of 'method chaining' where builder methods return builder object
  itself.
- Possibility of partially initalized object; user code can set only a few or none of properties using witXXX methods
  and can build().
  If required properties are missing, build method should provide suitable defaults or throw exception.

## Summary

Think of builder pattern when you have a complex constructor or an object is built in multiple steps.