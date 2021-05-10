public class OneRowNim {
	
	
	private int nSticks = 7; // Start with 7 sticks .
	private int player = 1; // Player 1 plays first .

	public void takeOne() {
		nSticks = nSticks - 1;
		player = 3 - player;
	} // takeOne ()

	public void takeTwo() {
		nSticks = nSticks - 2;
		player = 3 - player;
	}// takeTwo()

	public void takeThree() {
		nSticks = nSticks - 3;
		player = 3 - player;
	} // takeThree ()

	public void report() {
		//TODO print Number of sticks left: 
		System.out.println("The number of sticks left is: "+nSticks);
		//TODO print who has next turn
		System.out.println("The player with the next turn: "+player);
	} // report ()
} // OneRowNim1 class