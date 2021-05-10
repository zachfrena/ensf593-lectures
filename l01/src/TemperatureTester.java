
public class TemperatureTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Temperature t = new Temperature(5.4);
		
		System.out.println("The temperature is: "+ t.getTemp());
		t.setTemp(6.2);
		System.out.println("The temperature is: "+ t.getTemp());
	}

}
