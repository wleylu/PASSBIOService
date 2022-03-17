/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.passbio.dao;

import com.passbio.log.AppLogger;
import com.sun.prism.impl.PrismSettings;
import java.io.IOException;
import static java.lang.Thread.sleep;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.paint.Stop;

/**
 *
 * @author yacou.kone
 */
public class CheckerPassBIO implements Runnable{
    
    static boolean statut=true;
    
    
    public CheckerPassBIO(){
        
    }

    @Override
     @SuppressWarnings({"UnusedAssignment", "SleepWhileInLoop", "CallToPrintStackTrace", "UseSpecificCatch"})
    public void run() {
               
        AppLogger log;
        InsertDB passbioInsert;
       // int i=0;
        try {
             
           log=new AppLogger("Initialisation du service PASSBIO");
        } catch (Exception ex) {
            
            Logger.getLogger(CheckerPassBIO.class.getName()).log(Level.SEVERE, null, ex);
        }
        while(statut){
            try{
                //i++;
                passbioInsert=new InsertDB();
                passbioInsert.insertionDB();
              //  log=new AppLogger("Exécution :"+i+" heure "+new AppLogger().formatageDateHeure());
                Thread.sleep(120000);
               
            }
            catch (Exception e){              
                e.printStackTrace();
            }
            
           try {
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
             
        }
    }
    
    @SuppressWarnings({"ResultOfObjectAllocationIgnored", "CallToPrintStackTrace"})
    public static void  stop(){
        statut=false;
        try {
             AppLogger log=new AppLogger();
            String date=log.formatageDateHeure();
            AppLogger log1=new AppLogger("Arret du service PASSBIO :"+date);
            statut=false;
        } catch (Exception e) {
                try {
                        new AppLogger("Impossible d'arreter le service PASSBIO :"+new AppLogger().formatageDateHeure());
            } catch (ParseException ex) {
                ex.printStackTrace();
            }
                
        }
       
    
    }
    
            

  

     
    
    
    
}
