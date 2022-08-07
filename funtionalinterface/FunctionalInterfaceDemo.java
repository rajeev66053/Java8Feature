package funtionalinterface;

@FunctionalInterface
public interface FunctionalInterfaceDemo {

	//Must contain exactly one abstract method and any number of default method.
	void singleAbstractMethod();
	
	default void printName() {
		System.out.println("Welcome to Functional Interface");
	}
	default void printName2() {
		System.out.println("Welcome to Functional Interface 2");
	}
}
