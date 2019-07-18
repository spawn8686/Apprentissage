package com.sdz.fluxEntreeSorti;

import java.io.*;
import com.prive.exercices.Titre;

public class Main 
{
	public static void main(String[] args) 
	{
		Titre ti = new Titre();
		
		ti.titre("Test des méthodes de la classe java.io.File");
		File f = new File("test.txt");
		System.out.println("Le chemin absolue du fichier est : "+ f.getAbsolutePath());
		System.out.println("Le fichier s'appel : "+ f.getName());
		System.out.println("Le fichier existe t'il : "+ f.exists());
		System.out.println("Est-ce un répertoire : "+ f.isDirectory());
		System.out.println("Est-ce un fichier : "+ f.isFile());
		
		ti.titre("Enumération des lecteur racine du PC grâce au méthode de la même classe");
		System.out.println("Affichage des lecteurs à la racine du PC : ");
		for (File file : f.listRoots()) 
		{
			System.out.println(file.getAbsolutePath());
			try 
			{
				int i = 1;
				
				for (File nom : file.listFiles()) // On parcours la liste des fichiers et répertoires
				{
					// si il s'agit d'un répertoire, on ajoute '/'
					System.out.println("\t\t"+((nom.isDirectory()) ? nom.getName()+"/" : nom.getName()));
					
					if ((i%4) == 0) 
					{
						System.out.println("\n");
					}
					i++;
				}
				System.out.println("\n");
			} catch (NullPointerException e) 
			{
				// L'instruction peut générer une NullPointException
				// si il n'y a pas de sous-fichier !
			}
		}
		
		
		ti.titre("Exercices Lecture et écriture de fichiers .txt");
	      FileInputStream fis = null;
	      FileOutputStream fos = null;
	      try 
	      {
	         fis = new FileInputStream(f);
	         fos = new FileOutputStream(new File("test2.txt"));

	         byte[] buf = new byte[8];

	         int n = 0;

	         while ((n = fis.read(buf)) >= 0) 
	         {
	            fos.write(buf);	            
	            for (byte bit : buf) 
	            {
	               System.out.print("\t" + bit + "(" + (char) bit + ")");
	            }
	            System.out.println("");
	            buf = new byte[8];

	         }
	         System.out.println("Copie terminée !");

	      } catch (FileNotFoundException e) 
	      {
	         e.printStackTrace();
	      } catch (IOException e) 
	      {
	         e.printStackTrace();
	      } finally 
	      {
	         try 
	         {
	            if (fis != null)
	               fis.close();
	         } catch (IOException e) 
	         {
	            e.printStackTrace();
	         }

	         try 
	         {
	            if (fos != null)
	               fos.close();
	         } catch (IOException e) 
	         {
	            e.printStackTrace();
	         }
	      }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
