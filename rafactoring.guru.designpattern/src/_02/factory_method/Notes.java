package _02.factory_method;

public class Notes {

}

// Factory Method is a creational design pattern that provides an interface for
// creating objects in superclass, but allow subclasses to alter the type of
// objects that will be created.

// The Factory Method pattern suggests replacing direct object creation (using a
// new operator) with a call to a special "factory" method. The constructor call
// should be moved inside that method

// At first glance, such move may seem pointless. But now you can override the
// factory method in a subclass and change the class of an object that will be
// created.

//java.util.Calendar#getInstance()
//java.util.ResourceBundle#getBundle()
//java.text.NumberFormat#getInstance()
//java.nio.charset.Charset#forName()
//java.net.URLStreamHandlerFactory#createURLStreamHandler(String) (Returns different singleton objects, depending on a protocol)
//java.util.EnumSet#of()
//javax.xml.bind.JAXBContext#createMarshaller() and other similar methods.