package collection;

import java.util.ArrayList;
import java.util.Collections;

public class Assign99_arraylist {

	public static void main(String[] args) 
	{
		ArrayList l1 = new ArrayList();
		l1.add("Monali");
		l1.add("Sudhakar");
		l1.add("Gaikwad");
		l1.add("Monali");
		Collections.sort(l1);
		l1.add(100);
		l1.add(true);
		l1.add(18);
		l1.add(false);
		l1.add('S');
		System.out.println(l1);
	}

}
