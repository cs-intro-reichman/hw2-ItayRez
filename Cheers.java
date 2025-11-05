public class Cheers {
        public static void main(String[] args) {

          String wordUpper = args[0].toUpperCase();
          int amount = Integer.parseInt(args[1]);
          int length = wordUpper.length();
          String anLetters = "AEFHILMNORSX";



          for (int i = 0; i < length ; i++){

                 if (anLetters.indexOf(wordUpper.charAt(i)) != -1){
                     System.out.println("Give me an " + wordUpper.charAt(i) + ": " + wordUpper.charAt(i) + "!");
                } else {
                     System.out.println("Give me a  " + wordUpper.charAt(i) + ": " + wordUpper.charAt(i) + "!");
                }

        }
        
          System.out.println("What does that spell?");

          for (int j = 0; j < amount ; j++){

                System.out.println(wordUpper + "!!!");

          }

        }
}
