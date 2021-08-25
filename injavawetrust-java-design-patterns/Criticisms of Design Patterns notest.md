# Criticisms of Design Patterns

The following are some of the criticisms of patterns.

- Christopher Alexander considered the domain that did not change a lot over the years (compared to software industry). 
On the contrary, software industry is always changing and the changes in software development are much faster 
than any other domain. So, you cannot start from the domain (of buildings and towns) that Christopher Alexander considered

- The way you write program in today’s world is different and the facilities that you have nowadays are much 
more compared to old days of programming. So, when you extract patterns based on some old practices, 
you basically show additional respect to them.

- Many of the patterns are close to each other. And there are always pros and cons associated with each of the patterns

- The pattern that is giving you the satisfactory results today, can be a big burden to you in the near future due to 
- the "continuous changes" in the software industry.

- It is very unlikely that an infinite number of requirements can be well designed with a finite number of design patterns.

- Designing a software is basically an art. And there is no definition or criteria for best art.

- Design patterns give you the idea but not the implementations (like libraries or frameworks). 
Each human mind is unique. So, each engineer may have his/her own preferences for implementing a similar concept, 
and that can create chaos in a team.

- Consider a simple example. Patterns encourage people to code to a super type (abstract class/ interface). 
But for a simple application where you know that there are no upcoming changes, or the application is created 
for a demo purposes only, this rule may not make much sense.

- In a similar way, in some small applications, you may find that enforcing the rules of design patterns are increasing 
your code size and maintenance costs.

- Erasing the old and adapting the new is not always easy. For example, when you first learned about inheritance, 
you were excited. You probably wanted to use it in many ways and were seeing only the benefits from the concept. 
But later when you started experimenting with design patterns, you started learning that in many cases, 
compositions are preferred over inheritance. This shifting of gears is not easy.

- Design patterns are based on some of the key principles, and one of them is to identify the code that may vary 
and then separate it from rest of the code. It sounds very good from theoretical perspective. 
But in real world implementations, who guarantees you that your judgment is perfect? 
Software industry always changes, and it needs to adapt with new requirements/demands.

- Many patterns are already integrated with modern day languages. 
Instead of implementing the pattern from the scratch, you can use the built-in support in the language constructs. 
For example, you may notice that each of the patterns has JDK implementations in some context.

- Inappropriate use of patterns can lead to antipatterns 
(e.g., an inappropriate use of mediator pattern can lead to a "God Class" antipattern.

- Many people believe that the concepts of design patterns simply indicate that a programming language may need additional features. 
So, patterns have less significance with the increasing capabilities of modern-day programming languages. 
Wikipedia says that computer scientist Peter Norvig believes that 16 out of the 23 patterns 
in the GoF’s design patterns are simplified or eliminated via direct language support in Lisp or Dylan. 
You can see some similar thoughts at https://en.wikipedia.org/wiki/Software_design_pattern.

- At the end, design patterns basically help you to get benefit from others experience.
You are getting their thoughts, you come to know how they encountered the challenges, 
how they tried to adapt new behaviors in their systems, and so forth. 
But you start with the assumption that a beginner or relatively less-experienced person cannot solve a problem better than 
his/her seniors. 
In some specific occasions, a relatively less experienced person can have a better vision than his seniors, 
and he can prove himself more effective in the future.


## Questions & Answers

1 - Is there a catalog for these patterns?

The GoF’s catalog is considered the most fundamental pattern catalog.

The Portland Patterns Repository and The Hillside Group’s website are well-known in this context. 
You can get valuable insights and thoughts from these resources at 
http://wiki. c2.com/?WelcomeVisitors and 
https://hillside.net/ patterns/patterns-catalog.

2 - Why are you not covering other patterns?

- Computer science keeps growing, and you keep getting new patterns.
- If you are not familiar with the fundamental patterns, you cannot evaluate the true needs of the remaining or upcoming patterns. 
For example, if you know MVC well, you can see how it is different than Model-View-Presenter (MVP) and understand why MVP is needed.

3 -  I often see the term “force” with the description of design patterns. What does it mean?

It is the criteria based on which developers justify their developments. 
Broadly, your target and current constraints are two important parts of your force. 
Therefore, when you develop your application, you can justify your development with these parts.

4 - In various forums, I have seen people fighting about the pattern definition and say something like, 
"A pattern is a proven solution to a problem in a context." What does it mean?

This is a simple and easy-to-remember definition of what a pattern is.
But simply breaking it down into three parts (problem, context, and solution) is not enough.

5 - Sometimes I am confused to see similar UML diagrams for two different patterns. 
Also, I am further confused with the classification of the patterns in many cases. How can I overcome this?

This is perfectly natural. The more you read and analyze the implementations and the more you try to understand 
the intent behind the designs, the distinctions among them will be clearer to you.

6 - When should I consider writing a new pattern?

Writing a new pattern is not easy. You need to study a lot and evaluate the available patterns before you put your effort. 
But if you do not find any existing pattern to serve your domain specific need, you may need to write your own pattern. 
It would be very good if your solution passes the “rule of three” (which basically says that to get the tag “pattern,” 
a solution needs to be successfully applied in a real-world solution at least three times). 
Once you have done this, you can let others know about it, participate in discussion forums and take feedbacks from others. 
This activity can help both you and the development community.
