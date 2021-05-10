
import java.util.Scanner;

public class CubeUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cube c1 = new Cube(6);
		Cube c2 = new Cube(3);
		Cube c3 = new Cube(5);
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input a side length for c4: ");
		int z = sc.nextInt();
		Cube c4 = new Cube(z);
		
		System.out.println("The surface area of c1 is: "+c1.getSurfaceArea()+" and the volume of c1 is: "+c1.getVolume());
		System.out.println("The surface area of c2 is: "+c2.getSurfaceArea()+" and the volume of c2 is: "+c2.getVolume());
		System.out.println("The surface area of c3 is: "+c3.getSurfaceArea()+" and the volume of c3 is: "+c3.getVolume());
		System.out.println("The surface area of c4 is: "+c4.getSurfaceArea()+" and the volume of c4 is: "+c4.getVolume());
	}

}
