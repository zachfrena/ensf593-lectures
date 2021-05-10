
public class Rectangle {
	
	public int length;
	public int width;
	
	public Rectangle(int l, int w) {
		this.length=l;
		this.width=w;
	}
	
	public int getPerimeter(){
		return(2*(this.width+this.length));
	}
	
	
}
