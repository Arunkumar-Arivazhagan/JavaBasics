package SecondClass;

public class BillSuperMarket {
	
	int productOne;
	int productTwo;
	int productThree;
	
	BillSuperMarket(int productOne)
	{
		this.productOne = productOne;
		System.out.println("The bill amount is " + productOne);
	}
	
//	BillSuperMarket(int productOne, int productTwo)
//	{
//		this.productOne = productOne;
//		this.productTwo = productTwo;
//		int billAmount = productOne+productTwo;
//		System.out.println("The bill amount is " + billAmount);
//	}
	
	BillSuperMarket(int productOne, int productTwo, int productThree)
	{
		this.productOne = productOne;
		this.productTwo = productTwo;
		this.productThree = productThree;
		int billAmount = productOne+productTwo+productThree;
		System.out.println("The bill amount is " + billAmount);
	}
}
