# Iterator Design Pattern

https://www.journaldev.com/1716/iterator-design-pattern-java

Iterator Design Pattern is one of the behavioral pattern.Iterator pattern is used to provide a standard way to traverse
through a group of Objects. Iterator pattern is widely used in Java Collection Framework. Iterator interface provides
methods for traversing through a collection.

According to GoF, iterator design pattern intent is:

Provides a way to access the elements of an aggregate object without exposing its underlying representation.

Iterator pattern is not only about traversing through a collection, we can provide different kind of iterators based on
our requirements.

Iterator design pattern hides the actual implementation of traversal through the collection and client programs just use
iterator methods.

## Iterator Design Pattern Important Points

- Iterator pattern is useful when you want to provide a standard way to iterate over a collection and hide the
  implementation logic from client program.
- The logic for iteration is embedded in the collection itself and it helps client program to iterate over them easily.

## Iterator Design Pattern in JDK

We all know that Collection framework Iterator is the best example of iterator pattern implementation but do you know
that java.util.Scanner class also Implements Iterator interface.
