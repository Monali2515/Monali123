package inheritance;

class Teacher
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
	public class Student extends Teacher
	{
		static void gk()
		{
			System.out.println("General knowledge");
		}
		public static void main(String[] args) 
		{
			gk();
			Teacher t1=new Teacher();
			t1.selenium();
			t1.java();
		
		}
	

}
