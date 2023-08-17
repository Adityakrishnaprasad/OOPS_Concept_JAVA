package RunTimePolyMorphism;

public class RunTimePolymorphismMain {

	public static void main(String[] args) {
		
		Vehicle v = new Vehicle();  //(specalization)
		v.start();
		
		Vehicle v2 = new car(); //upcasting (generalization)
		v2.start();
		
	
		Vehicle v1 = new BikeRP();
		v1.start();
		
		
		
	}

}
