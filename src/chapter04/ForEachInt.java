package chapter04;
import static com.maoruxin.javabook.util.Range.*;
import static com.maoruxin.javabook.util.Print.*;

public class ForEachInt {
	public static void main(String[] args) {
		for(int i : range(10)){
			printnb(i + " ");
		}
		print();
		for(int i : range(5, 10))
			printnb(i + " ");
		print();
//		for(int i : range(5, 21, 3))
//			printnb(i + " ");
		int i = 0;
		for(;;){
			i++;
			System.out.println(i);
			if(i == 99)
				break;//return
		}
		System.out.println("return");
			
			
	}
}
