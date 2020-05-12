/*
	Assignment: RedCounter06
	Program:	RedCounterGui
	Programmer: Tysen - Tysen Christensen
	Created:	Oct 9, 2019Oct 9, 2019
*/
/**
 * FILE RedCounterGui.java
 */
package redCounter;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.SystemColor;

/**
 * @author Tysen CLASS - RedCounterGui
 */
public class RedCounterGui extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RedCounterGui frame = new RedCounterGui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public RedCounterGui() {

		Counter c = new Counter();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JLabel lblName = new JLabel("Tysen's GUI");
		lblName.setBackground(SystemColor.controlHighlight);
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(lblName, BorderLayout.SOUTH);

		JPanel panel = new JPanel();
		panel.setOpaque(false);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(0, 2, 0, 0));

		JLabel redCounter = new JLabel("Red Counter: " + c.getCounter());
		redCounter.setBackground(Color.LIGHT_GRAY);
		redCounter.setFont(new Font("Courier New", Font.PLAIN, 24));
		panel.add(redCounter);

		JButton btn1 = new JButton("Click Me");
		btn1.setOpaque(true);
		btn1.setForeground(Color.WHITE);
		btn1.setFont(new Font("Courier New", Font.PLAIN, 26));
		btn1.setBackground(new Color(0, 0, 255));
		panel.add(btn1);
		btn1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				btn1.setBackground(c.randomColor(btn1.getBackground()));
				c.count(btn1.getBackground());
				redCounter.setText("Red Counter: " + c.getCounter());
			}

		});

	}

}
