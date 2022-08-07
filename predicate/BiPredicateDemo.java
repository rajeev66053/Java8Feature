package predicate;
import java.util.function.BiPredicate;

public class BiPredicateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BiPredicate<Integer,Integer> checkSumOfTwo = (a,b) -> a+b >=5;
		System.out.println("Sum of 2 and 5 is greater than 5 : " + checkSumOfTwo.test(2, 5));
		System.out.println("Sum of 2 and 1 is greater than 5 : " + checkSumOfTwo.test(2, 1));

	}

}
