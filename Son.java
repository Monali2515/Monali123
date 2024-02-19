package inheritance;

class Parent
{
	static void add()
	{
		System.out.println("Addition");
	}
}
class Daughter extends Parent
{
	 void sub()
	{
		//add();
		System.out.println("Substraction");
	}
}
public class Son extends Parent
{
	static void mul()
	{
	
		System.out.println("Multiplication");
	}

	public static void main(String[] args) 
	{
	Daughter d1=new Daughter();
	d1.sub();
	mul();
	add();
	
	}

}
