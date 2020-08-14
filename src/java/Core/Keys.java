/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Core;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import org.json.JSONObject;

/**
 *
 * @author DATA PC
 */
class Keys {


    private String TEST_SECRET_KEY;
    private String TEST_PUBLIC_KEY;
    private String LIVE_SECRET_KEY;
    private String LIVE_PUBLIC_KEY;
    String KEY_IN_USE;

    
    void initKeys() throws FileNotFoundException {
        JSONObject keyObject;
        String fileContent = "";
        File file = new File("C:\\Users\\DATA PC\\Documents\\NetBeansProjects\\PaystackApi\\src\\java\\Config\\Keys.json");
        Scanner scanner = new Scanner(file);

        while (scanner.hasNext()) {
            fileContent += scanner.nextLine();
        }
        keyObject = new JSONObject(fileContent).getJSONObject("API_KEYS");

        this.KEY_IN_USE = keyObject.getString("KEY_IN_USE");
        this.TEST_SECRET_KEY = keyObject.getString("TEST_SECRET_KEY");
        this.TEST_PUBLIC_KEY = keyObject.getString("TEST_PUBLIC_KEY");
        this.LIVE_SECRET_KEY = keyObject.getString("LIVE_SECRET_KEY");
        this.LIVE_PUBLIC_KEY = keyObject.getString("LIVE_PUBLIC_KEY");

    }

   
    protected void setTest_SECRET_KEY(String key) {
        this.TEST_SECRET_KEY = key;
    }

   
    protected String getTEST_SECRET_KEY() {
        return this.TEST_SECRET_KEY;
    }

   
    protected void setTEST_PUBLIC_KEY(String key) {
        this.TEST_PUBLIC_KEY = key;
    }

    
    protected String getTEST_PUBLIC_KEY() {
        return this.TEST_PUBLIC_KEY;
    }

   
    protected void setLIVE_SECRET_KEY(String key) {
        this.LIVE_SECRET_KEY = key;
    }

   
    protected String getLIVE_SECRET_KEY() {
        return this.LIVE_SECRET_KEY;
    }

    
    protected void setLIVE_PUBLIC_KEY(String key) {
        this.LIVE_PUBLIC_KEY = key;
    }

    
    protected String getLIVE_PUBLIC_KEY() {
        return this.LIVE_PUBLIC_KEY;
    }

}


