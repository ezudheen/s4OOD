import java.awt.*;  
import java.awt.event.*; 

class testTwo extends Frame implements ActionListener {  

	Button button = new Button("click me");  

	testTwo(){  
	
		button.setBounds(30,100,80,30);	// setting button position  

		button.addActionListener(this); 

		add(button);			//adding button into frame  

		setSize(300,300);	//frame size 300 width and 300 height  

		setLayout(null);	//no layout manager  

		setVisible(true);	//now frame will be visible, by default not visible  
	}

	public void actionPerformed(ActionEvent e) {
 
	        String s = e.getActionCommand(); 
	
	        if (s.equals("click me")) { 
  
	            button.setBounds(30,150,120,30);

	            button.setLabel("click me again"); 
	        } 
    	} 
  
	public static void main(String args[]){  
	
		testTwo frame = new testTwo();  
	}
}
