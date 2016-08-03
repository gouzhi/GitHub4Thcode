package chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import chapter14.pets.Cymric;
import chapter14.pets.Hamster;
import chapter14.pets.Mouse;
import chapter14.pets.Pet;
import chapter14.pets.Pets;
import static com.maoruxin.javabook.util.Print.*;

public class ListFeatures {
	public static void main(String[] args) {
		Random rand = new Random(47);
		List<Pet> pets = Pets.arrayList(7);
		print("1: " + pets);
		Hamster h = new Hamster();
		pets.add(h); 	//  Automatically resizes
		print("2 " + pets);
		print("3 " + pets.contains(h));
		pets.remove(h);
		Pet p = pets.get(2);
		print("3 remove " + pets);
		print("4 " + p + " " + pets.indexOf(p) );
		Pet cymric = new Cymric();
		print("5 " + pets.indexOf(cymric));
		print("6 " + pets.remove(cymric));
		// Must be the exact object
		print("7 " + pets.remove(p));
		print("8 " + pets);
		pets.add(3, new Mouse()); // Insert at an index
		print("9 " + pets);
		List<Pet> sub = pets.subList(1, 4);
		print("sublist " + sub);
		print("10 " + pets.containsAll(sub));
		Collections.sort(sub); // In-place sort
		print("sorted subList " + sub);
		// Order is not import in containsAll();
		print("11 " + pets.containsAll(sub));
		Collections.shuffle(sub, rand); // Mix it up
		print("shuffled subList: " + sub);
		print("pets" + pets);
		print("12 " + pets.containsAll(sub));
		List<Pet> copy = new ArrayList<Pet>(pets);
		sub = Arrays.asList(pets.get(1),pets.get(4));
		print("pets" + pets);
		print("sub " + sub);
		
	}
}
