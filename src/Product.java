public class Product {
	public static void main(String [] a)
	{
		Genproducts G= new Electronics() ;
		G.products();
		Electronics E = (Electronics) G ; // Type Casting
		E.Mobiles();
		E.laptop();
		Genproducts GE= new Clothes();
		GE.products();
		Clothes C = (Clothes) GE; // Type Casting
		C.Cargo();
		C.Jean();
	}
}
	class Genproducts 
	{
		public void products()
		{
		System.out.println(" Flipkart Product Details");
		}
	}
	
	class Electronics extends Genproducts
	{
		
		public void products()
		{
			super.products();
		System.out.println(" Flipkart Electronic Product Details");
		}
		public void Mobiles()
		{
			System.out.println(" Flipkart Electronic Mobile Details ");
		}
		public void laptop()
		{
			System.out.println(" Flipkart Electronic Laptop Details ");
		}
	}
	class Clothes extends Genproducts
	{
		public void products()
		{
			//super.products();
		System.out.println(" Flipkart clothes Product Details");
		}
		public void Cargo()
		{
			System.out.println(" Flipkart Cargo Clothes details ");
		}
		public void Jean()
		{
			System.out.println(" Flipkart Jean clothes Details ");
		}
	}
