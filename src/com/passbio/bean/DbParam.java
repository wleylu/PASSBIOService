/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.passbio.bean;

/**
 *
 * @author yacou.kone
 */
public class DbParam {
    private String driverDb;
    private String userDb;
    private String paasDb;
    private String urlDb;
    
    public DbParam(){}

    public String getDriverDb() {
        return driverDb;
    }

    public void setDriverDb(String driverDb) {
        this.driverDb = driverDb;
    }

    public String getUserDb() {
        return userDb;
    }

    public void setUserDb(String userDb) {
        this.userDb = userDb;
    }

    public String getPaasDb() {
        return paasDb;
    }

    public void setPaasDb(String paasDb) {
        this.paasDb = paasDb;
    }

    public String getUrlDb() {
        return urlDb;
    }

    public void setUrlDb(String urlDb) {
        this.urlDb = urlDb;
    }
    
     
}
