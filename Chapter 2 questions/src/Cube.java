
public class Cube {
	private int side;
	public Cube(int s){
	this.side=s;
	}
	public int getSurfaceArea(){
	return(6*(this.side*this.side));
	}
	public int getVolume(){
	return(this.side*this.side*this.side);
	}
}

