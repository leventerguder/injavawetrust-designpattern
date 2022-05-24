# State Design Pattern

https://www.journaldev.com/1751/state-design-pattern-java

State Design Pattern is one of the behavioral design pattern. State Design Pattern is used when an Object change its
behavior based on its internal state.

If we have to change the behavior of an object based on its state, we can have a state variable in the Object. Then use
if-else condition block to perform different actions based on the state. State design pattern is used to provide a
systematic and loosely coupled way to achieve this through Context and State implementations.

State Pattern Context is the class that has a State reference to one of the concrete implementations of the State.
Context forwards the request to the state object for processing. Let’s understand this with a simple example.

## State Design Pattern Benefits

The benefits of using State pattern to implement polymorphic behavior is clearly visible. The chances of error are less
and it’s very easy to add more states for additional behavior. Thus making our code more robust, easily maintainable and
flexible. Also State pattern helped in avoiding if-else or switch-case conditional logic in this scenario.

State Pattern is very similar to Strategy Pattern.