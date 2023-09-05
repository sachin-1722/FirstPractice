package Package_1;

public class assignment1 
{
	int Age;
	int Rollno;
	
	public void Display1() 
	{
		System.out.println("welcome to all of you");
	}
	
	public void Display2()
	{
		System.out.println("automation is very easy");
	}
	
	public static void main(String[] args) 
	{
		assignment1 as = new assignment1();
		as.Age= 30;
		as.Rollno=1244882;
		System.out.println("Age of student " + as.Age);
		System.out.println("Rollno of student " + as.Rollno);
		as.Display1();
		as.Display2();
		
		
	}
}
