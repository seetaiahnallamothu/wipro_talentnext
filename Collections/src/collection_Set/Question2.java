package collection_Set;

import java.util.HashSet;
import java.util.Iterator;

public class Question2 {

	public static void main(String[] args) {
		HashSet<String> empNames = new HashSet<>();
		empNames.add("Seethu");
		empNames.add("Kumar");
		empNames.add("Ganesh");
		
		Iterator<String> it = empNames.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}