package p0300;

import robocode.Robot;

public class P0305 extends Robot {
	@Override
	public void run() {
		while (true) {
			ahead(100);
			turnRight(90);
		}
	}
}
