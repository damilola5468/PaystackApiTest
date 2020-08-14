/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PaystackServices;

import Core.ApiConnection;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author DATA PC
 */
public class FetchTransaction {
    
    public void fetchTransaction(String id) throws MalformedURLException ,IOException{
         URL url = new URL (Constants.UrlConstants.PAYSTACK_TRANSACTIONS_FETCH_TRANSACTION);
          ApiConnection connect = new ApiConnection(url);
          connect.connectAndQueryWithGet(id);

    }
}
