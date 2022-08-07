package function;
import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Function<Integer,Integer> squareMe = i -> i*i;
		System.out.println("Square of 5 is : " + squareMe.apply(5));
		

	}

}
