package guiIntro;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class GuiIntroApp {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
Font font1 = new Font("Tahoma", Font.BOLD, 33);
Font font2 = new Font("Papaya", Font.BOLD + Font.ITALIC, 77);
Font font3 = new Font("Tahoma", Font.BOLD, 16);
		frame.setBounds(100, 10, 400, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNorth = new JLabel("MyFirstGui");
		lblNorth.setHorizontalAlignment(JLabel.CENTER);
		lblNorth.setForeground(Color.GREEN);
		lblNorth.setBackground(Color.BLUE);
		lblNorth.setOpaque(true);
		lblNorth.setFont(font1);
		
		
		JLabel lblCenter = new JLabel("Hi");
		lblCenter.setHorizontalAlignment(JLabel.CENTER);
		lblCenter.setForeground(Color.ORANGE);
		lblCenter.setBackground(Color.RED);
		lblCenter.setOpaque(true);
		lblCenter.setFont(font2);
		
		JLabel lblName = new JLabel("NAME: ", JLabel.CENTER);
		/*lblName.setHorizontalAlignment(JLabel.CENTER);
		lblName.setForeground(Color.ORANGE);
		lblName.setBackground(Color.RED);
		lblName.setOpaque(true);
		*/
		
		lblName.setFont(font3);
		
		JButton btnWest = new JButton("WEST");
		JTextField txt = new JTextField(16);
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.GRAY);
		
		
		frame.add(lblCenter);
		frame.add(lblNorth, BorderLayout.NORTH);
		frame.add(btnWest, BorderLayout.WEST);
		panel1.add(lblName);
		panel1.add(txt);
		frame.add(panel1, BorderLayout.SOUTH);
		
		
		
		
		
		
		
		frame.setVisible(true);
		
	}

}
