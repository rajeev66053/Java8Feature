package predicate;
import java.util.function.Predicate;

public class PredicateFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<String> checkLength=s->s.length() >= 5;
		System.out.println("The length of string is greater than 5 : " + checkLength.test("Predicate Test"));

	}

}
