package studio7;

public class die {
	private static int n;

	public die(int sides) {
		this.n = sides;
	}
	
	public int roll() {
		int roll = (int) (Math.random()*n + 1);
		return roll;
	}
	
	public static void main(String[] args) {
		die superman = new die(6);
		System.out.println(superman.roll());
	}

}
