package chapter04;

public class Fibonacci {
	public static void main(String[] args) {
		int[] Fib = new int[100];
		Fib[0] = 0;
		Fib[1] = 1;
		for(int i = 2;i < 100 ; i++){
			Fib[i] = Fib[i-2] + Fib[i-1];
			System.out.println(Fib[i]);
		}
	}
}
