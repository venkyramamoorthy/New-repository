
public class Company {
	public static void main (String [] b)
	{
		//Employee e=new Employee();
		Employee c = new Manager() ;
	    c.salary();
	    Manager v= (Manager)c;
	    v.project();
	    new Hr();
	    System.out.println();
	    System.out.println("Olunga Poduda Madaiya doi");
	    System.out.println("Olunga Poduda Madaiya doi");
	    System.out.println("Maaadu matom vazhanthurukkaye olunga theriyatha");//  update venkatesh
	    System.out.println("Maaadu matom vazhanthurukkaye olunga ootha theriyatha");
	    System.out.println("i am updating");
	    System.out.println("i am updating2");
	    System.out.println("i am updating3");

	}
}

abstract class Employee
{
	public void salary()
	{
		System.out.println(" salary For Employee ");
	}
	
}

 class Manager extends Employee
 {
	 public void salary()
	 {
		 super.salary();
		 System.out.println(" salary For manager ");
	 }
	 public void project()
	 {
		 System.out.println(" projects For manager ");
	 }
 }
 
 class Hr extends Employee
 {
	 public void salary()
	 {
		 System.out.println("Salary For Hr ");
	 }
	 public void project()
	 {
		 System.out.println("Projects For Hr");
	 }
 }