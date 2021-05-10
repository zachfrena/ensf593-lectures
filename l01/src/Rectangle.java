
public class Rectangle {

	public int length;
	public int width;
	public int x;
	public int y;

	public Rectangle(int length, int width, int x, int y) {
		this.length=length;
		this.width=width;
		this.x=x;
		this.y=y;
	}
	
	public int calculateArea() {
		return this.length * this.width;
	}
	
	public void draw() {
	}
}