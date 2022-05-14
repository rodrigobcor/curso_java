package appSec10;

import java.util.ArrayList;
import java.util.List;

public class Main95 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add(2, "ab");
		
		System.out.println(list.size());
		
		list.remove(4);
		for (String letras: list) {
			System.out.println(letras);
		}
		System.out.println("---------------");
		list.removeIf(x -> x.charAt(0) == 'a');
		for (String letras: list) {
			System.out.println(letras);
		}
		
	}

}
