package ch.rapazp.java.formation.practice.testdisque;

/* -----------------------------------------------------------------------------
 * (c) 2002 - 2014 by Pascal Rapaz
 * -----------------------------------------------------------------------------
 *
 * Disque.java
 *
 * -----------------------------------------------------------------------------
 * WHEN           VERSION   DESCRIPTION
 * 17.12.2002     1.0       Creation
 * -----------------------------------------------------------------------------
 */

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * Exercice 3
 * 
 * Representation d'un disque sous forme de classe.
 * 
 * Modifications effectuees par rapport a l'exercice 2:
 * 
 * - La methode main a ete deplacee dans la classe TestDisque.
 * 
 * - Les methode Helpers ont ete deplacee en fin de classe.
 * 
 * @author Pascal Rapaz
 * @version 1.0
 */
public class Disque {

  private String artist = null;
  private String title = null;
  private String style = null;
  private int nbrTrack = 0;
  private long time = 0;

  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  // Constructeurs
  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  /**
   * Construit un nouvel objet de type Disque.
   * 
   * @param artist
   *          Nom de l'artiste
   * @param title
   *          Titre du disque
   * @param style
   *          Style musical
   * @param nbrTracks
   *          Nombre de morceaux (pistes)
   * @param time
   *          Duree du disque
   */
  public Disque(String artist, String title, String style, int nbrTracks,
      long time) {

    this.setArtist(artist);
    this.setTitle(title);
    this.setStyle(style);
    this.setNbrTrack(nbrTracks);
    this.setTime(time);
  } // endConst

  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  // Methodes
  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  /**
   * Retourne la duree du disque formatee comme suit: <code>hh:mm:ss</code>
   * 
   * @return String La duree formatee
   */
  public String getFormatedTime() {

    return formatTime(time);
  } // endFct

  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  // Getters and Setters
  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  /**
   * Retourne le nom de l'artiste
   * 
   * @return String
   */
  public String getArtist() {
    return artist;
  } // endFct

  /**
   * Retourne le style de musique du disque
   * 
   * @return String
   */
  public String getStyle() {
    return style;
  } // endFct

  /**
   * Retourne le nombre de morceaux
   * 
   * @return int
   */
  public int getNbrTrack() {
    return nbrTrack;
  } // endFct

  /**
   * Retourne le titre de l'album
   * 
   * @return String
   */
  public String getTitle() {
    return title;
  } // endFct

  /**
   * Retourne la duree du disque en milliseconde
   * 
   * @return long
   */
  public long getTime() {
    return time;
  } // endFct

  /**
   * Valorise le nom de l'artiste
   * 
   * @param artist
   *          Le nom de l'artiste
   */
  public void setArtist(String artist) {
    this.artist = artist;
  } // endFct

  /**
   * Valorise le style de musique du disque
   * 
   * @param edition
   *          Le style de musique
   */
  public void setStyle(String style) {
    this.style = style;
  } // endFct

  /**
   * Valorise le nombre de morceaux
   * 
   * @param nbrTrack
   *          Le nombre de morceaux
   */
  public void setNbrTrack(int nbrTrack) {
    this.nbrTrack = nbrTrack;
  } // endFct

  /**
   * Valorise le titre du disque
   * 
   * @param title
   *          Le titre du disque
   */
  public void setTitle(String title) {
    this.title = title;
  } // endFct

  /**
   * Valorise la duree du disque en milliseconde
   * 
   * @param totalTime
   *          La duree du disque
   */
  public void setTime(long time) {
    this.time = time;
  } // endFct

  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  // Helpers
  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  /**
   * Retourne une heure en format milliseconde
   * 
   * @param hour
   *          Heure
   * @param min
   *          Minutes
   * @param sec
   *          Secondes
   * @return long Represente l'heure en milliseconde
   */
  public static long calculTime(int hour, int min, int sec) {

    /*
     * Rappel: 1 heure = 1 * 60 * 60 * 1000 millisecondes
     */
    return (hour * 3600 + min * 60 + sec) * 1000;
  } // endFct

  /**
   * Retourne l'heure formatee.
   * 
   * @param time
   *          L'heure a formater
   * @return String L'heure formatee
   */
  public static String formatTime(long time) {

    // Definition du timezone afin de ne pas avoir de decalage horaire dans
    // le formatage de l'heure
    TimeZone utc = TimeZone.getTimeZone("GMT");
    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
    sdf.setTimeZone(utc);

    return sdf.format(new Date(time));
  } // endFct
} // /:~
