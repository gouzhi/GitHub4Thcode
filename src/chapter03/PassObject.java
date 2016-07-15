package chapter03;
import static com.maoruxin.javabook.util.Print.*;
/**
 * 别名问题
 * 传递对象，传递的是引用
 * @author Administrator
 *
 */
class Letter{
	char c;
	float f;
}
public class PassObject {
	/*right*/
	static void f(Letter y){
		y.c = 'z';
	}
	/*error*/
	static void c(float f){
		f = 93.8f;
		print("ccccc--"+f);
	}
	public static void main(String[] args) {
		Letter x = new Letter();
		x.c = 'a';
		print(x.c);
		f(x);
		print(x.c);
		/*别名问题*/
		c(x.f);
		print(x.f);
		x.f = 66.666f;
		print(x.f);
	}
}	
