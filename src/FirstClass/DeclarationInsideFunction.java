package FirstClass;

public class DeclarationInsideFunction {

	public static void main(String[] args) {

		int a = 40;
		int b = 20;
		
		System.out.println("I'm inside Main function");
		System.out.println(a);
		System.out.println(b);

	}

	static void div() {
		int a = 80;
		int b = 8;
		System.out.println("I'm inside Div function");
		System.out.println(a);
		System.out.println(b);
		System.out.println(a/b);
	}

	static void add() {
		int a = 50;
		int b = 8;
		System.out.println("I'm inside Add function");
		System.out.println(a);
		System.out.println(b);
		System.out.println(a+b);
	}

	static void sub() {
		int a = 20;
		int b = 8;
		System.out.println("I'm inside Sub function");
		System.out.println(a);
		System.out.println(b);
		System.out.println(a-b);
	}

	static void mul() {
		int a = 30;
		int b = 8;
		System.out.println("I'm inside Mul function");
		System.out.println(a);
		System.out.println(b);
		System.out.println(a*b);
	}


}
