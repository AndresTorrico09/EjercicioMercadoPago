package com.andresleonel09.ejerciciomercadopago.Api;

import com.andresleonel09.ejerciciomercadopago.Models.MediosPago;

import java.util.List;

import retrofit2.Call;
import rx.Observable;

/**
 * Created by Andres-PC on 2018-12-05.
 */

public class ApiManager {
    private final MercadoPagoApi api;

    public ApiManager(MercadoPagoApi api) {
        this.api = api;
    }

    public Call<List<MediosPago>> getMediosDePago(String public_key){
        return api.getMediosDePago(public_key);
    }
}
