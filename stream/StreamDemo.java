package stream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
	public static void main(String[] args) {
		
		List<Integer> arrList= new ArrayList<Integer>();
		arrList.add(15);
		arrList.add(25);
		arrList.add(5);
		
		List<Integer> newList=new ArrayList<Integer>();
		
		newList = arrList.stream()
				.filter(x->x >= 15)
				.collect(Collectors.toList());
		
		newList.stream().forEach(x->System.out.println(x));
	
	}

}
