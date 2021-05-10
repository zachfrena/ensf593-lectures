
public class OneRowNim {
	
	private int player;//initialize variables
	private int sticks;
	
	public OneRowNim(int p, int s) {
		this.player=p;
		this.sticks=s;
	}
	
	public void takeOne() {
		sticks=sticks-1;
		System.out.println("There are: "+sticks+" sticks left.");
		player=3-player;
		System.out.println("It is Player "+player+"'s turn.");
	}
	public void takeTwo() {
		sticks=sticks-2;
		System.out.println("There are: "+sticks+" sticks left.");
		player=3-player;
		System.out.println("It is Player "+player+"'s turn.");
	}
	public void takeThree() {
		sticks=sticks-3;
		System.out.println("There are: "+sticks+" sticks left.");
		player=3-player;
		System.out.println("It is Player "+player+"'s turn.");
	}
	
}
