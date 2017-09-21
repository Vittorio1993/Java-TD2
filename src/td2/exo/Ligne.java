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
public class Ligne {
    private Integer noLigne;
    ArrayList<Station>lstStation;
    
    public void Linge(Integer n, Station dep, Station arr){
        noLigne=n;
        lstStation = new ArrayList<>(); 
        lstStation.add(0,dep);
        lstStation.add(lstStation.size()-1,arr);
        
    }
    
    
    
    public void afficher(){
        System.out.println("Le nom de ligne est "+this.getNoLinge());
        for(int i=0;i<lstStation.size();i++){    
            System.out.println("Le no."+i+" Station est "+lstStation.get(i).getNom());
        }
       
    }
    
    public Integer getNoLinge(){
        return noLigne;
    }
    
    public void insererStation(Station pre, Station ajoute){
        for(int i = 0;i<lstStation.size();i++){
            if (pre==lstStation.get(i)){ 
                lstStation.add(i+1,ajoute);
            }   
           
        }   
    }
    
    public void supprimerStation(Station supp){
        lstStation.remove(supp);
        
    }
    
    public Boolean stationDesservie(Station vérifier ){
        Boolean reponse = false;
        for(int i=0;i<lstStation.size();i++){
            if(vérifier==lstStation.get(i)){
                reponse= true;
            }
        }
        return reponse;
    }   
}



