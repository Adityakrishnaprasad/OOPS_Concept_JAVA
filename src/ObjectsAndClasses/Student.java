package ObjectsAndClasses;

public class Student {

	int id;
	String name;
	char grade;
	double cgpa;
	
	void data() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(grade);
		System.out.println(cgpa);
	}
	
	//through method we are initializing variables
	
	void initialize(int eid, String ename, char egrade, double ecgpa) {
		id=eid;
		name=ename;
		grade=egrade;
		cgpa=ecgpa;
	}
}
