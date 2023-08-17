package Interfaces;

public class Aclass implements sample {

	@Override
	public void details() {
		System.out.println(id);
		System.out.println(name);
		
	}
	
	public static void main(String[] args) {
		Aclass a = new Aclass();
		a.details();
	}
	
	

}
