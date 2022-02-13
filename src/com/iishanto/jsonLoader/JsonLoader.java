package com.iishanto.jsonLoader;

import java.io.InputStream;

public class JsonLoader implements JsonLoaderInterface{
    @Override
    public void startFromInputStream(InputStream inputStream) {
        /*
        Create a thread that will read and segment json from input stream and then put it on a stack
         */
    }

    /*
    Will return true if the json stack is not empty
     */
    @Override
    public boolean hasJson() {
        return false;
    }

    /*
    Will return the topmost value of the stack
     */
    @Override
    public String topJson() {
        return null;
    }

    /*
    Will remove the topmost json from the stack
     */
    @Override
    public void popJson() {

    }
}
