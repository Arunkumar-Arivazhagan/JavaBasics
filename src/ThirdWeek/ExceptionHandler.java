package ThirdWeek;

import java.util.*;
import java.util.Scanner;

public class ExceptionHandler {

	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		try {
			System.out.println("Enter a NUMBER: ");
			int a = scan.nextInt();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Invalid number");
		}
		finally
		{
			System.out.println("Successfully executed");
		}
	}

}
