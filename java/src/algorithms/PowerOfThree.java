/**
 * 
 */
package algorithms;

/**
 * Given an integer, write a function to determine if it is a power of three.
 * 
 * Follow up:
 * Could you do it without using any loop / recursion?
 * 
 * @author YunKai
 *
 */
public class PowerOfThree {

	/**
	 * main function for testing purpose
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Expected value: true Actual value: " + isPowerOfThree(27));
		System.out.println("Expected value: false Actual value: " + isPowerOfThree(15));

	}
	
	/**
	 * isPowerOfThree solution
	 * If one number is power of three, then log3(n) should be an integer
	 * 
	 * @param num
	 * @return
	 */
	
	public static boolean isPowerOfThree(int num) {
		double n = Math.log10(num)/Math.log10(3);
		return (n - (int)n == 0) ? true:false;
	}

}
