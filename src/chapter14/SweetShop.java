package chapter14;
import static com.maoruxin.javabook.util.Print.*;

class Candy{
	static {print("Loading Candy");}
}

class Gum{
	static {print("Loading Gum");}
}

class Cookie{
	static {print("Loading Cookie");}
}

public class SweetShop {
	public static void main(String[] args) {
		print("inside main");
		new Candy();
		print("After createing Candy");
		try{
			Class.forName("chapter14.Gum");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
			print("Couldn't find Gum");
		}
		print("After Class.forName(\"Gum\")");
		new Cookie();
		print("After creating Cookie");
	}
}
