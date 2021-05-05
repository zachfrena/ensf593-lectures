
public class HelloWorld extends Object{

	private String greeting = "Hello World";
	
	public void greet() {
		
		System.out.println(this.greeting);
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloWorld helloworld;
		helloworld = new HelloWorld();
		helloworld.greet();

	}

}
