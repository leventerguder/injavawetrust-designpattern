package _03.abstract_method;

public class Notes {

}

// Abstract Factory is a creational design pattern that lets you produce
// families of related objects without specifying their concrete classes.

// When a business logic must work with different variants of products from some
// product family, but you do not want it to depend on concrete product classes
// (or if they are unknown beforehand).

// pros

// Follows the Open/Closed Principle.
// Allows building families of product objects and guarantees their
// compatibility.
// Avoids tight coupling between concrete products and code that uses them.
// Divides responsibilities between multiple classes.

// cons
// Increases overall code complexity by creating multiple additional classes.


//javax.xml.parsers.DocumentBuilderFactory#newInstance()
//
//javax.xml.transform.TransformerFactory#newInstance()
//
//javax.xml.xpath.XPathFactory#newInstance()