public class NumbersCruncher {
	public static void main(String[] args) {
		if (args.length < 1) {
			System.err.println("You must provide an argument");
			return;
		}

		String option = args[0];
		int[] nums = parseIntArray(args, 1);


		if (option.equals("max")) {
			System.out.println(max(nums));
		}
		else if (option.equals("sum")) {
			System.out.println(sum(nums));
		}
		else if (option.equals("sum-squared")) {
			System.out.println(sumSquared(nums));
		}
		else if (option.equals("is-neg")) {
			System.out.println(hasNegatives(nums)? "yes":"no");
		}
		else if (option.equals("neg")) {
			printArray(negate(nums));
		}
		else if (option.equals("diff")) {
			printArray(differences(nums));
		}
		else {
			System.err.println(String.format("Invalid option '%s'.", option));
		}
	}

	public static int[] parseIntArray(String[] strs, int start) {
		int[] nums = new int[strs.length-start];
		for (int i=start; i<strs.length; i++) {
			try {
				nums[i-1] = Integer.valueOf(strs[i]);
			}
			catch (NumberFormatException e) {
				System.err.println(String.format("Invalid number '%s' was discarded.", strs[i]));
			}
		}
		return nums;
	}

	public static void printArray(int[] ints) {
		for (int i=0; i<ints.length; i++) {
			System.out.printf("%d ", ints[i]);
		}
		System.out.println();
	}

	public static int max(int[] nums) {
		int max = Integer.MIN_VALUE;
		for (int i=0; i<nums.length; i++) {
			max = nums[i]>max? nums[i] : max;
		}
		return max;
	}

	public static int sum(int[] nums) {
		int total = 0;
		for (int i=0; i<nums.length; i++) {
			total += nums[i];
		}
		return total;
	}

	public static int sumSquared(int[] nums) {
		int total = 0;
		for (int i=0; i<nums.length; i++) {
			total += nums[i]*nums[i];
		}
		return total;
	}

	public static boolean hasNegatives(int[] nums) {
		for (int i=0; i<nums.length; i++) {
			if (nums[i] < 0) {
				return true;
			}
		}
		return false;
	}

	public static int[] negate(int[] nums) {
		for (int i=0; i<nums.length; i++) {
			nums[i] = -nums[i];
		}
		return nums;
	}

	public static int[] differences(int[] nums) {
		if (nums.length<2) {
			System.err.println("You must provide at least two numbers to use this option.");
			return new int[0];
		}
		int[] diffs = new int[nums.length - 1];
		for (int i=0; i<diffs.length; i++) {
			diffs[i] = nums[i+1] - nums[i];
		}
		return diffs;
	}
}