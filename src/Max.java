public class Max {
	public static void main(String[] args) {
		int max = Integer.MIN_VALUE;
		for (int i=0; i<args.length; i++) {
			int num = Integer.valueOf(args[i]);
			max = num>max? num : max;
		}
		System.out.println(max);
	}
}