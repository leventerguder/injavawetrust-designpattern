# Dependency Injection Design Pattern

https://www.journaldev.com/2394/java-dependency-injection-design-pattern-example-tutorial

Java Dependency Injection design pattern allows us to remove the hard-coded dependencies and make our application
loosely coupled, extendable and maintainable. We can implement dependency injection in java to move the dependency
resolution from compile-time to runtime.

Dependency Injection in Java is a way to achieve Inversion of control (IoC) in our application by moving objects binding
from compile time to runtime. We can achieve IoC through Factory Pattern, Template Method Design Pattern, Strategy
Pattern and Service Locator pattern too.

Spring Dependency Injection, Google Guice and Java EE CDI frameworks facilitate the process of dependency injection
through use of Java Reflection API and java annotations. All we need is to annotate the field, constructor or setter
method and configure them in configuration xml files or classes.

## Benefits of Java Dependency Injection

- Separation of Concerns
- Boilerplate Code reduction in application classes because all work to initialize dependencies is handled by the
  injector component
- Configurable components makes application easily extendable
- Unit testing is easy with mock objects

## Disadvantages of Java Dependency Injection

- If overused, it can lead to maintenance issues because the effect of changes are known at runtime.
- Dependency injection in java hides the service class dependencies that can lead to runtime errors that would have been
  caught at compile time.