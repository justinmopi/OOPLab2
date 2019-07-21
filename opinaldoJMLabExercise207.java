/*Exercise 7 --- Two Largest Elements

Complete the following program so that it computes and writes out the two largest 
elements in the array.

import java.io.* ;

class TwoLargest
{

 public static void main ( String[] args ) throws IOException 
 {
  int[] data = {3, 1, 5, 7, 4, 12, -3, 8, -2};

  // declare and initialize variables for the two largest

  // compute the two largest
  for ( int index= ; index < data.length; index++)
  {
  }

  // write out the two largest
  System.out.println(  );

 }
}*/

package opinaldoJMLabExercise2;

/**
 *
 * @author Justin Martin Opinaldo
 */
public class opinaldoJMLabExercise207 {

public static void main ( String[] args ) {    
    int[] data = {10,8,39,9,5,7,2,4};
    int largest = 0;
    int secondlargest = 0;
    
    for(int index = 0; index < data.length; index++){
        if(data[index] > largest){
            secondlargest = largest;
            largest = data[index];}
        else if(data[index] > secondlargest){
            secondlargest = data[index];}}
    
    System.out.println("Largest number is "+largest);
    System.out.println("Second largest number is "+secondlargest);
    }
}