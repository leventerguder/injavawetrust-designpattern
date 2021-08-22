# Interpreter Pattern

## GoF Definition

Given a language, define a representation for its grammar along with an interpreter that uses the 
representation to interpret sentences in the language.

## Concept

To understand this pattern, you need to be familiar with some key terms, like sentences, grammar, languages, and so forth. 
So, you may need to visit the topics of formal languages in Automata, if you are not familiar with them.

Normally, this pattern deals with how to evaluate sentences in a language. 
So, you first need to define a grammar to represent the language. Then the interpreter deals with that grammar. 
This pattern is best if the grammar is simple.

Each class in this pattern may represent a rule in that language, and it should have a method to interpret an expression. 
So, to handle a greater number of rules, you need to create a greater number of classes. 
This is why an interpreter pattern should not be used to handle complex grammar.

Let’s consider different arithmetic expressions in a calculator program. 
Though these expressions are different, they are all constructed using some basic rules, 
which are defined in the grammar of the language (of these arithmetic expressions). 
So, it is best if you can interpret a generic combination of these rules rather than treat 
each combination of rules as separate cases. An interpreter pattern can be used in such a scenario.

## Real-World Example

- A translator who translates a foreign language.
- Consider music notes as grammar, where musicians play the role of interpreters.

## Computer World Example

- Java compiler interprets the Java source code into byte code that is understandable by JVM.

In Java, you may also notice the java.util.regex.pattern class that acts as an interpreter.

## Questions & Answers

1 - When should I use this pattern ?

In daily programming, it is not needed very much. Though
in some rare situations, you may need to work with your own programming language to define specific protocols. 
In a situation like this, this pattern may become handy. 
But before you proceed, you must ask yourself about the return on investment (ROI).

2 - What are the advantages of using an interpreter design pattern?

- You are very much involved in the process of how to define grammar for your language and how to represent 
and interpret those sentences. You can change and extend your grammar also.

- You have full freedom over how to interpret these expressions.

- 3 - What are the challenges associated with using interpreter design patterns?

I believe that the amount of work is the biggest concern. 
Also maintaining complex grammar becomes tricky because you may need to create (and maintain) separate classes 
to deal with different rules.
