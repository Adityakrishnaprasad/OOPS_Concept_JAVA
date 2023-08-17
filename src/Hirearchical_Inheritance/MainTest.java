package Hirearchical_Inheritance;

public class MainTest {

	public static void main(String[] args) {
		ParentHirearchial ph = new ParentHirearchial();
		ph.money=123345;
		ph.properties="houses&Lands";
		ph.property();
		
		Son s = new Son();
		s.details();
		
		Daughter d = new Daughter();
		d.Ddetails();

	}

}
