
public class Temperature {
	
	public double temp; //creating the temp variable
	public Temperature(double t) { //constructor
		this.temp=t;
	}
	
	public void setTemp(double t) { //creating the setTemp method
		this.temp=t; //setting the temp variable to the user input
	}
	public double getTemp() {
		return(this.temp); //returning the current temp
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Temperature t= new Temperature(45.2);// calling the constructor and creating new object 
	System.out.println(t.getTemp()); //getting the current temp
	t.setTemp(44.5); //setting new temp to 44.5
	System.out.println(t.getTemp()); //getting the updated temp
		
	}

}
