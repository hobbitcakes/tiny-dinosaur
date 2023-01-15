package com.hobbitcakes.web.tinydinosaur;

import java.io.Serializable;

public class ApplicationVersion implements Serializable {

    private final String version;
    private final String Application;

    public ApplicationVersion(String version, String application) {
        this.version = version;
        Application = application;
    }

    public String getVersion() {
        return version;
    }

    public String getApplication() {
        return Application;
    }
}
