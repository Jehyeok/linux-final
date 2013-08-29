import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

public class PICalculatorTest extends TestCase {
	List<Position> posList = new ArrayList<Position>();
	
	public void setUp() {
		for (int i = 0; i < 10; i++) {
			double posX = Math.random();
			double posY = Math.random();
			posList.add(new Position(posX, posY));
		}
	}
	
	public void testMakeRandomNumberBetweenZeroToOne() throws Exception {
		for (int i = 0; i < 20; i++) {
//			System.out.println(Math.random());
		}
	}
	
	public void testSavePos() throws Exception {
		
		for (Position position : posList) {
//			System.out.println(position.toString());
		}
	}
	
	public void testCheckIfDistanceWithin_1() throws Exception {
		Position pos1 = new Position(0.1, 0.1);
		assertTrue(pos1.isInCircle());

		Position pos2 = new Position(0.8, 0.8);
		assertFalse(pos2.isInCircle());
		
	}
}
