package com.example.microservice1;

public class MessageDTO extends MessageFromMicro2DTO{
    private Long createdDate;

    public MessageDTO(Long id, String body) {
        super(id, body);

    }

    public Long getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Long createdDate) {
        this.createdDate = createdDate;
    }
}
