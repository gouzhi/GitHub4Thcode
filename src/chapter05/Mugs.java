package chapter05;
import static com.maoruxin.javabook.util.Print.*;
/**
 * Java "Instance Initialization"
 * @author Administrator
 *
 */
class Mug{
	Mug(int marker){
		print("Mug("+ marker +")");
	}
	void f(int marker){
		print("f("+ marker +")");
	}
}
public class Mugs {
	Mug mug1;
	Mug mug2;
	{
		mug1 = new Mug(1);
		mug2 = new Mug(2);
		print("mug1 & mug2 initialized");
	}
	Mugs(){
		print("Mugs()");
	}
	Mugs(int i){
		print("Mugs(int)");
	}
	public static void main(String[] args) {
		print("Inside main()");
		new Mugs();
		print("new Mugs() complate");
		new Mugs(1);
		print("new Mugs() complate");
	}
}
