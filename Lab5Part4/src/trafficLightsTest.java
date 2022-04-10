import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

//implements runnable
public class trafficLightsTest implements Runnable {
	private JPanel panel = new JPanel();
	
	//constructor
    public trafficLightsTest(JPanel panel1){
        panel = panel1;
    }
    //draw method fills in black in traffic lights
	public void draw(){
        Graphics g = panel.getGraphics();
        g.setColor(Color.BLACK);
        g.fillOval(100,20,100,100);
        g.fillOval(100,125,100,100);
        g.fillOval(100,230,100,100);

    }
    
	//run method part of the threads class
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			//calls draw method
            draw();
           //loops through drawing colours in traffic lights indefinitely
            while (true){
                Graphics g = panel.getGraphics();
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