package _12_slot_machine;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class seven implements ActionListener {
	JLabel jli = new JLabel();
	JLabel jlii = new JLabel();
	JLabel jliii = new JLabel();
	JPanel jp = new JPanel();
	JFrame jf = new JFrame();
	JButton jb = new JButton();
	String s = "";

	public void run() {

		jf.setVisible(true);
		jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
		jf.add(jp);
		jb.addActionListener(this);

		jb.setText("PRESS ME");
		jp.add(jb);
		jf.add(jp);
		jli = loadImage("cherry.png");
		jlii = loadImage("download.jpg");
		jliii = loadImage("sevenyay.jpg");
		jp.add(jli);
		jlii.setPreferredSize(new Dimension(500, 500));
		jp.add(jlii);
		jp.add(jliii);
		jf.pack();
	}

	private JLabel loadImage(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);

		return new JLabel(icon);

	}

	public JLabel gri() {
		JLabel jl = null;
		Random r = new Random();

		int ra = r.nextInt(3);

		if (ra == 0) {
			jl = loadImage("cherry.png");
			s+= "0";
		} else if (ra == 1) {
			jl = loadImage("download.jpg");
			s+= "1";
		} else if (ra == 2) {
			s+="2";
			jl = loadImage("sevenyay.jpg");
		}

		return jl;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		s= "";
		jli = gri();
		jlii = gri();
		jliii = gri();
		jp = new JPanel();
		jp.add(jb);
		jp.add(jli);
		jp.add(jlii);
		jp.add(jliii);
		jf.getContentPane().removeAll();
		jf.add(jp);
		jf.pack();
		if (s.equals("000")||s.equals("111")||s.equals("222")) {
			
			
		JOptionPane.showMessageDialog(null, "YOU WON. YOU GAMBLED AWAY ALL YOUR MONEY AND WON 12 DOLLARS. GOOD FOR YOU. NOW GO HOME. OH WAIT. THAT WAS SEIZED BY THE IRS. LOL FAILURE. GET A JOB.");
			
		}
	}
}
