package stream.sort;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class SortedInDescendingDemo {

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
		//Sorted in ascending using comparator
//		Stream<Integer> sortedStream = filteredStream.sorted((i1,i2)->i1.compareTo(i2));
		//Sorted in descending using comparator
		Stream<Integer> sortedStream = filteredStream.sorted((i1,i2)->i2.compareTo(i1));
		sortedStream.forEach(x->System.out.println(x));
	}

}
