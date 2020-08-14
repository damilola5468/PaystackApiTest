/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import Core.ApiConnection;
import PaystackServices.FetchTransaction;
import PaystackServices.InitializeTransaction;
import PaystackServices.ListTransactions;
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

//         Initialze Transactions
        
        HashMap queryMap = new HashMap<String, String>();
        queryMap.put("email", "lorlahstrings@gmail.com");
        queryMap.put("amount", "100000");
        InitializeTransaction init = new InitializeTransaction();
        init.init(queryMap);
        
        
//          Verify Transaction
        
//            VerifyTransaction verify = new VerifyTransaction ();
//            verify.verify("ux3scgacrg");
 
        
//        List Transactions
        
//        ListTransactions  list = new ListTransactions ();
//        list.ListAll();       
         
        
            


    }
    
}
