package ProgrammingSkills;

public class CaculationAverageSalary {
	public static double average(int[] salary) {

		double max = salary[0];
		double min = salary[0];
		double totalSalary = 0.0;
		for (int i = 0; i < salary.length; i++) {
			max = Math.max(max, salary[i]);
			min = Math.min(min, salary[i]);
			totalSalary += salary[i];

		}
		double average = (totalSalary - max - min) / (salary.length - 2);
		return average;
	}
}
