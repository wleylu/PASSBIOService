/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.passbio.dao;

import com.passbio.bean.OperationT24;
import com.passbio.log.AppLogger;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author yacou.kone
 */
public class ServiceResultatJson {
    
    public List<OperationT24> insertResultat(String json){
        //String json=resultat;
        /* json="{\"total\":\"1\",\"data\":[{\"date\":\"20180509\",\"reference_alternative\":\"1000008\","
                + "\"reference_T24\":\"FT1812918QY2\",\"nom\":\"DOSSO\",\"prenom\":\"YLYASSE\"}]}";
        */
        
   
        List<OperationT24> donnees=new ArrayList<>();
        OperationT24 refInfos;
        try {
            InterfacePB servicePB=new InterfacePB();
        } catch (Exception e) {
                try {
                AppLogger lg1=new AppLogger("Impossible de lancer l'interface PassioBIO "+new AppLogger().formatageDateHeure());
                } 
                catch (Exception ex) {
                    ex.printStackTrace();
            }
            
        }
        
   
        if (!json.equals("999"))
        {
            
        
                JSONObject jsonobject=null;
                

                        try {
                                jsonobject = new JSONObject(json);
                                 JSONArray array = jsonobject.getJSONArray("data");
                                 
                                for(int i=0; i<array.length();i++) 
                                {
                                    JSONObject valeurT24 = array.getJSONObject(i);
                                       refInfos=new OperationT24();
                                       refInfos.setDateOper(valeurT24.getString("date"));
                                       refInfos.setReference_alternative(valeurT24.getString("reference_alternative"));
                                       refInfos.setReference_T24(valeurT24.getString("reference_T24"));
                                       refInfos.setNom(valeurT24.getString("nom"));
                                       refInfos.setPrenom(valeurT24.getString("prenom"));
                                       //codeRetour=servicePB.getCodeRetour(refInfos.getReference_T24());
                                       refInfos.setStatut(refInfos.getStatut());
                                       
                                       donnees.add(refInfos);

                                }


                    } 
                        catch (JSONException e) 
                        {
                          e.printStackTrace();
                        }             
        }
        else
        {
            return null;
        }
                
        return donnees;
        
    }
    
    
}
