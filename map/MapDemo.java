package stream.map;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arrList= new ArrayList<Integer>();
		arrList.add(5);
		arrList.add(2);
		arrList.add(3);
				
//		Stream s = arrList.stream().map(i->i*i);
//		s.forEach(x-> System.out.println(x));
		
//		Creation -> arrList.stream()
//		Configuration -> map(i->i*i)
//		processing ->forEach(x-> System.out.println(x))
		
		arrList.stream().map(i->i*i).forEach(x-> System.out.println(x));

	}

}
