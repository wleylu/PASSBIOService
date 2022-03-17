/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.passbio.database;

import com.passbio.bean.ConfigInfos;
import com.passbio.bean.DbParam;
import java.io.IOException;

/**
 *
 * @author yacou.kone
 */
public class ParamDB {
        
        public ParamDB(){
            
        }
        
        public DbParam getDonnesDb() throws IOException{
            
            DbParam param=new DbParam();
            ConfigInfos infos=new ConfigInfos();
            param.setDriverDb(infos.getDriver());
            param.setPaasDb(infos.getDbpassword());
            param.setUrlDb(infos.getDburl());
            param.setUserDb(infos.getDbuser());
                    
            
            return param;
            
        }
    
}
