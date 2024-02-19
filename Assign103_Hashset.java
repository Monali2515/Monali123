package collection;

import java.util.Collections;
import java.util.HashSet;

public class Assign103_Hashset {

	public static void main(String[] args)
	{
		HashSet t1 = new HashSet();
		t1.add("Monali");
		t1.add("Gaikwad");
		t1.add("Monali");
		t1.add(100);
		t1.add(null);
		t1.add('D');
		t1.add(true);
		System.out.println(t1);
	}

}
