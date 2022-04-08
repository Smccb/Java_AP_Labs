import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LambdaGUI extends JFrame {
	public LambdaGUI() {
		Container contentPane = getContentPane();
		JPanel panel = new JPanel();
		JButton button = new JButton("Button");
		
		button.addActionListener(e -> {
			Class<LambdaGUI> classNameInstance = LambdaGUI.class;
			String className = classNameInstance.getName();
			System.out.println("class Name: " + className);
		});
		
		panel.add(button);
		contentPane.add(panel);
		
		setSize(200, 200);
        setVisible(true);
		setLocation(100, 50);
	}
	
	public static void main(String[] args) {
		LambdaGUI frame = new LambdaGUI();
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
