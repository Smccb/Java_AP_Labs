import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;
//stop lights implements runnable
class StopTheLights extends JFrame{
	
	JPanel panel1 = new JPanel();
    public StopTheLights(){
        Container contentPane = getContentPane();
        contentPane.add(panel1, "Center");
        JPanel panel = new JPanel();
        Thread t1 = new Thread(new trafficLightsTest(panel1));
        addWindowListener(new WindowAdapter() {  
        	public void windowClosing(WindowEvent e) { 
        		System.exit(0);
        	}
        } );

        addButton(panel, "Start", new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                t1.start();
            }
        });

        addButton(panel, "Stop", new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                t1.interrupt();
            }
        });
        
        contentPane.add(panel,"South");
        setLocation(100, 50);
        setResizable(false);
        setSize(300,450);
        setVisible(true);
    }
    public void addButton(Container contentPane, String title, ActionListener e){
        JButton button = new JButton(title);
        contentPane.add(button);
        button.addActionListener(e);
    }
    
    public static void main(String[] args) {
        StopTheLights frame = new StopTheLights();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
