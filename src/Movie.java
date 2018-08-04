public class Movie {
	int ticket;
	String film;
	int price;
	float gst = 0.28f;

	public static void main(String[] b) {
		System.out.println("Movie Prices");
		Movie I = new Movie();
		I.price = 150;
		Movie B = new Movie();
		B.price = 160;
		I.Ivanthandiran();
		B.Bagubali();
	}

	public void Ivanthandiran() {
		System.out.println("Ivan Thandiran");
		System.out.println(" Movie Price = " + Totalprice());
	}

	public void Bagubali() {
		System.out.println("Bagubali");
		System.out.println(" Movie Price = " + Totalprice());
	}
	
	public float Totalprice()
	{
		float tot=price*gst;
		tot=price + tot;
		return tot;
	}
}