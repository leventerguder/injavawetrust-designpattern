# MVC Pattern

Model View Controller (MVC) is an architectural pattern.
The use of this pattern is commonly seen in web applications or when we develop powerful user interfaces.

## Concept

From this introduction, it is apparent that the pattern consists of the three major components: Model, View, and Controller. 
Controller is placed between View and Model in such a way that Model and View can communicate to each other only through Controller.

## Computer World Example

Many web programming frameworks uses the concept of MVC framework. Some of the typical example include Django, Ruby on Rails, ASP.NET, and so forth
In the Java world, in a MVC architecture, you may notice the use of Java servlets as controllers and JavaBeans as models, whereas JSPs create different views

## Questions && Answers

1 - Suppose you have a programmer, a DBA, and a graphic designer. Can you guess their roles in a MVC architecture?
The graphic designer designs the view layer. The DBA makes the model and programmer works to make an intelligent controller.

2 - What are the key advantages of using MVC design patterns?

- "High cohesion and low coupling" is the slogan of MVC. Tight coupling between model and view is easily removed in this pattern. 
So, it can be easily extendable and reusable.
- It supports parallel development.
- You can also provide multiple runtime views.

3 - What are the challenges associated with MVC patterns?

- Requires highly skilled personnel.
- It may not be suitable for a tiny application.
- Developers need to be familiar with multiple languages/ platforms/technologies.
- Multiartifact consistency is a big concern because you are separating the overall project into three different parts.

4 - Can you provide multiple views in this implementation?
Sure. Let’s add a new view called “Mobile view” in the application.
