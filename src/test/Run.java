/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import td2.exo.Ligne;
import td2.exo.Station;
import td2.exo.Reseau;

/**
 *
 * @author zhanghuakai
 */
public class Run {
    public static void main(String args[]){
        Station s1=new Station();
        Station s2=new Station();
        Station s3=new Station();
        Station s4=new Station();
        
        s1.init("compans");
        s2.init("st-michel");
        s3.init("jeanne d'arc");
        s4.init("jean jaurès");
        
        Ligne l1=new Ligne();
        Ligne l2=new Ligne();
        
        l1.Ligne(1, s1, s2);
        l2.Ligne(2, s1, s2);
        l1.afficher();
        l2.afficher();
        System.out.println("\n");
        
        l1.insererStation(s1, s3);
        l2.insererStation(s1, s4);
        l1.insererStation(s4, s3);
        l1.afficher();
        l2.afficher();
        System.out.println("\n");
        
        l1.supprimerStation(s3);
        l1.afficher();
        System.out.println("\n");
        
        //Déterminer si la station s3 est une station desservie de ligne l1
         if (l1.stationDesservie(s3)){ 
            System.out.println("La station est une station desservie");
        }
        else{
            System.out.println("La station n'est pas une station desservie");
        }
        System.out.println("\n");
        
        System.out.println("Complément");
        Reseau r1=new Reseau();
        r1.init();
       
        
        r1.creerligne(l1);
        r1.creerligne(l2);
        
        
        r1.obtenirligne(2);
        System.out.println("\n");
        
        
        for(int i=0;i<r1.retrouverligne(s1).size();i++){
            System.out.println(r1.retrouverligne(s1).get(i).getNoLinge());
        }
        System.out.println("\n");
        
        for(int i=0;i<r1.obtenirensemblestations().size();i++){
            System.out.println(r1.obtenirensemblestations().get(i).getNom());
            
        }
        System.out.println("\n");
        
        for(int i=0;i<r1.obtenirlignes(s1,s2).size();i++){
            System.out.println(r1.obtenirlignes(s1,s2).get(i).getNoLinge());
            
        }
        
        
        
        
        
        
        
        
        
    }
    
}
