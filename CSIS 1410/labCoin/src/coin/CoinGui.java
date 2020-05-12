/*
	Assignment: labCoin
	Program:	CoinGui
	Programmer: Tysen - Tysen Christensen
	Created:	Oct 28, 2019Oct 28, 2019
*/
/**
 * FILE CoinGui.java
 */
package coin;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * @author Tysen
 *CLASS - CoinGui
 */
public class CoinGui extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CoinGui frame = new CoinGui();
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
	public CoinGui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		JLabel coinLbl = new JLabel("");
		coinLbl.setHorizontalAlignment(SwingConstants.CENTER);
		coinLbl.setFont(new Font("Sylfaen", Font.PLAIN, 37));
		contentPane.add(coinLbl, BorderLayout.CENTER);
		
		JPanel btnPanel = new JPanel();
		contentPane.add(btnPanel, BorderLayout.NORTH);
		btnPanel.setLayout(new GridLayout(1, 1, 0, 0));
		
		JButton btnCent = new JButton("");
		btnCent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				coinLbl.setText(Coin.CENT.toString());
			}
		});
		btnCent.setIcon(new ImageIcon(CoinGui.class.getResource("/coin/img/UsCent.png")));
		btnPanel.add(btnCent);
		
		JButton btnDime = new JButton("");
		btnDime.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				coinLbl.setText(Coin.DIME.toString());
			}
		});
		
		JButton btnNkl = new JButton("");
		btnNkl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				coinLbl.setText(Coin.NICKEL.toString());
			}
		});
		btnNkl.setIcon(new ImageIcon(CoinGui.class.getResource("/coin/img/UsNickel.png")));
		btnPanel.add(btnNkl);
		btnDime.setIcon(new ImageIcon(CoinGui.class.getResource("/coin/img/UsDime.png")));
		btnPanel.add(btnDime);
		
		JButton btnQrt = new JButton("");
		btnQrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				coinLbl.setText(Coin.QUARTER.toString());
			}
		});
		btnQrt.setIcon(new ImageIcon(CoinGui.class.getResource("/coin/img/UsQuarter.png")));
		btnPanel.add(btnQrt);
		
		
	}

}
