package CompileTimePolymorphism;

public class order {
	
	void deliver(int orderid) {
		System.out.println("id of the order is :"+orderid);
	}
	
	void deliver(String name,int price) {
		System.out.println("name of the product is : "+name+" "+"price is :"+price);
	}
	
	void deliver(int price, String name) {
		System.out.println("price is : " +price+" "+"name of the product is : "+name);
	}
	
	void deliver(double orderid) {
		System.out.println("id of the order is :"+orderid);
	}

}
