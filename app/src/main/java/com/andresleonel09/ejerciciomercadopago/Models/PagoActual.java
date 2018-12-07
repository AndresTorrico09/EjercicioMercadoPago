package com.andresleonel09.ejerciciomercadopago.Models;

/**
 * Created by atorrico on 6/12/2018.
 */

public class PagoActual {

    private Double monto;
    private String idMetodoPago;
    private String nombreMetodoPago;
    private Integer idBanco;
    private String nombreBanco;
    private String cuotasPago;

    public PagoActual() {

    }

    public String getNombreBanco() {
        return nombreBanco;
    }

    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }

    public String getNombreMetodoPago() {
        return nombreMetodoPago;
    }

    public void setNombreMetodoPago(String nombreMetodoPago) {
        this.nombreMetodoPago = nombreMetodoPago;
    }

    public String getIdMetodoPago() {
        return idMetodoPago;
    }

    public void setIdMetodoPago(String idMetodoPago) {
        this.idMetodoPago = idMetodoPago;
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

    public String getCuotasPago() {
        return cuotasPago;
    }

    public void setCuotasPago(String cuotasPago) {
        this.cuotasPago = cuotasPago;
    }

    @Override
    public String toString() {
        return   "Monto pagado: "   + monto
        + "\n" + "Metodo de pago: " + nombreMetodoPago
        + "\n" + "Banco: "          + nombreBanco
        + "\n" + "Detalle cuotas: " + cuotasPago;
    }


}
