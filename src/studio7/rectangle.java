package studio7;

import edu.princeton.cs.introcs.StdDraw;

public class rectangle {
	private static int length;
	private static int width;

	public rectangle(int L, int W) {
		this.length = L;
		this.width = W;

	}

	public int area() {
		int area = length * width;
		return area;
	}

	public int perimeter() {
		int perimeter = (2 * length) + (2 * width);
		return perimeter;
	}

	public boolean isSquare() {
		if (length == width) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		rectangle superman = new rectangle(5, 5);
		System.out.println(superman.isSquare());
	}

}