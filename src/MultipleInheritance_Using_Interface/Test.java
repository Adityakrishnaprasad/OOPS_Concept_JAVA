package MultipleInheritance_Using_Interface;

public class Test extends Student implements Jspiders,Qspiders{
	
	
	@Override
	public void test() {
		System.out.println("student choosen testing");
		
		
	}

	@Override
	public void develop() {
		System.out.println("student choosen developing");
	}

	public static void main(String[] args) {
		
         Test t = new Test();
         t.choose();
         t.develop();
  		System.out.println("or");
         t.test();
	}

	

}
