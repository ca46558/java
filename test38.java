package tw.index;

import java.util.HashMap;
import java.util.Set;

public class test38 {

	public static void main(String[] args) {
		HashMap<String, Object> person = new HashMap<>();
		person.put("name", "test");
		person.put("gender", true);
		person.put("age", 18);
		person.put("weight", 80.3);

		System.out.println(person.size());
		System.out.println(person.get("name"));
		System.out.println("--------");
		Set<String> keys = person.keySet();
		
		for(String key : keys) {
			System.out.println(key + ":" + person.get(key) + "\n");
		}
	}

}
