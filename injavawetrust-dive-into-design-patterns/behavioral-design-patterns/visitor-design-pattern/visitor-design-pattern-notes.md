# Visitor

Visitor is a behavioral design pattern that lets you separate algorithms from the object on which they operate.

Visitor is a behavioral design pattern that allowing adding new behaviors to existing class hierarchy without altering
any existing code.

## Usage of the pattern in Java

Visitor isn't a very common pattern because of its complexity and narrow applicability.

Here are some examples of pattern in core Java libraries:

- javax.lang.model.element.AnnotationValue and AnnotationValueVisitor
- javax.lang.model.element and ElementVisitor
- javax.lang.model.type.TypeMirror and TypeVisitor
- java.nio.file.FileVisitor and SimpleFileVisitor
- javax.faces.component.visit.VisitContext and VisitCallback

## Solution

The Visitor pattern suggests that you place the new behavior into a separate class called visitor, instead of trying to
integrate it into existing classes. The original object that had to perform the behavior is now passed to one of the
visitor’s methods as an argument, providing the method access to all necessary data contained within the object.

## Real World Analogy

A good insurance agent is always ready to offer different policies to various types of organizations.

Imagine a seasoned insurance agent who’s eager to get new customers. He can visit every building in a neighborhood, try-
ing to sell insurance to everyone he meets. Depending on the type of organization that occupies the building, he can
offer specialized insurance policies.

## Applicability

- Use the Visitor when you need to perform an operation on all elements of a complex object structure (for example, an
  object tree)
  The Visitor pattern lets you execute an operation over a set of objects with different classes by having a visitor
  object implement several variants of the same operation, which correspond to all target classes.

- Use the Visitor to clean up the business logic of auxiliary behaviors. The pattern lets you make the primary classes
  of your app more focused on their main jobs extracting all other behaviors into a set of visitor classes.

- Use the pattern when a behavior makes sense only in some classes of a class hierarchy, but not in others. You can
  extract this behavior into a separate visitor class and implement oly those visiting methods that accept objects of
  relevant classes, leaving the rest empty.

## Pros and Cons

- Open/Closed Principle. You can introduce a new behavior that can work with objects of different classes without
  changing these classes.
- Single Responsibility Principle. You can move multiple versions of the same behavior into the same class.
- A visitor object can accumulate some useful information while working with various objects. This might be handy when
  you want to traverse some complex object structure, such as an object tree, and apply the visitor to each object of
  this structure.
- (-) You need to update all visitors each time a class gets added to or removed from the element hierarchy.
- (-) Visitors might lack the necessary access to private fields and methods of the elements that they're supposed to
  work with.

## Relations with Other Patterns

- You cna treat Visitor as a powerful version of the Command pattern. Its object can execute operations over various
  objects of different classes.
- You can use Visitor to execute an operation over an entire Composite tree.
- You can use Visitor along with Iterator to traverse a complex data structure and execute some operation over its
  elements, even if they all have different classes.
