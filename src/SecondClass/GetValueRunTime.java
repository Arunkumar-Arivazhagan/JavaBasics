package SecondClass;

import java.util.Scanner;

public class GetValueRunTime {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); //Object creation
		
		System.out.println("Enter A value : ");
		
		int a = scan.nextInt();
		
		System.out.println("Enter B value : ");
		
		int b = scan.nextInt();
		
		//int a = 10;
		
		System.out.println(a+b);

	}

}
