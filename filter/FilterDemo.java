package stream.filter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FilterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arrList= new ArrayList<Integer>();
		arrList.add(15);
		arrList.add(25);
		arrList.add(52);
		
//		Stream s = arrList.stream().filter(i->i%2 == 0);
//		s.forEach(x-> System.out.println(x));
		
		arrList.stream().filter(i->i%2 == 0).forEach(x-> System.out.println(x));
	}

}
