public class NeuronLayer{

	float[]
	public NeuronLayer(){}


//Actives----------------------------------------------

	//Computes the output error values of all neurons in a layer by comparing the output with a target pattern.
	void computeLayerError ( Pattern pattern )

	//Computes the output values of all neurons in a layer.
	void computeOutput ()
	
	
//Getters and Setters----------------------------------
	
	float[] getLayerError (){}
	float[] getOutput (){}
	void setInput ( InputValue value ){}//kohonen
	void setInput ( Pattern pattern ){}//backprop
	int size (){}

} 	
