package defaultMethodInterface;

public interface InterfaceDemo {

//	void printNameABS();
	
	default void printName() {
		System.out.println("Default method in interface");
	}
}
