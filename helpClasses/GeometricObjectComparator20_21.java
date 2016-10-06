package helpClasses;

import java.io.Serializable;
import java.util.Comparator;

public class GeometricObjectComparator20_21 implements Comparator<GeometricObject20_21>, Serializable {
	private static final long serialVersionUID = 1L;

	@Override
	public int compare(GeometricObject20_21 o1, GeometricObject20_21 o2) {
		double area1 = o1.getArea();
		double area2 = o2.getArea();
		if (area1 < area2)
			return -1;
			else if (area1 == area2)
				return 0;
			else
				return 1;
	}
}
