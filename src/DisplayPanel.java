import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;


public class DisplayPanel extends JPanel implements ActionListener{
				
	static ArrayList<String> str;
	int iter = 0;
	int offset = 0;
	int graphOffset = 0;
	int index=0;
	NeuralNet n;
	
	DisplayPanel(){
		JButton StartButton = new JButton("Start");
		StartButton.addActionListener(this);
		add(StartButton,BorderLayout.WEST);
		
		str = new ArrayList<String>();
	}

	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.BLACK);
		
		//printing out the neurons
		for(int i=index; i<str.size(); i++){
			if(14*(offset)+40 > this.getSize().height){
				index++;
			}
			g.drawString(str.get(i), 5, 14*offset+40);
			offset++;
		}
		offset=0;
		//printing out the weights
		if(n!=null)
		for(int i=0; i<n.numLayers; i++){
			g.drawString("Layer"+(i+1), 300+(i*80), 14*graphOffset+40);
			graphOffset++;
			for(int j=0; j<n.layers[0].numNeurons; j++){
				
				g.setColor(Color.BLUE);
				g.drawString("   Neu"+(j+1), 300+(i*80), 14*graphOffset+40);
				graphOffset++;
				for(int k=0; k<n.layers[0].neurons[0].numInputs(); k++){
					DecimalFormat df = new DecimalFormat("#.##");
					String printValue = df.format(n.layers[i].neurons[j].weightMatrix[k]);
					g.setColor(Color.BLACK);
					g.drawString("      Input"+(k+1), 300+(i*80), 14*graphOffset+40);
					graphOffset++;
					g.setColor(Color.RED);
					g.drawString("        "+printValue, 300+(i*80), 14*graphOffset+40);
					graphOffset++;
					g.setColor(Color.BLACK);
				}
			}
			graphOffset=0;
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		iter++;
		str.add(iter+": "+"Hello");
		
		n = new NeuralNet(2, 1, 5, 7);
		
		double[] a = {1};
		for(int i=0; i<100; i++){
			repaint();
			n.update(a);
		}
	}
}
