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
		
		// i�������飬jָ��������Ƿ���i��ͬ����һ����  
		int i = 0, j = 1;
		while(i<len && j<len) {
			if(nums[i] == nums[j]) {        // ���������ͬ
				j++;                        // ��j������ǰ�ң�ֱ���ҵ���ͬ��nums[i]�� 
			}
			else {
				i++;                        // i������Ҫ�����ǵ��ظ��Ǹ��� 
				nums[i] = nums[j];          // �÷��ظ���j�����ظ���i 
				j++;                        // ���´������j  
			}
		}
		return i+1;
	}

}
