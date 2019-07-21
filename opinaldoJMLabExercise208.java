/*Exercise 8 --- Reversal of Elements

Complete the following program so that it reverses the order of the values in data, 
then prints it out.

In the first version of the program there is only one array and its values are 
reversed with some fairly tricky programming. 

import java.io.* ;

class ReverserVersion1 
{

 public static void main ( String[] args ) throws IOException
 {
  int[] data = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};

  // reverse the data
  for ( int j=0; j < be careful here; j++)
  {

  }

  // write out the new data
  for ( int j=0; j < data.length; j++)
  {

  }

 }
}*/

package opinaldoJMLabExercise2;

/**
 *
 * @author Justin Martin Opinaldo
 */
public class opinaldoJMLabExercise208 {

public static void main(String[] args) {
    int[] data = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
    int reverse;
    
    for(int j = 0; j < data.length/2; j++){
            reverse = data[j];
            data[j] = data[data.length-1-j];
            data[data.length-1-j] = reverse;}
    
    System.out.print("Reversed Data: ");
        for(int j = 0; j < data.length; j++){
            System.out.print(data[j] + " ");}
    }
}