package chapter01;
/**
 * 自动装箱
 * @author Administrator
 *
 */
public class Autoboxing {
	public static void main(String[] args) {
		/**
		 * 实际上，程序运行时，系统为我们执行了下面一条语句
		 * Integer num = new Integer(290);
		 */
		Integer num = 290;
		System.out.println(290);
		
		Boolean bool = true;
		Character c = 'x';
		Byte b = 127;
		Short s = 8888;
		Integer i = 8888888;
		Long l = 888888888l;
		Float f = 99.8888f;
		Double d = 888888.888888;
		System.out.println(b);
		System.out.println(f);
		System.out.println(d);
		
		
	}
}
