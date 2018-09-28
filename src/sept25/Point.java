package sept25;

public class Point {
	
	int x; 
	int y;
	
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public Point() {
		this.x=0;
		this.y=0;
	}
	
	public Point(int x) {
		this.x=x;
		this.y=0;
	}
	
	public String toString() {
		return "(" + x + "," + y + ")" ;
	}

}
