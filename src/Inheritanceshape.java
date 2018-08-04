public class Inheritanceshape {
	public static void main(String[] a) {
		
		/*Shape s = new Shape();
		s.Area();
		Rectangle R = new Rectangle();
		R.Area();
		Square S = new Square();
		S.Area();*/
		Shape s = new Square();
		s.Area();
		Square V = (Square)s; // Type casting Methods
		V.Area1();
		
	}
}
	 class Shape {
		public void Area() {
System.out.println(" Area for Shape ");
		}
	}

	class Rectangle extends Shape {
		public void Area() {
			System.out.println(" Area for Rectangle ");
					}
	}

	class Square extends Shape {
		public void Area() {
			super.Area();
			System.out.println(" Area for Square ");
					}
		public void Area1() {
			//super.Area();
			System.out.println(" Area1 for Square ");
					}

	}


