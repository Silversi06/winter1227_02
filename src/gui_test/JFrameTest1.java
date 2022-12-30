package gui_test;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class JFrameTest1 {
	public static void main(String args[]) {
		JFrame frame = new JFrame();
		JLabel lbl = new JLabel();
		ImageIcon icon = new ImageIcon("Saved Pictures/KakaoTalk_20220320_040311101.jpg");
		lbl.setIcon(icon);
		frame.add(lbl);
		frame.setTitle("JFrame ¿¬½À");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(200,200);
		frame.setSize(500,300);
		frame.setVisible(true);
	}

}
