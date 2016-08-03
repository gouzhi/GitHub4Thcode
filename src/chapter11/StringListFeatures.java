package chapter11;

import static com.maoruxin.javabook.util.Print.print;

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

public class StringListFeatures {
	public static void main(String[] args) {
		Random rand = new Random(47);
		List<String> pets = new ArrayList<String>(Arrays.asList("wo","ai","gou","gou","forever"));
		print("1: " + pets);
		String h = new String("?");
		pets.add(h); 	//  Automatically resizes
		print("2 " + pets);
		print("3 " + pets.contains(h));
		pets.remove(h);
		print("3 remove " + pets);
		String p = pets.get(2);
		print("4 " + p + " " + pets.indexOf(p) );
		String cymric = new String("ai");
		print("5 " + pets.indexOf(cymric));
		print("6 " + pets.remove(cymric));
//		// Must be the exact object
		print("7 " + pets.remove(p));
		print("8 " + pets);
		pets.add(2, "88888888888888"); // Insert at an index
		print("9 " + pets);
		List<String> sub = pets.subList(1, 4);
		print("sublist " + sub);
		print("10 " + pets.containsAll(sub));
		Collections.sort(sub); // In-place sort
		print("sorted subList " + sub);
		print("pets" + pets);
//		// Order is not import in containsAll();
		print("11 " + pets.containsAll(sub));
		print("pets" + pets);
		Collections.shuffle(sub, rand); // Mix it up
		print("shuffled subList: " + sub);
		print("pets" + pets);
		print("12 " + pets.containsAll(sub));
		List<String> copy = new ArrayList<String>(pets);
		sub = Arrays.asList(pets.get(1),pets.get(3));
		print("pets" + pets);
		print("sub " + sub);
		copy.retainAll(sub);
		print("13 " + copy);
		copy = new ArrayList<String>(pets);
		print("fresh copy " + copy);
		copy.remove(2);
		print("14 " + copy);
		copy.removeAll(sub);
		print("15 " + copy);
		copy.set(0, "alone"); // Replace an element
		print("16 " + copy);
		copy.addAll(0, sub);
		print("17 " + copy);
		print("18 " + pets.isEmpty());
		pets.clear(); // Remove all elements
		print("19 " + pets);
		print("20 " + pets.isEmpty());
		pets.add(null);
		print("20 null " + pets.isEmpty());
		pets.addAll(Arrays.asList("I","AM","TRIED"));
		print("21 " + pets);
		Object[] o = pets.toArray();
		print("22 " + o[3]);
//		Pet[] pa = pets.toArray(new Pet[0]);
//		print("23 " + pa[3].id());
	}
}
