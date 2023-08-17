package CompileTimePolymorphism;

public class MainClass {

	public static void main(String[] args) {
		order o = new order();
		o.deliver(5642);
		o.deliver(54);
		o.deliver(2222, "earphones");
		o.deliver("phone", 1000);

	}

}
