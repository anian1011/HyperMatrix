package com.hypermatrix.dto;

import org.springframework.stereotype.Component;

/**
 * Created by anian on 2016/6/18.
 */
public class MessageDto {
    private String backUrl;
    private String message;

    public String getBackUrl() {
        return backUrl;
    }

    public void setBackUrl(String backUrl) {
        this.backUrl = backUrl;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public MessageDto(String backUrl, String message) {
        this.backUrl = backUrl;
        this.message = message;
    }
}
