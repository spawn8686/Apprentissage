package p0500;

import java.awt.Color;

public class HueRenderer extends PointRenderer {
	/**
	 * Génère un PointRenderer affichant des points de couleur
	 * en se basant sur le cercle chromatique 
	 */
	public HueRenderer() {
		super();
	}
	
	/**
	 * Génère un PointRenderer en se basant sur le cercle chromatique
	 * Les valeurs vont de 0.0 (rouge vers l'orange) à 1.0 (rouge vers le magenta)
	 * @param range plage de valeur, 1.0 correspond au spectre complet du cercle chromatique
	 * @param delta couleur de départ
	 */
	public HueRenderer(float range, float delta) {
		this.range = range;
		this.delta = delta;
	}
	public HueRenderer(float range, float delta, boolean sens) {
		this.range = range;
		this.delta = delta;
		this.sens = sens;
	}
	
	@Override
	public Color getColor(int level) {
		if(level == -1) {
			return background;
		} else {
			//float l = sens ? 200 - level : level;
			float l = (level % COLOR_CYCLE) / COLOR_CYCLE * range * (sens ? 1 : -1);
			return Color.getHSBColor(l+delta, 1.0f, 1.0f);  
		}
	}
}