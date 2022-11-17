package DataStructureI;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

	
	public static boolean containsDuplicate( int [] nums) {
		Set<Integer> uniques = new HashSet<Integer>();
		for (int i = 0; i < nums.length; i++) {
			if(uniques.contains(nums[i])) {
				return true;
			}
			uniques.add(nums[i]);
		}
		return false;
	}
	
	
	public static boolean containsDuplicate1( int [] nums) {
		
		Set<Integer> uniques = new HashSet<Integer>();
		int i=0;
		while(i < nums.length) {
			if(uniques.contains(nums[i])) {
				return true;
			}
			uniques.add(nums[i]);
			i++;
		}
		
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
