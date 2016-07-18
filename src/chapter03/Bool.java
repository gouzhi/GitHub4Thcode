package chapter03;
import static com.maoruxin.javabook.util.Print.*;

import java.util.Random;
/**
 * Relational and logical operators
 * @author Administrator
 *
 */
public class Bool {
	public static void main(String[] args) {
		Random rand = new Random(47);
		int i = rand.nextInt(100);
		int j = rand.nextInt(100);
		print("i="+i);
		print("j="+j);
		print("i > j is "+(i > j));
		print("i < j is "+(i < j));
		print("i >= j is "+(i >= j));
		print("i <= j is "+(i <= j));
		print("i == j is "+(i == j));
		print("i != j is "+(i != j));
		// Treating an int as a boolean is not legal java:
		//与，或，非操作只可应用于布尔值
//		print("i && j is "+(i && j));
//		print("i || j is "+(i || j));
//		print("!i is "+(!i));
		print("(i < 10) && (j < 10) is "+ ((i < 10) && (j < 10)));
		print("(i < 10) || (j < 10) is "+ ((i < 10) || (j < 10)));
	}
}
