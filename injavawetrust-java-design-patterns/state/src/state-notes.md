#  State Pattern

# GoF Definition
Allow an object to alter its behavior when its internal state changes.
The object will appear to change its class.

## Concept

uppose that you are dealing with a large-scale application where 
the codebase is rapidly growing. As a result, the situation becomes complex and 
you may need to introduce lots of if-else blocks/switch statements to 
guard the various conditions.

The state pattern fits in such a context. 
It allows your objects to behave differently based on the current state, 
and you can define state-specific behaviors with different classes.


So, in this pattern, you start thinking in terms of possible states of your application, 
and you segregate the code accordingly. Ideally, each of the states is independent of other states. 
You keep track of these states, and your code responds as per the behavior of the current state.
For example, suppose that you are watching a television (TV) program/show. If you press the mute button on the TV’s remote control, you notice a state change in your TV.
But you cannot notice any change if the TV is already turned off.

So, the basic idea is that if your code can track the current state of the application, 
you can centralize the task, segregate your code, and respond accordingly.

## Computer World Example

Suppose that you have a job-processing system that can process a certain number of jobs at a time.
When a new job appears, either the system processes the job, or it signals that the system is busy with the maximum number of jobs that it can process at one time.
In other words, the system sends a busy signal when its total number of job-processing capabilities has been reached.

In the javax.faces.lifecycle package, there is class called Lifecycle. 
This class has a method called execute(FacesContext context), in which you may notice an implementation of the state design pattern. 
FacesServlet can invoke the execute method of a LifeCycle and a LifeCycle object communicates with different phases (states).

## Questions & Answers

1 - Can you elaborate how this pattern is useful with another real- world scenario?

you can consider the scenario where a customer buys an online ticket and in some later phase he/she cancels it. 
The refund amount may vary with different conditions; for example, the number of days before you can cancel the ticket.

2 - In this example, you have considered only three states of a TV: On, Off, or Mute. 
There are many other states, for example, there may be a state that deals with connection issues or display conditions. 
Why have you ignored those?

The straightforward answer is to represent simplicity. If the number of states increases significantly in the system, 
then it becomes difficult to maintain the system (and it is one of the key challenges associated with this design pattern). 
But if you understand this implementation, you can easily add any states you want.

3 - I noticed that the GoF represented a similar structure for both the state pattern and the strategy pattern 
in their famous book. I am confused to see that.

Yes, the structures are similar, but you need to note that the intents are different. Apart from this key distinction,
you can simply think like this: with a strategy pattern provides a better alternative to subclassing. On the other hand, 
in a state design pattern, different types of behaviors can be encapsulated in a state object and
the context is delegated to any of these states. When a context’s internal states change, its behavior also changes.

4 - How are you supporting the open-close principle in our implementation?

Each of these TV states are closed for modification, but you can add brand-new states to the TV class.

5 - What are the common characteristics between the strategy pattern and the state pattern?

Both can promote composition and delegation.

6 - It appears to me that these state objects are acting like singletons. Is this correct?
Yes. Most times they act in this way.

7 - Can you avoid the use of “contexts” in the method parameters.
For example, can you avoid them in the following statements?
void pressOnButton(TV context);

(v2 example)

8 - In these implementations, TV is a concrete class. Why are you not programming to interface in this case?

I assume that the TV class is not going to change, and so I ignored that part to reduce 
some code size of the program. But yes, you can always start from an interface in which you can define the contracts.

9 - What are the pros and cons of a state design pattern?

Pros
You have already seen that following the open/close principle, 
you can easily add new states and new behaviors. 
Also, a state behavior can be extended without hassle. 
For example, in this implementation, you can add a new state and a new behavior for a TV class without changing the TV class itself.

Reduces the use of if-else statements (i.e., conditional complexity is reduced.

Cons

The state pattern is also known as objects for states. So, you can assume that more states need more codes, 
and the obvious side effect is difficult maintenance for you.

10 - In the TV class constructor, you are initializing the TV with an Off state. 
So, can both the states and the context class trigger the state transitions?

Yes
