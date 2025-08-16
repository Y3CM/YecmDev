package com.devsenior.yecm;

public class Document {
    private String title;
    
    public Document(String title) {
        this.title = title;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    @Override
    public String toString() {
        return "Document: [" + title + "]";
    }

}
