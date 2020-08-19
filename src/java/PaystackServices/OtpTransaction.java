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
import java.util.HashMap;

/**
 *
 * @author DATA PC
 */
public class OtpTransaction {
    public void MakeOtpTransaction (HashMap<String, String> params) throws MalformedURLException, IOException{
        
         URL url = new URL (Constants.UrlConstants.PAYSTACK_CHARGE_OTP);
          ApiConnection connect = new ApiConnection(url);
          connect.connectAndQueryWithPost(params);

    }
}
