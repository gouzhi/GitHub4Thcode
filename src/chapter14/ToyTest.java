package chapter14;
import static com.maoruxin.javabook.util.Print.*;

interface HasBatteries{}
interface Waterproof{}
interface Shoots{}
interface CanFlay{}
class Toy{
	// Comment out the following default constructor
	// to see NoSuchMethodError from (*1*)
//	Toy(){}
	Toy(int i){}
}
class FancyToy extends Toy 
	implements HasBatteries,Waterproof,Shoots,CanFlay{
	FancyToy() {
		super(1);
	}
}
public class ToyTest {
	static void printInfo(Class cc){
		print("Class name: " + cc.getName() + 
				" is interface? [" + cc.isInterface() + "]");
		print("Simple name: " + cc.getSimpleName());
		print("Canonical name : " + cc.getCanonicalName());
	}
	public static void main(String[] args) {
		Class c = null;
		try {
			c = Class.forName("chapter14.FancyToy");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			print("Can't find FancyToy");
			System.exit(1);
		}
		printInfo(c);
		for(Class face : c.getInterfaces()){
			printInfo(face);
		}
		Class up = c.getSuperclass();
		Object obj = null;
		try {
			// Requests default
			obj = up.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
			print("Cannot instantiate");
		}catch (IllegalAccessException e) {
			e.printStackTrace();
			print("Cannot access");
			System.exit(1);
		}
		printInfo(obj.getClass());
	}
	
}
