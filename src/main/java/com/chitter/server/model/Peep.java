package com.chitter.server.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotEmpty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "peeps")
public class Peep {

    @Id
    @JsonProperty("_id")
    private String _id;

    @JsonProperty("name")
    @NotEmpty(message = "Must include name")
    private String name;

    @JsonProperty("username")
    @NotEmpty(message = "Must include username")
    private String username;

    @JsonProperty("message")
    @NotEmpty(message = "Must include message")
    private String message;

    @JsonProperty("timestamp")
    @NotEmpty(message = "Must include timestamp")
    private String timestamp;

    public Peep() {}

    public Peep(String name, String username, String message, String timestamp) {
        this.name = name;
        this.username = username;
        this.message = message;
        this.timestamp = timestamp;
    }

    public String getId(){
        return this._id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void  setUsername(String username) {
        this.username = username;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Peep [_id:" + this._id
                + ", username: " + this.username
                + ", name: " + this.name
                + ", message: " + this.message
                + ", timestamp: " + this.timestamp + "]";
    }

}
