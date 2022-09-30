package com.example.bio;

public class Bio {
    private final long id;
    private final String content;

    public Bio(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
