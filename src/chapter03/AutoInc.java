package chapter03;
import static com.maoruxin.javabook.util.Print.*;
/**
 * Demonstrates the ++ and -- operators
 * @author Administrator
 *
 */
public class AutoInc {
	public static void main(String[] args) {
		int i = 1;
		print("i:"+i);
		print("i++:"+i++);
		print("i:"+i);
		print("++i:"+ ++i);
		print("i:"+i);
		print("--i:"+ --i);
		print("i:"+i);
		print("i--:"+ i--);
		print("i:"+i);
		Hjs h1 = new Hjs();
		h1.setI(i++);
		print("h1.getI()"+h1.getI());
		print("i:"+i);
		Hjs h2 = new Hjs();
		h2.setI(++i);
		print("h2.getI()"+h2.getI());
		print("i:"+i);
	}
}
class Hjs{
	int i ;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
	
}