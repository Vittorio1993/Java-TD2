/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td2.exo;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author zhanghuakai
 */
public class Reseau {
     ArrayList<Ligne> lstligne;
    
    public void init(){
        lstligne=new ArrayList<>();
       
        
    }
    
    public void creerligne(Ligne li){
        lstligne.add(li);
    }
    
    public Ligne obtenirligne(int n ){
        Ligne l=new Ligne();
        for(int i=0;i<lstligne.size();i++){
            if(lstligne.get(i).getNoLinge()==n){
                l=lstligne.get(i);
            }
        }
        l.afficher();
        return l;
    }
    
    public ArrayList<Ligne> retrouverligne(Station s){
        ArrayList<Ligne> lstlignedesservie= new ArrayList<>();
        for(int i=0;i<lstligne.size();i++){
            if (lstligne.get(i).stationDesservie(s)){
                lstlignedesservie.add(lstligne.get(i));
            }
        }
        return lstlignedesservie;
    }
        
        
    
    public ArrayList<Station> obtenirensemblestations(){
        //Boolean check=true;
        ArrayList<Station> lststationdesservie= new ArrayList<>();
        for(int i=0;i<lstligne.size();i++){
            for(int j=0;j<lstligne.get(i).lstStation.size();j++){
               /* for (int k=0;k<lststationdesservie.size();k++){
                    if (lstligne.get(i).lstStation.get(j)==lststationdesservie.get(k)){
                        check=false;
                    }
                }*/
                   if(!lststationdesservie.contains(lstligne.get(i).lstStation.get(j))){
                       lststationdesservie.add(lstligne.get(i).lstStation.get(j));
                }       
            }
        }
        return lststationdesservie;
    }
    
    public ArrayList<Ligne> obtenirlignes(Station a, Station b){
        ArrayList<Ligne> lstligneutile= new ArrayList<>();
        for(int i=0;i<lstligne.size();i++){
            if (lstligne.get(i).stationDesservie(a)&&lstligne.get(i).stationDesservie(b)){
            lstligneutile.add(lstligne.get(i));
            }
        }
        return lstligneutile;
        
    }
}
