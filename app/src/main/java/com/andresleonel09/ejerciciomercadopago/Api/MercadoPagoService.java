package com.andresleonel09.ejerciciomercadopago.Api;

import android.content.Context;

import com.andresleonel09.ejerciciomercadopago.Globals;
import com.andresleonel09.ejerciciomercadopago.MercadoPagoAplication;
import com.andresleonel09.ejerciciomercadopago.Models.MediosPago;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import rx.Observable;
import rx.functions.Action1;

/**
 * Created by Andres-PC on 2018-12-05.
 */

public class MercadoPagoService {

    static MercadoPagoService instance;
    private Context context;
    private ApiManager apiManager;

    public void init(Context context, ApiManager apiManager){
        this.context = context;
        this.apiManager = apiManager;
    }

    public static MercadoPagoService getInstance() {
        if(instance == null)
            instance = new MercadoPagoService();
        return instance;
    }

    public void getMediosDePago(String public_key) {
        apiManager.getMediosDePago(public_key).
        enqueue(new Callback<List<MediosPago>>() {
            @Override
            public void onResponse(Call<List<MediosPago>> call, Response<List<MediosPago>> response) {
                int statusCode = response.code();

                Globals g = Globals.getInstance();
                g.setlistMP(response.body());
            }

            @Override
            public void onFailure(Call<List<MediosPago>> call, Throwable t) {
                Throwable x = t;
            }
        });
    }
}
