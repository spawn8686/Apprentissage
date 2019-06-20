package p0736;

import java.util.ArrayList;
import java.util.Collection;

public class Boat {
	private ArrayList<Integer> positions;
	
	public Boat(int start, int size) {
		positions = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			positions.add(start+i);
		}
	}
	
	public boolean checkYourself(Integer position) {
		return positions.remove(position);
	}
	
	public boolean isAlive() {
		return !positions.isEmpty();
//		return positions.size() > 0;
	}
	
	public Collection<Integer> getPositions() {
		return positions;
	}
}
