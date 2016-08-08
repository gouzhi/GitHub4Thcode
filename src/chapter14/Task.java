package chapter14;
class GreatGrandFather{ int i;}
class GrandFather extends GreatGrandFather{int i;}
class Father extends GrandFather{int i;}
class Me extends Father{int i;}
class Son extends Me{int i;}
public class Task {
	public static void main(String[] args) throws ClassNotFoundException {
		recursion(Class.forName("chapter14.Son"));
		char[] c = {'a','b'};
		System.out.println(c.getClass());
		char cc = 'a';
//		System.out.println(cc.getClass());
		System.out.println(boolean.class.getSimpleName());
	}
	static void recursion(Class c){
		Class superClass = c.getSuperclass();
		System.out.println(superClass.getDeclaredFields());
		System.out.println(superClass.getName());
		if(superClass.getSuperclass()!=null){
			recursion(superClass);
		}
	} 
}
