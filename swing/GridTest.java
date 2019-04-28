import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridTest extends JFrame {

  	public static void main(String[] args) {
    		int rows = 4;
    		int cols = 3;
    		GridTest gt = new GridTest(rows, cols);
    		gt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    		gt.pack();
    		gt.setVisible(true);
  	}

  	public GridTest(int rows, int cols) {
    		Container pane = getContentPane();
    		pane.setLayout(new GridLayout(rows, cols));
    		for (int i = 0; i < rows*cols; i++) {
      			JButton button = new JButton(Integer.toString(i + 1));
      			pane.add(button);
    		}
  	}

}
