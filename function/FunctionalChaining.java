package function;
import java.util.function.Function;

public class FunctionalChaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<Integer,Integer> doubleIt = i -> 2*i;
		System.out.println("Double function : " + doubleIt.apply(2));
		
		Function<Integer,Integer> cubeIt = i -> i*i*i;
		System.out.println("Cube function : " + cubeIt.apply(2));

		// It is similar to (2*2)^3
		System.out.println("First doubling using andThen : " + doubleIt.andThen(cubeIt).apply(2));

		// It is similar to ((2)^3)*2
		System.out.println("First cubing using compose : " + doubleIt.compose(cubeIt).apply(2));
		
		

	}

}
