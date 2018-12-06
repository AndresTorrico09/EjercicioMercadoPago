package com.andresleonel09.ejerciciomercadopago;

/**
 * Created by Andres-PC on 2018-12-05.
 */

public class ItemData {

    String text;
    Integer imageId;
    public ItemData(String text, Integer imageId){
        this.text=text;
        this.imageId=imageId;
    }

    public ItemData(String text){
        this.text=text;
    }

    public String getText(){
        return text;
    }

    public Integer getImageId(){
        return imageId;
    }
}