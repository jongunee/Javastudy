public class Variable1 {
	public static void main(String[] args) {
		double r = Math.random() * 6;	//	0.0~5.999999
		r = r + 1;
		int num = (int) r;
		System.out.println(num);
		
		int num2 = (int) (Math.random() * 6 + 1);
		long ut = System.currentTimeMillis();
		System.out.println(ut);
	}
}
