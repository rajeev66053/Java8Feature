package stream.sort;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class SortedDemo {

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
		Stream<Integer> sortedStream = filteredStream.sorted();
		sortedStream.forEach(x->System.out.println(x));
	}

}
