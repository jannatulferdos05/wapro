package com.iishanto.jsonLoader;

import java.io.InputStream;

public interface JsonLoaderInterface {
    public void startFromInputStream(InputStream inputStream, JsonCallbackManagerInterface jsonCallbackManagerInterface);
}
