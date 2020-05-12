/*
	Assignment: LabGuiLayout
	Program:	LayoutManager
	Programmer: Tysen - Tysen Christensen
	Created:	Sep 30, 2019Sep 30, 2019
*/
/**
 * FILE LayoutManager.java
 */
package layoutManager;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

/**
 * @author Tysen CLASS - LayoutManager
 */
public class LayoutManager extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LayoutManager frame = new LayoutManager();
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
	public LayoutManager() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.WEST);

		JLabel lblDemoLayout = new JLabel("Demo Layout");
		lblDemoLayout.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblDemoLayout, BorderLayout.NORTH);

		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(0, 4, 0, 0));

		JLabel lbl1 = new JLabel("1");
		lbl1.setForeground(Color.DARK_GRAY);
		lbl1.setFont(new Font("Times New Roman", Font.PLAIN, 87));
		lbl1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1.setOpaque(true);
		lbl1.setBackground(new Color(255, 255, 0));
		panel_1.add(lbl1);

		JLabel lbl2 = new JLabel("2");
		lbl2.setForeground(Color.DARK_GRAY);
		lbl2.setFont(new Font("Times New Roman", Font.PLAIN, 87));
		lbl2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl2.setBackground(Color.BLUE);
		lbl2.setOpaque(true);
		panel_1.add(lbl2);

		JLabel lbl3 = new JLabel("3");
		lbl3.setForeground(Color.DARK_GRAY);
		lbl3.setFont(new Font("Times New Roman", Font.PLAIN, 87));
		lbl3.setHorizontalAlignment(SwingConstants.CENTER);
		lbl3.setBackground(Color.YELLOW);
		lbl3.setOpaque(true);
		panel_1.add(lbl3);

		JLabel lbl4 = new JLabel("4");
		lbl4.setForeground(Color.DARK_GRAY);
		lbl4.setFont(new Font("Times New Roman", Font.PLAIN, 87));
		lbl4.setHorizontalAlignment(SwingConstants.CENTER);
		lbl4.setOpaque(true);
		lbl4.setBackground(Color.YELLOW);
		panel_1.add(lbl4);

		JButton Button = new JButton("<==");
		Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (lbl1.getBackground() == Color.BLUE) {
					lbl4.setBackground(Color.BLUE);
					lbl1.setBackground(Color.YELLOW);
				} else if (lbl2.getBackground() == Color.BLUE) {
					lbl1.setBackground(Color.BLUE);
					lbl2.setBackground(Color.YELLOW);
				} else if (lbl3.getBackground() == Color.BLUE) {
					lbl2.setBackground(Color.BLUE);
					lbl3.setBackground(Color.YELLOW);
				} else if (lbl4.getBackground() == Color.BLUE) {
					lbl3.setBackground(Color.BLUE);
					lbl4.setBackground(Color.YELLOW);
				}
			}
		});

		JButton Button_1 = new JButton("==>");
		Button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (lbl1.getBackground() == Color.BLUE) {
					lbl2.setBackground(Color.BLUE);
					lbl1.setBackground(Color.YELLOW);
				} else if (lbl2.getBackground() == Color.BLUE) {
					lbl3.setBackground(Color.BLUE);
					lbl2.setBackground(Color.YELLOW);
				} else if (lbl3.getBackground() == Color.BLUE) {
					lbl4.setBackground(Color.BLUE);
					lbl3.setBackground(Color.YELLOW);
				} else if (lbl4.getBackground() == Color.BLUE) {
					lbl1.setBackground(Color.BLUE);
					lbl4.setBackground(Color.YELLOW);
				}
			}
		});
		panel.setLayout(new GridLayout(7, 1, 2, 2));
		panel.add(Button);
		panel.add(Button_1);
	}

}
