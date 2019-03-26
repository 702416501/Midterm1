package pkgShape;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RectangleTest {
	private int length,width;
	public RectangleTest() {
	}
	@Before
	public void Constructiontest() {
		try {
			Rectangle rec1= new Rectangle(2,3);
		}
		catch(Exception e) {
			fail("failure to make rectangle");
		}
		
	}
	@Before
	void gettertest() {
		try {
			Rectangle rec1= new Rectangle(2,3);
			int lengthRec1= rec1.getLength();
			int widthRec1= rec1.getWidth();
		}
		catch(Exception e) {
		fail("failure to get dimension");
	}
	@Test 
	public int setterTest() {
		try {
			Rectangle rec1= new Rectangle(2,3);
			int lengthRec1= rec1.getLength();
			int widthRec1= rec1.getWidth();
			rec1.setLength(lengthRec1);
			rec1.setWidth(widthRec1);
		}
		catch(Exception e) {
			fail("failure to set dimension");
		}
	}
	@Test
	public void areatest() {
		try {
			Rectangle rec1= new Rectangle(2,3);
			double areaRec1= rec1.area();
		
		}
		catch(Exception e) {
		fail("failure to find area");
		}
	}
	@Test
	public void perimetertest() {
		try {
			Rectangle rec1= new Rectangle(2,3);
			double perimeterRec1= rec1.perimeter();
			
		}
		catch(Exception e) {
		fail("Failure to find perimeter");
		}

	}
	@Test
	public void comparetotest() {
		try {
			
		}
		fail("Not yet implemented");
	}
	@Test
	public void illegalargumenttest() {
		try {
			Rectangle rec1= new Rectangle(2,3);
			
		}
		fail("Not yet implemented");
	}

}
