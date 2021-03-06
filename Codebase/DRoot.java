/** 
 *This class returns the recursive sum of all the digits in a number
 */

public class DRoot {
	/**
	 *Algorithm for digital_root method
	 *1. while the input integer is less than 9,
	 *	 do:
	 *	 get the value of n by adding the 
	 *   dividend of n and 10 (n/10) and  
	 *   the remainder of n modulo 10 ( n/10 + n % 10)
	 *2. if N<9 , return the value of n
	 *@param n is the integer to be inputed
	 *@return n is the recursive sum of all digits
	 **/
   public static int digital_root(int n) {
      while(n > 9){
		n = n/10 + n % 10;
	  }
   	  return(n);
   }
}