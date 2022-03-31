# https://www.journaldev.com/1487/adapter-design-pattern-java

# Adapter Design Pattern

Adapter design pattern is one of the structural design pattern and its used so that two unrelated interfaces can work
together. The object hat joins these unrelated interface is called an Adapter.

One of the great real life example of Adapter design pattern is mobile charger. Mobile battery needs 3 volts to charge
but the normal socket produces either 120V (US) or 240V (India). So the mobile charger works as an adapter between
mobile charging socket and the wall socket.


## Two Way Adapter Pattern

While implementing Adapter pattern, there are two approaches - class adapter and object adapter. 
However, both these approaches produce same result.

Class Adapter – This form uses java inheritance and extends the source interface, in our case Socket class.
Object Adapter – This form uses Java Composition and adapter contains the source object.


## Adapter Design Pattern Example in JDK

- java.util.Arrays#asList()
- java.io.InputStreamReader(InputStream)(Returns a Reader)
- java.io.OutputStreamWriter(OutputStream) (Returns a Writer)

