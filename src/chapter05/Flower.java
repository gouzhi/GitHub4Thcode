package chapter05;
import static com.maoruxin.javabook.util.Print.*;
public class Flower {
	int petalCount = 0;
	String s = "initial value";
	Flower(int petals){
		petalCount = petals;
		print("Constructor w/ int arg only , petalCount= "+petalCount);
	}
	
	Flower(String s){
		s = s;
		print("Constructor w/ String arg only , s= "+s);
	}
	
	Flower(int petals,String s){
		this(petals);
//		this(s);// Can't call two!
		s = s;
		print(" String & int args");
	}
	
	Flower(){
		this(47, "hi");
		print("default constructor no args ");
	}
	
	void printPetalCount(){
//		this(11); Not insidie non-constructor!
		print("petalCount = " + petalCount + " s = " + s);
	}
	
	public static void main(String[] args) {
		Flower f = new Flower();
		f.printPetalCount();
	}
}
