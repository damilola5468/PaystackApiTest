/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import Core.ApiConnection;
import PaystackServices.FetchBanks;
import PaystackServices.FetchCountry;
import PaystackServices.FetchTransaction;
import PaystackServices.InitializeTransaction;
import PaystackServices.ListTransactions;
import PaystackServices.OtpTransaction;
import PaystackServices.VerifyTransaction;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;

/**
 *
 * @author DATA PC
 */
public class Test {

    public static void main(String[] args) throws IOException {

//      Initialze Transactions
//      HashMap queryMap = new HashMap<String, String>();
//      queryMap.put("email", "lorlahstrings@gmail.com");
//      queryMap.put("amount", "1000000");
//      InitializeTransaction init = new InitializeTransaction();
//      init.init(queryMap);
           
//      Verify Transaction
//      VerifyTransaction verify = new VerifyTransaction ();
//      verify.verify("81owmjwnjg");
   
//      List Transactions
      ListTransactions  list = new ListTransactions ();
      list.ListAll();       
         
//      List Country
//      FetchCountry fetchcountry = new FetchCountry();
//      fetchcountry.fetchCountry();
        
//      List bank
//      FetchBanks fetchbanks = new FetchBanks();
//      fetchbanks.fetchBanks();
        
//      Charge Through Otp
//      OtpTransaction otptransaction = new OtpTransaction();
//      HashMap otpmap = new HashMap<String , String>();
//      otpmap.put("reference", "81owmjwnjg");
//      otpmap.put("otp", "123456");
//      otptransaction.MakeOtpTransaction(otpmap);
        
            


    }
    
}
