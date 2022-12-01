package SecondClass;

import java.util.Scanner;

public class RelationalOperator {

	public static void main(String[] args) {
		
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("Enter a value : ");
//		
//		int a = scan.nextInt();
//		
//		System.out.println("Enter b value : ");
//		
//		int b = scan.nextInt();
//		
//		System.out.println("Enter c value : ");
//		
//		int c = scan.nextInt();
//		
//		
//		if(a==b && a==c && b==c)
//		{
//			System.out.println("A, B and C values are equal");
//		}
//		else if(a>b && a>c)
//		{
//			System.out.println("A is greater");
//		}
//		else if(b>a & b>c)
//		{
//			System.out.println("B is greater");
//		} else
//		{
//			System.out.println("C is greater");
//		}
		
		orFunction();
	}
	
	static void orFunction() {
		boolean passport = true;
		boolean driverLic = false;
		boolean criminal = true;
//		if(passport || driverLic)
//		{
//			System.out.println("You are allowed to participate");
//		}
//		else 
		if(!criminal)
		{
			System.out.println("You have clear records");
		} else
		{
			System.out.println("You are not allowed");
		}
	}
}
