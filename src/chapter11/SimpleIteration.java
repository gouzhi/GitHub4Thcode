package chapter11;

import static com.maoruxin.javabook.util.Print.print;

import java.util.Iterator;
import java.util.List;

import chapter14.pets.Pet;
import chapter14.pets.Pets;

public class SimpleIteration {
	public static void main(String[] args) {
		List<Pet> pets = Pets.arrayList(6);
		print("pets " + pets);
		Iterator<Pet> it = pets.iterator();
		while(it.hasNext()){
			Pet p = it.next();
			System.out.println(p);
		}
		it = pets.iterator();
		for(int i = 0; i < 6 ; i++){
			print(i);
			it.next();
			it.remove();
			print("pets " + pets);
		}
		
	}
}
