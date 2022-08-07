package defaultMethodInterface;

public class InterfaceDemoImpl3 implements InterfaceDemo {
	
	public void printName() {
		System.out.println("Default method override in implementation class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceDemoImpl3 demo3=new InterfaceDemoImpl3();
		demo3.printName();
	}

}
