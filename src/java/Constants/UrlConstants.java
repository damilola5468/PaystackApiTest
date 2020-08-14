/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constants;

/**
 *
 * @author DATA PC
 */
public class UrlConstants {
    
  

    private final static String BASE_API_ENDPOINT = "https://api.paystack.co";

    //URL definitions for transaction endpoints
    public static final String PAYSTACK_TRANSACTIONS_INITIALIZE_TRANSACTION = BASE_API_ENDPOINT + "/transaction/initialize";
    public static final String PAYSTACK_TRANSACTIONS_VERIFY_TRANSACTION = BASE_API_ENDPOINT + "/transaction/verify/";
    public static final String PAYSTACK_TRANSACTIONS_LIST_TRANSACTIONS = BASE_API_ENDPOINT + "/transaction";
    public static final String PAYSTACK_TRANSACTIONS_FETCH_TRANSACTION = BASE_API_ENDPOINT + "/transaction/";
    public static final String PAYSTACK_TRANSACTIONS_CHARGE_AUTHORIZATION = BASE_API_ENDPOINT + "/transaction/charge_authorization";
    public static final String PAYSTACK_TRANSACTIONS_CHARGE_TOKEN = BASE_API_ENDPOINT + "/transaction/charge_token";
    public static final String PAYSTACK_TRANSACTIONS_EXPORT_TRANSACTIONS = BASE_API_ENDPOINT + "/transaction/export";

   //URL definitions for page endpoint
    public static final String PAYSTACK_PAGES_CREATE_PAGE = BASE_API_ENDPOINT + "/page";
    public static final String PAYSTACK_PAGES_LIST_PAGES = BASE_API_ENDPOINT + "/page";
    public static final String PAYSTACK_PAGES_FETCH_PAGE = BASE_API_ENDPOINT + "/page/";
    public static final String PAYSTACK_PAGES_UPDATE_PAGE = BASE_API_ENDPOINT + "/page/";

}


