package pkgShape;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RectangleTest extends Rectangle {
	private int length,width;
	public RectangleTest() {
	}
	@Before
	public void Constructiontest() {
		try {
			super(getLength(),getWidth())>0;
			
		}
		catch(Exception e) {
			fail("IllegalArgumentException");
		}
		
	}
	@Test
	public void gettertest() {
		fail("Not yet implemented");
	}
	@Test
	public void settertest() {
		fail("Not yet implemented");
	}
	@Test
	public void areatest() {
		fail("Not yet implemented");
	}@Test
	public void perimetertest() {
		fail("Not yet implemented");
	}@Test
	public void comparetotest() {
		fail("Not yet implemented");
	}@Test
	public void illegalargumenttest() {
		fail("Not yet implemented");
	}

}
