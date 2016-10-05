package helpClasses;

public class Point20_04 implements Comparable<Point20_04> {
	double x;
	double y;

	public Point20_04() {
		
	}

	/** Constructor */
	public Point20_04(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	/** Override method for comparing points */
	@Override 
	public int compareTo(Point20_04 point) {
		
		//If x-coordinates are same, compare y-coordinates
		if (x == point.getX()) {
			if (y > point.getY()) {
				return 1;
			} else if (y < point.getY()) {
				return -1;
			} else {
				return 0;
			}
		}
		else if (x > point.getX())
			return 1;
		else
			return -1;
	}

	/** Override toString method */
	@Override
	public String toString() {
		return "(" + String.format("%.2f", x) + ", " 
			+ String.format("%.2f", y) + ")";
	}
}
