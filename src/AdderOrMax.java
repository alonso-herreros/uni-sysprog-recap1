public class AdderOrMax {
	public static void main(String[] args) {
		if (args.length == 0) {
			System.err.println("You must provide an argument");
			return;
		}

		if (args[0].equals("max")) {
			int max = Integer.MIN_VALUE;
			for (int i=1; i<args.length; i++) {
				int num = Integer.valueOf(args[i]);
				max = num>max? num : max;
			}
			System.out.println(max);
		}
		else if (args[0].equals("add")) {
			int total = 0;
			for (int i=1; i<args.length; i++) {
				total += Integer.valueOf(args[i]);
			}
			System.out.println(total);
		}
		else {
			System.err.println(String.format("Invalid argument '%s'", args[0]));
		}
	}
}