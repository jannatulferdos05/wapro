package com.iishanto.jsonLoader.Classes;

import com.iishanto.jsonLoader.JsonCallbackInterface;
import com.iishanto.jsonLoader.JsonCallbackManagerInterface;

import java.util.HashMap;

public class JsonCallbackManager implements JsonCallbackManagerInterface {
    HashMap <String, JsonCallbackInterface> callbacks=new HashMap<>();
    public void addCallBack(String callbackName,JsonCallbackInterface callback){
        callbacks.put(callbackName,callback);
    }
    public void addNewJson(String json){

    }
}
