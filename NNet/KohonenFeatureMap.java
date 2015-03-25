
public class KohonenFeatureMap extends N_NeuralNet{

    	public KohonenFeatureMap (){
	}
    
    	/*Connects the feature map and the input layer (which is generated depending on the size 
	of the inputMatrix) with a  weight matrix.*/
	void connectLayers ( InputMatrix inputMatrix ){
	}

	//Creates a two-dimensional feature map with xSize*ySize map neurons.
    	void createMapLayer ( int xSize, int ySize ){
	}

	//Returns the current activation area.
    	double getActivationArea (){
	}

	//Returns the initial activation area.
    	double getInitActivationArea (){
	}

	//Returns the initial learning rate.
    	double getInitLearningRate (){
	}

	//Returns the number of neurons in the map layer's x-dimension.
    	int getMapSizeX (){
	}

	//Returns the number of neurons in the map layer's y-dimension.
    	int getMapSizeY (){
	}

	//Returns the number of weights in the weight matrix.
    	int getNumberOfWeights (){
	}

	//Returns the final activation area.
    	double getStopArea (){
	}

	//Returns the weight values of the net's weight matrix.
    	float[][] getWeightValues (){
	}

	//Performs a learning step.
    	void learn (){
	}

	//Sets the initial activation area.
    	void setInitActivationArea ( double initActivationArea ){
	}

	//Sets the final activation area at which the net stops learning.
    	void setStopArea ( double stopArea ){
	}

	//Sets the initial learning rate.
    	void setInitLearningRate ( double initLearningRate ){
	}


