/*Exercise 1 --- Array Sum 

Examine the following program:

class Exercise1 
{  
 public static void main ( String[] args )  
 {    
  int[] val = {0, 1, 2, 3};

  sum = 

  System.out.println( "Sum of all numbers = " + sum );

 } 
}

Complete the assignment statement so that it computes the sum of the numbers in the array.*/

package opinaldoJMLabExercise2;

/**
 *
 * @author Justin Martin Opinaldo
 */
public class opinaldoJMLabExercise201 {

public static void main(String[] args) {
    int[] val = {0, 1, 2, 3}; 
    int sum = 0;
    
    for(int i = 0; i < 4; i++){
        sum += val[i];}
    System.out.println("Sum of all numbers = " + sum);
    }
}