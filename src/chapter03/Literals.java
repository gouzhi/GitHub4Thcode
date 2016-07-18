package chapter03;
import static com.maoruxin.javabook.util.Print.*;

public class Literals {
	public static void main(String[] args) {
		int i1 = 0x2f;// Hexadecimail (lowercase)
		print("i1:"+i1);
		print("i1:"+Integer.toBinaryString(i1));
		int i2 = 0X2f;// Hexadecimal (uppercase)
		print("i2:"+i2);
		print("i2:"+Integer.toBinaryString(i2));
		int i3 = 0177;// Octal(leading zero)
		print("i3:"+i3);
		print("i3:"+Integer.toBinaryString(i3));
		char c = 0xffff;// max char hex value
		print("c:"+c);
		print("c:"+Integer.toBinaryString(c));
		byte b = 0x7f;
		print("b:"+b);
		print("b:"+Integer.toBinaryString(b));
		short s = 0x7fff;// max short hex value
		print("s:"+s);
		print("s:"+Integer.toBinaryString(s));
		long n1 = 200L;// long suffix
		print("n1:"+Long.toBinaryString(n1));
		long n2 = 200l;// long suffix (but can be confusing)像数字1
		long n3 = 200;
		float f2 = 1F; //float suffix
		float f3 = 1f; // float suffix
		double d1 = 1d; // double suffix
		double d2 = 1D; // double suffix;
		double d3 = 1; 
		
		
	}
}
