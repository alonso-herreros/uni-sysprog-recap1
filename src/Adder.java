public class Adder {
	public static void main(String[] args) {
		int total = 0;
		for (int i=0; i<args.length; i++) {
			total += Integer.valueOf(args[i]);
		}
		System.out.println(total);
	}
}