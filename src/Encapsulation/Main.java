package Encapsulation;

public class Main {

	public static void main(String[] args) {
		 p1 a = new p1("aditya",123,"kittu");
	        a.display();
	        //a.getUsername();
	        a.setUsername("krishna");
	        //a.getId();
	        a.setPassword("prasad");
	        a.setId(105);
	        System.out.println();
	        System.out.println("after changing the name is : "+a.getUsername());
	        System.out.println("after changing the ID is : "+a.getId());
	        System.out.println("after changing the name is : "+a.getPassword());
	}

}
