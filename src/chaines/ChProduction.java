
package chaines;

import elements.*;
import java.io.*;
import java.lang.*;
import java.util.*;
/**
 *
 * @author lea
 */
public class ChProduction {
    private String code;
    private String nom;
    private ArrayList<Element> entree = new ArrayList(); //modifier en HashMap
    private ArrayList<Element> sortie = new ArrayList(); //modifier en HashMap
    private int nivActivation;
    private String moyenStock;
    private boolean dispoStock;

    public ChProduction(String code, String nom, int nivActivation, String moyenStock, boolean dispoStock) {
        this.code = code;
        this.nom = nom;
        this.nivActivation = nivActivation;
        this.moyenStock = moyenStock;
        this.dispoStock = dispoStock;
        this.nivActivation=getNiveau();
    }
    
    public void addElementEntree(Element e) throws IOException{
        //utiliser la partie CSV
    }
    
    public int getNiveau(){
        //calcul du niveau d'activation cf la classe Calcul
        return 0;
    }  
}
