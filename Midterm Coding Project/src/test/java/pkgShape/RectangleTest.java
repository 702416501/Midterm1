package pkgShape;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RectangleTest extends Rectangle {
	private int length,width;
	public RectangleTest() {
	}
	@Before
	public void test() {
		try {
			super(getLength(),getWidth())>0;
	
			
		}
		catch(Exception e) {
			fail("IllegalArgumentException");
		}
		
	}

}
