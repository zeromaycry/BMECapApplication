package com.example.student.bmecapapplication;


/**
 * Created by Charles Pritchett on 2/19/2018.
 */

public class Photo {
    private String identity;
    String version;
    int idnum;
    int image;

    public Photo(String name, String ver, int ident, int img){
        this.identity = name;
        this.version = ver;
        this.idnum = ident;
        this.image = img;
    }

    public String getName(){return identity;}

    public String getVersion(){return version;}

    public int getImage(){
        return image;
    }
    public int getId(){return idnum;}

}
