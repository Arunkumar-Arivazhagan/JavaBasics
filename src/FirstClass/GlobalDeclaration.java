package FirstClass;

public class GlobalDeclaration {
	
	static int a = 20; //global declaration
	static int b = 10;

	public static void main(String[] args) {
		
		add();
		sub();
		mul();
		div();

	}
	
	static void div() { 
		System.out.println(a/b);
	}

	static void add() {
		System.out.println(a+b);
	}
	
	static void sub() {
		System.out.println(a-b);
	}
	
	static void mul() {
		System.out.println(a*b);
	}
}
