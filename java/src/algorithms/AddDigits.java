/**
 * 
 */
package algorithms;

/**
 * Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
 * 
 * For example:
 * Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
 * 
 * Follow up:
 * Could you do it without any loop/recursion in O(1) runtime?
 * 
 * @author YunKai
 *
 */
public class AddDigits {

	/**
	 * main function for testing purpose
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("expected value: 9 actual value: " + addDigits(27));
		System.out.println("expected value: 8 actual value: " + addDigits(278));
		System.out.println("expected value: 7 actual value: " + addDigits(5677));
	}
	
	/**
	 * AddDigits Solution
	 * 
	 * @param num
	 * @return
	 */
	public static int addDigits(int num) {
		return (num-1)%9+1;
	}
	

}
