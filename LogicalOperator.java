package module4;

public class LogicalOperator {

	public static void main(String[] args) {
		int a=100;
		int b=20;
		if(!(a>80 && b==a))
		{
			System.out.println("and operator");
		}
		if(!(a<b || b==a))
		{
			System.out.println("or operator");
		}

	}

}
