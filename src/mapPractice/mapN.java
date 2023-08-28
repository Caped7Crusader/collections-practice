package mapPractice;

import java.util.HashMap;
import java.util.Map;

public class mapN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//HashMap with initial capacity 16, 0.75 load factor
		HashMap map = new HashMap();
		
		Map m = new HashMap();
		
		//HashMap with specified initial capacity and default load factor
		HashMap map2 = new HashMap(20);
		
		//HashMap with specified initial capacity and specified load factor
		HashMap map3 = new HashMap(20,0.9f);
		
		//Equivalent hashMap from Map
		HashMap map4 = new HashMap(m);
		
		HashMap<String,Integer> marks = new HashMap<>();
		marks.put("Science", 90);
		marks.put("Maths",80);
		marks.put("English", 80);
		//insertion order is not preserved
		
		marks.put("FB", 10);
		marks.put("Ea", 10);
		//Hash value of both keys is same, these will be stored to same index bucket
		
		System.out.println(marks);
	}

}
