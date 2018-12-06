package com.andresleonel09.ejerciciomercadopago.Models;

/**
 * Created by atorrico on 6/12/2018.
 */

public class PagoActual {

    private Double monto;
    private String metodo_pago;
    private Integer idBanco;

    public PagoActual() {

    }
    public PagoActual(Double monto, String metodo_pago, Integer idBanco) {
        this.monto = monto;
        this.metodo_pago = metodo_pago;
        this.idBanco = idBanco;
    }

    public String getMetodo_pago() {
        return metodo_pago;
    }

    public void setMetodo_pago(String metodo_pago) {
        this.metodo_pago = metodo_pago;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public Integer getIdBanco() {
        return idBanco;
    }

    public void setIdBanco(Integer idBanco) {
        this.idBanco = idBanco;
    }
}
