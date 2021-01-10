import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI implements ActionListener {
	
	int count = 0;
	
	private JLabel label;
	private JFrame frame;
	private JPanel panel;
	private JButton button;
	
	public GUI() {

		//Get Local Screen Resolution
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		//Store Width & Height in variables
		final int screen_Width = dim.width;
		final int screen_Height = dim.height;

		//Create a JFrame
		frame = new JFrame();
		//Set JFrame Size
		frame.setSize(screen_Width , screen_Height);

		//Create a Button
		button = new JButton("Click me");
		//Add action listener to itself
		button.addActionListener(this);
		
		//Create a Label
		label = new JLabel("Number of clicks: 0");
		
		//Create a Panel
		panel = new JPanel();
		
		//Add Button & Label to Panel
		panel.add(button);
		panel.add(label);
		
		//Add Panel to Frame
		frame.add(panel, BorderLayout.CENTER);

		//General JFrame Properties
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setExtendedState(Frame.MAXIMIZED_BOTH);
		frame.setTitle("Our GUI");
		//frame.pack();
		frame.setVisible(true);
		frame.setUndecorated(true);
		frame.setLayout( null );

	}
	
	public static void main(String[] args) {
		new GUI();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		count++;
		label.setText("Number of clicks: " + count);
	}

}
