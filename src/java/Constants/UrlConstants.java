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
    
   //URL definition for customer verification
    public static final String PAYSTACK_VERIFY_CUSTOMER = BASE_API_ENDPOINT + "/bvn/match";
    public static final String PAYSTACK_GET_CUSTORMER_INFO = BASE_API_ENDPOINT + "/bank/resolve_bvn/";
    public static final String PAYSTACK_CONFIRM_ACCOUNT_NUMBER = BASE_API_ENDPOINT + "/bank/resolve";
     
   //URL definition to get list of banks in nigeria 
    public static final String PAYSTACK_GET_ALL_BANKS = BASE_API_ENDPOINT + "/bank";
   
    //URL definition to get list of country
    public static final String PAYSTACK_GET_ALL_COUNTRY = BASE_API_ENDPOINT + "/country";
    
    //URL definition to get list of states
    public static final String PAYSTACK_GET_LIST_STATES = BASE_API_ENDPOINT + "/address_verification/states"; 
    
    //URL definition to get Otp charge
    public static final String PAYSTACK_CHARGE_OTP = BASE_API_ENDPOINT + "/charge/submit_otp"; 
    
    //URL definition to initiate charge
    public static final String PAYSTACK_INIT_CHARGE = BASE_API_ENDPOINT + "/charge"; 
 
    //URL definition to resend Otp
    public static final String PAYSTACK_TO_RESEND_OTP = BASE_API_ENDPOINT + "/transfer/resend_otp"; 

    
     
     
     

}


