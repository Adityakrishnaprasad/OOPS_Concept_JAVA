package Constructors;

public class Constructorsprogram {
	
	int a;
	int b;
	
	public Constructorsprogram() {  //default constructor
		
	}
	 
	void add(int a, int b) {
		System.out.println(a+b);
	}
	
	public Constructorsprogram(int A, int B) {
		
		this.a= a;
		this.b=b;
	}
	
	int pmconst(int a, int b) {
		
		return a+b;
	}
	
	

	public static void main(String[] args) {
		
		Constructorsprogram cp = new Constructorsprogram();
		cp.add(23, 23);

		Constructorsprogram cp1 = new Constructorsprogram(5, 6);
		int add=cp1.pmconst(5, 6);
		System.out.println(add);
		
	}

}
