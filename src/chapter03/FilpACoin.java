package chapter03;

import java.util.Random;

class Coin{
	public static Random rand = new Random();
	public void filpACoin(){
		int i = rand.nextInt(100);
		if(i < 50){
			System.out.println("head");
		}else{
			System.out.println("tail");
		}
	}
}
public class FilpACoin {
	public static void main(String[] args) {
		Coin coin = new Coin();
		for(int i = 0;i < 10;i++)
			coin.filpACoin();
	}
}
