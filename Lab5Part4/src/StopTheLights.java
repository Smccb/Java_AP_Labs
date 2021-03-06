import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;
//stop lights implements runnable
class StopTheLights extends JFrame implements Runnable{
	
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
    
    public void draw(){
        Graphics g = panel1.getGraphics();
        g.setColor(Color.BLACK);
        g.fillOval(100,20,100,100);
        g.fillOval(100,125,100,100);
        g.fillOval(100,230,100,100);

    }
    
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
            draw();
            while (true){
                Graphics g = panel1.getGraphics();
                g.setColor(Color.RED);
                g.fillOval(110, 30, 80, 80);
                Thread.sleep(500);
                draw();
                g.setColor(Color.YELLOW);
                g.fillOval(110,135,80,80);
                Thread.sleep(500);
                draw();
                g.setColor(Color.green);
                g.fillOval(110,240,80,80);
                Thread.sleep(500);
                draw();
            }
        }
        catch (InterruptedException e){}
		
	}
}
