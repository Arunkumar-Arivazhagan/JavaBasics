package FirstClass;

public class Student {
	
	String name;
	int age;
	int phy;
	int chem;
	int math;
	
	Student(String name, int age, int phy, int chem, int math) //constructor
	{
		this.name = name;
		this.age = age;
		this.phy = phy;
		this.chem = chem;
		this.math = math;
	}
	
	public void seatYesOrNo()
	{
		System.out.println(getAverage());
		if(getAverage()>=50)
		{
			System.out.println("You got the seat");
		} else {
			System.out.println("No seat for you");
		}
	}
	
	public int getAverage()
	{
		return (phy+chem+math)/3;
	}
}
