import java.util.Random;

public class Neuron{

	double[] weightMatrix;
	private double output;
	
//Construct----------------------------------------------
	
	//initializing the neuron with a random weight in every input vector
	public Neuron(int numInputs){
		Random r = new Random();
		weightMatrix = new double[numInputs];
		for (int i=0; i<numInputs; i++){
			weightMatrix[i] = r.nextDouble();
		}
	}	

//Actives----------------------------------------------

	//logit, log(p/(1-p)) for sigmoid normalization
	double activateSigmoid (double p){
		return Math.log(p/(1-p));
	}

	//putting a new input into the matrix
	void setInput(int index, double input){
		weightMatrix[index] = input;
	}
	
	//getting the size of the matrix
	int getSize(){
		return weightMatrix.length;
	}
	
	double[] getWeightMatrix(){
		return weightMatrix;
	}

	//getting the output of the neuron
	double getOutput(){
		for (int i=0; i<getSize(); i++){
			output += weightMatrix[i];
		} 
		output = output / getSize();
		return output;
	}
}
