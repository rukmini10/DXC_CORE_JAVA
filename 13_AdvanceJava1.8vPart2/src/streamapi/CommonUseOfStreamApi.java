package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class CommonUseOfStreamApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> countries=Arrays.asList("India","Srilanka","","Bhutan","Nepal","Bangladesh");
//filtering blank countries 
		List<String> countries2=countries.stream()
         .filter(country -> !countries.isEmpty()).collect(Collectors.toList());
	
	System.out.println(countries2);
	
	//converting given list in to set
	Set<String> set=countries.stream()
			.collect(Collectors.toCollection(TreeSet::new));
	System.out.println(set);
	
	//converting list of string in to single string
	String singleString=countries.stream()
			.map(Object::toString)
			.collect(Collectors.joining(", "));
	
	System.out.println(singleString);
	
	}

}
