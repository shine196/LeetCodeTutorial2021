package Algorithm;

public class SearchInsertPosition {

	public int searchInsert(int[] nums, int target) {
		int result = -1;
		int start = 0;
		int end = nums.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (nums[mid] == target)
				return mid;

			else if (nums[mid] < target)
				start = mid + 1;

			else {
				end = mid - 1;
				result = mid;
			}
		}

		if (result == -1)
			return nums.length;

		else
			return result;
	}
}
