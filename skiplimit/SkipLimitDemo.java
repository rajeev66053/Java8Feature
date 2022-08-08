package stream.skiplimit;

import java.util.Arrays;
import java.util.List;

public class SkipLimitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list =Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14);
		System.out.println("<----Limit---->");
		list.stream().limit(7).forEach(x->System.out.println(x));
		System.out.println("<----Skip---->");
		list.stream().skip(4).forEach(x->System.out.println(x));
		
	}

}
