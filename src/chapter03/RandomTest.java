package chapter03;

import java.util.Random;

public class RandomTest {
	public static void main(String[] args) {
		Random r = new Random(666);   
        for(int i = 1; i < 4; i++){   
            System.out.println("第" + i + "次:" + r.nextInt());   
        } 
	}
}
