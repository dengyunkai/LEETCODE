/**
 * 
 */
package algorithms;

/**
 * You are climbing a stair case. It takes n steps to reach to the top. 
 * Each time you can either climb 1 or 2 steps. In how many distinct ways 
 * can you climb to the top?
 * 
 * @author YunKai
 *
 */
public class ClimbingStairs {

	/**
	 * main function for testing purpose
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Expected value:8 Actual value:"+climbStairs(5));
		System.out.println("Expected value:8 Actual value:"+fibonacci(5));

	}
	
	/**
	 * climbStairs solution
	 * it is a fibonacci sequence
	 * f1=1,f2=2,f3=3,f(n)=f(n-1)+f(n-2)
	 * 
	 * @param num
	 * @return 
	 */
	public static int climbStairs(int num) {
		if (num <=3)
		{
			return num;
		}
		else
		{
			return climbStairs(num-1)+climbStairs(num-2);
		}
	}
	
	/**
	 * 
	 * another solution without using loop
	 * 
	 * @param num
	 * @return
	 */
	
	public static int fibonacci(int num) {
		if (num <=3)
		{
			return num;
		}
		int f1=1, f2=2, f3=0;
		for (int i=3;i<=num;i++)
		{
			f3=f1+f2;
			f1=f2;
			f2=f3;
		}
		return f3;
	}
}
