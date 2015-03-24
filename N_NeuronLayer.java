public class NeuronLayer{

	float[]
	public NeuronLayer(){}
	
	void computeLayerError ( Pattern pattern )
	Computes the output error values of all neurons in a layer by comparing the output with a target pattern.
	
	void computeOutput ()
	Computes the output values of all neurons in a layer.
	
	float[] getLayerError (){}
	Returns the output error values of all neurons in a layer.
		
	float[] getOutput (){}
	Returns the output values of all neurons in a layer.
	
	void setInput ( InputValue value ){}
	Sets a value as an input to a neuron layer.
	Only used by the input layer of a Kohonen Feature Map.
	
	void setInput ( Pattern pattern ){}
	Sets a pattern as an input to a neuron layer.
	Only used by the input layer of a Backpropagation Net.	

	int size (){}
	Returns the number of neurons in a layer.
} 	
