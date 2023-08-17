package Encapsulation;

public class p1 {

	    private String username;
	    private int id;
	    private String password;

	    p1(String username,int id,String password){
	        this.username=username;
	        this.id=id;
	        this.password=password;
	    }

	    public String getUsername() {
	        return username;
	    }

	    public void setUsername(String username) {
	        this.username = username;
	    }

	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public String getPassword() {
	        return password;
	    }

	    public void setPassword(String password) {
	        this.password = password;
	    }

	    public void display(){
	        System.out.println("before changing the name is : "+this.username);
	        System.out.println("before changing the id is : "+this.id);
	        System.out.println("before changing the password is : "+this.password);
	        System.out.println();
	        System.out.println(".................................................");
	    }
	}

	

