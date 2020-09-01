package hotel;
import java.util.List;
import java.util.ArrayList;
public class lista {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>(); 
		
		
		list.add("maria");
		list.add("alex");
		list.add("maria");
		list.add("EDuardo");
		list.add(2, "element");
		list.remove(1);
		System.out.println(list.size());
		for(String J: list) {
			System.out.println(J);
		}
		
		
	}

}
