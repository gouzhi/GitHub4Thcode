package chapter05;
/**
 * Using finalize() to detect an object that 
 * hasn't been properly cleaned up
 * @author Administrator
 *
 */
class Book{
	boolean checkedOut = false;
	Book(boolean checkOut){
		checkedOut = checkOut;
	}
	void checkIn(){
		checkedOut = false;
	}
	protected void finalize() throws Throwable{
		if(checkedOut){
			System.out.println("Error: checked out");
			//Normally, you'll also do this
			super.finalize();//Call the base-class versin
		}
	}
}
public class TerminationCondition {
	public static void main(String[] args) {
		Book novel = new Book(true);
		// Proper cleanup
		novel.checkIn();
		// Drop the reference, forget to clean up
		new Book(true);
		// Force garbage collection & finalization
		System.gc();
	}
}
