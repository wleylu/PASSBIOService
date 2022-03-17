/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.passbio.database;

import com.passbio.bean.DbParam;
import com.passbio.dao.CheckerPassBIO;
import com.passbio.log.AppLogger;


import java.io.FileNotFoundException;
import java.io.IOException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author yacou.kone
 */
@SuppressWarnings("CallToPrintStackTrace")
public class Database {
    
     ParamDB dbDonnes=new ParamDB();
     DbParam param=new DbParam();
     Connection connection;
     CheckerPassBIO serv=new CheckerPassBIO();
    
        
        public Connection getConnection(){
            
                try {
                      param=dbDonnes.getDonnesDb();
                     // Class.forName("com.mysql.jdbc.Driver");
                    // Class.forName(param.getDriverDb());
                   //  connection = DriverManager.getConnection("jdbc:mysql://localhost/passport","root","");
                     
                    connection = DriverManager.getConnection(param.getUrlDb(), param.getUserDb(), param.getPaasDb());
                     
                 //   System.out.println("Connexion établie avec succès configInfos");
                    String date=new AppLogger().formatageDateHeure();
                    AppLogger log=new AppLogger("Connexion etablie avec succes : "+date);
                } catch (Exception ex) {
                   
                    try {
                         
                        String date1=new AppLogger().formatageDateHeure();
                        AppLogger log1=new AppLogger("Probleme de connexion a la Database : "+date1+" : "+ex.getMessage());
                    } catch (Exception ex1) {
                        Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex1);
                    }
                                        
                    System.out.println("Probleme de connexion a la Database : " + ex.getMessage());
                  }  
                
            return connection;
        }
     

    
    public Database()
    {
    }
    
    
  
    
    
}
