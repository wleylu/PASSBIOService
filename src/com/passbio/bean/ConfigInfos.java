package com.passbio.bean;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author Melarga.COULIBALY
 */
public class ConfigInfos {

    private final String logtype;
    private final String applogdir;
    private final String wsaddress;
    private final String wsdomain;
    private final String wsname;
    private final String t24wsaddress;
    private final String t24wsdomain;
    private final String t24wsname;
    private final String banet24company;
    private final String banet24user;
    private final String banet24secret;
    private final String driver;
    private final String datasource;
    private final String mode;
    private  String dburl;
    private final String dbuser;
    private String mmgdbdriver;
    private String mmgdburl;
    private String mmgdbuser;
    private String mmgdbpassword;
    private String codeserviceperiodique;
    private String codeservicealerte;
    private String orionfiliales;
    private final String dbpassword;
    private final String sendersms;
    private final String dlrurl;
    private final String smscbaci;
    private final String smscbabn;
    private final String smscbatg;
    private final String smscbabf;
    private final String smscbane;
    private final String smscbaml;
    private final String smscbasn;
    private final String smscbacm;
    private final String smscbagb;
    private final String t24userpb;
    private final String t24secretpb;
    private final String companyt24pb;
    
    
    
    public ConfigInfos() throws FileNotFoundException, IOException
    {
        Properties appConfig = new Properties();
        //appConfig.load(new FileInputStream("C:/Projets/PASSBIOService/config")); 
        appConfig.load(new FileInputStream("./config/config.properties")); 
//        appConfig.load(new FileInputStream("C:\\Projets\\ABITigocash\\config\\config.properties"));
        this.applogdir = appConfig.getProperty("APPLOGDIR");
        this.logtype = appConfig.getProperty("LOGTYPE");        
        this.wsaddress = appConfig.getProperty("WSADRESS");
        this.wsdomain = appConfig.getProperty("WSDOMAIN");
        this.wsname = appConfig.getProperty("WSNAME");
        this.t24wsaddress = appConfig.getProperty("T24WSADRESS");
        this.t24wsdomain = appConfig.getProperty("T24WSDOMAIN");
        this.t24wsname = appConfig.getProperty("T24WSNAME");
        this.banet24company = appConfig.getProperty("BANET24COMPANY");
        this.banet24user = appConfig.getProperty("BANET24USER");
        this.banet24secret = appConfig.getProperty("BANET24SECRET");
        this.driver = appConfig.getProperty("DRIVER");
        this.datasource = appConfig.getProperty("DATASOURCE");
        this.mode = appConfig.getProperty("MODE");
        this.dburl = appConfig.getProperty("DBURL");
        this.dbuser = appConfig.getProperty("DBUSER");
        this.dbpassword = appConfig.getProperty("DBPASSWORD");
        this.mmgdbdriver = appConfig.getProperty("MMGDBDRIVER");
        this.mmgdburl = appConfig.getProperty("MMGDBURL");
        this.mmgdbuser = appConfig.getProperty("MMGDBUSER");
        this.mmgdbpassword = appConfig.getProperty("MMGDBPASSWORD");
        this.sendersms = appConfig.getProperty("SENDERSMS");
        this.dlrurl = appConfig.getProperty("DLRURL");
        this.codeserviceperiodique = appConfig.getProperty("CODESERVICEPERIODIQUE");
        this.codeservicealerte = appConfig.getProperty("CODESERVICEALERTES");
        this.orionfiliales = appConfig.getProperty("ORIONFILIALES");
        this.smscbaci = appConfig.getProperty("SMSCBACI");
        this.smscbabn = appConfig.getProperty("SMSCBABN");
        this.smscbatg = appConfig.getProperty("SMSCBATG");
        this.smscbabf = appConfig.getProperty("SMSCBABF");
        this.smscbane = appConfig.getProperty("SMSCBANE");
        this.smscbaml = appConfig.getProperty("SMSCBAML");
        this.smscbasn = appConfig.getProperty("SMSCBASN");
        this.smscbacm = appConfig.getProperty("SMSCBACM");
        this.smscbagb = appConfig.getProperty("SMSCBAGB");
        this.t24userpb=appConfig.getProperty("T24USERPB");
         this.t24secretpb=appConfig.getProperty("T24SECRETPB");
         this.companyt24pb=appConfig.getProperty("COMPANYT24PB");
    }

    public String getCompanyt24pb() {
        return companyt24pb;
    }

    
    public String getT24userpb() {
        return t24userpb;
    }

    public String getT24secretpb() {
        return t24secretpb;
    }
    
    
    

    public String getLogtype() {
        return logtype;
    }

    public String getApplogdir() {
        return applogdir;
    }

    public String getWsaddress() {
        return wsaddress;
    }

    public String getWsdomain() {
        return wsdomain;
    }

    public String getWsname() {
        return wsname;
    }

    public String getDriver() {
        return driver;
    }

    public String getDatasource() {
        return datasource;
    }

    public String getMode() {
        return mode;
    }

    public String getDburl() {
        return dburl;
    }
    public void setDburl(String url) {
        this.dburl=this.dburl+url;
    }

    public String getDbuser() {
        return dbuser;
    }

    public String getDbpassword() {
        return dbpassword;
    }

    public String getMmgdbdriver() {
        return mmgdbdriver;
    }

    public String getMmgdburl() {
        return mmgdburl;
    }

    public String getMmgdbuser() {
        return mmgdbuser;
    }

    public String getMmgdbpassword() {
        return mmgdbpassword;
    }

    public String getSendersms() {
        return sendersms;
    }

    public String getDlrurl() {
        return dlrurl;
    }

    public String getT24wsaddress() {
        return t24wsaddress;
    }

    public String getT24wsdomain() {
        return t24wsdomain;
    }

    public String getT24wsname() {
        return t24wsname;
    }

    public String getBanet24company() {
        return banet24company;
    }

    public String getBanet24user() {
        return banet24user;
    }

    public String getBanet24secret() {
        return banet24secret;
    }

    public String getCodeserviceperiodique() {
        return codeserviceperiodique;
    }

    public String getCodeservicealerte() {
        return codeservicealerte;
    }

    public String getOrionfiliales() {
        return orionfiliales;
    }

    public String getSmscbaci() {
        return smscbaci;
    }

    public String getSmscbabn() {
        return smscbabn;
    }

    public String getSmscbatg() {
        return smscbatg;
    }

    public String getSmscbabf() {
        return smscbabf;
    }

    public String getSmscbane() {
        return smscbane;
    }

    public String getSmscbaml() {
        return smscbaml;
    }

    public String getSmscbasn() {
        return smscbasn;
    }

    public String getSmscbacm() {
        return smscbacm;
    }

    public String getSmscbagb() {
        return smscbagb;
    }
    
    public String getSmsc(String filiale){
        String smsc="";
        if (filiale.equalsIgnoreCase("BACI")) smsc=smscbaci;
        if (filiale.equalsIgnoreCase("BABN")) smsc=smscbabn;
        if (filiale.equalsIgnoreCase("BATG")) smsc=smscbatg;
        if (filiale.equalsIgnoreCase("BABF")) smsc=smscbabf;
        if (filiale.equalsIgnoreCase("BANE")) smsc=smscbane;
        if (filiale.equalsIgnoreCase("BAML")) smsc=smscbaml;
        if (filiale.equalsIgnoreCase("BASN")) smsc=smscbasn;
        if (filiale.equalsIgnoreCase("BACM")) smsc=smscbacm;
        if (filiale.equalsIgnoreCase("BAGB")) smsc=smscbagb;
    
        return smsc;
    }
       
}
