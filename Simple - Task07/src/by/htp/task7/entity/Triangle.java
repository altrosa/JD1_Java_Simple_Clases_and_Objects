package by.htp.task7.entity;

public class Triangle {

	/*
	 * 7. Описать класс, представляющий треугольник. Предусмотреть методы для
	 * создания объектов, вычисления площади, периметра и точки пересечения медиан.
	 */

	private double sideAB;

	private double sideBC;

	private double sideAC;

	public Triangle() {

	}

	public Triangle(double sideAB, double sideBC, double sideAC) {

		this.sideAB = sideAB;
		this.sideBC = sideBC;
		this.sideAC = sideAC;
	}

	public double getSideAB() {
		return sideAB;
	}

	public void setSideAB(double d) {
		this.sideAB = d;
	}

	public double getSideBC() {
		return sideBC;
	}

	public void setSideBC(double d) {
		this.sideBC = d;
	}

	public double getSideAC() {
		return sideAC;
	}

	public void setSideAC(double d) {
		this.sideAC = d;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(sideAB);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(sideAC);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(sideBC);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Triangle other = (Triangle) obj;
		if (Double.doubleToLongBits(sideAB) != Double.doubleToLongBits(other.sideAB))
			return false;
		if (Double.doubleToLongBits(sideAC) != Double.doubleToLongBits(other.sideAC))
			return false;
		if (Double.doubleToLongBits(sideBC) != Double.doubleToLongBits(other.sideBC))
			return false;
		return true;
	}

}
