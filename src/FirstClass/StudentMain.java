package FirstClass;

public class StudentMain {
	public static void main(String[] args) {
		
		System.out.println("Welcome to Anna University");
		
		Student arun = new Student("Swaroop", 17, 89, 89, 79);
		Student deepika = new Student("Deepika", 18, 99, 99, 99); //OBJECT CREATION
		
		try {
			System.out.println(arun.name);
			arun.seatYesOrNo();
			
			System.out.println(deepika.name);
			deepika.seatYesOrNo();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
