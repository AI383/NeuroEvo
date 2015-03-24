abstract class NeuralNet
extends 	

java.lang.Object

instantiated by 	can't be instantiated
constructors 	none
methods 	boolean displayNow ()
Indicates, whether the net should be drawn or not, depending on its display step. True, if the net should be drawn. False otherwise.

boolean finishedLearning ()
Indicates that the net has finished learning. True, if the learning process is finished. False otherwise.

String getElapsedTime ()
Returns the elapsed learning time of a neural net.

int getLearningCycle ()
Returns the current learning cycle of a neural net.

double getLearningRate ()
Returns the current learning rate of a neural net.

int getMaxLearningCycles ()
Returns the number of maximum learning cycles of a neural net.

void resetTime ()
Resets the net's learning time.

void setDisplayStep ( int displayStep )
Sets a value that indicates the interval to display the net.

void setLearningRate ( double learningRate )
Sets the learning rate of a neural net.

void setMaxLearningCycles ( int maxLearningCycles )
Sets the number of learning cycles, the net shall perform.
If -1, the net has no maximum cycle. 
