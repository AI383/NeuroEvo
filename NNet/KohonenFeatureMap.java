
public class KohonenFeatureMap extends NeuralNet{

	private double activationArea;
    	private double initActivationArea;
    	private double initLearningRate;
    	private int mapSizeX;
    	private int mapSizeY;
    	private int numberOfWeights;
    	private double stopArea;
    	private float[][] weightValues;

    	public KohonenFeatureMap (){
	}
    
//Actives------------------------------------------------

    	/*Connects the feature map and the input layer (which is 
	generated depending on the size 
	of the inputMatrix) with a  weight matrix.*/
	void connectLayers ( InputMatrix inputMatrix ){
	}

	//Creates a two-dimensional feature map with xSize*ySize map neurons.
    	void createMapLayer ( int xSize, int ySize ){
	}

	//Performs a learning step.
    	void learn (){
	}

//Getters and Setters-------------------------------------

    	double getActivationArea (){}
    	double getInitActivationArea (){}
    	double getInitLearningRate (){}
    	int getMapSizeX (){}
    	int getMapSizeY (){}
    	int getNumberOfWeights (){}
    	double getStopArea (){}
    	float[][] getWeightValues (){}
    	void setInitActivationArea ( double initActivationArea ){}
    	void setStopArea ( double stopArea ){}
    	void setInitLearningRate ( double initLearningRate ){}


