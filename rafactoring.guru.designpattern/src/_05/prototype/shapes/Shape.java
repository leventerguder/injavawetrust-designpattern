package _05.prototype.shapes;

public abstract class Shape {

	public int x;
	public int y;
	public String color;

	public Shape() {
	}

	public Shape(Shape target) {
		if (target != null) {
			this.x = target.x;
			this.y = target.y;
			this.color = target.color;
		}
	}

	public abstract Shape clone();

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object object2) {
		if (!(object2 instanceof Shape))
			return false;
		Shape shape2 = (Shape) object2;
		return shape2.x == x && shape2.y == y && shape2.color == color;
	}

}
