
public class OneRowNimTester {

	public static void main(String[] args) {
		
		//TODO create a OneRowNim object
		OneRowNim nim = new OneRowNim();
		
		// 7 sticks, player 1
		// TODO call report
		nim.report();
		
		// TODO take three sticks
		nim.takeThree();
		// 4 sticks, player 2
		// TODO call report
		nim.report();
		
		// TODO take two sticks
		nim.takeTwo();
		// 2 sticks, player 1
		// TODO call report
		nim.report();
		
		
		// TODO take one stick
		nim.takeOne();
		// 1 stick, player 2
		// TODO call report
		nim.report();
		
		// TODO This will go negative
		nim.takeThree();
		nim.report();
		
				
	}

}
