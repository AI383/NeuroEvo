import java.util.Random;

public class Neuron{

	double[] weightMatrix;
	private double output;
	
//Construct----------------------------------------------
	
	//initializing the neuron with a random weight in every input vector
	public Neuron(int inputsPerNeuron){
		Random r = new Random();
		weightMatrix = new double[inputsPerNeuron];
		for (int i=0; i<inputsPerNeuron; i++){
			weightMatrix[i] = r.nextDouble();
		}
		DisplayPanel.str.add("      Neuron: "+weightMatrix.toString());
	}

//Actives----------------------------------------------

	void setInput(int index, double input){weightMatrix[index] = input;}
	int numInputs(){return weightMatrix.length;}
	double[] getInputs(){return weightMatrix;}

	//getting the output of the neuron
	double getOutput(){
		for (int i=0; i<numInputs(); i++){
			output += weightMatrix[i];
		}
		output = output / numInputs();
		return output;
	}
}
