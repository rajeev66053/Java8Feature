package stream.count;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CountDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arrList= new ArrayList<Integer>();
		arrList.add(15);
		arrList.add(25);
		arrList.add(52);
		
		
		//get stream object
		Stream<Integer> openStream =arrList.stream();
		//configure stream by filter
		Stream<Integer> filteredStream =openStream.filter(i->i >=20);
		long streamCount =filteredStream.count();
		System.out.println(streamCount);
				
				

	}

}
