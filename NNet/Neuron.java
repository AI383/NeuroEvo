import java.util.Random;

public class Neuron{

	private int numInputs;
	private double[] weightMatrix = new double[];
	private double output;
	
	public Neuron(int numInputs){
		Random r = new Random();
		this.numInputs = numInputs;
		for (int i=0; i<numInputs; i++)
		  {
			weightMatrix[i] = r.nextDouble();
		  }
	}	

//Actives----------------------------------------------

	void activateSigmoid (){}
	void computeError (float val){}

//Getters---------------------------------------

	float getNumInputs(){return numInputs}
	float getOutput(){return output}

}
