package _11_whack_a_mole;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class elom implements ActionListener {
	JButton r;
	JFrame jf = new JFrame();
	JPanel jp = new JPanel();
	int mh = 0;
Date md = null ;
	public void run() {

		Random rd = new Random();
		int rad;
		rad = rd.nextInt(24);
if ( md == null) {
	md = new Date();
}
		for (int i = 0; i < 24; i++) {
			JButton jb = new JButton();
			jb.addActionListener(this);
			jp.add(jb);

			if (i == rad) {
				jb.setText("MOLE");
				r = jb;

			}
		}
		jf.add(jp);
		jf.setSize(new Dimension(300, 300));
		jf.setVisible(true);
		jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == r) {
			speak("Correct!");
			mh = mh + 1;
			jf.getContentPane().removeAll();
			jp = new JPanel();
if (mh == 10) {
	endGame(md, mh);
	System.exit(0);
}
			run();
		} else {

			speak("YOU'RE AN IDIOT YOU HAVE TO CLICK THE MOLE! BUTTON NOT THE BLANK ONE YOU IDIOT!tgherstiugeuirshcuierhestfiuvdfhrtfijvhseuirdfhversihrfveuirghfvuirsfghuierghuirghreiutygiurhfiurhfiuwehtguierghuierhfueiryguierhguieryguifdhsuighfsuidhciuesfhiuweqhe1ui2y8r72987745uheifihdihfdiueghrgiuhrgpneumonoultramicroscopicsilicovolcanoconiosispneumonoultramicroscopicsilicovolcanoconiosispneumonoultramicroscopicsilicovolcanoconiosispneumonoultramicroscopicsilicovolcanoconiosispneumonoultramicroscopicsilicovolcanoconiosispneumonoultramicroscopicsilicovolcanoconiosispneumonoultramicroscopicsilicovolcanoconiosispneumonoultramicroscopicsilicovolcanoconiosispneumonoultramicroscopicsilicovolcanoconiosispneumonoultramicroscopicsilicovolcanoconiosispneumonoultramicroscopicsilicovolcanoconiosispneumonoultramicroscopicsilicovolcanoconiosispneumonoultramicroscopicsilicovolcanoconiosispneumonoultramicroscopicsilicovolcanoconiosishjfdghtg yery7tug3y5e78tgydrhsuidrfh34euiok4jedhchdyhghtefygvehrdfkbdyfuhghbertudhfguerdhtfguvierdghfueryt7e5ry5tfiudthfruifgvherfdfhvuigfghidfhuighbiugdkvbgikghhgfkdfhfgiudfduyuygyurdyfryedgfueruesgrfuyufgriusyfgetyurg78retu748894534y79tyueiurfhfdvbnv jknbvcmbkcvmgdjfhvdfhkvnegrhfjketuhfjuhitefhuitefuhirguhiuhirguihfgihfuifdhiudsuihgfsudgfiuhfdhfdjdgfnjfguihdfgoufdgrrew''gfdlgr[pgbfophjdgheruighfuidhfiudhfgurietyriuyeuwihw4iusghwriughusirghuishfuirsfghuiwrgfurwghuhugfhdughudrhfudfighuifdhguidfhguierhgue8rhge7t38y47tu83ryt784y78y23846578367826572384673246723642386373637426347362478623746238764278346782364287367237842373673426743764372686782346732764328645652348563882375457245803248389247329723490324703489743083427843298472809740823749273492347823084fd sorry. ");
		}

	}

	static void speak(String words) {
		if (System.getProperty("os.name").contains("Windows")) {
			String cmd = "PowerShell -Command \"Add-Type -AssemblyName System.Speech; (New-Object System.Speech.Synthesis.SpeechSynthesizer).Speak('"
					+ words + "');\"";
			try {
				Runtime.getRuntime().exec(cmd).waitFor();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			try {
				Runtime.getRuntime().exec("say " + words).waitFor();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	private void endGame(Date timeAtStart, int molesWhacked) {
		Date timeAtEnd = new Date();
		JOptionPane.showMessageDialog(null, "Your whack rate is "
				+ ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked) + " moles per second.");
	}
}
