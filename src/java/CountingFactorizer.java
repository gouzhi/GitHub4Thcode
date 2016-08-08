package java;

import java.util.concurrent.atomic.AtomicLong;

public class CountingFactorizer {
	private final AtomicLong count = new AtomicLong();
	
	public long getCount(){return count.get();}
	
	public void service(Serv){
		
	}
}
