import java.util.Random;

public class Neuron{

	private float error;
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
	//Performs a sigmoid activation on a neuron's input and computes its output.

	void computeError (float val){}
	//Computes the output error of a neuron in an output neuron layer
	//by comparing the neuron's current output with the targetValue.

//Getters---------------------------------------

	float getNumInputs(){return numInputs}
	float getOutput(){return output}
	float getError(){return error}
}
