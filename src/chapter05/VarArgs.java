package chapter05;
/**
 * Using array syntax to create variable argument lists
 * @author Administrator
 *
 */
class A{}

public class VarArgs {
	static void printArray(Object[] args){
		for(Object obj : args){
			System.out.println(obj + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		printArray(new Object[]{new Integer(8),new Float(3.14),new Double(66.88),new A()});
		printArray(new Object[]{"one","two","three"});
		printArray(new Object[]{new A(),new A(),new A()});
	}
}
