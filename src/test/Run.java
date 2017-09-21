/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import td2.exo.Ligne;
import td2.exo.Station;

/**
 *
 * @author zhanghuakai
 */
public class Run {
    public static void main(String args[]){
        Station s1=new Station();
        Station s2=new Station();
        Station s3=new Station();
        
        s1.init("compans");
        s2.init("st-michel");
        s3.init("jeanne d'arc");
        
        Ligne l1=new Ligne();
        
        l1.Linge(1, s1, s2);
        l1.afficher();
        
        l1.insererStation(s1, s3);
        l1.afficher();
        
        l1.supprimerStation(s3);
        l1.afficher();
        
    }
    
}
