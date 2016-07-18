package chapter03;

public class Exponents {
	public static void main(String[] args) {
		float expFloat = 1.39e-43f;//1.39 * 10的-43次方
		expFloat = 1.39E-43f;//Uppercase and lowercase 'e' are the same
		System.out.println(expFloat);
		double expDouble = 47e47d;// 'd' is optional
		double expDouble2 = 47e47;// Automatically double
		System.out.println(expDouble);
		System.out.println(expDouble2);
		System.out.println(Math.E);
	}
}
