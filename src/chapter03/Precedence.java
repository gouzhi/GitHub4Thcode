package chapter03;
import static com.maoruxin.javabook.util.Print.*;
/**
 * Precedence 优先级
 * @author Administrator
 *
 */
public class Precedence {
	public static void main(String[] args) {
		int x = 1, y = 2, z = 3;
		int a = x + y - 2/2 +z;
		int b = x + (y-2)/(2+z);
		print("a="+a+" b="+b);
	}
}
