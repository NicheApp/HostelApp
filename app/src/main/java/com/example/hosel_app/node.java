package com.example.hosel_app;

//syntax of the data
public class node {
    private String txt;//rest text
    private String title;//title of each node
    private String image_url;//for the image
    public  node(String txt, String title, String image_url){
        this.txt=txt;
        this.title = title;
        this.image_url = image_url;
    }
    public String getText(){
        return txt;
    }//for retrurning the text
    public String getTitle(){ return title;}//for returning title
    public String getImage_url(){ return image_url;}
}
