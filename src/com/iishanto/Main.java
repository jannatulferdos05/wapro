package com.iishanto;

import com.iishanto.jsonLoader.*;
import com.iishanto.jsonLoader.Classes.JsonCallbackManager;
import com.iishanto.jsonLoader.Classes.JsonLoader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) {
        /*
        @ Unit testing JsonLoader class
         */
        JsonLoaderInterface jsonLoader=new JsonLoader();
        String cwd=System.getProperty("user.dir");
        JsonCallbackManagerInterface jsonCallbackManager=new JsonCallbackManager();
        jsonCallbackManager.addCallBack("userInformation", new JsonCallbackInterface() {
            @Override
            public void execute(Object jsonObject) {
                System.out.printf("JSON OBJECT FOUND FOR USER INFORMATION");
            }
        });

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    jsonLoader.startFromInputStream(new FileInputStream(new File(cwd+"/src/com/iishanto/test/samplejson.json")),jsonCallbackManager);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
