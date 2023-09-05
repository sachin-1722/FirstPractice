package Package_1;


//{}----represents boundary(body) of the class 
public class Class1 
{
	int a;
	int b;
	int c;
	public void abc()
	{
		System.out.println("This is java basics class");
	}
	public static void main(String[] args) 
	{
		Class1 cl = new Class1();
		cl.abc();
		
		cl.a=105;
		cl.b=250;
		cl.c = cl.a+cl.b;
		System.out.println("the value of a " + cl.a);
		System.out.println("the value of b " + cl.b);
		System.out.println("the value of c " + cl.c);
		
		cl.a=420;
		cl.c = cl.a+cl.b;
		System.out.println("the value of a " + cl.a);
		System.out.println("the value of c " + cl.c);
//		System.out.println("This is inside main method");
	}
}
