package ch.rapazp.java.formation.practice.employe;

/* -----------------------------------------------------------------------------
 * (c) 2002, 2003 by Rodrigue Vaudan
 * -----------------------------------------------------------------------------
 *
 * ListeEmployeeNonVideException.java
 *
 * -----------------------------------------------------------------------------
 * WHEN           VERSION   DESCRIPTION
 * 21.02.2003     1.0       Creation
 * -----------------------------------------------------------------------------
 */

import java.util.ArrayList;

/**
 * Exercice 5
 * 
 * Representation d'une liste d'employes
 * 
 * @author Rodrigue Vaudan
 * @version 1.0
 */
public class ListeEmployes 
{

  public final static int RECHERCHE_NOM = 0;
  public final static int RECHERCHE_TEL = 1;

  private ArrayList<Employe> m_listeEmployes = null;

  public ListeEmployes() 
  {
    m_listeEmployes = new ArrayList<Employe>();
  }// endConst

  public void ajouter(Employe nouvelEmploye) 
  {
    m_listeEmployes.add(nouvelEmploye);
  }// endFct

  public void ajouter(ArrayList<Employe> listeNouveauxEmployes)
      throws ListeEmployeeNonVideException, EmployeNonValideException 
  {

    if (!m_listeEmployes.isEmpty()) 
    {
      throw new ListeEmployeeNonVideException("Des employes existent deja dans la liste !!");
    }// endIf

    for (int i = 0; i < listeNouveauxEmployes.size(); i++) 
    {
      if (!(listeNouveauxEmployes.get(i) instanceof Employe)) 
      {
        throw new EmployeNonValideException("Vous essayer d'inserer autre chose qu'un employe !!!");
      }// endIf
    }// endFor

    m_listeEmployes = listeNouveauxEmployes;
  }// endFct

  public Employe rechercheParNom(String nomEmploye) throws EmployeNonTrouveException,
      TelNonTrouveException 
  {
    return recherche(nomEmploye, RECHERCHE_NOM);
  }// endFct

  public Employe rechercheParTel(String telEmploye) throws EmployeNonTrouveException,
      TelNonTrouveException 
  {
    return recherche(telEmploye, RECHERCHE_TEL);
  }// endFct

  public void print() 
  {
    System.out.print(this);
  }// endFct

  public String toString() 
  {
    StringBuilder res = new StringBuilder();

    res.append("\nListe des employes enregistres\n");
    res.append("******************************\n");

    try 
    {
      for (int i = 0;; i++) 
      {
        res.append(((Employe) m_listeEmployes.get(i)).toString());
        res.append("\n");
      }// endFor
    } 
    catch (Exception ex) 
    {
      // noting to do
    }// endTry

    return res.toString();
  }// endFct

  private Employe recherche(String param, int mode) throws EmployeNonTrouveException,
      TelNonTrouveException 
  {

    int cpt = 0;
    boolean employeTrouve = false;
    Employe employe = null;

    switch (mode) 
    {
    case RECHERCHE_NOM:
      while (cpt < m_listeEmployes.size() && !employeTrouve) 
      {

        if (((Employe) m_listeEmployes.get(cpt)).getNom().equalsIgnoreCase(param)) 
        {
          employe = (Employe) m_listeEmployes.get(cpt);
          employeTrouve = true;
        }// endIf

        cpt++;
      }// endWhile

      break;

    case RECHERCHE_TEL:
      while (cpt < m_listeEmployes.size() && !employeTrouve) 
      {

        if (((Employe) m_listeEmployes.get(cpt)).getTel().equalsIgnoreCase(param)) 
        {
          employe = (Employe) m_listeEmployes.get(cpt);
          employeTrouve = true;
        }// endIf

        cpt++;
      }// endWhile

    }// endSwitch

    if (!employeTrouve) 
    {
      if (mode == RECHERCHE_NOM) 
      {
        throw new EmployeNonTrouveException("L'employe " + param + " n'existe pas !!");
      } 
      else 
      {
        throw new TelNonTrouveException("Le tel " + param + " n'existe pas !!");
      }// endIf
    }// endIf

    return employe;
  }// endFct
}// /:~