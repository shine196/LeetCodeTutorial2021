package ProgrammingSkills;

public class CountOddNumber {
	public static int countOdds(int low, int high) { // ko tối ưu, với 2 số cách nhau xa
		int count = 0;
		for (int i = low; i <= high; i++) {
			if (i % 2 != 0)
				count++;
		}
		return count;
	}

	public static int countOdds1(int low, int high) {
		int n = (high - low) / 2;
		if (low % 2 != 0 || high % 2 != 0)
			n++;
		return n;
	}
}
