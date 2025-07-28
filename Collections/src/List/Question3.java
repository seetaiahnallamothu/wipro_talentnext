package List;

import java.util.ArrayList;
import java.util.Iterator;

public class Question3 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Seethaiah");
		list.add("kesava");
		list.add("Ganesh");
		list.add("lakashman");
		list.add("Sai krishna");
		printAll(list);
	}
	
	static void printAll(ArrayList<String> names) {
		Iterator<String> it = names.iterator();
		while(it.hasNext()) {
			String name = it.next();
			System.out.println(name);
		}
		
	}

}