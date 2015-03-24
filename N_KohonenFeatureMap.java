    public class KohonenFeatureMap
    extends 	

    java.lang.Object
        NeuralNet

    instantiated by 	application
    constructors 	public KohonenFeatureMap ()
    methods 	void connectLayers ( InputMatrix inputMatrix )
    Connects the feature map and the input layer (which is generated depending on the size of the inputMatrix) with a weight matrix.

    void createMapLayer ( int xSize, int ySize )
    Creates a two-dimensional feature map with xSize*ySize map neurons.

    double getActivationArea ()
    Returns the current activation area.

    double getInitActivationArea ()
    Returns the initial activation area.

    double getInitLearningRate ()
    Returns the initial learning rate.

    int getMapSizeX ()
    Returns the number of neurons in the map layer's x-dimension.

    int getMapSizeY ()
    Returns the number of neurons in the map layer's y-dimension.

    int getNumberOfWeights ()
    Returns the number of weights in the weight matrix.

    double getStopArea ()
    Returns the final activation area.

    float[][] getWeightValues ()
    Returns the weight values of the net's weight matrix.

    void learn ()
    Performs a learning step.

    void setInitActivationArea ( double initActivationArea )
    Sets the initial activation area.

    void setStopArea ( double stopArea )
    Sets the final activation area at which the net stops learning.

    void setInitLearningRate ( double initLearningRate )
    Sets the initial learning rate.



