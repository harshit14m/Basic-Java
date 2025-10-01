package module4;

public class NonstaticMethodNew {

	void add() 
	{
		System.out.println("Addition");
	}
	void sub() {
		System.out.println("Subtraction");
	}
	void mul() {
		System.out.println("Multiplication");
	}
	public static void main(String[] args) {

		NonstaticMethodNew n = new NonstaticMethodNew();
		n.add();
		n.sub();
		n.mul();
		n.mul();
		
		NonstaticMethodNew n1 = new NonstaticMethodNew ();
		n1.sub();
	}

}
