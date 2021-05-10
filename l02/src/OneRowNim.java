public class OneRowNim {
	
	//private static int MAX_STICKS = 100;
	
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

	/**
	 * Prints number of sticks and next player.
	 */
	public void report() {
		
		//TODO print Number of sticks left: 
		System.out.println("Number of sticks left: "+nSticks);
		//TODO print who has next turn
		System.out.println("Next turn Player "+player);
		
	} // report ()
} // OneRowNim1 class