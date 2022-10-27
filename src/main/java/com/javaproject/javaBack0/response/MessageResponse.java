package com.javaproject.javaBack0.response;

public class MessageResponse {

    boolean success = true;
    String message;

    public MessageResponse(String message) {this.message = message;}

    public MessageResponse(boolean success, String message){
        this.success = success;
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success){
        this.success = success;
    }

    public String getMessage(){ return message;}

    public void setMessage(String message){this.message = message;}
}
