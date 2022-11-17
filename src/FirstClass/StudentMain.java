package FirstClass;

public class StudentMain {
	public static void main(String[] args) {
		
		System.out.println("Welcome to Anna University");
		
		Student arun = new Student("Arun",16,60,70,90);
		Student deepika = new Student("Deepika", 17,99,80,90); //OBJECT CREATION
		
		System.out.println(arun.name);
		arun.seatYesOrNo();
		
		System.out.println(deepika.name);
		deepika.seatYesOrNo();
		
	}
}
