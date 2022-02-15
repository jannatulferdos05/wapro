package com.iishanto.jsonLoader;

public interface JsonCallbackManagerInterface {
    public void addNewJson(String json);
    public void addCallBack(String callbackName,JsonCallbackInterface callback);
}
