package chapter11;
import java.util.ArrayList;

// Simple container example (produces complier warnings)

class Apple{
	private static long counter;
	private static long id = counter++;
	public long id(){return id;}
}
class Orange{}
public class ApplesAndOrangesWithoutGenerics {
	public static void main(String[] args) {
		ArrayList apples = new ArrayList();
		for(int i = 0 ; i < 3; i++){
			apples.add(new Apple());
		}
		apples.add(new Orange());
		for(int i = 0; i < apples.size(); i++){
			Apple apple = (Apple)apples.get(i);
		}
		ArrayList<Apple> applesG = new ArrayList<Apple>();
		applesG.add(new Apple());
//		applesG.add(new Orange());
	}
}
