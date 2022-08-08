package stream.collect;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectDemo {
	public static void main(String[] args) {
		List<Integer> arrList= new ArrayList<Integer>();
		arrList.add(15);
		arrList.add(25);
		arrList.add(52);
		
		//get stream object
		Stream<Integer> openStream =arrList.stream();
		//configure stream by filter
		Stream<Integer> filteredStream =openStream.filter(i->i >=20);
		List<Integer> newfilteredListOrigin =filteredStream.collect(Collectors.toList());
		newfilteredListOrigin.stream().forEach(x->System.out.println(x));
		
		
		
	}

}
