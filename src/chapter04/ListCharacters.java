package chapter04;

import java.util.Random;

/**
 * Demonstrates "for" loop by listing
 * all the lowercase ASCII letters.
 * @author Administrator
 *
 */
public class ListCharacters {
	public static Random rand = new Random(56);
	public static void main(String[] args) {
//		for(char c = 0; c < 128; c++){
//			if(Character.isUpperCase(c))
//				System.out.println("value: "+(int)c+" character: "+c);
//		}
		int a = rand.nextInt(100);
		int b = rand.nextInt(100);
		for(int i = 0; i < 23;i++){
			System.out.println("a "+a+" b "+b);
			if(a > b){
				System.out.println("a > b");
			}else if(a < b){
				System.out.println("a < b");
			}else{
				System.out.println("a = b");
			}
			a = b;
			b = rand.nextInt(100);
		}
		
		int j = 0;
		while(j < 23){
			System.out.println("a "+a+" b "+b);
			if(a > b){
				System.out.println("a > b");
			}else if(a < b){
				System.out.println("a < b");
			}else{
				System.out.println("a = b");
			}
			a = b;
			b = rand.nextInt(100);
			j++;
		}
	}
}
