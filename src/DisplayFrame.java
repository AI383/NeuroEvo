import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class DisplayFrame{
	public static void main(String[] args){
		
		JFrame j;
		Graphics dbGraphics;
		DisplayPanel d;
		
		j = new JFrame();
		d = new DisplayPanel();
		d.setPreferredSize(new Dimension(400, 300));
    j.add(d);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  j.setTitle("NeuroEvo");
		j.pack();
		j.setVisible(true);
	}
}
