package module4;

public class Grotech 
{

	Grotech()           // 1st Constructor5
	{
		System.out.println("1st constructor");
	}
	Grotech(int a)           // 2nd Constructor5
	{
		System.out.println("2nd constructor");
	}
	
	Grotech(int a, char b, String name)           // 3rd Constructor5
	{
		System.out.println("3rd constructor");
	}
	public static void main(String[] args) {
		Grotech g1 = new Grotech(100);    // 1st Syntax
		new Grotech();                // 2nd Syntax

		Grotech g2 = new Grotech(50);
		new Grotech();
		new Grotech(100);
		
		new Grotech(234, 'k', "Harshit");
	}

}
