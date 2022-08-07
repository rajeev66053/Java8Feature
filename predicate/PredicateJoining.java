package predicate;
import java.util.function.Predicate;

public class PredicateJoining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<String> checkLength=s->s.length() >= 5;
		System.out.println("The length of string is greater than 5 : " + checkLength.test("Predicate Test"));

		Predicate<String> checkEvenLength=s->s.length()%2 == 0;
		System.out.println("The length of string is even : " + checkEvenLength.test("Test"));

		//It can be joined with and
		System.out.println("after merging with and : "+ checkLength.and(checkEvenLength).test("Predicate Tes"));
		
		//It can be joined with or
		System.out.println("after merging with or : "+ checkLength.or(checkEvenLength).test("Predicate Tes"));
		
		//It can be joined with negate. If checkLength is greater than 5 then it will return false.
		System.out.println("after merging with negate : "+ checkLength.negate().test("Predicate Test"));
				
	}

}
