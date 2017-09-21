/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td2.exo;
import java.util.ArrayList;

/**
 *
 * @author zhanghuakai
 */
public class Reseau {
     ArrayList<Ligne> lstligne;
    
    public void init(){
        lstligne=new ArrayList<>();
    }
    
    public void creerligne(Ligne l){
        lstligne.add(l);
    }
    
    public Ligne obtenirligne(int n ){
        Ligne l=new Ligne();
        for(int i=0;i<lstligne.size();i++){
            if(lstligne.get(i).getNoLinge()==n){
                l=lstligne.get(i);
            }
        }
         return l;
    }
    
    public  retrouverligne(){
        
    }
    
    public void  obtenirensemblestations(){
        
    }
    
    public void obtenirlignes(){
        
    }
}
