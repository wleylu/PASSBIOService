/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.passbio.dao;

//import com.melware.services.MBS;
//import com.melware.services.MBS_Service;
/*
import com.cbs.orion.services.AMOBILE;
import com.temenos.services.EnquiryInput;
import com.temenos.services.EnquiryInputCollection;
import com.temenos.services.ObjectFactory;
import com.temenos.services.Status;
import com.temenos.services.T24WebServicesImpl;
import com.temenos.services.TNAALRTMVTType;
import com.temenos.services.TNAGETMVTType;
import com.temenos.services.TNAGETSOLDEType;
import com.temenos.services.TNALISTTRXType;
import com.temenos.services.WebRequestCommon;
*/
import com.passbio.bean.ConfigInfos;
import com.passbio.log.AppLogger;
import com.passbio.service.EnquiryInput;
import com.passbio.service.EnquiryInputCollection;
import com.passbio.service.ObjectFactory;
import com.passbio.service.Status;
import com.passbio.service.T24WebServicesImpl;
import com.passbio.service.TNAGETTRXPASS;
import com.passbio.service.TNAGETTRXPASSType;
import com.passbio.service.TNATXNPASSBIOType;
import com.passbio.service.WebRequestCommon;
import java.io.IOException;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.text.ParseException;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import javax.xml.namespace.QName;
import javax.xml.ws.Holder;
import javax.xml.ws.Service;

/*
 *
 * @author Melarga.COULIBALY
 */

public class InterfacePB {

//   private MBS port;
   private Service service;
   private T24WebServicesImpl t24port;
  // private AMOBILE orionport;
   private ObjectFactory objfact;
   private WebRequestCommon wrqc;
   private ConfigInfos config;
   public String filiale;
   public String viewaccount="yes";
   public String oldaccount="yes";
 //  private boolean t24migration=true;

 /**
 *
 * Constructeur Par defaut.
 * Ce constructeur cree un port pour l'utilisation du web Service avec l'adresse interne
 */
   

 /**
 *
 * Constructeur avec adresse de la forme adresseip:port
 * Ce constructeur cree un port pour l'utilisation du web Service avec l'adresse mis en parametre
 * @param filiale
     * @param viewacct
     * @param oldaccount
 */

 
           
  
    @SuppressWarnings("CallToPrintStackTrace")
    public InterfacePB() {
        
              AppLogger log;
              String testUrl=null;
                      
       // Service service;
//      System.out.println("Filiale="+filiale+" , ConfigFiliales="+config.getOrionfiliales());
//     System.out.println(config.getT24wsaddress());
            try { // Call Web Service Operation
                //pour descativer la sécurité SSL 
                
                       

                config=new ConfigInfos(); 
                 testUrl=config.getT24wsaddress();
                 if (testUrl.substring(0, 8).toUpperCase().equals("HTTPS://")){
                            sslValidation();
                    }
                
               // AppLogger log;
                URL url = new URL(config.getT24wsaddress());
                QName serviceName = new QName(config.getT24wsdomain(),config.getT24wsname());
                service = Service.create(url, serviceName);
                t24port = service.getPort(T24WebServicesImpl.class);
                objfact = new ObjectFactory();
                wrqc = objfact.createWebRequestCommon();
                wrqc.setUserName(config.getT24userpb());wrqc.setPassword(config.getT24secretpb());wrqc.setCompany(config.getCompanyt24pb());
                //System.out.println("Initialisation interface WS T24");
                
                 
            } catch (Exception ex) {
                try {
                     log=new AppLogger("Impossible de se connecter avec le service SOAP "+new AppLogger().formatageDateHeure());
                } catch (Exception e) {
                    
                  // CheckerPassBIO.stop();
                   e.printStackTrace();
                
                    
                }
               
             //   ex.printStackTrace();
                //CheckerPassBIO.stop();
               
            }
       
       } 
 
   
 /**
 *
 * Renvoie les nouveaux mouvements dans MVTD
  *
  *
     * @return 
 */
    

   @SuppressWarnings({"CallToPrintStackTrace", "ResultOfObjectAllocationIgnored"})
    public String getInfoClient() throws ParseException {
        @SuppressWarnings("UnusedAssignment")
                String resultat = "";
        String result = "";
        //if (this.t24migration == true) {
            List<String> retour=new ArrayList<String>();
    
    //        String resultat = port.getAlertmvt();
           
            EnquiryInputCollection enqColl = objfact.createEnquiryInputCollection();
            EnquiryInput enqIn;enqIn = objfact.createEnquiryInput();
            enqIn.getEnquiryInputCollection().add(enqColl);
            Holder<List<TNAGETTRXPASSType>>  tnagettrxpass0= new Holder<>();

            Holder<Status> status = new Holder<>();
            
            try {
                  
                        //t24port.tnagettrxpass(wrqc, enqIn, status, tnagettrxpass0);
                        t24port.tnagettrxpass(wrqc, enqIn, status, tnagettrxpass0);              
                        retour = tnagettrxpass0.value.get(0).getGTNAGETTRXPASSDetailType().getMTNAGETTRXPASSDetailType().get(0).getMESSAGERETOUR();
            }
              catch(Exception ex) {
                 //
                    new AppLogger("Impossible d'interroger le wservice :"+new AppLogger().formatageDateHeure());
                 ex.printStackTrace(); 
                  //
                 //
                 //CheckerPassBIO.stop();
                  return "NOK";
            }
            resultat = retour.get(0);
        //} else {
         //   resultat = orionport.getAlertmvt(filiale);
           // if (resultat.equalsIgnoreCase("1"))
         //   System.out.println("retour ORION= "+resultat);
       // }
        return resultat;
    }

    
    
    @SuppressWarnings("CallToPrintStackTrace")
    public String getCodeRetour(String refTransaction) {
        @SuppressWarnings("UnusedAssignment")
                String resultat = "";
        
        //if (this.t24migration == true) {
            List<String> retour=new ArrayList<String>();
    
    //        String resultat = port.getAlertmvt();
            EnquiryInputCollection enqColl = objfact.createEnquiryInputCollection();
            EnquiryInput enqIn;enqIn = objfact.createEnquiryInput();
            enqColl.setColumnName("REQUEST");enqColl.setCriteriaValue(refTransaction);enqColl.setOperand("EQ");
            enqIn.getEnquiryInputCollection().add(enqColl);            
            Holder<List<TNATXNPASSBIOType>>  tnatxnpassbiotype0= new Holder<>();
            
            Holder<Status> status = new Holder<>();
            
            
            try {
                //t24port.tnagettrxpass(wrqc, enqIn, status, tnagettrxpass0);
                t24port.tnatxnpassbio(wrqc, enqIn, status, tnatxnpassbiotype0);              
                retour = tnatxnpassbiotype0.value.get(0).getGTNATXNPASSBIODetailType().getMTNATXNPASSBIODetailType().get(0).getRESULTAT();
            }
              catch(Exception ex) {
                  ex.printStackTrace();
                  return "NOK";
            }
            resultat = retour.get(0);
            
         //   System.out.println(resultat);
        //} else {
         //   resultat = orionport.getAlertmvt(filiale);
           // if (resultat.equalsIgnoreCase("1"))
         //   System.out.println("retour ORION= "+resultat);
       // }
        return resultat;
    }

    
    
   @SuppressWarnings("CallToPrintStackTrace")
    private static void sslValidation() {
    try
    {
        // Create a trust manager that does not validate certificate chains
        TrustManager[] trustAllCerts = new TrustManager[] {new X509TrustManager() {
            @Override
            public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                return null;
            }
            @Override
            public void checkClientTrusted(X509Certificate[] certs, String authType) {
            }
            @Override
            public void checkServerTrusted(X509Certificate[] certs, String authType) {
            }
        }
        };

        // Install the all-trusting trust manager
        SSLContext sc = SSLContext.getInstance("SSL");
        sc.init(null, trustAllCerts, new java.security.SecureRandom());
        HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());

        // Create all-trusting host name verifier
        HostnameVerifier allHostsValid = new HostnameVerifier() {
            @Override
            public boolean verify(String hostname, SSLSession session) {
               // System.out.println("caller hostname="+hostname);
                return true;
            }
        };

        // Install the all-trusting host verifier
        HttpsURLConnection.setDefaultHostnameVerifier(allHostsValid);
    }
    catch (NoSuchAlgorithmException | KeyManagementException e) {
        e.printStackTrace();
    }
}

 
   }
   



