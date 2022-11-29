package SecondClass;

import java.util.Scanner;

public class MethodOverloading { //class

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter value of a : ");
		
		int a = scan.nextInt();
		
		System.out.println("Enter value of b : ");
		
		int b = scan.nextInt();
		
		System.out.println("Enter value of c : ");
		
		int c = scan.nextInt();
		
		print(a);
		print(a,b); //calling a function
		print(b,c);
		print(a,b,c);

	}

	private static void print(int a) {
		
		System.out.println("Value of a = " + a);		
	}
	
	private static void print(int a, int b) {  //method
		
		System.out.println("Value of a = " + a);
		System.out.println("Value of b = " + b);
	}
	private static void print(int a, int b,int c) {  //method
		
		System.out.println("Value of a = " + a);
		System.out.println("Value of b = " + b);
	}
}
