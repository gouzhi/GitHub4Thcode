package chapter11;

import java.util.Collection;
import java.util.HashSet;

public class SimpleCollection {
	public static void main(String[] args) {
		Collection<Integer> c = new HashSet<Integer>();
		for(int i = 0; i < 3; i++)
			c.add(i); // Autoboxing
		for(Integer i :c)
			System.out.println(i);
	}
}
