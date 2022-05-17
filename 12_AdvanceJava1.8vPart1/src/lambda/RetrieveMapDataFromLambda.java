package lambda;

import java.util.HashMap;
import java.util.Map;

public class RetrieveMapDataFromLambda {
public static void main(String[] args) {
	Map<String,Double> fruits=new HashMap<>();

	fruits.put("Apple", 234.50);
	fruits.put("Banana", 44.50);
	fruits.put("Papaya", 34.50);
	fruits.put("Mango", 334.50);
	fruits.put("Pine Apple", 134.50);
	
	//normal without lambda
	System.out.println(fruits);
	
	//or
	for(Map.Entry<String, Double> entry:fruits.entrySet()) {
		System.out.println(entry.getKey()+"="+entry.getValue());
	}
	
	fruits.forEach((k,v) -> System.out.println(k+"="+v));
}
}
