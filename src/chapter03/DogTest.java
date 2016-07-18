package chapter03;
import static com.maoruxin.javabook.util.Print.*;
class Dog{
	String name;
	String says;
	public Dog(String name,String says){
		this.name = name;
		this.says = says;
	}
	public void print(){
		System.out.println(this.name+":"+this.says);
	}
}
public class DogTest {
	public static void main(String[] args) {
		Dog d1 = new Dog("spot", "Ruff!");
		Dog d2 = new Dog("scruffy", "Wurf!");
		d1.print();
		d2.print();
		Dog d3 = d1;
		print(d1==d3);
		//未重写equals,比较引用
		print(d1.equals(d3));
	}
}
