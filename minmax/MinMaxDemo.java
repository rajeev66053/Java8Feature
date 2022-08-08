package stream.minmax;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MinMaxDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arrList= new ArrayList<Integer>();
		arrList.add(15);
		arrList.add(52);
		arrList.add(150);
		arrList.add(25);
		
		
		//get stream object
		Stream<Integer> openStream =arrList.stream();
		//configure stream by filter
		Stream<Integer> filteredStream =openStream.filter(i->i >=20);
		Integer min = filteredStream.min((i1,i2)-> i1.compareTo(i2)).get();
		System.out.println("Min value : "+ min);
//		
		//We cannnot use stream once it has been used we have to create a new stream to work
//		Integer max = filteredStream.max((i1,i2)-> i1.compareTo(i2)).get();
//		System.out.println("Max value : "+ max);
	}

}
