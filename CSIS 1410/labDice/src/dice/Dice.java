/*
	Assignment: labDice
	Program:	Dice
	Programmer: Tysen - Tysen Christensen
	Created:	Sep 23, 2019Sep 23, 2019
*/
/**
 * FILE Dice.java
 */
package dice;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * @author Tysen
 *CLASS - Dice
 */
public class Dice {

	/**
	 * METHOD-
	 *@param args
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		Random r = new Random();
		Icon[] icons = {new ImageIcon(Dice.class.getResource("/dice/die-1.png")),
				new ImageIcon(Dice.class.getResource("/dice/die-2.png")),
				new ImageIcon(Dice.class.getResource("/dice/die-3.png")),
				new ImageIcon(Dice.class.getResource("/dice/die-4.png")),
				new ImageIcon(Dice.class.getResource("/dice/die-5.png")),
				new ImageIcon(Dice.class.getResource("/dice/die-6.png"))
				
				};
		
		
				frame.setBounds(100, 10, 400, 500);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				JLabel lblCenter = new JLabel("",JLabel.CENTER);
				lblCenter.setIcon(icons[r.nextInt(icons.length)]);
			
				
				JButton btnSouth = new JButton("Roll 'Em ");
				btnSouth.setForeground(Color.PINK);
				btnSouth.setBackground(Color.BLACK);
				btnSouth.addActionListener(new ActionListener() {

					
					public void actionPerformed(ActionEvent e) {
						lblCenter.setIcon(icons[r.nextInt(icons.length)]);
						
					}});
				
				
				
				frame.add(lblCenter);
				frame.add(btnSouth, BorderLayout.SOUTH);
				frame.setVisible(true);
	}

}
