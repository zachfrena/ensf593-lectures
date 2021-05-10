
public class Person{

	private String name;//setting up variables
	private String phone;
	
	public Person(String n, String p) { //constructor for Person class
		this.name=n;
		this.phone=p;
	}
	
	public String printName() { //method to print name
		return this.name;
	}
	public String printPhone() { //method to print phone
		return this.phone;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Person z= new Person("Zach","Samsung"); //calling constructor to create object
	System.out.println("The Person's name is: " + z.printName()); 
	System.out.println("The Person's phone is: " + z.printPhone());
	}

}
