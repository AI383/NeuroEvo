public class NeuronLayer{

	int numNeurons;
	int numInputsPerNeuron;
	double output;
	Neuron[] neurons;

//Construct--------------------------------------------

	public NeuronLayer(int n, int m){
		numNeurons = n;
		numInputsPerNeuron = m;
		
		//populating the layer
		neurons = new Neuron[numNeurons];
		for(int i=0; i<numNeurons; i++){
			neurons[i] = new Neuron(numInputsPerNeuron);
		}
	}

//Actives----------------------------------------------

	double computeOutput (){
		for (int i=0; i<numNeurons(); i++){
			output += neurons[i].getOutput();
		} 
		output = output / numNeurons();
		return output;
	}
	
//Getters and Setters----------------------------------
	
	int numNeurons(){return numNeurons;}
	int getNumInputsPerNeuron(){return numInputsPerNeuron;}
	Neuron[] getNeurons(){return neurons;}
} 	
