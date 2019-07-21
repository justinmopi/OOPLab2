/*Exercise 3 --- Three Arrays

Examine the following program:

class Exercise3
{
 public static void main(String[] args)    
 {
  int[] valA   = { 13, -22,  82,  17};
  int[] valB   = {-12,  24, -79, -13};
  int[] sum    = {  0,   0,   0,   0}; 

  // Add values from corresponding slots of valA and valB
  // and put the result in the corresponding slot of sum.

  System.out.println( "sum: "
    + sum[0] + " " + sum[1] + " " + sum[2] + " " + sum[3] );
 } 
}

Complete the program with four assignment statements so that each slot of sum 
contains the sum of the corresponding slots in valA and valb. Ie., add slot zero 
of valA to slot zero of valB and put the result in slot zero of sum, and so on.*/ 

package opinaldoJMLabExercise2;

/**
 *
 * @author Justin Martin Opinaldo
 */
public class opinaldoJMLabExercise203 {

public static void main(String[] args) {
    int[] valA = {1,2,3,4};
    int[] valB = {2,4,6,8};
    int[] sum = {0,0,0,0};

    for(int i = 0; i < 4; i++){
        sum[i] = valA[i]+valB[i];} 
    System.out.println("Sum: "+ sum[0]+" "+sum[1]+" "+sum[2]+" "+sum[3]);
    }
}