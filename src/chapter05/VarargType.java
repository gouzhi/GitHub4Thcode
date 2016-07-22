package chapter05;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.IntArrayData;

public class VarargType {
	static void f(Character... agrs){
		System.out.println(agrs.getClass());
		for(Character c : agrs)
			System.out.println(c);
	}
	static void g(int... agrs){
		System.out.println(agrs.getClass());
		for(int c : agrs)
			System.out.println(c);
	}
	static void i(Integer... agrs){
		System.out.println(agrs.getClass());
		for(Integer c : agrs)
			System.out.println(c);
	}
	
	public static void main(String[] args) {
		f('a','b');
		g(1,2,3,4,5,6);
		g(new Integer(1),new Integer(2),new Integer(3));
		i(1,2,3,4,5,6);
		i(new Integer(1),new Integer(2),new Integer(3));
	}
}
