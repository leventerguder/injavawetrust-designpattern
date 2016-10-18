package _01.singleton.eager.initialization;

import java.lang.reflect.Constructor;

//http://stackoverflow.com/questions/2599440/how-can-i-access-a-private-constructor-of-a-class

public class BreakPrivateConstructor {
	public static void main(final String[] args) throws Exception {
		Constructor<Foo> constructor = Foo.class.getDeclaredConstructor(new Class[0]);
		constructor.setAccessible(true);
		Foo foo = constructor.newInstance(new Object[0]);
		System.out.println(foo);
	}
}

class Foo {
	private Foo() {
		// private constructor
	}

	@Override
	public String toString() {
		return "Foo object created!";
	}
}