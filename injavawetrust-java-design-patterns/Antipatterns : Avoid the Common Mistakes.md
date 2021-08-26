# AntiPatterns : Avoid the Common Mistakes

## What is an AntiPattern?

In real-world application development , you may follow approaches that are very attractive at first
but in the long run , they cause problems.
For example , you try to do a quick fix to meet a delivery deadline, but if you are not aware of the p
potential pitfalls, you may pay a big price.

Antipatterns alert you about common mistakes that lead to a bad solution. 
Knowing them helps you take precautionary measures. 
The proverb “prevention is better than cure” very much fits in this context.

Antipatterns alert you to common mistakes by describing how attractive approaches can make your life difficult in future. 
At the same time, they suggest alternate solutions that may seem tough or ugly at the beginning but ultimately help you 
build a better solution. 
In short, antipatterns identify problems with established practices and they can map general situations to a specific class 
of highly productive solutions. They can also provide better plans to reverse some bad practices and make healthy solutions.

Brief History of Antipatterns

The original idea of design patterns came from building architect Christopher Alexander. 
He shared his ideas for the construction of buildings within well-planned towns. 
Gradually, these concepts entered into software development and they gained popularity through the leading-edge 
software developers like Ward Cunningham and Kent Beck. 
In 1994, the idea of design patterns entered mainstream object-oriented software development through an industry conference 
on design patterns, known as Pattern Languages of Program Design (PLoP). 
It was hosted by the Hillside Group. Jim Coplien’s paper “A Development Process Generative Pattern Language” 
is a famous one in this context. 
And with the launch of the classic text Design Patterns: Elements of Reusable Object−Oriented Software by the Gang of Four, 
design patterns became extremely popular.

Undoubtedly, these great design patterns helped (and are still helping) programmers to develop the high-quality software. 
But people started noticing the negative impacts also

So, the software industry needed to focus on the negative consequences of these mistakes, 
and eventually, the idea of antipatterns evolved. Many experts started contributing to this field, but the 
first well-formed model came through Michael Akroyd’s presentation, “AntiPatterns: Vaccinations against Object Misuse.” 
It was the antithesis of the GoF’s design patterns.

## Examples of Antipatterns

- Over Use of Patterns  
Developers may try to use patterns at any cost, regardless of whether it is appropriate or not.

- God Class 
A big object that tries to control almost everything with many unrelated methods.
An inappropriate use of the mediator pattern may end up with this antipattern.

- Not Invented Here
I am a big company and I want to build everything from scratch. Although there is already a library available that
was developed by a smaller company, I’ll not use that. I will make everything of my own and once it is developed, 
I’ll use my brand value to announce, “Hey Guys. The ultimate library is launched for you.”

- Zero Means Null
A common example includes developers who think that no one wants to be at latitude zero, longitude zero.
Another common variation is when a programmer uses :1, 999 or anything like that to represent an inappropriate integer value. 
Another erroneous use case is observed when a user treats “09/09/9999” as a null date in an application. 
So, in these cases, if the user needs to have the numbers :1,999 or the date “09/09/9999”, he is unable to get them.

- Golden Hammer 
Mr. X believes that technology T is always best. 
So, if he needs to develop a new system (that demands new learning), he still prefers T, even if it is inappropriate. 
He thinks, “I do not need to learn any more technology if I can somehow manage it with T.”

- Management by Numbers
The greater the number of commits, the greater the number of lines of code, or the greater the number
of defects fixed are the signs of a great developer. 
Bill Gates said, “Measuring programming progress by lines of code is like measuring aircraft building progress by weight.”

- Shoot the Messenger
You are already under pressure and the program deadline is approaching. 
There is a smart tester who always finds typical defects that are hard to fix. 
So, at this stage, you do not want to involve him because he will find more defects and the deadline may be missed.

- Swiss Army Knife
Demand a product that can serve the customer’s every need. Or make a drug that cures all illnesses. 
Or design software that serves a wide range of customers with varying needs. It does not matter how complex the interface is.

- Copy and Paste Programming
I need to solve a problem but I already have a piece of code to deal with a similar situation. 
So, I can copy the old code that is currently working and start modifying it if necessary. 
But when you start from an existing copy, you essentially inherit all the potential bugs associated with it. 
Also, if the original code needs to be modified in the future, you need to implement the modification in multiple places. 
This approach also violates the Don’t Repeat Yourself (DRY) principle.

Architects Don’t Code
I am an architect. My time is valuable. I’ll
only show paths or give a great lecture on coding. There are enough implementers who should implement my idea. 
Architects Play Golf is a sister of this antipattern.

Hide and Hover 
Do not expose all edits or delete links until he/she hovers the element.

Disguised Links and Ads 
Earn revenue when users click a link or an advertisement, but they cannot get what they want.

nowadays, you can learn about various antipatterns from different websites/sources. 
For example, a Wikipedia page talks about various antipatterns (see https://en.wikipedia.org/wiki/Antipattern). 
You can also get a detailed list of the antipattern catalog at http://wiki.c2.com/?AntiPatter nsCatalog to learn more. 
You may also notice that the concept of antipatterns is not limited to object-oriented programming.

Types of Antipatterns

Antipatterns can belong in more than one category. Even a typical antipattern can belong in more than one category.
The following are some common classifications.

- Architectural antipatterns 
  
    The Swiss Army Knife antipattern is an example in this category.

- Development antipatterns
  
  The God Class and Over Use of Patterns are examples in this category.

- Management antipatterns

  The Shoot the Messenger antipattern falls in this category

- Organizational antipatterns

    Architects Don’t Code and Architects Play Golf are examples in this category.

- User Interface antipatterns

  Examples include Disguised Links and Ads.

## Questions & Answers

1 - How are antipatterns related to design patterns?

With design patterns, you reuse the experiences of others who came before you. 
When you start blindly using those concepts for the sake of use only, you fall into the traps of reuse of recurring solutions. 
This can lead you to a bad situation. And then you learn that your return on investment keeps decreasing but maintenance costs keep increasing. 
The apparently easy and standard solutions (or patterns) may cause more problems for you in the future.

2 - A design pattern may turn into an antipattern. Is this correct?

Yes. If you apply a design pattern in the wrong context, that can cause more trouble than the problem it solves. 
Eventually it will turn into an antipattern. So, understanding the nature and context of the problem is very important.

3 - Antipatterns are related to software developers only. Is this correct?

No. The usefulness of an antipattern is not limited to developers; it may be applicable to others also; for example, 
antipatterns are useful to managers and technical architects also.

4 - Even if you do not get much benefit from antipatterns now, 
they can help you adapt new features easily with fewer maintenance costs in future. Is this correct? 

Yes

5 - What are the probable causes of antipatterns?

It can come from various sources/mindsets. The following are a few common examples.

- “We need to deliver the product as soon as possible.”
- “We do not need to analyze the impact right now.”
- “I am an expert of reuse. I know design patterns very well.”
- “We will use the latest technologies and features to impress our customers. We do not need to care about legacy systems.”
- “More complicated code will reflect my expertise on the subject.”

6 - Discuss some symptoms of antipatterns.

In object-oriented programming, the most common symptom is your system cannot easily adapt a new feature. 
Also, maintenance costs are keep increasing. You may also notice that you have
lost the power of key object-oriented features like inheritance, polymorphism, and so forth.

Apart from these, you may notice some/all of the following symptoms.

- Use of global variables
- Code duplication
- Limited/no reuse of code
- One big class (God Class)
- A large number of parameterless methods, etc

7 - What is the remedy if you detect an antipattern?

You may need to follow a refactored and better solution. For example, the following are some solutions for avoiding antipatterns.

Golden Hammer: You may try to educate Mr. X through proper training.

Zero Means Null: You can use an additional boolean variable to indicate the null value properly.

Management by Numbers:
Numbers are good if you use them wisely. 
You cannot judge the ability of a programmer by the number of defects he/she fixes per week. 
The quality is also important. A typical example includes fixing a simple UI layout is much easy compared to fix a critical memory leak in the system. 
Consider another example. “More number of tests are passing” does not indicate that your system is more stable unless 
the tests exercise different code paths/branches.

Shoot the Messenger: 
Welcome the tester and involve him immediately. He can find typical defects early, and you can avoid last-moment surprises.


Copy and Paste Programming: Instead for searching a quick solution, you can refactor your code. 
You can also make a common place to maintain the frequently used methods to avoid duplicates and provide easier maintenance.

Architects Don’t Code: 
Involve architects in parts of the implementation phase. This can help both the organization and the architects. 
This activity can give them a clearer picture about the true functionalities of the product.

8 - What do you mean by refactoring?

In the coding world, the term refactoring means improving the design of existing code without changing 
the external behavior of the system/application. 
This process helps you get more readable code. At the same time, the code should be more adaptable to new requirements
(or change requests) and they should be more maintainable.
