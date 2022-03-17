/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passbioservice;

import com.passbio.dao.CheckerPassBIO;
import java.io.IOException;
import java.text.ParseException;

/**
 *
 * @author yacou.kone
 */
public class PASSBIOService {

    /**
     * @param args the command line arguments
     * 
     * 
     */
   
    public PASSBIOService(){
        
    }
    
    public static void main(String[] args)  {
        // TODO code application logic here
        
        CheckerPassBIO servicePassBio=new CheckerPassBIO();
        servicePassBio.run();
              
       
    }
    
}
