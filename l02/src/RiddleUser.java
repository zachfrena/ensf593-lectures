
/**
 * This is the RiddleUser Class on p.73 Fig 2.15
 * 
 * @author Yves
 *
 */
public class RiddleUser {
	
	private Riddle riddle;
	

	/**
	 * Sets up 2 riddles and prints their question and answer
	 * 
	 * @param argv
	 */
	public static void main(String argv[]) { 
		Riddle riddle1 = new Riddle (
			"What is black and white and red all over?",
			"An embarrassed zebra."); 
		
		//TODO add a second riddle
		Riddle riddle2 = new Riddle("Why?", "Because.");
		
		System.out.println("Here are two riddles:");
		System.out.println( riddle1 . getQuestion ( ) ) ;
		
		//TODO print question of second riddle
		System.out.println(riddle2.getQuestion());
		 
		
		System.out.println("The answer to the first riddle is:"); 
		//TODO print answer to first riddle
		System.out.println(riddle1.getAnswer());
		
		System.out.println("The answer to the second is:"); 
		// TODO print answer to second riddle
		System.out.println(riddle2.getAnswer());
		
		}

}
