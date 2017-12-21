
public class Game {
	Knot a = new Knot();
	Knot b = new Knot();
	int c = 2;
	int d = 5;
	
	Knot pokus = new Knot(c, d, a, null, b, null);
	
	System.out.println(pokus.up);
	
}
