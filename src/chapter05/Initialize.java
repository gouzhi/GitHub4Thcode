package chapter05;

class StringInit1{
	public String s;
}

class StringInit2{
	public String s = "init2";
}

class StringInit3{
	public String s;
	public StringInit3(){
		s = "init3";
	}
}
public class Initialize {
	public static void main(String[] args) {
		StringInit1 si1 = new StringInit1();
		System.out.println(si1.s);
		StringInit2 si2 = new StringInit2();
		System.out.println(si2.s);
		StringInit3 si3 = new StringInit3();
		System.out.println(si3.s);
	}
}
