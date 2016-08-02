package chapter16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayOfGenerics {
	public static void main(String[] args) {
		List<String>[] ls;
		List[] la = new List[10];
		ls = la;   //ls = (List<String>[])la;
		ls[0] = new ArrayList<String>();
		ls[0].add("add");
		//ls[1] = new ArrayList<Integer>();
		System.out.println(Arrays.toString(ls));
		
		Object[] objects = ls; // So assignment is OK
		// Compiles and runs without complaint
		objects[1] = new ArrayList<Integer>();
		System.out.println(Arrays.toString(objects));
		
		// However , if your needs are straightforward it is
		// possible to create an array of generics, albeit
		// with an "unchecked" warning
		List<BerylliumSphere>[] spheres = new List[10];
		for(int i = 0; i < spheres.length; i++){
			spheres[i] = new ArrayList<BerylliumSphere>();
		}
		System.out.println(Arrays.toString(spheres));
		
		
		
		
	}
}
