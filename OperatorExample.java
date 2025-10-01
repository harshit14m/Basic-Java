package module4;

public class OperatorExample {
	
	static void add() 
	{
		System.out.println("Addition");
		int a = 100;
		int b = 200;
		int sum = a+b;
		System.out.println(sum);
	}
	static void sub()
	{
		System.out.println("Subtraction");
		int a = 100;
		int b = 200;
		int sub = a-b;
		System.out.println(sub);
	}
	static void mul()
	{
		System.out.println("Multiplication");
		int a = 100;
		int b = 200;
		int mul = a*b;
		System.out.println(mul);
	}
	static void div()
	{
		System.out.println("Division");
		int a = 550;
		int b = 200;
		int div = a/b;
		System.out.println(div);
	}
	static void mod()
	{
		System.out.println("Modulus");
		int a = 410;
		int b = 400;
		int mod = a%b;
		System.out.println(mod);
	}

	public static void main(String[] args) {
		add();
		sub();
		mul();
		div();
		mod();

	}

}
