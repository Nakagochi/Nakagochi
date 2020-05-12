/*
	Assignment: LabBallon
	Program:	Ballon
	Programmer: Tysen - Tysen Christensen
	Created:	Sep 30, 2019Sep 30, 2019
*/
/**
 * FILE Ballon.java
 */
package labBallon;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 * @author Tysen CLASS - Ballon
 */
public class BalloonApp extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BalloonApp frame = new BalloonApp();
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
	public BalloonApp() {
		Random r = new Random();
		Size[] s = Size.values();
		Icon[] i = { 
				new ImageIcon(BalloonApp.class.getResource("/labBallon/balloon20.jpg")),
				new ImageIcon(BalloonApp.class.getResource("/labBallon/balloon40.jpg")),
				new ImageIcon(BalloonApp.class.getResource("/labBallon/balloon60.jpg")),
				new ImageIcon(BalloonApp.class.getResource("/labBallon/balloon80.jpg")),
				new ImageIcon(BalloonApp.class.getResource("/labBallon/balloon100.jpg")) 
				};

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 517, 407);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JLabel lblLabBalloon = new JLabel("Lab Balloon");
		lblLabBalloon.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblLabBalloon, BorderLayout.NORTH);
		JLabel eql = new JLabel("");
		eql.setOpaque(true);
		JPanel panel = new JPanel();
		JLabel balloon1 = new JLabel("");
		balloon1.setVerticalAlignment(SwingConstants.BOTTOM);
		balloon1.setHorizontalAlignment(SwingConstants.CENTER);

		balloon1.setOpaque(true);
		JLabel balloon2 = new JLabel("");
		balloon2.setVerticalAlignment(SwingConstants.BOTTOM);
		balloon2.setHorizontalAlignment(SwingConstants.CENTER);
		balloon2.setOpaque(true);
		contentPane.add(panel, BorderLayout.SOUTH);

		JButton btnGetRandomBalloon = new JButton("Get Random Balloon");
		btnGetRandomBalloon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int x = r.nextInt(s.length);
				int y = r.nextInt(s.length);

				boolean a = r.nextBoolean();
				boolean b = r.nextBoolean();
				
				Balloon b1 = new Balloon(s[x], a);
				Balloon b2 = new Balloon(s[y], b);

				balloon1.setIcon(i[x]);
				balloon2.setIcon(i[y]);

				balloon1.setText(b1.toString());
				balloon2.setText(b2.toString());

				if (b1.equals(b2)) {
					eql.setText("Balloons are Equal ");
					eql.setBackground(Color.GREEN);
				} else {
					eql.setText("Balloons are not Equal ");
					eql.setBackground(Color.RED);
				}

			}
		});
		panel.add(btnGetRandomBalloon);

		panel.add(eql);

		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(0, 2, 0, 0));

		panel_1.add(balloon1);

		panel_1.add(balloon2);
	}

}
