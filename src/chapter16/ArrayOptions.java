package chapter16;
import static com.maoruxin.javabook.util.Print.*;

import java.util.Arrays;

import javax.swing.text.html.HTMLDocument.HTMLReader.HiddenAction;

public class ArrayOptions {
	public static void main(String[] args) {
		// Arrays of objects;
		BerylliumSphere[] a; // Local uninitialized variable
		BerylliumSphere[] b = new BerylliumSphere[5];
		// The references inside the array are automatically initialized to null:
		print("b " + Arrays.toString(b));
		BerylliumSphere[] c = new BerylliumSphere[4];
		for(int i = 0 ; i < c.length; i++){
			if(c[i] == null){// Can test for null reference
				c[i] = new BerylliumSphere();
			}
		}
		BerylliumSphere[] d = {new BerylliumSphere(),new BerylliumSphere(),new BerylliumSphere()};
		// Dynamic aggregate initialization:
		a = new BerylliumSphere[]{new BerylliumSphere(),new BerylliumSphere()};
		print("a.length = " + a.length);
		print("b.length = " + b.length);
		print("c.length = " + c.length);
		print("d.length = " + d.length);
		a = d;
		print("a.length = " + a.length);
		
		// Arrays of primitives
		int[] e; // Null refence
		int[] f = new int[5];
		// The primitives inside the array are automatically initialized to zero
		print("f: " + Arrays.toString(f));
		int[] g = new int[4];
		for(int i = 0 ; i < g.length ; i++)
			g[i] = i * i;
		print("g: " + Arrays.toString(g));
		
		int[] h = { 11 , 47 , 93 };
		// Compile error : variable e notinitialized
		//print("e.length = " + e.length);
		print("f.length = " + f.length);
		print("g.length = " + g.length);
		print("h.length = " + h.length);
		e = h;
		print("e.length = " + e.length);
		e = new int[]{ 1 , 2 };
		print("e.length = " + e.length);
		hide(new BerylliumSphere[5]);
		hide(new BerylliumSphere[]{new BerylliumSphere()});
//		hide({new BerylliumSphere()});
	}
	public static void hide(BerylliumSphere[] array){
		System.out.println("hide" + Arrays.toString(array));
	}
}
