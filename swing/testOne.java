
// Java program to create a blank text  
// field of definite number of columns. 
import java.awt.event.*; 
import javax.swing.*; 
class testOne extends JFrame implements ActionListener { 
    // JTextField 
    static JTextField text; 
  
    // JFrame 
    static JFrame frame; 
  
    // JButton 
    static JButton button; 
  
    // label to diaplay text 
    static JLabel label; 
  
    // default constructor 
    testOne() 
    { 
    } 
  
    // main class 
    public static void main(String[] args) 
    { 
        // create a new frame to stor text field and button 
        frame = new JFrame("textfield"); 
  
        // create a label to display text 
        label = new JLabel("nothing entered"); 
  
        // create a new button 
        button = new JButton("submit"); 
  
        // create a object of the text class 
        testOne te = new testOne(); 
  
        // addActionListener to button 
        button.addActionListener(te); 
  
        // create a object of JTextField with 16 columns 
        text = new JTextField(16); 
  
        // create a panel to add buttons and textfield 
        JPanel panel = new JPanel(); 
  
        // add buttons and textfield to panel 
        panel.add(text); 
        panel.add(button); 
        panel.add(label); 
  
        // add panel to frame 
        frame.add(panel); 
  
        // set the size of frame 
        frame.setSize(300, 300); 
  
        frame.show(); 
    } 
  
    // if the button is pressed 
    public void actionPerformed(ActionEvent e) 
    { 
        String s = e.getActionCommand(); 
        if (s.equals("submit")) { 
            // set the text of the label to the text of the field 
            label.setText(text.getText()); 
  
            // set the text of field to blank 
            text.setText("  "); 
        } 
    } 
} 

