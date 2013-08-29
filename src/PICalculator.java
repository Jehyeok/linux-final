import java.util.ArrayList;
import java.util.List;


public class PICalculator implements Runnable {
	double PI;
	public static final int THREAD_NUM = 4;
	public static final int LOOP_NUM = 50000;
	@Override
	
	public void run() {
		List<Position> posList = new ArrayList<Position>();
		for (int i = 0; i < LOOP_NUM; i++) {
			double posX = Math.random();
			double posY = Math.random();
			posList.add(new Position(posX, posY));
		}
		synchronized(this) {
			PI += (double)numInCircle(posList) / LOOP_NUM;
		}
	}
	
	public int numInCircle(List<Position> posList) {
		int count = 0;
		for (Position position : posList) {
			if (position.isInCircle()) {
				count++;
			}
		}
		return count;
	}

	public double getPI() {
		return PI/4;
	}
}
