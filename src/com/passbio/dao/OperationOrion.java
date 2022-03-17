/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.passbio.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author yacou.kone
 */
public class OperationOrion {
    
    public OperationOrion(){}
    
    
    public String getRefOper(Connection con,String nooper){
         String sql="SELECT numero  FROM recus where numero=?";
         String retour=null;
         
         try {
             PreparedStatement st=con.prepareStatement(sql);
             st.setString(1, nooper);
             ResultSet rs=st.executeQuery();
                if (rs.next()){
                    retour=rs.getString(1);
                 } 
              st.close();
        } catch (Exception e) {
            retour =null;
        }
  
         
        return retour;
    }
    
    
}
