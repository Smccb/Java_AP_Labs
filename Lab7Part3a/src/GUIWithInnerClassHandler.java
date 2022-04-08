import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUIWithInnerClassHandler extends JFrame {
	JButton button = new JButton("Button");

	JLabel label = new JLabel("Label");
	
	public GUIWithInnerClassHandler() {
		Container contentPane = getContentPane();
		JPanel panel = new JPanel();
		
		
		
		panel.add(label);
		panel.add(button);
		contentPane.add(panel);
		
		setSize(200, 200);
        setVisible(true);
		setLocation(100, 50);
	}
	
	public static void main(String[] args) {
		GUIWithInnerClassHandler frame = new GUIWithInnerClassHandler();
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public class ButtonHandler implements ActionListener {
		
		button.addActionListener(this);
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
}
