public class BackpropagationNet extends NeuralNet{

public BackpropagationNet ()


//Actives----------------------------------------------

	/*Adds a neuron layer with size neurons.
	Note that neuron layers are sequentially added to the net.*/
	void addNeuronLayer ( int size )

	/*Connects all neuron layers with weight matrices.
	Must be called after all neuron layers have been added.*/
	void connectLayers ()

	//Performs one learning step.
	void learn ()

	//Reads a conversion table for ASCII-binary values from file conversionFileName.
	synchronized void readConversionFile ( String conversionFileName )

	//Reads input and target patterns from file patternFileName.
	synchronized void readPatternFile ( String patternFileName )

	//Tries to recall the correct output for a learned input pattern recallInput.
	String recall ( String recallInput )

//Getters and Setters----------------------------------

	double getAccuracy ()			{ return accuracy; }
	double getError ()			{ return error; }
	String getInputPattern ( int patternNr ){ return; }
	double getMinimumError ()		{ return minError; }
	float[] getNeuronOutputs ( int layerNr ){ return accuracy; }
	int getNumberOfLayers ()		{ return layers; }
	int getNumberOfNeurons ( int layerNr )	{ return accuracy; }
	int getNumberOfPatterns ()		{ return patterns; }
	int getNumberOfWeights ()		{ return weights; }
	int getNumberOfWeights ( int matrixNr )	{ return accuracy; }
	String getOutputPattern ( int patternNr ){ return accuracy; }
	float getPatternError ( int patternNr ){ return accuracy; }
	String getTargetPattern ( int patternNr ){ return accuracy; }

	/*Returns the weight values of weight matrix matrixNr.
	The values for matrixNr start with zero!*/
	float[][] getWeightValues ( int matrixNr )

	//Sets an accuracy value for the net, which is something like a "fuzzy border" 
	//for output/recall purposes (default is 0.2).
	void setAccuracy ( double accuracy )

	void setMinimumError ( float minimumError )







