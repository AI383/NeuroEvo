import java.util.ArrayList;

class NeuralNet{

	private int numInputs;
	private int numOutputs;
	private int numLayers;
	private int neuPerLayer;
	private ArrayList<NeuronLayer> layers;

//Construct------------------------------------

	public NeuralNet(int inputs, int outputs, int numLayers, int neuPerLayer){
		this.numInputs = inputs;
		this.numOutputs = outputs;
		this.numLayers = numLayers;
		this.neuPerLayer = neuPerLayer;
		ArrayList<NeuronLayer> layers = new ArrayList<NeuronLayer>();
	}

//Actives--------------------------------------
	
	//the main thinking process for the neural net, this updates the whole system.
	double[] update(double[] inputs){
	
		
		double[] outputs = {0};
		int weight = 0;
		double netinput;
		
		//if the length of the input array, reject.y is different from the preset number of input
	  	if (inputs.length != numInputs)
	  		return outputs;
	
	  	//for each layer in the neural net, 
	  	for (int i=0; i<numLayers; i++){
			
	  		//if the layer is not the first one, the input array is the output of the last layer.
			if ( i > 0 ){inputs = outputs;}
		   	weight = 0;

		   	//for each neuron in the layer at hand, 
		    for (int j=0; j<layers.get(i).getSize(); j++){

				netinput = 0;
				numInputs = layers.get(i).neurons[j].getSize();

				//for each weight in the weight matrix of the neuron at hand, add the inputs to the net input
				for (int k=0; k<numInputs - 2; k++){
					netinput += layers.get(i).neurons[j].weightMatrix[k] * inputs[weight++];	
				}

				//add the bias to the netinput.
				//netinput += layers.get(i).neurons[j].weightMatrix[numInputs-1] * CParams::dBias;
				
				//put the normalized version of the activation result into the output array
				//outputs.push_back(Sigmoid(netinput, CParams::dActivationResponse));
				weight = 0;
			}
		}

		return outputs;
		//inline double Sigmoid(double activation, double response);
	}

//----------------------------------------------------
	
	//boolean finishedLearning (){ }
	//void CreateNet(){}
	//ArrayList<double> getWeights(){}
	//int getNumberOfWeights(){}
	//void PutWeights(ArrayList<double> weights){}
	//String getElapsedTime (){ } 
	//int getLearningCycle (){ } 
	//double getLearningRate (){ } 
	//int getMaxLearningCycles (){ } 
	//void resetTime (){ } 
	//void setDisplayStep ( int displayStep ){ } 

	//Sets the learning rate of a neural net. 
	//void setLearningRate ( double learningRate ){ } 
	//void setMaxLearningCycles ( int maxLearningCycles ){ }

}  
