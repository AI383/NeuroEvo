public class BackpropagationNet
extends 	

java.lang.Object
    NeuralNet

instantiated by 	application
constructors 	public BackpropagationNet ()
methods 	void addNeuronLayer ( int size )
Adds a neuron layer with size neurons.
Note that neuron layers are sequentially added to the net.

void connectLayers ()
Connects all neuron layers with weight matrices.
Must be called after all neuron layers have been added.

double getAccuracy ()
Returns the accuracy value.

double getError ()
Returns the current error of the net.

String getInputPattern ( int patternNr )
Returns the input pattern with number patternNr.

double getMinimumError ()
Returns the minimum error of a neural net.

float[] getNeuronOutputs ( int layerNr )
Returns the output values of all neurons in layer layerNr.

int getNumberOfLayers ()
Returns the number of neuron layers.

int getNumberOfNeurons ( int layerNr )
Returns the number of neurons in layer layerNr.

int getNumberOfPatterns ()
Returns the number of patterns.

int getNumberOfWeights ()
Returns the number of weights of all weight matrices.

int getNumberOfWeights ( int matrixNr )
Returns the number of weights in weight matrix matrixNr.

String getOutputPattern ( int patternNr )
Returns the output pattern with number patternNr.

float getPatternError ( int patternNr )
Returns the error of output pattern patternNr.

String getTargetPattern ( int patternNr )
Returns the target pattern with number patternNr.

float[][] getWeightValues ( int matrixNr )
Returns the weight values of weight matrix matrixNr.
The values for matrixNr start with zero!

void learn ()
Performs one learning step.

synchronized void readConversionFile ( String conversionFileName )
Reads a conversion table for ASCII-binary values from file conversionFileName.

synchronized void readPatternFile ( String patternFileName )
Reads input and target patterns from file patternFileName.

String recall ( String recallInput )
Tries to recall the correct output for a learned input pattern recallInput.

void setAccuracy ( double accuracy )
Sets an accuracy value for the net, which is something like a "fuzzy border" for output/recall purposes (default is 0.2).

void setMinimumError ( float minimumError )
Sets the minimum error of a neural net. 
