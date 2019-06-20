package p0500;

import java.awt.Color;

public class BwRenderer extends PointRenderer {
	public BwRenderer() {
		super();
	}
	
	public BwRenderer(boolean sens) {
		super();
		setSens(sens);
	}

	public Color getColor(int level) {
		/*
		int MAX_LEVEL = 256;
		level = (int) ((level % COLOR_CYCLE) / COLOR_CYCLE) * MAX_LEVEL;
		int c = sens ? MAX_LEVEL - level : level;
		c = (int) (c / range + delta) % 256;
		*/
		float l = (level % COLOR_CYCLE) / COLOR_CYCLE * range ;
		l = (sens ? l : 1-l);

		return (level == -1) ? background : Color.getHSBColor(0, 0, l);
	}
}