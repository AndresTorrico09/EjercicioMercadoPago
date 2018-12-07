package com.andresleonel09.ejerciciomercadopago.Api;

import com.andresleonel09.ejerciciomercadopago.Models.Banco;
import com.andresleonel09.ejerciciomercadopago.Models.CuotasPago;
import com.andresleonel09.ejerciciomercadopago.Models.MedioDePago;

import java.util.List;

import retrofit2.Call;

/**
 * Created by Andres-PC on 2018-12-05.
 */

public class ApiManager {
    private final MercadoPagoApi api;

    public ApiManager(MercadoPagoApi api) {
        this.api = api;
    }

    public Call<List<MedioDePago>> getMediosDePago(String public_key){
        return api.getMediosDePago(public_key);
    }

    public Call<List<Banco>> getBancos(String public_key, String payment_method_id){
        return api.getBancos(public_key,payment_method_id);
    }

    public Call<List<CuotasPago>> getCuotasPago(String public_key, Double amount, String payment_method_id, String issuer_id){
        return api.getCuotasPago(public_key,amount,payment_method_id,issuer_id);
    }
}
