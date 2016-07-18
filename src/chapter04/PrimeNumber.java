package chapter04;

public class PrimeNumber {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		boolean a ;
		for(int i = 2;i <= 100;i++){
			a = true;
			for(int j = 2;j <= Math.sqrt(i);j++){
				if((i%j)==0){
					a = false;
					break;
				}
			}
			if(a){
				System.out.println(i);
			}
		}
		System.out.println("耗时："+(System.currentTimeMillis()-start));    
	}
}
