/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.passbio.log;

import com.passbio.bean.ConfigInfos;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Yacouba KONE
 */
public class AppLogger {
    
    public AppLogger(String message){
        
        
        String date=null;
        String filename=null;
        FileWriter file;
        
        try {
            ConfigInfos infos=new ConfigInfos();
            date=formatageDate();
            filename="passbio"+date+".log";
            file= new FileWriter(new File(infos.getApplogdir()+"/"+filename),true);
            BufferedWriter out=new BufferedWriter(file);
            out.write(message);
            out.newLine();
            
            out.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
    }
            public AppLogger(){}

            public String formatageDate(){
                    Date d=new Date();
                    SimpleDateFormat sd=null;
                    String s=null;
                try {                         
             
                    sd=new SimpleDateFormat("yyyMMdd");
                 s=sd.format(d);

                } catch (Exception e) {
                    s=null;
                    e.printStackTrace();
                }
                   
           
                 return s;
            }


                 public String formatageDateHeure() throws ParseException{
                 Date d=new Date();
                 SimpleDateFormat sd=new SimpleDateFormat("yyyMMdd HH:mm:ss");
                 String s=null;
                     try {
                         s=sd.format(d);
                     } catch (Exception e) {
                         e.printStackTrace();
                     }
                 

                 return s;
            }   

}
