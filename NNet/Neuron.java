
public class Neuron{

	private float error, input, output;
	
	public Neuron(float input){
		this.input = input;
	}	

//Actives----------------------------------------------

	void activateSigmoid (){}
	//Performs a sigmoid activation on a neuron's input and computes its output.

	void computeError (float val){}
	//Computes the output error of a neuron in an output neuron layer
	//by comparing the neuron's current output with the targetValue.

//Getters---------------------------------------

	float getInput(){return input}
	float getOutput(){return output}
	float getError(){return error}
}
