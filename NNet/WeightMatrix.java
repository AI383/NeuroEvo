public class WeightMatrix{

	private float[] biases;
	private float[] inputWeights;
	private float[] outputWeights;
	private float[][] weights;
	private int size;

	/*Creates a weight matrix with xSize*ySize weights. 
	The withBias flag indicates, whether Bias values shall be used or not.*/
	public WeightMatrix ( int xSize, int ySize, boolean withBias ){
	}
	
//Actives----------------------------------------

	/*Changes all weights using the Backpropagation learning algorithm.
	Only used by BackpropagationNet.*/
	void changeWeights ( float[] precLayer, float[] succLayer, double learningRate ){
	}

	/*Changes all weights using the Selforganization learning algorithm.
	Only used by KohonenFeatureMap.*/
	void changeWeightsKFM ( float[] precLayer, float[] succLayer, double learningRate ){
	}
	//Initializes all weights with values ranging from -1.0 to 1.0.
	void init (){
	}

	//Initializes all weights with specified values stored in iweight.
	void init ( float[][] iweight ){
	}
	/*Initializes all weights with InputValues 
	stored in iv that have the dimension dimension.
	Only used by KohonenFeatureMap.*/
	void init ( InputValue[] iv, int dimension ){
	}

//Getters and Setters---------------------------

	float[] getBiases (){}
	float[] getInputWeights ( int targetNeuron ){}
	float[] getOutputWeights ( int sourceNeuron ){}
	float[][] getWeights (){}
	int size (){}
}

