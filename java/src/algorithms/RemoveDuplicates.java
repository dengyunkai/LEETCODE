/**
 * 
 */
package algorithms;

/**
 * Given a sorted array, remove the duplicates in place such that each element 
 * appear only once and return the new length.
 * 
 * Do not allocate extra space for another array, you must do this in place 
 * with constant memory.
 * 
 * For example,
 * 
 * Given input array nums = [1,1,2],Your function should return length = 2, 
 * with the first two elements of nums being 1 and 2 respectively. 
 * It doesn't matter what you leave beyond the new length.
 * 
 * @author YunKai
 *
 */
public class RemoveDuplicates {

	/**
	 * main function for testing purpose
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int[] ary = {1, 1, 2, 2, 3, 3, 3, 4};
		System.out.println(removeDuplicates(ary));

	}
	
	/**
	 * 
	 * to be done
	 * 
	 * @param nums
	 * @return
	 */
	
	public static int removeDuplicates(int[] nums) {
		int len = nums.length;
		if(len<2){
			return len;
		}
		
		// i遍历数组，j指向待检验是否与i相同的下一个数  
		int i = 0, j = 1;
		while(i<len && j<len) {
			if(nums[i] == nums[j]) {        // 如果出现相同
				j++;                        // 则j继续往前找，直到找到不同于nums[i]数 
			}
			else {
				i++;                        // i跳动到要被覆盖的重复那个数 
				nums[i] = nums[j];          // 用非重复的j覆盖重复的i 
				j++;                        // 更新待检验的j  
			}
		}
		return i+1;
	}

}
