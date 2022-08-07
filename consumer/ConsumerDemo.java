package consumer;
import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Consumer<Integer> squareMe = i -> System.out.println("Taking an input and performing square : "+ i*i);
		squareMe.accept(5);

	}

}
