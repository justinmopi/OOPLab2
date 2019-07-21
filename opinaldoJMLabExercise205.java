/*Exercise 5 --- Reverse Order

Examine the following program: 

class Exercise5 
{  
 public static void main ( String[] args )  
 {
  int[] val = {0, 1, 2, 3};
  int temp;

  System.out.println( "Original Array: "
    + val[0] + " " + val[1] + " " + val[2] + " " + val[3] );
 
  // reverse the order of the numbers in the array
 
  System.out.println( "Reversed Array: " 
    + val[0] + " " + val[1] + " " + val[2] + " " + val[3] );
 }
}

Complete the program so that the numbers in the array appear in reversed order. 
You will need to use the variable temp to do this.*/

package opinaldoJMLabExercise2;

/**
 *
 * @author Justin Martin Opinaldo
 */
public class opinaldoJMLabExercise205 {

public static void main(String[] args) {
    int[] val = {1,2,3,4};     
    int reverse;
   
    System.out.println("Original Array: "+val[0]+" "+val[1]+" "+val[2]+" "+val[3]);
    for(int i = 0; i < 2; i++){
        reverse = val[i];
        val[i] = val[3 - i];
        val[3 - i] = reverse;}
    System.out.println("Reversed Array: "+val[0]+" "+val[1]+" "+val[2]+" "+val[3]);
    }
}