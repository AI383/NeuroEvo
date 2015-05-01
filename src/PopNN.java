public class PopNN {

	NeuralNet[] pop; 
	NeuralNet[] fitPop; 

	private static final double crossRate = 0.5;
    private static final double mutationRate = 0.02;
    private static final int selectRate = 5;
    private static final int mutationFactor = 10;

    public PopNN(int size) {
    	pop = new NeuralNet[size];
    	fitPop = new NeuralNet[selectRate];
    }

    public NeuralNet getNum(int num) { return pop[num]; }
    public void setNum(NeuralNet n, int num) { pop[num] = n; }
    public int getSize() { return pop.length; }

    public void initialize() { 
    	for (int i =0; i < pop.length; i++) {
    		NeuralNet n = new NeuralNet(7, 1, 5, 5); 
    		setNum(n, i); 
    	}
    }

    /**
	 * This function will select an arbitrary number of successful neural networks. 
	 */ 
    public void selection(NeuralNet n) {

    }

    /**
     * This function will mutate a weight in Neural Network Neuron weight matrix. 
     */
    public void mutation() {

    }

    /** 
     * This function will crossover neural networks to produce offspring
     */ 
    public void crossover() {

    }

    /**
     * This function will sort the population to determine the fittest.
     */
    public void getFittest() {

    }
}