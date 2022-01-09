# Iterator

Iterator is a behavioral design pattern that lets you traverse elements of a collection without exposing its underlying
representation. (list,stack, tree etc.)

## Solution

The main idea of the Iterator pattern is to extract the traversal behavior of a collection into a separate object called
an Iterator.

In addition to implementing the algorithm itself, an iterator object encapsulates all of the traversal details, such as
the current position and how many elements are left till the end.

Because of this, several iterators can go through the same collection at the same time, independently of each other.

Usually, iterators provide one primary method for fetching elements of the collection. The client can keep running this
method until it doesn't return anything, which means that the iterator has traversed all of the elements.

All iterators must implement the same interface. This makes the client code compatible with any collection type or any
traversal algorithm as long as there's a proper iterator. If you need a special way to traverse a collection, you just
create a new iterator class, without having to change the collection or the client.

## Applicability

- Use the Iterator pattern when your collection has a complex data structure under the hood, but you want to hide its
  complexity from clients. (either for convenience or security reasons)

  The iterator encapsulates the details of working with a complex data structure, providing the client with several
  simple methods of accessing the collection elements. While this approach is very convenient for the client, it also
  protects the collection from careless or malicious actions which the client would be able to perform if working with
  the collection directly.

- Use the pattern to reduce duplication of the traversal code across your app.

  The code of non-trivial iteration algorithms tends to be very bulky. When placed within the business logic of an app,
  it may blur the responsibility of the original code and make it less maintainable. Moving the traversal code to
  designated iterators can help you make the code of the application more lean and clean.

- Use the Iterator when you want your code to be able to traverse different data structures or when types of these
  structures are unknown beforehand.

  The pattern provides a couple of generic interfaces for both collections and iterators. Given that your code now uses
  these interfaces, it'll still work if you pass it various kinds of collections and iterators that implement these
  interfaces.

## Pros and Cons

- Sinle Responsibility Principle. You can clean up the client code and collections by extracting bulky traversal
  algorithms into separate classes.
- Open/Closed Principle. You can implement new types of collections and iterators and pass them to existing code without
  breaking anything.
- You can iterate over the same collection in parallel because each iterator object contains its own iteration state.
- For the same reason, you can delay an iteration and continue it when needed.
- (-) Applying the pattern can be an overkill if your app only works with simple collections.
- (-) Using an iterator may be less efficient than going through elements of some specialized collections directly.

## Relations with Other Patterns

- You can use Iterators to traverse Composite trees
- You can use Factory Method along with Iterator to let collection subclasses return different types of iterators that
  are compatible with the collections.
- You can use Memento along with Iterator to capture the current iteration state and roll it back if necessary.
- You can use Visitor along with Iterator to traverse a complex data structure and execute some operation over its
  elements even if they all have different classes.
