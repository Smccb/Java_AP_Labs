

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

abstract class MyAlbum extends JFrame{
	JButton startButton = new JButton("Start");
	JButton stopButton = new JButton("Stop");
	
	public MyAlbum() {
		Container contentPane = getContentPane();
		JPanel panel = new JPanel();
		//panel.setLayout();
		
		ImageIcon icon1 = new ImageIcon("20200921_054747.jpg");
		ImageIcon icon2 = new ImageIcon("20200911_180748.jpg");
		ImageIcon icon3 = new ImageIcon("20210905_204324.jpg");
		
		JLabel label1 = new JLabel(icon1);
		panel.add(label1);
		panel.add(new JLabel("dog pic"));
		JLabel label2 = new JLabel(icon2);
		panel.add(label2);
		JLabel label3 = new JLabel(icon3);
		panel.add(label3);
	
		contentPane.add(panel);
		
		setSize(400, 500);
        setVisible(true);
		setLocation(100, 50);
	}
	
	public static void main(String [] args) {
		MyAlbum frame = new MyAlbum();
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
}