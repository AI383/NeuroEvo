
public class Controller {
	public static void main(String[] args){
		NeuralNet n = new NeuralNet(1, 1, 3, 3);
		double[] a = {1};
		for(int i=0; i<100; i++){
			n.update(a);
		}
	}
}
