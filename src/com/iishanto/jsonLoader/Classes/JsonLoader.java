package com.iishanto.jsonLoader.Classes;

import com.iishanto.jsonLoader.JsonCallbackManagerInterface;
import com.iishanto.jsonLoader.JsonLoaderInterface;

import java.io.InputStream;

public class JsonLoader implements JsonLoaderInterface {
    @Override
    public void startFromInputStream(InputStream inputStream, JsonCallbackManagerInterface jsonCallbackManager) {
        /*
        Create an infinite loop that will read and segment json from input stream and then put it on a stack.
        The loop will break when the inputstream throws any error.

        @ After you've successfully retrieved a json string, call jsonCallbackManager.addNewJson(json_string_here) to
        @ process it.
         */
    }
}
