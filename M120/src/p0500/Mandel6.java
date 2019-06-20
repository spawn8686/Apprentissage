package p0500;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.Serializable;

import javax.swing.*;
/**
 * JPanel affichant une partie du systeme de MandelBrot sous forme
 * de representation graphique ou la couleur correspond au nombre d'iterations necessaires
 * pour sortir du systeme.
 * 
 * @author tibo
 *
 */
public class Mandel6 extends JPanel implements Cloneable, Serializable {
	private double selectedA, selectedB, currentRange;
	private PointRenderer pointRenderer;
	private boolean marks = true;
	private final int maxIter = 1000;
	
	/**
	 * Construit une fractal en degrade de gris
	 * pour la zone -1.5 a 0.5 pour a et -1 a 1 pour b
	 */
	public Mandel6(){
		this(-0.5, 0, 2, false, new BwRenderer());
	}

	/**
	 * Construit une fractal en utilisant un renderer specifique
	 * pour la zone -1.5 a 0.5 pour a et -1 a 1 pour b
	 * 
	 * @param renderer PointRenderer convertissant une valeur (0 a 200) en couleur
	 */
	public Mandel6(PointRenderer renderer){
		this(-0.5, 0, 2, false, renderer);
	}
	
	/**
	 * Construit une fractal en utilisant 
	 * <ul>
	 * <li>les coordonnees</li>
	 * <li>la plage a afficher</li>
	 * <li>l'affichage ou non du curseur de localisation</li>
	 * <li>un renderer specifique</li>
	 * </ul>
	 * 
	 * @param renderer convertissant une valeur (0 a 200) en couleur
	 * @param a Valeur de a au centre de la fractal pour l'axe horizontal
	 * @param b Valeur de b au centre de la fractal pour l'axe vertical
	 * @param range plage des valeurs affichees
	 * @param marks indique s'il faut afficher le curseur de localisation
	 */
	public Mandel6(double a, double b, double range, boolean marks, PointRenderer renderer){
		super();
		pointRenderer = renderer;
		this.marks = marks;
		setPreferredSize(new Dimension(400, 300));
		changeView(a, b, range);
		setBackground(renderer.getBackground());
	}

	/**
	 * Affiche une autre zone du modele de Mandelbrot
	 * 
	 * @param a Valeur de a (axe horizontal)
	 * @param b Valeur de b (axe vertical)
	 */
	public void changeView(double a, double b) {
		changeView(a, b, currentRange);
	}
	
	/**
	 * Permet d'afficher la meme zone qu'une autre fractale
	 * 
	 * @param m Fractale dont on veut copier la zone
	 */
	public void cloneView(Mandel6 m) {
		selectedA = m.getCurrentA();
		selectedB = m.getCurrentB();
		currentRange = m.getRange();
//		marks = m.isMarked();
		repaint();
	}
	/**
	 * Modifie la zone affichée
	 * La forme sera centree par rapport aux coordonnees fournies.
	 * 
	 * @param a indique la valeur de a se trouvant au centre de la forme (axe des x)
	 * @param b indique la valeur de b se trouvant au centre de la forme (axe des y)
	 * @param range indique la plage affichee
	 */
	public void changeView(double a, double b, double range){
		
		selectedA = a;
		selectedB = b;
		currentRange = range;
		repaint();
		
	}
	/**
	 * Modifie la zone affichee en se centrant par rapport a un point se trouvant sur la zone affichee
	 *  
	 * @param x la coordonnee en pixels pour x 
	 * @param y la coordonnee en pixels pour y
	 * @param zoom Le facteur de grossissement a appliquer sur l'affichage en cours
	 */
	public void changeView(int x, int y, double zoom){
		int w = getWidth();
		int h = getHeight();
		int minRange = Math.min(w, h);
		int deltaX = (getWidth() - minRange ) / 2;
		int deltaY = (getHeight() - minRange ) / 2;
		x = x - deltaX;
		y = y - deltaY;
		double a = selectedA + x / getScale(w, h) - currentRange / 2.0;
		double b = selectedB + y / getScale(w, h) - currentRange / 2.0;
		changeView(a, b, currentRange / zoom);
	}
	
	/**
	 * Effectue un zoom avant de la zone d'affichage
	 */
	public void zoomIn(){
		zoom(false);
	}
	/**
	 * Effectue un zoom arriere de la zone d'affichage
	 */
	public void zoomOut(){
		zoom(true);
	}
	/**
	 * Effectue un zoom (de facteur 2) de la zone d'affichage
	 * 
	 * @param out Si vrai, indique que l'on va afficher une zone plus etendue de la fractale (s'eloigner)
	 */
	private void zoom(boolean out) {
		if (out) {
			currentRange = currentRange * 2.0;
		} else {
			currentRange = currentRange / 2.0;
		}
		repaint();
	}

	/**
	 * Effectue un zoom du facteur passe en parametre de la zone d'affichage
	 * 
	 * @param factor facteur de grossisement (on zoom si > 1, on dezoom si < 1)
	 */
	public void zoom(double factor) {
		currentRange = currentRange / factor;
		repaint();
	}
	
	private double getScale(int sizex, int sizey) {
		return Math.min(sizex, sizey) / currentRange;
	}
	
	public void paintComponent(Graphics g) {
        super.paintComponent(g);

    	int[] pixelArray;
    	BufferedImage image;
		int sizex = this.getSize().width;
		int sizey = this.getSize().height;

		pixelArray = new int[sizex * sizey * 3];
        int pixelArrayOffset = 0;
        image = new BufferedImage(sizex, sizey, BufferedImage.TYPE_INT_RGB);
        
		double scale = getScale(sizex, sizey);
		
		double a = selectedA , b = selectedB;
		int it = 0;

		for (int y = 0 ; y < sizey ; y++) {
			b = selectedB + (y - sizey / 2) /scale;
			for (int x = 0 ; x < sizex ; x++) {
				a = selectedA + (x - sizex / 2) / scale;
				it = mandelbrotTest(a, b);

				Color c = pointRenderer.getColor(it);
                pixelArray[pixelArrayOffset++] = c.getRed();
                pixelArray[pixelArrayOffset++] = c.getGreen();
                pixelArray[pixelArrayOffset++] = c.getBlue();
			}
		}
        WritableRaster raster = image.getRaster();
        raster.setPixels(0,0, sizex, sizey, pixelArray);

        g.drawImage(image, 0, 0, getWidth(), getHeight(),
			0, 0, image.getWidth(), image.getHeight(), null);

        //Affiche la marque si nécessaire
        if(isMarked()) {
            int[] temp = null;
            int[] p = raster.getPixel(sizex/2, sizey/2, temp);
            float[] bg = Color.RGBtoHSB(p[0], p[1], p[2], null);
            float brightness = bg[2] < 0.4f ? bg[2] + 0.6f : bg[2] > 0.6f ? bg[2] - 0.6f : 1.0f;
        	g.setColor(Color.getHSBColor(bg[0] + 0.3f, bg[1], brightness));
        	
        	int delta = Math.min(getWidth(), getHeight()) / 20;
        	g.drawLine(getWidth() / 2, getHeight() / 2 - delta, getWidth()/2, getHeight() / 2 + delta);
        	g.drawLine(getWidth() / 2 - delta, getHeight() / 2 , getWidth() / 2 + delta, getHeight() / 2 );
        }
		
	}
	
	@Override
	public void setBackground(Color background) {
		super.setBackground(background);
		getPointRenderer().setBackground(background);
		repaint();
	}
	
	/**
	 * Permet de dupliquer une fractal
	 */
	public Mandel6 clone() {
		Mandel6 mandel6 = null;
		try {
			mandel6 = (Mandel6) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		mandel6.pointRenderer = pointRenderer.clone();
		return mandel6;
	}

	public double getCurrentA() {
		return selectedA;
	}
	public double getCurrentB() {
		return selectedB;
	}
	public double getRange() {
		return currentRange;
	}
	
	/**
	 * Permet d'afficher ou non le curseur de position au centre de la zone d'affichage
	 * 
	 * @param marks Indique si le curseur est affiche
	 */
	public void setMarks(boolean marks) {
		if(this.marks != marks) {
			this.marks = marks;
			repaint();
		}
	}

	public boolean isMarked() {
		return marks;
	}
	public PointRenderer getPointRenderer() {
		if(pointRenderer == null) {
			pointRenderer = new BwRenderer();
		}
		return pointRenderer;
	}
	public void setPointRenderer(PointRenderer pointRenderer) {
		this.pointRenderer = pointRenderer;
		setBackground(pointRenderer.getBackground());
		repaint();
	}
	
	private int mandelbrotTest(double a, double bi) {
		double atmp, btmp;
		int number = 0;
		double z = 0,zi = 0;
		
		while ( (number != maxIter) && (comp_magnitude(z,zi) < 4)) {			
			number++;
			atmp = z * z  - zi * zi  + a;
			btmp = 2 * z * zi + bi;
			
			z = atmp;
			zi = btmp;
		}
		
		if (number == maxIter) {
			return -1;
		} else {
			return number % maxIter;
		}
	}
	
	private double comp_magnitude(double a, double b) {
		return  a * a + b * b;
	}

}