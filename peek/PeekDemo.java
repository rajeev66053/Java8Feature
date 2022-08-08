package stream.peek;

import java.util.Arrays;
import java.util.List;

public class PeekDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> intList = Arrays.asList(1,2,3,4,5);
		//Peek is used for debuging intermediate operation
		intList.stream().filter(a->a%2 ==0).peek(System.out::println).map(a->a+a).filter(a->a>5).forEach(a->System.out.println(a));

	}

}
