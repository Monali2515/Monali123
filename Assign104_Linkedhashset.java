package collection;

import java.util.Collections;
import java.util.LinkedHashSet;

public class Assign104_Linkedhashset {

	public static void main(String[] args) 
	{
		LinkedHashSet t1 = new LinkedHashSet();
		t1.add("Monali");
		t1.add("Gaikwad");
		t1.add("Monali");
		t1.add(100);
		t1.add(null);
		t1.add('D');
		t1.add(true);
		//Collections.sort(t1);
		System.out.println(t1);
	}

}
