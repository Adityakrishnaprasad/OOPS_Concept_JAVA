package ObjectsAndClasses;

public class Trains {
	int no;
	String name;
	
	Trains(int tid,String tname){
		no=tid;
		name=tname;
	}
	
	void display() {
		System.out.println("number of train is :"+no);
		System.out.println("name of the train is :"+name);
	}
	

}
