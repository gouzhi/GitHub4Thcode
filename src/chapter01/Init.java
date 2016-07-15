package chapter01;

public class Init {
	public static void main(String[] args) {
		PrimitiveDateTypes primitiveDateType = new PrimitiveDateTypes();
		System.out.println(primitiveDateType.x+"--"+primitiveDateType.c);
	}
}

class PrimitiveDateTypes{
	int x;
	char c;
}