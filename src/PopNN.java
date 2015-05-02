public class PopNN {
//
//	NeuralNet[] pop; 
//	NeuralNet[] fitPop; 
//
//	private static final double crossRate = 0.5;
//    private static final double mutationRate = 0.02;
//    private static final int selectRate = 5;
//    private static final int mutationFactor = 10;
//
//    public PopNN() {
//    	pop = new NeuralNet[40];
//    	fitPop = new NeuralNet[20];
//    }
//
//    public NeuralNet getNum(int num) { return pop[num]; }
//    public void setNum(NeuralNet n, int num) { pop[num] = n; }
//    public int getSize() { return pop.length; }
//
//    public void initialize() { 
//    	for (int i =0; i < pop.length; i++) {
//    		NeuralNet n = new NeuralNet( 1, 5, 5); 
//    		setNum(n, i); 
//    	}
//    }
//
//    /**
//	 * This function will select the top 20 fittest members.  
//	 */ 
//    public void selection() {
//        getFittest();
//        for (int i = 0; i < 20; i++) { 
//            fitPop[i] = pop[i]; 
//        }
//    }
//
//    /**
//     * This function will mutate a weight in Neural Network Neuron weight matrix. 
//     */
//    public void mutation() {
//
//    }
//
//    /** 
//     * This function will crossover neural networks to produce offspring
//     */ 
//    public void crossover() {
//        for(int n = 0; n < 20; n++) {
//            for (int i = 0; i < fitPop[i].getNumLayers(); i++) { 
//                for (int j = 0; j < fitPop[i].layers[j].numNeurons(); j++) {
//                    int[] mask = getMask(fitPop[i].layers[j].neurons[0].); 
//                    Neuron tmp = fitPop[i].layers[j].neurons[0]; 
//                    for (int k = 0; k < fitPop[0].layers[0].neurons[0].weightMatrix.length; k++) {
//
//                    }   
//                }
//            }
//        }
//    }
//
//    public void crossover() {
//            for (int i = 0; i < fitPop.length; i++) { 
//                for (int j = 0; j < fitPop[0].layers.length; j++) {
//                    for (int k = 0; k < fitPop[0].layers[j].neurons.length; k++) {
//                        int[] mask = getMask(fitPop[i].layers[j].neurons[k].weightMatrix.length); 
//                        Neuron tmp = fitPop[i].layers[j].neurons[k]; 
//                        for (int w = 0; w < fitPop[i].layers[j].neurons[k].weightMatrix.length; w++) {
//                            if (mask[w] == 1) {
//                                tmp.weightMatrix[w] = fitPop[0].layers[j].neurons[k].weightMatrix[w]; 
//                            } else {
//                                tmp.weightMatrix[w] = fitPop[i].layers[j].neurons[k].weightMatrix[w]; 
//                            }
//                        }
//                        pop[i+20].layers[j].neurons[k] = tmp; 
//                    }
//                }
//            }
//    }
//
//    /**
//     * This function will sort the population to determine the fittest.
//     */
//    public void getFittest() {
//        int n = pop.length; 
//        while (n != 0) 
//        {
//            int newn = 0; 
//            for(int i = 1; i <= n-1; i++) {
//                if(pop[i-1].getFitness() < pop[i].getFitness()) {
//                    swap(i-1,i);
//                    newn=i;
//                }
//            }
//            n = newn;   
//        }
//    }
//
//    public int[] getMask(int n) {
//        int[] mask = new int[n]; 
//        for(int i=0; i<n; i++) {
//            if(Math.random() > .5) mask[i] = 1; 
//            else mask[i] = 0; 
//        }
//    }
}