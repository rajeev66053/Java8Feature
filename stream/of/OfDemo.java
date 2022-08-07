package stream.of;

import java.util.stream.Stream;

public class OfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stream.of(1,11,111,1111).forEach(x->System.out.println(x));
		
		String[] name = {"Rajeev","Ram","Hari"};
		Stream.of(name).filter(x->x.length()>=4).forEach(x->System.out.println(x));

	}

}
