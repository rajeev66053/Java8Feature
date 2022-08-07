package supplier;
import java.util.Date;
import java.util.function.Supplier;

public class SupplierFunction {
	public static void main(String[] args) {
		Supplier<Date> currentDate =()-> new Date();
		System.out.println(currentDate.get());
	}

}
