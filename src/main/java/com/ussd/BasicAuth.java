package com.ussd;

import javax.xml.bind.DatatypeConverter;

public class BasicAuth {

    static final String USERNAME = "Afrocast";
    static final String PASSWORD = "Tshiamo#21";

    public BasicAuth(){

    }

    public String getAuthorizationHeader() {
        return "Basic " + encodeBase64();
    }

    private String encodeBase64() {
        String userPass = USERNAME + ":" + PASSWORD;
        return DatatypeConverter.printBase64Binary(userPass.getBytes());
    }
}
