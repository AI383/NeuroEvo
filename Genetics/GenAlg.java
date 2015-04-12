public class GenAlg {

	// Holds the entire population of chromosomes
	private ArrayList<Genome> gePopulation; 
	private int popSize; 
	//amount of weights per chromosome
	private int numWeights; 
	//total fitness of population
	private double fitnessTotal;
	private double topFitness; 
	private double avgFitness;
	private double worstFitness;
	private int fittestGenome;
	private double mutationRate; 
	private double crossoverRate;
	private int generation; 
	
	private void crossover(ArrayList<double> mum, ArrayList<double> dad, ArrayList<double> childOne, ArrayList<double> childTwo) {}

	private void mutate(ArrayList<double> child) {}

	private void grabNBest(int nbest, ArrayList<Genome> pop) {}

/*----------------------------------------------------------Constructor-----------------------------------------------------------*/ 	
	public GenAlg(int pSize, double mutRate, double croRate, int numWei) {
		popSize = pSize; 
		mutationRate = mutRate;
		crossoverRate = croRate; 
		numWeights = numWei; 
	}

} 
