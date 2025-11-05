// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int num = Integer.parseInt(args[0]);
		double piAprox = 1;
		double divideBy = 3;
		double pi = Math.PI;

		for (int i = 1 ; i < num; i++){

			if (i % 2 == 0) {
				piAprox += 1/divideBy;
			} else {
				piAprox -= 1/divideBy;
			}

			divideBy += 2; 
		}
		System.out.println("pi according to Java: " + pi);
		System.out.println("pi, approximated:     " + piAprox*4);

	}
}