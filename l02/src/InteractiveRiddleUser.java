import java.util.Scanner;

public class InteractiveRiddleUser {

	
	public static void main(String[] args) {
		// TODO Create Riddle and print question
		Riddle riddle = new Riddle(
				"What is black and white and red all over?",
				"An embarrassed zebra.");
		
		System.out.println(riddle.getQuestion());
		
		
		// TODO Use Scanner to read the answer from the user
		Scanner s = new Scanner(System.in);
		String ans = s.nextLine();
		//System.out.println("Read: "+ans);
		// TODO close the Scanner
		s.close();
		
		
		// TODO Check if answer matches Riddle answer
		if(ans.equals(riddle.getAnswer())) {
			System.out.println("Correct!");
		}else {
			System.out.println("Almost.");
		}
		
		// TODO print correct answer
		System.out.println(riddle.getAnswer());
		

		

	}

}
