/*
	Assignment: 1410_Module03
	Program:	ExerciseGui
	Programmer: Tysen - Tysen Christensen
	Created:	Oct 9, 2019Oct 9, 2019
*/
/**
 * FILE ExerciseGui.java
 */
package module03;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * @author Tysen CLASS - ExerciseGui
 */
public class ExerciseGui extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExerciseGui frame = new ExerciseGui();
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
	public ExerciseGui() {
		
		//Constructs the counter Class within the ExerciseGui Class.
		Count c = new Count();
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		
		//Top label of GUI. Prints "V O T E"
		JLabel lblVote = new JLabel("V O T E");
		lblVote.setBorder(new EmptyBorder(8, 0, 8, 0));
		lblVote.setForeground(Color.DARK_GRAY);
		lblVote.setHorizontalAlignment(SwingConstants.CENTER);
		lblVote.setOpaque(true);
		lblVote.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblVote.setBackground(new Color(230, 230, 230));
		contentPane.add(lblVote, BorderLayout.NORTH);
		
		
		//Bottom Panel that holds the labels for Democrat and Republic. Also where the counters are displayed.
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);
		panel_1.setLayout(new GridLayout(0, 2, 0, 0));
		
		
		//republican Counter
		JLabel repCount = new JLabel("Republican: " + c.getrCount());
		repCount.setHorizontalAlignment(SwingConstants.CENTER);
		repCount.setFont(new Font("Courier New", Font.PLAIN, 18));
		panel_1.add(repCount);
		
		
		//democrat counter
		JLabel demCount = new JLabel("Democrat: " + c.getdCount());
		demCount.setHorizontalAlignment(SwingConstants.CENTER);
		demCount.setFont(new Font("Courier New", Font.PLAIN, 18));
		panel_1.add(demCount);
		
		
		// The panel that holds the buttons
		JPanel panel = new JPanel();
		panel.setBorder(new EmptyBorder(15, 15, 15, 15));
		panel.setBackground(new Color(180, 180, 180));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(0, 2, 15, 0));
		
		
		//Republican button. Holds Elephant picture
		JButton btnE = new JButton("");
		btnE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c.repCounter();
				repCount.setText("Republican: " + c.getrCount());
			}
		});
		btnE.setIcon(new ImageIcon(ExerciseGui.class.getResource("/module03/Images/Republican-Logo-4.png")));
		panel.add(btnE);
		
		
		//Democrat Button. Holds Democrat Picture.
		JButton btnD = new JButton("");
		btnD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c.demCounter();
				demCount.setText("Democrat: " + c.getdCount());
			}
		});
		btnD.setIcon(new ImageIcon(ExerciseGui.class.getResource("/module03/Images/Democrat-Logo-3.png")));
		panel.add(btnD);

	}

}
