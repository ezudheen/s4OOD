import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MultiGrid extends JFrame {

  	public static void main(String[] args) {
    		
		new MultiGrid();
  	}


	public void CreateGrid (Container pane, int rows, int cols) {

		pane.setLayout(new GridLayout(rows, cols));
	}


  	public MultiGrid() {

		// Outer Grid

		int outer_rows = 2;

    		int outer_cols = 2;

		JPanel panel1 = new JPanel();

		JPanel panel2 = new JPanel();

		JPanel panel3 = new JPanel();

		JPanel panel4 = new JPanel();

		panel1.add(new JButton(Integer.toString(1)));

		panel2.add(new JButton(Integer.toString(2)));

		JButton button3 = new JButton(Integer.toString(3));

		panel3.add(button3);

		panel4.add(new JButton(Integer.toString(4)));

		CreateGrid(getContentPane(), outer_rows, outer_cols);  

		getContentPane().add(panel1); 

		getContentPane().add(panel2); 

		getContentPane().add(panel3); 

		getContentPane().add(panel4); 

		// Inner Grid

		int inner_rows = 2;

    		int inner_cols = 2;

		JPanel panel31 = new JPanel();

		JPanel panel32 = new JPanel();

		JPanel panel33 = new JPanel();

		JPanel panel34 = new JPanel();

		panel3.remove(button3);

		panel31.add(new JButton(Integer.toString(31)));

		panel32.add(new JButton(Integer.toString(32)));

		panel33.add(new JButton(Integer.toString(33)));

		panel34.add(new JButton(Integer.toString(34)));

		CreateGrid(panel3, inner_rows, inner_cols);  

		panel3.add(panel31); 

		panel3.add(panel32); 

		panel3.add(panel33); 

		panel3.add(panel34); 
    		
		// Defualt Settings

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.pack();

		this.setVisible(true);
  	}

}
