public class OneRowNim {
	
<<<<<<< HEAD
=======
	//private static int MAX_STICKS = 100;
>>>>>>> 34c5676b030c012dfdc2640d90bfba8139b25da0
	
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
<<<<<<< HEAD
		//TODO print Number of sticks left: 
		System.out.println("The number of sticks left is: "+nSticks);
		//TODO print who has next turn
		System.out.println("The player with the next turn: "+player);
=======
		
		//TODO print Number of sticks left: 
		System.out.println("Number of sticks left: "+nSticks);
		//TODO print who has next turn
		System.out.println("Next turn Player "+player);
		
>>>>>>> 34c5676b030c012dfdc2640d90bfba8139b25da0
	} // report ()
} // OneRowNim1 class