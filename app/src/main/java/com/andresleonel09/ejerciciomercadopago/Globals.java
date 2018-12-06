package com.andresleonel09.ejerciciomercadopago;

import com.andresleonel09.ejerciciomercadopago.Models.MediosPago;

import java.util.List;

/**
 * Created by Andres-PC on 2018-12-06.
 */

public class Globals{
    private static Globals instance;

    // Global variable
    private int data;
    private List<MediosPago> listMP;

    // Restrict the constructor from being instantiated
    private Globals(){}

    public void setData(int d){
        this.data=d;
    }
    public int getData(){
        return this.data;
    }
    public List<MediosPago> getlistMP() {
        return listMP;
    }

    public void setlistMP(List<MediosPago> listMP) {
        this.listMP = listMP;
    }

    public static synchronized Globals getInstance(){
        if(instance==null){
            instance=new Globals();
        }
        return instance;
    }
}