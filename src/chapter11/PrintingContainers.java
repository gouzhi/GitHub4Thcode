package chapter11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

import static com.maoruxin.javabook.util.Print.*;
public class PrintingContainers {
	static Collection fill(Collection<String> collection){
		collection.add("rat");
		collection.add("cat");
		collection.add("dog");
		collection.add("dog");
		return collection;
	}
	
	static Map fill(Map<String,String> map){
		map.put("rat", "Fuzzy");
		map.put("cat", "rags");
		map.put("dog", "Bosco");
		map.put("dog", "spot");
		return map;
	}
	
	public static void main(String[] args) {
		print(fill(new ArrayList<String>(0)));
		print(fill(new LinkedList<String>()));
		print(fill(new HashSet<String>()));
		print(fill(new TreeSet<String>()));
		print(fill(new LinkedHashSet<String>()));
		print(fill(new HashMap()));
		print(fill(new TreeMap()));
		print(fill(new LinkedHashMap()));
	}
}
