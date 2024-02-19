package inheritance;
class Three
{
	void salman()
	{
		System.out.println("Salman khan");
	}
	void shahrukh()
	{
		System.out.println("Shahrukh khan");
	}
}

class Two extends Three
{
	void rinku()
	{
		System.out.println("Rinku Singh");
	}
	void surya()
	{
		System.out.println("Surya kumar");
	}
}
public class One extends Two
{
	 void pune()
	{
		System.out.println("Education");
	}
	void banglore()
	{
		System.out.println("IT Industries");
	}
	public static void main(String[] args) 
	{
		System.out.println("Cricket");
		One o1 = new One();
		o1.rinku();
		o1.surya();
		
		System.out.println("Actor");
		o1.salman();
		o1.shahrukh();
		
		
		System.out.println("City");
		o1.pune();
		o1.banglore();
		
		
	
	}
	
	
	
	

}
