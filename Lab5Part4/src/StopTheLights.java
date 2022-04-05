import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class StopTheLights extends JFrame implements Runnable, ActionListener{
	JButton startButton = new JButton("Start");
	JButton stopButton = new JButton("Stop");
	
	public StopTheLights() {
		Container contentPane = getContentPane();
		JPanel buttonHolderPanel = new JPanel(new GridLayout(1, 2));
		
		
		startButton.addActionListener(this);
		stopButton.addActionListener(this);
		
		buttonHolderPanel.add(startButton);
		buttonHolderPanel.add(stopButton);
		
		contentPane.setLayout(new BorderLayout());
		contentPane.add(buttonHolderPanel, BorderLayout.SOUTH);
		
		setVisible(true);
		setSize(350, 450);
		setLocation(100, 50);
	}
	
	public static void main(String [] args) {
		StopTheLights frame = new StopTheLights();
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void drawCircle(Graphics g, int x, int y, int radius) {

		  int diameter = radius * 2;

		  //shift x and y by the radius of the circle in order to correctly center it
		  g.fillOval(x - radius, y - radius, diameter, diameter); 

		}

	@Override
	public void run() {
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == startButton) {
			int x=100, y=100, r=100;
			
			//drawCircle(g, x, y, r);
		}
		else if(e.getSource() == stopButton) {
			
		}
	}
}