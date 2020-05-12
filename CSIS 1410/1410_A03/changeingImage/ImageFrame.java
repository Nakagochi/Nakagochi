/*
	Assignment: ChangingImagesA06
	Program:	ImageFrame
	Programmer: Tysen - Tysen Christensen
	Created:	Oct 20, 2019Oct 20, 2019
*/
/**
 * FILE ImageFrame.java
 */
package changeingImage;

import java.awt.Graphics;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import java.awt.GridLayout;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.ImageIcon;

import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * @author Tysen CLASS - ImageFrame
 */
public class ImageFrame extends JFrame {
	/**
	 * FIELDS - int Temporary value for the position in the figureList array.
	 */
	private int fig = 0;
	/**
	 * FIELDS - int Temporary value for the position in the hairList array.
	 */
	private int har = 0;
	/**
	 * FIELDS - intTemporary value for the position in the shoesList array.
	 */
	private int shoe = 0;
	/**
	 * FIELDS - int Temporary value for the position in the scarfList array.
	 */
	private int scrf = 0;

	/**
	 * FIELDS - JPanel Adds objects to the GUI
	 */
	private JPanel contentPane;
	/**
	 * FIELDS - ArrayList<ImageIcon> array of figure images
	 */
	private ArrayList<ImageIcon> figureList = new ArrayList<ImageIcon>();
	/**
	 * FIELDS - ArrayList<Icon> array of hair images
	 */
	private ArrayList<Icon> hairList = new ArrayList<Icon>();
	/**
	 * FIELDS - ArrayList<Icon> array of hair images
	 */
	private ArrayList<Icon> shoesList = new ArrayList<Icon>();
	/**
	 * FIELDS - ArrayList<Icon> array of hair images
	 */
	private ArrayList<Icon> scarfList = new ArrayList<Icon>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ImageFrame frame = new ImageFrame();
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
	public ImageFrame() {
		// Adds StickFigure Images to array
		figureList.add(new ImageIcon(ImageFrame.class.getResource("images/stickFigure01.png")));
		figureList.add(new ImageIcon(ImageFrame.class.getResource("images/stickFigure02.png")));
		figureList.add(new ImageIcon(ImageFrame.class.getResource("images/stickFigure03.png")));
		// Adds Hair Images to array
		hairList.add(new ImageIcon(ImageFrame.class.getResource("images/hair01.png")));
		hairList.add(new ImageIcon(ImageFrame.class.getResource("images/hair02.png")));
		hairList.add(new ImageIcon(ImageFrame.class.getResource("images/hair03.png")));
		// Adds shoes images to array
		shoesList.add(new ImageIcon(ImageFrame.class.getResource("images/shoes01.png")));
		shoesList.add(new ImageIcon(ImageFrame.class.getResource("images/shoes02.png")));
		shoesList.add(new ImageIcon(ImageFrame.class.getResource("images/shoes03.png")));
		// Adds scarf images to array
		scarfList.add(new ImageIcon(ImageFrame.class.getResource("images/scarf01.png")));
		scarfList.add(new ImageIcon(ImageFrame.class.getResource("images/scarf02.png")));
		scarfList.add(new ImageIcon(ImageFrame.class.getResource("images/scarf03.png")));

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 468, 387);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		// Button panel
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.WEST);
		panel.setLayout(new GridLayout(6, 1, 0, 0));

		JLabel lbl01 = new JLabel("You choose");
		panel.add(lbl01);
		// hair check box
		JCheckBox chckbx_1 = new JCheckBox("Hair");
		panel.add(chckbx_1);
		// scarf check box
		JCheckBox chckbx_2 = new JCheckBox("Scarf");
		panel.add(chckbx_2);
		// shoes check box
		JCheckBox chckbx_3 = new JCheckBox("Shoes");
		panel.add(chckbx_3);

		// Update button based on the check box info
		JButton btn = new JButton("UPDATE");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int box = 0;
				if (chckbx_1.isSelected()) {
					box++;
					if (har != 2) {
						har++;
						repaint();
					} else {
						har = 0;
						repaint();
					}
				}
				if (chckbx_2.isSelected()) {
					box++;
					if (scrf != 2) {
						scrf++;
						repaint();
					} else {
						scrf = 0;
						repaint();
					}
				}
				if (chckbx_3.isSelected()) {
					box++;
					if (shoe != 2) {
						shoe++;
						repaint();
					} else {
						shoe = 0;
						repaint();
					}

				}
				if (box == 0) {
					if (fig != 2) {
						fig++;
						repaint();
					} else {
						fig = 0;
						repaint();
					}
				}

			}
		});

		panel.add(btn);

		// Image that can change
		JPanel panel_Im = new Combine();
		contentPane.add(panel_Im, BorderLayout.CENTER);

	}

	/**
	 * @author Tysen CLASS - Combine, Combines the images to one component
	 */
	public class Combine extends JPanel {

		@Override
		public void paintComponent(Graphics g) {
			super.paintComponents(g);

			figureList.get(fig).paintIcon(this, g, 100, 0);
			hairList.get(har).paintIcon(this, g, 100, 0);
			scarfList.get(scrf).paintIcon(this, g, 100, 0);
			shoesList.get(shoe).paintIcon(this, g, 100, 0);

		}
	}
}
