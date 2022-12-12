package FirstClass;

public class Student {
	
	String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPhy() {
		return phy;
	}

	public void setPhy(int phy) {
		this.phy = phy;
	}

	public int getChem() {
		return chem;
	}

	public void setChem(int chem) {
		this.chem = chem;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

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
