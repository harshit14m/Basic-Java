package module4;

public class MethodDuplicate {
	static void add() {
		System.out.println("method Overloading 1");
	}
	static void add(int a) {
		System.out.println("method Overloading 2");
	}
	static void add(double a) {
		System.out.println("method Overloading 3");
	}
	void add(boolean a) {
		System.out.println("method Overloading 4");
	}
	static void add(char a) {
		System.out.println("method Overloading 5");
	}
	static void add(char a, double b) {
		System.out.println("method Overloading 6");
	}
	static void add(String a, String b) {
		System.out.println("method Overloading 7");
	}
	static void add(String a) {
		System.out.println("method Overloading 8");
	}
	public static void main(String[] args) {
		add();
		add(100);
		add(100000000000.9);
		MethodDuplicate m4 = new MethodDuplicate();
		m4.add(false);

	}

}
