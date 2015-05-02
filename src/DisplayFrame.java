import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JScrollPane;

public class DisplayFrame{
	public static void main(String[] args){
		
		JFrame j;
		DisplayPanel d;
		JScrollPane scroll;
		Graphics dbGraphics;

		
		j = new JFrame();
		d = new DisplayPanel();
		d.setPreferredSize(new Dimension(400, 300));
		scroll = new JScrollPane(d);
		j.add(scroll);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.setTitle("NeuroEvo");
		j.pack();
		j.setVisible(true);
	}
}
