package com.api.payload;

import java.util.Date;

public class ErrorDto {

    private String message;
    private Date date;
    private String uri;
    private String status;
    private int statusCode;

    public ErrorDto(String message, Date date, String uri,String status,int statusCode) {
        this.message = message;
        this.date = date;
        this.uri = uri;
        this.status=status;
        this.statusCode=statusCode;

    }

    public String getMessage() {
        return message;
    }

    public Date getDate() {
        return date;
    }

    public String getStatus() {
        return status;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public String getUri() {
        return uri;
    }
}

