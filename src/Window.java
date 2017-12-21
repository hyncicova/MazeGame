
import javax.swing.JFrame;

public class Window extends JFrame {

	   public Window() {
	       this.setTitle("The Bug Game");
	       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      
	      Screen background = new Screen();
	        this.add(background);

	       this.setSize(600, 500);
	   }

	   public static void main(String[] args) {
	       Window okno = new Window();
	       okno.setVisible(true);
	   }
}

