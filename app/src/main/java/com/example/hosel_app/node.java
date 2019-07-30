package com.example.hosel_app;

public class node {
    private String txt;
    private String title;
    public  node(String txt, String title){
        this.txt=txt;
        this.title = title;
    }
    public String getText(){
        return txt;
    }
    public String getTitle(){ return title;}
}
