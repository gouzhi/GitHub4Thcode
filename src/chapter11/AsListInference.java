package chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

// Arrays.asList() makes its best guess about type
class Snow{}
class Power extends Snow{}
class Light extends Power{}
class Heavy extends Power{}
class Crusty extends Snow{}
class Slush extends Snow{}
public class AsListInference {
	public static void main(String[] args) {
		List<Snow> snow1 = Arrays.asList(new Crusty(),new Slush(),new Power());
		
		// Won't compile
		// List<Snow> snow2 = Arrays.asList(new Light(),new Heavy());
		List<Snow> snow3 = new ArrayList<Snow>(0);
		Collections.addAll(snow3, new Light(),new Heavy());
		// Give a hint using an explict type argument spection
		List<Snow> snow4 = Arrays.<Snow>asList(new Light(),new Heavy());
		
		List<Snow> snow5 = new ArrayList<Snow>(0);
		snow5.add(new Power());
		snow5.add(new Light());
		snow5.add(new Heavy());
		snow5.add(new Crusty());
		snow5.add(new Slush());
		printList(snow3);
		
		
		
	}
    static void printList(List<Snow> l){
    	for(Snow snow : l)
    		System.out.println(snow);
    }
}
