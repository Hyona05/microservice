package com.example.microservice1;

public class MessageFromMicro2DTO {
    private Long id;
    private String body;

    public MessageFromMicro2DTO() {
    }

    public MessageFromMicro2DTO(Long id, String body) {
        this.id = id;
        this.body = body;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
