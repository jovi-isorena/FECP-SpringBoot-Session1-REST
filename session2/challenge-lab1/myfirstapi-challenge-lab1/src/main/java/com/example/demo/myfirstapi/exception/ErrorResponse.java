package com.example.demo.myfirstapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ErrorResponse {
    LocalDateTime timestamp;
    HttpStatus httpStatus;
    String url;
    String method;
    Map<String,String> errorMesages;

    public ErrorResponse(LocalDateTime timestamp, HttpStatus httpStatus, String url, String method, List<FieldError> fieldErrors) {
        this.timestamp = timestamp;
        this.httpStatus = httpStatus;
        this.url = url;
        this.method = method;
        this.errorMesages = getErrorMessages(fieldErrors);
    }

    public ErrorResponse(LocalDateTime now, HttpStatus httpStatus, String servletPath, String method) {
        this.timestamp = now;
        this.httpStatus = httpStatus;
        this.url = servletPath;
        this.method = method;
    }

    private Map<String, String> getErrorMessages(List<FieldError> fieldErrors) {
        if(fieldErrors.isEmpty()) return new HashMap<>();
        Map<String, String> msgs = new HashMap<>();
        for (FieldError fieldError: fieldErrors){
            msgs.put(fieldError.getField(), fieldError.getDefaultMessage());
        }
        return msgs;

    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public Map<String, String> getErrorMesages() {
        return errorMesages;
    }

    public String getMethod() {
        return method;
    }

    public String getUrl() {
        return url;
    }

}
