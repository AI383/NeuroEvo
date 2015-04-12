public class NeuronLayer{

	int numNeurons;
	int numInputsPerNeuron;
	double output;
	Neuron[] neurons;

//Construct--------------------------------------------

	public NeuronLayer(int n, int m){
		this.numNeurons = n;
		this.numInputsPerNeuron = m;
	}

//Actives----------------------------------------------

	double computeOutput (){
		for (int i=0; i<getSize(); i++){
			output += neurons[i].getOutput();
		} 
		output = output / getSize();
		return output;
	}
	
//Getters and Setters----------------------------------
	
	int getSize(){
		return numNeurons;
	}

	int getNumInputsPerNeuron(){
		return numInputsPerNeuron;
	}
	
	Neuron[] getNeurons(){
		return neurons;
	}
} 	
