# Interpreter Design Pattern

Interpreter design pattern is one of the behavioral design pattern. Interpreter pattern is used to define a grammatical
representation for a language and provides an interpreter to deal with this grammar.

The best example of interpreter design pattern is java compiler that interprets the java source code into byte code that
is understandable by JVM. Google Translator is also an example of interpreter pattern where the input can be in any
language and we can get the output interpreted in another language.

To implement interpreter pattern, we need to create Interpreter context engine that will do the interpretation work.
Then we need to create different Expression implementations that will consume the functionalities provided by the
interpreter context.

Finally we need to create the client that will take the input from user and decide which Expression to use and then
generate output for the user.