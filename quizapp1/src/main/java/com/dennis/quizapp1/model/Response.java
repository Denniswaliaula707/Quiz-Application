package com.dennis.quizapp1.model;

public class Response {
   private Integer id;
   private String response;

    public Response(Integer id, String response) {
        this.id = id;
        this.response = response;
    }
    public Integer getId() {
        return id;
}
    public String getResponse() {
        return response;
    }
}