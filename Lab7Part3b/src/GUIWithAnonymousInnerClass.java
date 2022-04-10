
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class GUIWithAnonymousInnerClass extends JFrame {
	  
	public static void main(String[] args) {
		JLabel label = new JLabel("label");
		GUIWithAnonymousInnerClass GUI = new GUIWithAnonymousInnerClass();
		JButton button = new JButton("changeText");
		GUI.getContentPane().setLayout(new FlowLayout());
		GUI.getContentPane().add(label);
		GUI.getContentPane().add(button);
		//Anonymous class begins
		button.addActionListener(new ActionListener() {
			  public void actionPerformed(ActionEvent e) {
				  label.setText("Inner class has set the outer label " + getClass().getName());
			  }
		    });
		
		//Anonymous class ends
		GUI.setSize(500,300);
		GUI.setVisible(true);
	}
}