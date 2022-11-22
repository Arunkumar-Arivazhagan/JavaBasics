package FirstClass;

import SecondClass.Phone;

public class MainFunction {

	public static void main(String[] args) {

		// static = modifier. A single copy of a variable/method is created and shared.
		//			The class "owns" the static member

		Phone friend1 = new Phone("iPhone");
		Phone friend2 = new Phone("OnePlus");
		Phone friend3 = new Phone("Samsung");

		System.out.println(Phone.numberOfPhone); //here i have not used the reference, 
												//i have used the class name directly
	}
}

