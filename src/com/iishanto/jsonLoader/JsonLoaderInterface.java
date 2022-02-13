package com.iishanto.jsonLoader;

import java.io.InputStream;

public interface JsonLoaderInterface {
    public void startFromInputStream(InputStream inputStream);

    public default String getUserJson(){
        return null;
    }
    public default String getPendingMsgJson(){
        return null;
    }
    public default String getActiveStatusJson(){
        return null;
    }
    /*
        return true if json stack is not empty false otherwise
     */
    public boolean hasJson();
    public String topJson();
    public void popJson();
    public default String topAndPop(){
        String json=topJson();
        popJson();
        return json;
    }
}
