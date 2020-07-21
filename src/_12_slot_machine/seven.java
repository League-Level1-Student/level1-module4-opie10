package _12_slot_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class seven implements ActionListener {
	public void run() {
JLabel jli = new JLabel();
JLabel jlii = new JLabel ();
JLabel jliii = new JLabel();
		JPanel jp = new JPanel();
		JFrame jf = new JFrame();
		JButton jb = new JButton();
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
jp.add(jlii);
jp.add(jliii);
jf.pack();
	}

	private JLabel loadImage(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);

		return new JLabel(icon);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}
