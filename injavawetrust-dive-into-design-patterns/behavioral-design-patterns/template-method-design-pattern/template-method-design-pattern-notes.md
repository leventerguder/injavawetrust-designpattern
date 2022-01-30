# Template Method

Template Method is a behavioral design pattern that defines the skeleton of an algorithm in the superclass but lets
subclasses override specific steps of the algorithm without changing its structure.

Template Method is a behavioral design pattern that allows you to define a skeleton of an algorithm in a base class and
let subclasses override the steps without changing the overall algorithm's structure.

## Usage of the pattern in Java

The Template Method pattern is quite common in Java frameworks. Developers often use it to provide framework users with
a simple means of extending standard functionality using inheritance.

Here are some examples :

- All non-abstract methods of java.io.InputStream , java.io.OutputStream, java.io.Reader and java.io.Writer
- All non-abstract methods of java.util.AbstractList , java.util.AbstractSet and java.util.AbstractMap
- javax.servlet.http.HttpServlet , all the doXXX methods by default send an HTTP 405 "Method Not Allowed" error as
  response. YOu are free to override any of them.

Template Method can be recognized by behavioral methods that already have a "default" behavior defined by the base
class.

## Solution

The Template method pattern suggests that you beak down an algorithm into a series of steps, turn these steps into
methods, and put a series of calls to these methods inside a single "template method."

## Real World Analogy

A typical architectural plan can be slightly altered to better fit the client's needs.

## Applicability

- Use the Template Method pattern when you want to let clients extend only particular steps of an algorithm, but not the
  whole algorithm or its structure.

  The Template Method lets you turn a monolithic algorithm into a series of individual steps which can be easily
  extended by subclasses while keeping intact the structure defined in a superclass

- Use the Pattern when you have several classes that contain almost identical algorithms with some minor differences. As
  a result, you might need to modify both classes when the algorithm changes.

  When you turn such an algorithm into a template method, you can also pull up the steps with similar implementations
  into a superclass, eliminating code duplication. Code that varies between subclasses can remain in subclasses.

## Pros and Cons

- You can let clients override only certain parts of a large algorithm, making them less affected by changes that happen
  to other parts of the algorithm.
- You can pull the duplicate code into a superclass.
- (-)Some clients may be limited by the provided skeleton of an algorithm.
- (-)You might violate the Liskov Substitution Principle by suppressing a default step implementation via a subclass.
- (-)Template methods tend to be harder to maintain the more steps they have.

## Relations with Other Patterns

- Factory Method is a specialization of Template Method. At the same time, a Factory Method may serve as a step in a
  large Template Method.
- Template Method is based on inheritance: it lets you alter parts of an algorithm by extending those parts in
  subclasses. Strategy is based on composition: you can alter parts of the object’s behavior by supplying it with
  different strategies that correspond to that behavior. Template Method works at the class level, so it’s static.
  Strategy works on the object level, letting you switch behaviors at runtime.
