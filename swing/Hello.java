// Hello.java (Java SE 5)
import javax.swing.*;

public class Hello extends JFrame {

	public Hello() {
        
		//super("hello");
   		
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

	        //this.add(new JLabel("Hello, world!"));

		//this.setSize(300, 500);

		this.setBounds(100, 300, 280, 440);
			
	        //this.pack();

	        this.setVisible(true);
    	}

    	public static void main(final String[] args) {
        	
		new Hello();
    	}
}
