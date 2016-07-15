package chapter01;

public class ATypeName {
	/* Class body goes here */
	public static void main(String[] args) {
		/*static类型的只有一个*/
		Staticobject so1 = new Staticobject();
		Staticobject so2 = new Staticobject();
		System.out.println(so1.scope);
		System.out.println(so2.scope);
		so2.scope = new Scope();
		System.out.println(so1.scope);
		System.out.println(so2.scope);
		/*自动包装功能*/
		Character ch = 'x';//字符单引号
		char c = ch;
	}
	
}

class Staticobject{
	static Scope scope = new Scope();
}

class Scope{
	
}