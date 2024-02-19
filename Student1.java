package inheritance;
class Teacher1
{
	void selenium()
	{
		System.out.println("selenium");
	}
	void java()
	{
		System.out.println("java");
	}
}
public class Student1 extends Teacher1
{

	void gk()
	{
		System.out.println("gk");
	}
	public static void main(String[] args)
	{
		Teacher1 p1 = new Teacher1();
		p1.selenium();
		p1.java();
		Student1 s1=new Student1();
		s1.gk();
		
	}

}
