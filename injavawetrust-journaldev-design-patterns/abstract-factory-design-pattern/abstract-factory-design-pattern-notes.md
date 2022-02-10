# https://www.journaldev.com/1418/abstract-factory-design-pattern-in-java

# Abstract Factory Design Pattern

Abstract Factory design pattern is one of the Creational patterns. Abstract Factory pattern is almost similar to Factory
Pattern except the fact that its more like factory of factories.

## Abstract Factory Design Pattern Benefits

- Abstract Factory Design Pattern provides approach to code for interface rather than implementation.
- Abstract Factory Pattern is "factory of factories" and can be easily extended to accommodate more products, for
  example we can add another sub-class Laptop and a factory LaptopFactory.
- Abstract Factory Pattern is robust and avoid conditional logic of Factory pattern.

## Abstract Factory Design Pattern Examples in JDK

- javax.xml.parsers.DocumentBuilderFactory#newInstance()
- javax.xml.transform.TransformerFactory#newInstance()
- javax.xml.xpath.XPathFactory#newInstance()
