package p0500;

import java.awt.Color;
import java.io.Serializable;

public abstract class PointRenderer implements Cloneable, Serializable {
	protected boolean sens = false;
	protected Color background = Color.BLACK;
	protected float range = 1.0f;
	protected float delta = 0.0f;
	protected final float COLOR_CYCLE = 100.0f;
	
	/**
	 * Defini l'ordre utilise pour la generation des couleurs
	 * 
	 * @param sens decroissant si faux
	 */
	public void setSens(boolean sens){
		this.sens = sens;
	}
	/**
	 * Defini la couleur de fond.
	 * Cette couleur est utilisee si le niveau est superieur a 200
	 * 
	 * @param background La couleur de fond
	 */
	public void setBackground(Color background) {
		this.background = background;
	}
	public Color getBackground() {
		return background;
	}
	public void setRange(float range) {
		this.range = range;
	}
	public void setDelta(float delta) {
		this.delta = delta;
	}
	public PointRenderer clone() {
		PointRenderer pointRenderer = null;
		try {
			pointRenderer = (PointRenderer) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		pointRenderer.background = new Color(background.getRGB());
		return pointRenderer;
	}

	/**
	 * Calcule la couleur correspondant au niveau 
	 * passe en parametre
	 * 
	 * @param level le niveau
	 * @return la couleur calculee
	 */
	abstract public Color getColor(int level);
}