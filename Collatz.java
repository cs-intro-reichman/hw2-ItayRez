// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int n = Integer.parseInt(args[0]);
		String mode = args[1];
		int i = 1;
		
		for (int count = 1 ; count <= n ; count++ ){ 
			i = count;
			int stepCount = 1; 

			if (mode.equals("v")){ 
				System.out.print(i + " ");
			}
			while(true) { 
			    if (i%2 != 0){ 
				    i = i*3 + 1;
					if (mode.equals("v")){
				        System.out.print(i + " ");
				    }
			    } else { 
				    i /=2;
					if (mode.equals("v")){ 
				        System.out.print(i + " ");
					}
			    } 
				stepCount++;
				 if (i==1) { 
					break;
				}
		    } if(mode.equals("v")){
				System.out.println("(" + stepCount + ")"); 
			}
		} 
		System.out.println("Every one of the first " + n + " hailstone sequences reached " + i + ".");
	}
}
