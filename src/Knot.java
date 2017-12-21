
public class Knot {
	int X;
	int Y;
	
	Knot up = new Knot();
	Knot down = new Knot();
	Knot left = new Knot();
	Knot right = new Knot();
	
	public Knot(){
		
	}
	
	public Knot (int X, int Y, Knot up, Knot down, Knot left, Knot right){
		
		this.X = X;
		this.Y = Y;
		
		this.up = up;
		this.down = down;
		this.left = left;
		this.right = right;
	}

}
