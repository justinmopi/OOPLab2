/*Exercise 6 --- Sum of Even, Odd, and All Elements 

Complete the following program so that it computes the sum of all the elements of 
the array, the sum of the even elements, and the sum of the odd elements. Assume 
that all the numbers are zero or positive. Even integers are those for which N%2 
is zero.

import java.io.* ;

class ThreeSums
{
 
 public static void main ( String[] args ) throws IOException
 {
  int[] data = {3, 2, 5, 7, 9, 12, 97, 24, 54};

  // declare and initialize three sums

  // compute the sums
  for ( int index=0; index < data.length; index++)
  {
  }

  // write out the three sums
  System.out.println(  );

 }
}*/

package opinaldoJMLabExercise2;

/**
 *
 * @author Justin Martin Opinaldo
 */
public class opinaldoJMLabExercise206 {

public static void main(String[] args) {
    int[] data = {3, 2, 5, 7, 9, 12, 97, 24, 54};
    int total = 0;
    int evenSum = 0;
    int oddSum = 0;
      
    for(int index=0; index < data.length; index++){
        if(data[index]%2 == 1){
            oddSum += data[index];}
        else{
            evenSum += data[index];}}
    total = evenSum + oddSum;
    System.out.println("Sum of Even: " + evenSum);
    System.out.println("Sum of Odd: " + oddSum);
    System.out.println("Total Sum: " + total);
    }
}