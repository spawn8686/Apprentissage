package p0736;

import java.util.ArrayList;
import java.util.Collection;

public class Fleet {
	private ArrayList<Boat> boats = new ArrayList<>();
	
	public void add(Boat boat) {
		boats.add(boat);
	}
	
	public boolean play(Integer position) {
		for (Boat boat : boats) {
			if(boat.checkYourself(position)){
				return true;
			}
		}
		return false;
	}
	
	public boolean isAlive() {
		for (Boat boat : boats) {
			if(boat.isAlive()){
				return true;
			}
		}
		return false;
	}
	
	public Collection<Integer> getPositions() {
		ArrayList<Integer> positions = new ArrayList<>();
		for (Boat boat : boats) {
			positions.addAll(boat.getPositions());
			//Ou mais plus compliqué
//			for (Integer integer : boat.getPositions()) {
//				positions.add(integer);
//			}
		}
		return positions;
	}
	
	public boolean isFree(Boat boat) {
		for (Integer position : boat.getPositions()) {
			if(getPositions().contains(position)){
				return false;
			}
		}
		return true;
	}
}
