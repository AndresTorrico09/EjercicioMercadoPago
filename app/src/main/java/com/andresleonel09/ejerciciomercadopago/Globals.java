package com.andresleonel09.ejerciciomercadopago;

import com.andresleonel09.ejerciciomercadopago.Models.Banco;
import com.andresleonel09.ejerciciomercadopago.Models.CuotasPago;
import com.andresleonel09.ejerciciomercadopago.Models.MedioDePago;
import com.andresleonel09.ejerciciomercadopago.Models.PagoActual;

import java.util.List;

/**
 * Created by Andres-PC on 2018-12-06.
 */

public class Globals{
    private static Globals instance;

    // Global variable
    private int data;
    private List<MedioDePago> listMP;
    private List<Banco> listBancos;
    private List<CuotasPago> cuotasPago;

    private PagoActual pagoActualActual;

    // Restrict the constructor from being instantiated
    private Globals(){}

    public static synchronized Globals getInstance(){
        if(instance==null){
            instance=new Globals();
        }
        return instance;
    }

    public void setData(int d){
        this.data=d;
    }
    public int getData(){
        return this.data;
    }

    public List<MedioDePago> getlistMP() {
        return listMP;
    }
    public void setlistMP(List<MedioDePago> listMP) {
        this.listMP = listMP;
    }

    public List<Banco> getListBancos() {
        return listBancos;
    }
    public void setListBancos(List<Banco> listBancos) {
        this.listBancos = listBancos;
    }

    public PagoActual getPagoActual() {
        return pagoActualActual;
    }

    public void setPagoActual(PagoActual pagoActualActual) {
        this.pagoActualActual = pagoActualActual;
    }

    public List<CuotasPago> getCuotasPago() {
        return cuotasPago;
    }

    public void setCuotasPago(List<CuotasPago> cuotasPago) {
        this.cuotasPago = cuotasPago;
    }
}