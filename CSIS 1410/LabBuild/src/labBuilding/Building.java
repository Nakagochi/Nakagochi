package labBuilding;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Building extends JPanel {
	// TODO: write code to draw the building
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		ArrayList<Color> c = new ArrayList<Color>();
		int x = 25;
		int y = 100;
		int a = 0;
		double z = Math.random()*12;
		
		c.add(Color.RED);
		c.add(Color.YELLOW);
		c.add(Color.BLUE);
		c.add(Color.GREEN);
		c.add(Color.ORANGE);
		c.add(Color.PINK);
		c.add(Color.BLACK);
		c.add(Color.GRAY);
		c.add(Color.WHITE);
		c.add(Color.MAGENTA);
		c.add(Color.CYAN);
		c.add(Color.DARK_GRAY);
		c.add(Color.LIGHT_GRAY);
		
		g.setColor(c.get((int) z));
		g.fillRect(x-5, y-5, 260, 260 );
		g.fillRect(x+175,y-40,20,40);
		g.fillRect(x+200,y-25,10,25);
		
		for(a=0; a < 10; a ++ ) {			z= Math.random()*12;
			
			g.setColor(c.get((int) z));
			g.fillRect(x, y, 250, 25);
			g.setColor(c.get((int) z));
			g.drawRect(x, y, 250, 25);
			g.setColor(c.get((int) z));
			g.fillRect(147, 100, 6, 255);
			g.setColor(c.get((int) z));
			g.fillRect(73, 100, 6, 255);
			g.setColor(c.get((int) z));
			g.fillRect(220, 100, 6, 255);
			
			y += 25;
		}
		g.setColor(new Color(200,140,255));;
		g.fillRect(110, 340, 15, 15);
	
		
	}

}
