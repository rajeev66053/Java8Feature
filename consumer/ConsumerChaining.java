package consumer;
import java.util.function.Consumer;

public class ConsumerChaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<Integer> squareMe = i -> System.out.println("Taking an input and performing square : "+ i*i);
		squareMe.accept(5);
		Consumer<Integer> doubleMe = i -> System.out.println("Taking an input and performing doubling  : "+ 2*i);
		doubleMe.accept(5);
		

		System.out.println("<------After functional chaining------>");
		squareMe.andThen(doubleMe).accept(5);
	}

}
