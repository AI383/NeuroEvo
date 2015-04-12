import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;


public class DisplayPanel extends JPanel implements ActionListener{
				
	static String str = "";
	int iter = 0;
	
	DisplayPanel(){
		JButton StartButton = new JButton("Start");
		StartButton.addActionListener(this);
		add(StartButton,BorderLayout.WEST);
	}

	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.BLACK);
		g.drawString(str, 5, 20*iter);
		iter++;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		str = "Hello";
		NeuralNet n = new NeuralNet(1, 1, 3, 3);
		double[] a = {1};
		for(int i=0; i<100; i++){
			repaint();
			n.update(a);
		}
	}
}