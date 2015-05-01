import java.util.ArrayList;

class NeuralNet{

	 int numInputs;
	 int numOutputs;
	 int numLayers;
	 int neuPerLayer;
	 NeuronLayer[] layers;

//Construct------------------------------------

	public NeuralNet(int out, int lay, int neu){
		numInputs = lay;
		numOutputs = out;
		
		//populating the NNet
		numLayers = lay;
		neuPerLayer = neu;
		layers = new NeuronLayer[numLayers];
		for(int i=0; i<numLayers; i++){
			layers[i] = new NeuronLayer(neuPerLayer, numInputs);
			neuPerLayer--;
			numInputs--;
		}
	}

//Actives--------------------------------------
	
	//the main thinking process for the neural net, this updates the whole system.
	double[] think(double[] inputs){
	
		
		double[] outputs = {0};
		int weight = 0;
		double netinput;
		
		//if the length of the input array is different from the preset number of input, reject
	  	if (inputs.length != numInputs)
	  		return outputs;
	
	  	//for each layer in the neural net,
	  	for (int i=0; i<numLayers; i++){
			
  	  	//if the layer is not the first one, the input array is the output of the last layer.
  			if ( i > 0 ){inputs = outputs;}
  		   	
  		  weight = 0;

  	   	//for each neuron in the layer at hand,
  	    for (int j=0; j<layers[i].numNeurons()-1; j++){
    				netinput = 0;
  		  		numInputs = layers[i].neurons[j].numInputs();
  
  			//for each weight in the weight matrix of the neuron at hand, add the inputs to the net input
  			for (int k=0; k<numInputs - 2; k++){
  				netinput += layers[i].neurons[j].weightMatrix[k] * inputs[weight++];
  			}
  
  			//add the bias to the netinput.
  			netinput += layers[i].neurons[j].weightMatrix[numInputs-1];
  			weight = 0;
			}
		}

		return outputs;
	}
}
