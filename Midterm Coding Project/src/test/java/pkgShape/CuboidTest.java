package pkgShape;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CuboidTest {
	private int depth;
	public CuboidTest() {
	}
	@Before
	public void Constructiontest() {
		try {
			Cuboid cub1= new Cuboid(2,3,1);
		}
		catch(Exception e) {
			fail("failure to make Cuboid");
		}
		
	}
	@Before
	void gettertest() {
		try {
			Cuboid cub1= new Cuboid(2,3,1);
			int depthcub1= cub1.getDepth();
			
		}
		catch(Exception e) {
			fail("failure to get dimension");
		}
	}
	@Test 
	public void setterTest() {
		try {
			Cuboid cub1= new Cuboid(2,3,1);
			int lengthcub1= cub1.getLength();
			int widthcub1= cub1.getWidth();
			cub1.setLength(lengthcub1);
			cub1.setWidth(widthcub1);
		}
		catch(Exception e) {
			fail("failure to set dimension");
		}
	}
	@Test
	public void areatest() {
		try {
			Cuboid cub1= new Cuboid(2,3,1);
			double areacub1= cub1.area();
		
		}
		catch(Exception e) {
		fail("failure to find area");
		}
	}
	@Test
	public void perimetertest() {
		try {
			Cuboid cub1= new Cuboid(2,3,1);
			double perimetercub1= cub1.perimeter();
			
		}
		catch(Exception e) {
		fail("Failure to find perimeter");
		}

	}
	@Test
	public void comparetotest() {
		try {
			
		}
		catch(Exception e) {
			fail("Not yet implemented");
		}
	}
	@Test
	public void illegalargumenttest() {
		boolean thrown=false;
		try {
			try {
				Cuboid cub1= new Cuboid(-2,3,1);
				Cuboid cub2= new Cuboid(2,-3,1);
				Cuboid cub3= new Cuboid(2,3,-1);
			}
			catch(IllegalArgumentException e) {
				thrown=true;
				}
		assertTrue(thrown);
		}
		catch(Exception e) {
		fail("Failure to throw Illegal Argument Exception");
		}
	}
}