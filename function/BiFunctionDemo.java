package function;
import java.util.function.BiFunction;

public class BiFunctionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BiFunction<Integer,Integer,Integer> multiplyBoth = (a,b)-> a*b;
		System.out.println("Multiplication of 5 and 10 is : "+ multiplyBoth.apply(5, 10));
	}

}
