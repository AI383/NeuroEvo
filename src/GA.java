

public class GA {
	
    public static void main(String[] args) {

    	PopNN pop = new Population(40);
    	int gen = 0;
    	int fit = 0;
    	pop.initialize();
    	int cntGen = 0; 
        while (cntGen < 10000000) {
        	gen++;
            pop.selection(pop);
            pop.crossover();
            pop.mutation();
            pop.populate();
            fit = pop.evaluation();
            
            System.out.println("Gen: " + gen + " Fittest: " + fit);
        }
        
    }
}
