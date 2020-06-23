import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class lolfunnynot implements ActionListener {

	public void run() {
		// TODO Auto-generated method stub
	jf.setVisible(true);	
	jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
	jf.add(jp);
	jp.add(jb);
	jp.add(jbb);
	jbb.setText("Punchline");
	jb.setText("Joke");
	jb.addActionListener(this);
	jbb.addActionListener(this);
	
	
	
	
	
	
	
	
	
	
	jf.pack();

	}
	JFrame jf = new JFrame();
	JPanel jp = new JPanel();
	JButton jb = new JButton();
	JButton jbb = new JButton();
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == jb) {
			JOptionPane.showMessageDialog(null, "why did the chicken cross the road?");
		}
		if (e.getSource() == jbb) {
			JOptionPane.showMessageDialog(null, "How would I know? I'm no chicken!");
		}
	}
	
}
 