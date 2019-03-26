package pkgShape;

public class Cuboid extends Rectangle {
	private int Depth;
	
	public Cuboid(int length,int width,int depth) {
		super(length,width);
		this.Depth=depth;
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
	public Exception perimeter() {
		throw(Exception UnsupportedOperationException);
	
	}
	
}
