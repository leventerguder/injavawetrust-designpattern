# Template Method Design Pattern

Template Method is a behaviroal design pattern. Template Method design pattern is used to create a method a stub and
deferring some of steps of implementation to the subclasses.

Template method defines the steps to execute an algorithm and it can provide default implementation that might be common
for all or some of the subclasses.

## Template Method Design Pattern in JDK

- All non-abstract methods of java.io.InputStream, java.io.OutputStream, java.io.Reader and java.io.Writer
- All non-abstract methods of java.util.AbstractList, AsbstractSet , AbstractMap

## Template Method Design Pattern Important Points

- Template method should consists of cerain steps whose order is fixed and for some of the methods , implementation
  differs from base class to subclass. Template method should be final.
- Most of the times, subclasses call methods from super class but in template pattern, superclass template methods call
  methods from subclasses, this is known as "Hollywood Principle".
  Don't call us, we'll call you.
- Methods in base class with default implementation are referred as Hooks and they are intended to be overridden by
  subclasses, if you want some of the methods to be not overridden, you can make them final, for example in our case we
  can make buildFoundation() method final because if we don’t want subclasses to override it.
