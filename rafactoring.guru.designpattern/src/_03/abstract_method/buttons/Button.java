package _03.abstract_method.buttons;

/**
 * Abstract Factory assumes that you have several families of products,
 * structured into separate class hierarchies (Button/Checkbox). All products of
 * the same family have the common interface.
 * 
 * This is the common interface for buttons family.
 */

public interface Button {
	public abstract void paint();
}
