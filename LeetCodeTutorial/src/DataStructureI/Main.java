package DataStructureI;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random random  = new Random();
		int[] nums = new int[4];
		for (int i = 0; i < 4; i++) {
			nums[i] = random.nextInt(20)-10;
		}
		
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] +" ");
		}
		ContainsDuplicate containsDuplicate = new ContainsDuplicate();
		
		System.out.println("Check ContainsDuplicate:"+containsDuplicate.containsDuplicate(nums));
		System.out.println("Check ContainsDuplicate:"+containsDuplicate.containsDuplicate1(nums));
//		
//		System.out.println("Max :" + maxSubArray(nums) );
//		
		
	}	

}
