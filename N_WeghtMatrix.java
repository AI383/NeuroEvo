public class WeightMatrix
extends 	

java.lang.Object

instantiated by 	BackpropagationNet
KohonenFeatureMap
constructors 	public WeightMatrix ( int xSize, int ySize, boolean withBias )
Creates a weight matrix with xSize*ySize weights. The withBias flag indicates, whether Bias values shall be used or not.
methods 	void changeWeights ( float[] precLayer, float[] succLayer, double learningRate )
Changes all weights using the Backpropagation learning algorithm.
Only used by BackpropagationNet.

void changeWeightsKFM ( float[] precLayer, float[] succLayer, double learningRate )
Changes all weights using the Selforganization learning algorithm.
Only used by KohonenFeatureMap.

float[] getBiases ()
Returns the values of all biases in a weight matrix.

float[] getInputWeights ( int targetNeuron )
Returns the values of all incoming weights that lead to the neuron with number targetNeuron.

float[] getOutputWeights ( int sourceNeuron )
Returns the values of all outgoing weights that lead away from the neuron with number sourceNeuron.

float[][] getWeights ()
Returns the values of all weights in a weight matrix.

void init ()
Initializes all weights with values ranging from -1.0 to 1.0.

void init ( float[][] iweight )
Initializes all weights with specified values stored in iweight.

void init ( InputValue[] iv, int dimension )
Initializes all weights with InputValues stored in iv that have the dimension dimension.
Only used by KohonenFeatureMap.

int size ()
Returns the number of weights in a weight matrix. 
