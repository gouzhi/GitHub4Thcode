package chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import chapter14.Cymric;
import chapter14.Hamster;
import chapter14.Mouse;
import chapter14.Pet;
import chapter14.Pets;
import static com.maoruxin.javabook.util.Print.*;

public class IntegerListFeatures {
	public static void main(String[] args) {
		Random rand = new Random(47);
		List<Integer> pets = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
		print("1: " + pets);
		pets.add(3); 	//  Automatically resizes
		print("2 " + pets);
		print("3 " + pets.contains(3));
		Integer t = 3;
		pets.remove(t);
		print("3 remove " + pets);
		Integer p = pets.get(2);
		print("4 " + p + " " + pets.indexOf(p) );
		Integer cymric = 3;
		print("5 " + pets.indexOf(cymric));
		print("6 " + pets.remove(cymric));
		print("6 remove " + pets);
		// Must be the exact object
		print("7 " + pets.remove(p));
		print("8 " + pets);
		pets.add(3, 8); // Insert at an index
		print("9 " + pets);
		List<Integer> sub = pets.subList(1, 4);
		print("sublist " + sub);
		print("10 " + pets.containsAll(sub));
		Collections.sort(sub); // In-place sort
		print("sorted subList " + sub);
//		// Order is not import in containsAll();
		print("11 " + pets.containsAll(sub));
		print("pets" + pets);
		Collections.shuffle(sub, rand); // Mix it up
		print("shuffled subList: " + sub);
		print("pets" + pets);
		print("12 " + pets.containsAll(sub));
		List<Integer> copy = new ArrayList<Integer>(pets);
		sub = Arrays.asList(pets.get(1),pets.get(4));
		print("pets" + pets);
		print("sub " + sub);
		copy.retainAll(sub);
		print("13 " + copy);
		copy = new ArrayList<Integer>(pets);
		print("fresh copy " + copy);
		copy.remove(2);
		print("14 " + copy);
		copy.removeAll(sub);
		print("15 " + copy);
		copy.set(1, 9); // Replace an element
		print("16 " + copy);
		copy.addAll(2, sub);
		print("17 " + copy);
		print("18 " + pets.isEmpty());
		pets.clear(); // Remove all elements
		print("19 " + pets);
		print("20 " + pets.isEmpty());
		pets.add(null);
		print("20 null " + pets.isEmpty());
		pets.addAll(Arrays.asList(10,11,12,13,14,15));
		print("21 " + pets);
		Object[] o = pets.toArray();
		print("22 " + o[3]);
		
	}
}
