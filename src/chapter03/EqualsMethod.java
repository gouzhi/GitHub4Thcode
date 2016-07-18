package chapter03;

import static com.maoruxin.javabook.util.Print.*;
/**
 * 		对象的比较实际内容：equal
 * 		对象比较引用： == !=
 *   	基本类型比较内容  ==  !=
 * @author Administrator
 *
 */
public class EqualsMethod {
	public static void main(String[] args) {
//		Integer i1 = new Integer(47);
//		Integer i2 = new Integer(47);
		Integer i1 = 47;
		Integer i2 = 47;
		print(i1==i2);
		print(i1!=i2);
		print(i1.equals(i2));
		//最后一种情况是怎么比较的，留待扩展
		print(new Integer(47) == 47);
	}
}
