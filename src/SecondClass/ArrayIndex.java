package SecondClass;

public class ArrayIndex {

	public static void main(String[] args) {
		
//		String[] names = new String[5];
//		
//		names[0] = "Arun";
//		names[1] = "Swaroop";
		
		String names[] = {"Arun","Swaroop","Deepika", "Kumar", "Abi"};
		int age[] = {10,20,30,40,50};
//		String name1 = "Swaroop";
//		
//		System.out.println(names);
//		System.out.println(name1);
		
//		for(int i=0; i<=names.length;i++) {
//			System.out.println(names[i]);
//		}
		
		for(int j:age)
		{
			System.out.println(j);
		}
		
		for(String i:names)
		{
			System.out.println(i);
		}
	}
}
