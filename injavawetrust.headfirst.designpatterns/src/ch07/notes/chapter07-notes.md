# The Adapter and Facade Pattern

The Adapter Pattern converts the interface of a class into another interface clients expect.
Adapter lets classes work together that couldnt otherwise because of incompatible interfaces.

The Adapter Pattern is full of good object-oriented design principles: 
check out the use of object composition to wrap the adaptee with an altered interface.
This approach has the added advantage that we can use an adapter with any subclass of the adaptee.

## Object and class adapters

There are actually two kinds of adapters : object adapters and class adapters.


## Real-world adapters

Enumerators

The Enumeration interface allows you to step through the elements of a collection without knowing
the specifics of how they are managed in the collection.

Iterators

The more recent Collection classes use an Iterator interface that, like the Enumeration interface,
allows you to iterate through a set of items in a collection, and adds the ability to remove items.
