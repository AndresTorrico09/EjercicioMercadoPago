package com.andresleonel09.ejerciciomercadopago.Models;

/**
 * Created by Andres-PC on 2018-12-05.
 */

public class ItemComboData {

    private String id;
    private String text;
    private Integer imageId;

    public ItemComboData(String id, String text, Integer imageId){
        this.id=id;
        this.text=text;
        this.imageId=imageId;
    }

    public ItemComboData(String text){
        this.text=text;
    }

    public String getText(){
        return text;
    }

    public Integer getImageId(){
        return imageId;
    }

    public String getId(){
        return id;
    }
}