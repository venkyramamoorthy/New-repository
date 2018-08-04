public class Javaclass {
	public static void main(String[] a) {
		System.out.println("Hai Muthu");
		int r = 10 ;
		int b = 5 ;
		
		Javaclass v = new Javaclass();
		v.add(10, 5);
		v.add(r, b);
		v.string("India Won the Match");
		
	}
	
	public void add(int a ,int b)
	{
		System.out.println("add of a + b numbers is c = " + (a+b) );
	}
	
	public void string(String a)
	{
		System.out.println(a);
	}
}
