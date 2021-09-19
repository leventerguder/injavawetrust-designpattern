# Introduction to Patterns

## What's a Design Pattern ?

Design patterns are typical solutions to commonly occurring problems in software design. They are like pre-made blueprints that you can customize to solve recurring desing problem in your code.

You can't just find a pattern and copy it into your program, the way you can with off-the-shelf funct'ons or libraries.
The pattern is not a specific piece of code, but a general concept for solving a particular problem. YOu can follow the pattern details and implement a solution that suits the realities of your own program.

Patterns are often confused with algorithms, because both concept describe typical solutions to some known problems.
While an algorithm always defines a clear set of actions that can achieve some goal, a pattern is a more high-level description of a solution. The code of the same pattern applied to two different programs may be different.

An analogy to an algorithm is a cooking recipe : both have clear steps to achieve a goal.
On the other hand, a pattern is more like a blueprint : you can see what the result and its features are, but the exact order of implementation is up to you.

### What does the pattern consist of ?

Most patterns are described very formally so people can reproduce them in many contexts.
Here are sections that are usually present in a pattern description : 

- Intent of the pattern briefly describes both the problem and the solution.
- Motivation further explains the problem and the solution the pattern makes possible.
- Structure of classes shows each part of the pattern and how they are related.
- Code example in one of the popular programming languages makes it easier to grasp the idea behind the pattern.


### Classification of patterns

Design patterns differ by their complexity, level of detail and scale of applicability to the entire system being designed. I like the analogy to road constriction : you can make an intersection safer by either installing some traffic lights or building an entire multi-level interchange with underground passages for pedestrians.

The most basic and low-level patterns are often called idioms. They usually apply only to a single programming language.

The most universal and high-level patterns are architectural patterns. Developers can implement these patterns in virtually any language. Unlike other patterns, they can be used to design the architecture of an entire application.


In addition, all patterns can be categorized by their intent, or purpose. This book covers three main groups of patterns:

- Creational patterns provide object creation mechanisms that increase flexibility and reuse of existing code.
- Structural patterns explain how to assemble objects and classes into larger structures, while keeping the structures flexible and efficient.
- Behavioral patterns take care of effective communication and the assignment of responsibilities between objects.

### Who invented patterns?

Patterns are typical solutions to common problems in object-oriented design. When a solution gets repeated over and over in various projects, someone eventually puts a name to it and describes the solution in detail. That’s basically how a pattern gets discovered.

## Why Should I learn Patterns ?

The truth is that you might manage to work as a programmer for many years without knowing about a single pattern. A lot of people do just that. Even in that case, though, you might be implementing some patterns without even knowing it. So why would you spend time learning them?

- Design patterns are a toolkit of tried and tested solutions to common problems in software design.
Even if you never encouter these problems, knowing patterns is still useful because it teaches you how to solve all sorts of problems using principles of object-oriented design.

- Design patterns define a common language that you and your teammates can use communicate more effieciently.
You can say, “Oh, just use a Singleton for that,” and everyone will understand the idea behind your suggestion. No need to explain what a singleton is if you know the pattern and its name.