abstract class NeuralNet{

//Actives--------------------------------------

	/*Indicates, whether the net should be drawn or not, 
	depending on its display step.  
	True, if the net should be drawn. False otherwise.*/ 
	boolean displayNow (){ }  

	//Indicates that the net has finished learning. True, if the learning process is finished. False otherwise.
	boolean finishedLearning (){ }

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
