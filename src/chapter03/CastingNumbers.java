package chapter03;
import static com.maoruxin.javabook.util.Print.*;
/**
 *  What happens when you cast a float or 
 *  double to an integral value?
 *  截尾
 * @author Administrator
 *
 */
public class CastingNumbers {
	public static void main(String[] args) {
		double above = 0.7, below = 0.4;
		float fabove = 0.7f, fbelow = 0.4f;
		print("(int)above: "+(int)above);
		print("(int)below: "+(int)below);
		print("(int)fabove: "+(int)fabove);
		print("(int)fbelow: "+(int)fbelow);
	}
}
