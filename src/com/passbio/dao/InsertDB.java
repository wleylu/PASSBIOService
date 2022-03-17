/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.passbio.dao;

import com.passbio.bean.OperationT24;
import com.passbio.database.Database;
import com.passbio.log.AppLogger;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author yacou.kone
 */
public class InsertDB 
{
    
public InsertDB(){} 
    
    
        @SuppressWarnings("ResultOfObjectAllocationIgnored")
        public void insertionDB() throws IOException, ParseException{
            //InterfacePB interfaceT24=new InterfacePB();
            Database dbConnect=new Database();
            ServiceResultatJson json=new ServiceResultatJson(); 
            OperationOrion operOrion=new OperationOrion();
            String nooper=null;
            AppLogger log;
            String date=null;
           


            
     //    String resultat=interfaceT24.getInfoClient();
         
           // String codeStatut=interfaceT24.getCodeRetour();
           
          String resultat ="{\n" +
"	\"total\": \"10\",\n" +
"	\"data\": [{\n" +
"		\"date\": \"20181001\",\n" +
"		\"reference_alternative\": \"1000002\",\n" +
"		\"reference_T24\": \"TT182749R70G\",\n" +
"		\"nom\": \"COULIBALY\",\n" +
"		\"prenom\": \"SOUALEHO AL OSSEINE CHEICK IBRAHIM\"\n" +
"	}, {\n" +
"		\"date\": \"20181001\",\n" +
"		\"reference_alternative\": \"1000003\",\n" +
"		\"reference_T24\": \"TT18274TK8RM\",\n" +
"		\"nom\": \"ALLOU\",\n" +
"		\"prenom\": \"AKISSI CLAUDINE\"\n" +
"	}, {\n" +
"		\"date\": \"20181004\",\n" +
"		\"reference_alternative\": \"1000004\",\n" +
"		\"reference_T24\": \"TT18277Q16BS\",\n" +
"		\"nom\": \"DANH\",\n" +
"		\"prenom\": \"OUEU CHIMENE\"\n" +
"	}, {\n" +
"		\"date\": \"20181011\",\n" +
"		\"reference_alternative\": \"1000006\",\n" +
"		\"reference_T24\": \"TT182843JPHB\",\n" +
"		\"nom\": \"KANATE\",\n" +
"		\"prenom\": \"SOUALIO\"\n" +
"	}, {\n" +
"		\"date\": \"20181011\",\n" +
"		\"reference_alternative\": \"1000007\",\n" +
"		\"reference_T24\": \"TT182843JPHB\",\n" +
"		\"nom\": \"KANATE\",\n" +
"		\"prenom\": \"SOUALIO\"\n" +
"	}, {\n" +
"		\"date\": \"20181009\",\n" +
"		\"reference_alternative\": \"1000005\",\n" +
"		\"reference_T24\": \"TT182823X1CV\",\n" +
"		\"nom\": \"ASSAMOI\",\n" +
"		\"prenom\": \"PIERRE\"\n" +
"	}, {\n" +
"		\"date\": \"20181012\",\n" +
"		\"reference_alternative\": \"1000011\",\n" +
"		\"reference_T24\": \"TT182859KYS5\",\n" +
"		\"nom\": \"DIAKITE\",\n" +
"		\"prenom\": \"YACOUBA\"\n" +
"	}, {\n" +
"		\"date\": \"20181012\",\n" +
"		\"reference_alternative\": \"1000008\",\n" +
"		\"reference_T24\": \"TT18285WJ5VD\",\n" +
"		\"nom\": \"DOUKOURE\",\n" +
"		\"prenom\": \" \"\n" +
"	}]\n" +
"}";
            
         // String resultat="NOK";
         //  String resultat="{\"total\":\"1\",\"data\":[{\"date\":\"20180509\",\"reference_alternative\":\"1000008\","
          //  + "\"reference_T24\":\"FT1812918QY2\",\"nom\":\"DOSSO\",\"prenom\":\"YLYASSE\"}]}";
          
     /*   String resultat="{\"total\":\"1\",\"data\":[{\"date\":\"20180509\",\"reference_alternative\":\"1000009\","
            + "\"reference_T24\":\"FT1812918QY2\",\"nom\":\"DOSSO\",\"prenom\":\"YLYASSE\"},{\"date\":\"20180509\",\"reference_alternative\":\"1000008\","
            + "\"reference_T24\":\"FT1812918DZ2\",\"nom\":\"KONE\",\"prenom\":\"YACOUBA\"}]}";
     */
          
            List<OperationT24> operations=new ArrayList<OperationT24>();
            int j=0;
         //   System.out.println(codeStatut);
             if (!resultat.equals("NOK"))
                {

               
                        if (!resultat.equals("999"))
                        {

                                    log=new AppLogger();                
                                    try {
                                        date=log.formatageDateHeure();
                                    } catch (ParseException ex) {
                                        Logger.getLogger(InsertDB.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                    log=new AppLogger("Reception donnees :"+date+": Resultat : "+resultat);
                                    operations=json.insertResultat(resultat);
                                   // operations.setStatut(codeStatut);
                                   

                                                try {
                                                            Connection con=dbConnect.getConnection();

                                                        for(OperationT24 op:operations)
                                                        {
                                                            
                                                        
                                                                nooper=operOrion.getRefOper(con,op.getReference_alternative());

                                                                     if(nooper==null)
                                                                     {

                                                                                String sql="INSERT INTO recus(nom, numero, datoper, tentative, etat, fichier,prenom)"
                                                                                        + "VALUES (?, ?, ?, ?, ?, ?, ?)";

                                                                                PreparedStatement st=con.prepareStatement(sql);

                                                                                st.setString(1, op.getNom());
                                                                                st.setString(2, op.getReference_alternative());
                                                                                st.setString(3,datOperation(op.getDateOper()));
                                                                                st.setInt(4, op.getNbEssai());
                                                                                st.setString(5, op.getStatut());
                                                                                st.setString(6, op.getReference_T24());
                                                                                st.setString(7, op.getPrenom());
                                                                         

                                                                                st.executeUpdate();
                                                                                
                                                                                j++;
                                                                                st.close();

                                                                                 
                                                                     }
                                                                     else
                                                                     {
                                                                           log=new AppLogger("Insertion impossible la reference existe deja: reference :"+nooper+": Date : "+date+": SUCCES");
                                                                     }

                                                        } 
                                                        if(j>0){
                                                             log=new AppLogger("Insertion donnees :"+date+": SUCCES");
                                                        }
                                                                                                             
                                                        con.close();
                                                        new AppLogger("Deconnection a la base : "
                                                                +new AppLogger().formatageDateHeure());
                                                           
                                                }
                                                        catch (Exception e) 
                                                         {
                                                                   // CheckerPassBIO.stop();
                                                                    log=new AppLogger("Echec enregistrement : "+e.getMessage());
                                                                   
                                                         }
                            }
                 }
          /*  else
            {
                log=new AppLogger("Informations non disponible, code retour: "+resultat);
            }*/
            
            
        }
        
        
        public String datOperation(String datOper){
              Date d=new Date();
              String datOpertaion=datOper.substring(6, 8)+"/"+datOper.substring(4, 6)
                      +"/"+datOper.substring(0, 4);
              SimpleDateFormat sd=new SimpleDateFormat("HH:mm:ss");
                  
                 String s=null;
                     try {
                           s=sd.format(d);
                     } catch (Exception e) {
                         e.printStackTrace();
                     }
               
                 return datOpertaion+" "+s;
            
        }
    
}
