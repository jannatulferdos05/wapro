package com.iishanto;

import com.iishanto.jsonLoader.JsonLoader;
import com.iishanto.jsonLoader.JsonLoaderInterface;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) {
        /*
        @ Unit testing JsonLoader class
         */
        JsonLoaderInterface jsonLoader=new JsonLoader();
        try {
            String cwd=System.getProperty("user.dir");
            jsonLoader.startFromInputStream(new FileInputStream(new File(cwd+"/src/com/iishanto/test/samplejson.json")));
            new Thread(new Runnable() {
                @Override
                public void run() {
                    while (true){
                        if(jsonLoader.hasJson()){
                            jsonLoader.topJson();
                        }
                    }
                }
            }).start();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
