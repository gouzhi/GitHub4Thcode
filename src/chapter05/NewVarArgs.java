package chapter05;
public class NewVarArgs {
	static void printArray(Object ... args){
		for(Object obj : args){
			System.out.println(obj + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// Can take individul elements
		printArray(new Integer(1),new Integer(2));
		printArray(new Object[]{new Integer(8),new Float(3.14),new Double(66.88),new A()});
		printArray(new Object[]{"one","two","three"});
		printArray(new Object[]{new A(),new A(),new A()});
	}
}
