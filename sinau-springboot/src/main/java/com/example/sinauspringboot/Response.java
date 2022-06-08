package com.example.sinauspringboot;

import org.springframework.http.HttpStatus;

import java.io.Serializable;

public class Response implements Serializable {
     Object data;
     String message;
     HttpStatus status;

    public Response(Object data, String message, HttpStatus status) {
        this.data = data;
        this.message = message;
        this.status = status;
    }
}
