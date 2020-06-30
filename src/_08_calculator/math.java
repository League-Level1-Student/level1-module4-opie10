package _08_calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class math implements ActionListener {

	int q ;
	int w ;
	 int e ;
	
 JTextField hoi = new JTextField(20);
 JTextField hi = new JTextField(20);
 JFrame jf = new JFrame();
 JLabel jl = new JLabel();
 JButton jb1 = new JButton();
 JButton jb2 = new JButton();
 JButton jb3 = new JButton();
 JButton jb4 = new JButton();
 JPanel jp = new JPanel();
	
	
public void run()	{
jb1.setText("Add");	
jb2.setText("Sub");
jb3.setText("Div");
jb4.setText("Mul");
	
jb1.addActionListener(this);		
jb3.addActionListener(this);	
jb2.addActionListener(this);	
jb4.addActionListener(this);	
	
jp.add(hi);
jp.add(hoi);


jp.add(jb1);
jp.add(jb2);
jp.add(jb3)	;
jp.add(jb4);	
	
jp.add(jl);	
	jf.add(jp);
	jf.setVisible(true);
	jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
	jf.pack();
	
	
	
	
}
		
public void add(int q, int w) {
	
	 e = (q + w);
}	
public void sub(int q, int w) {
	
	 e = (q - w);
}	
public void div(int q, int w) {
	
	 e = (q / w);
}	
public void mul(int q, int w) {
	
	 e = (q * w);
}

@Override
public void actionPerformed(ActionEvent m) {
	// TODO Auto-generated method stub
	if (m.getSource()== jb1) {
	q = Integer.parseInt(hi.getText());
	w = Integer.parseInt(hoi.getText());
	add(q, w);
	}
	
	if (m.getSource()== jb2) {
		q = Integer.parseInt(hi.getText());
		w = Integer.parseInt(hoi.getText());
		sub(q, w);
		}
	if (m.getSource()== jb3) {
		q = Integer.parseInt(hi.getText());
		w = Integer.parseInt(hoi.getText());
		div(q, w);
		}
	if (m.getSource()== jb4) {
		q = Integer.parseInt(hi.getText());
		w = Integer.parseInt(hoi.getText());
		mul(q, w);
		}
	jl.setText(""+ m); 
	jf.pack();
}	

	
	
	
	
	
}
