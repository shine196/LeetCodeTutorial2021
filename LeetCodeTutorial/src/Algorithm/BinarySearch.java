package Algorithm;

import java.util.Random;

public class BinarySearch {
	// Cho một mảng các số nguyên numsđược sắp xếp theo thứ tự tăng dần và một số
	// nguyên target, hãy viết một hàm để tìm targetkiếm nums. Nếu targettồn tại,
	// sau đó trả về chỉ mục của nó. Nếu không, hãy quay trở lại -1.

	public static void main(String[] args) {
		Random random = new Random();
		int[] nums = new int[10];
		for (int i = 0; i < 10; i++) {
			nums[i] = random.nextInt(10);
		}

		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}

		System.out.println(search(nums, 5));
	}

	public static int search(int[] nums, int target) { // chưa tối ưu, vì mảng đã được sắp xếp

		for (int i = 0; i < nums.length; i++) {
			if (target == nums[i])
				return i;
		}
		return -1;
	}

	public static int search1(int[] nums, int target) {

		int low = 0, high = nums.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (nums[mid] == target) {
				return mid;
			} else if (nums[mid] < target) {
				low = mid + 1;
			} else {
				low = mid - 1;
			}
		}

		return -1;
	}

}
