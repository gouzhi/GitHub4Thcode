package chapter03;
import static com.maoruxin.javabook.util.Print.*;
/**
 * 赋值Assignment.java
 * @author Administrator
 *
 */
class Tank{
	int level;
}
public class Assignment {
	/**
	 * 不同类型赋值后结果不同
	 * 基本类型存储了实际的数值，赋值操作是直接将一个地方的内容复制到了另一个地方
	 * 对对象进行操作时，真正操作的是对对象的引用，对象的赋值，是将引用从一个地方复制到另一个地方
	 * @param args
	 */
	public static void main(String[] args) {
		Tank t1 = new Tank();
		Tank t2 = new Tank();
		print(t1.level + "--" +t2.level);
		t1.level = 27;
		t2.level = 88;
		print(t1.level + "--" +t2.level);
//		t1 = t2;
//		print(t1.level + "--" +t2.level);
//		t2.level = 99;
//		print(t1.level + "--" +t2.level);
//		t1.level = 66;
//		print(t1.level + "--" +t2.level);
		/*别名问题*/
		t1.level = t2.level;
		print(t1.level + "--" +t2.level);
		
		
		
		int a = 1;
		int b = 6;
		print(a + "--" + b);
		a = b;
		print(a + "--" + b);
		b = 8;
		print(a + "--" + b);
		
	}
}
