package helpClasses;

import java.util.Comparator;

public class CompareY20_04 implements Comparator<Point20_04> {
	double x1;
	double y1;
	double x2;
	double y2;

	/** Override method for comparing two points */
	@Override
	public int compare(Point20_04 p1, Point20_04 p2) {
		x1 = p1.getX();
		y1 = p1.getY();
		x2 = p2.getX();
		y2 = p2.getY();

		//If y-coordinates are same, compare x-coordinates
		if (y1 == y2) {
			if (x1 < x2) {
				return -1;
			} else if (x1 == x2) {
				return 0;
			} else {
				return 1;
			}
		}
		else if (y1 < y2)
			return -1;
		else 
			return 1;
	}
}
