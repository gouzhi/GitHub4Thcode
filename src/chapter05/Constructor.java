package chapter05;



public class Constructor {
	public Constructor(){
		this("call another constructor");
		System.out.println("Default Constructor");
	}
	
	public Constructor(String init){
		System.out.println(init + "Constructor");
	}
	public static void main(String[] args) {
		Constructor c = new Constructor();
		Constructor initc = new Constructor("init");
	}
}
