import java.util.Arrays;
import java.util.HashMap;

public class Q1Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 HashMap<Integer, String> map = new HashMap<>();
		 //adding element in the hash map
	        map.put(100, "akma");
	        map.put(101, "Bida'");
	        map.put(102, "Ammarul");
	        map.put(103, "Afifah");
	        map.put(103, "fifah");

	        System.out.println(Arrays.asList(map));
	        //removing element in hash maps
	        map.remove(100);
	        System.out.println(Arrays.asList(map));
	}

}
