class NeuralNet{

//Actives--------------------------------------

	/*Indicates, whether the net should be drawn or not, 
	depending on its display step.  
	True, if the net should be drawn. False otherwise.*/ 
	boolean displayNow (){ }  

	//Indicates that the net has finished learning. True, if the learning process is finished. False otherwise.
	boolean finishedLearning (){ }

private int numInputs;
private int numOutputs;
private int numHiddenLayers;
private int neuronsPerHiddenLayer;
private NeuronLayer[] layers;

public CNeuralNet();

void CreateNet();
vector<double> GetWeights()const;
int GetNumberOfWeights()const;
void PutWeights(vector<double> &weights);
double[] Update(double[] inputs)

  	double[] outputs;
  	int cWeight = 0;

  	if (inputs.size() != m_NumInputs)
  		return outputs;

  	for (int i=0; i<m_NumHiddenLayers + 1; ++i){
		if ( i > 0 ){
			inputs = outputs;
		}
	    	outputs.clear();
	   	cWeight = 0;
	    	for (int j=0; j<m_vecLayers[i].m_NumNeurons; ++j){
			double netinput = 0;
			int NumInputs = m_vecLayers[i].m_vecNeurons[j].m_NumInputs;
			for (int k=0; k<NumInputs - 1; ++k){
				netinput += m_vecLayers[i].m_vecNeurons[j].m_vecWeight[k] * inputs[cWeight++];
			}
	
			netinput += m_vecLayers[i].m_vecNeurons[j].m_vecWeight[NumInputs-1] * CParams::dBias;
	
			outputs.push_back(Sigmoid(netinput, CParams::dActivationResponse));
			cWeight = 0;
		}
	}

	return outputs;
	inline double Sigmoid(double activation, double response);
}

//Getters and Setters--------------------------

	String getElapsedTime (){ } 
	int getLearningCycle (){ } 
	double getLearningRate (){ } 
	int getMaxLearningCycles (){ } 
	void resetTime (){ } 
	void setDisplayStep ( int displayStep ){ } 

	//Sets the learning rate of a neural net. 
	void setLearningRate ( double learningRate ){ } 
	void setMaxLearningCycles ( int maxLearningCycles ){ }

}  
