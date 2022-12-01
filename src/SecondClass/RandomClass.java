package SecondClass;

import java.util.Random;

public class RandomClass {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int x = rand.nextInt(6)+1;
		
		boolean z = rand.nextBoolean();
		
		System.out.println(z);
		
		System.out.println(x);

	}

}
