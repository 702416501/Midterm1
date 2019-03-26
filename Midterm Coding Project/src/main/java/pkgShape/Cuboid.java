package pkgShape;

import java.util.Comparator;

public class Cuboid extends Rectangle {
	private int Depth;
	
	public Cuboid(int length,int width,int depth) {
		super(length,width);
		this.Depth=depth;
		if (Depth<=0) {
			throw new IllegalArgumentException();
		}
	}
	
	public int getDepth() {
		return Depth;
	}

	public void setDepth(int depth) {
		Depth = depth;
	}
	
	@Override
	public double area() {
		return 2*super.getLength()*super.getWidth() + 2*super.getLength()*getDepth() + 2*super.getWidth()*getDepth();
		
		}
	public double volume() {
		return getDepth()*super.getWidth()*super.getLength();
	}
	

	@Override
	public double perimeter() {
		throw new UnsupportedOperationException();
	
	}
	
	class SortByArea implements Comparator<Cuboid>{
		public int compare(Cuboid A,Cuboid B) {
			return (int)(A.area()-B.area());
		}
	}
	class SortByVolume implements Comparator<Cuboid>{
		public int compare(Cuboid A,Cuboid B) {
			return (int)(A.volume()-B.volume());
		}
		
	}
	
}
