import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;


public class DisplayPanel extends JPanel implements Runnable, ActionListener{
				
	static ArrayList<String> str;
	int iter = 0;
	int offset = 0;
	int graphOffset = 0;
	int index=0;
	
	ArrayList<Thread> threadArray;
	
	NeuralNet n;
	
	DisplayPanel(){
		JButton StartButton = new JButton("Start");
		StartButton.addActionListener(this);
		add(StartButton,FlowLayout.LEFT);
		str = new ArrayList<String>();
	}

	public synchronized void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.BLACK);
		
		offset=0;//for full screen refresh, else uncomment below for scroll
		
		//printing out the neurons
		for(int i=index; i<str.size(); i++){
//			if(14*(offset)+40 > this.getSize().height){
//				index++;
//				offset=0;
//			}
			index++;
			g.drawString(str.get(i), 5, 14*offset+40);
			offset++;
		}
		offset=0;
		
		//printing out the weights
		if(n!=null)
		for(int i=0; i<n.numLayers; i++){
			g.drawString("Layer"+(i+1), 300+(i*80), 14*graphOffset+40);
			graphOffset++;
			for(int j=0; j<n.layers[i].numNeurons; j++){
				
				g.setColor(Color.BLUE);
				g.drawString("   Neu"+(j+1), 300+(i*80), 14*graphOffset+40);
				graphOffset++;
				for(int k=0; k<n.layers[i].neurons[j].numInputs(); k++){
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
		Thread t = new Thread(this);
		t.start();
	}
    
	@Override
	public void run() {
	    iter++;
	    repaint();
		str.add(iter+": "+"Hello");
		//int in, int out, int layers, int neuronsPerLayer){
		n = new NeuralNet(1, 5, 5);
		
		double[] a = {1};
		for(int i=0; i<100; i++){
			//repaint();
			n.think(a);
		}
	}
}
