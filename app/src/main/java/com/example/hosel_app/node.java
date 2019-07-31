package com.example.hosel_app;

//syntax of the data
public class node {
    private String txt;//rest text
    private String title;//title of each node
    public  node(String txt, String title){
        this.txt=txt;
        this.title = title;
    }
    public String getText(){
        return txt;
    }//for retrurning the text
    public String getTitle(){ return title;}//for returning title
}
