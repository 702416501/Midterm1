package pkgShape;

public class Rectangle extends Shape {
	private int Length, Width; 
	
	
	public int getLength() {
		return Length;
	}

	public void setLength(int length) {
		Length = length;
	}

	public int getWidth() {
		return Width;
	}

	public void setWidth(int width) {
		Width = width;
	}
	public Rectangle(int length, int width) {
		this.Length=length;
		this.Width=width;
		if (Length<=0||Width<=0) {
			throw new IllegalArgumentException();
		}
	}
	
	@Override
	public double area() {
		return getLength()*getWidth();
		
		}

	@Override
	public double perimeter() {
		return 2*getLength()+2*getWidth();

	}


	public int compareTo() {
		//TODO complete this method
		return 0; 
		
	}
	
	
}
