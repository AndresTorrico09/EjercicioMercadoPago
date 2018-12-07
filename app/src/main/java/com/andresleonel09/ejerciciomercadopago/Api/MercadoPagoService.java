package com.andresleonel09.ejerciciomercadopago.Api;

import android.content.Context;

import com.andresleonel09.ejerciciomercadopago.Models.CuotasPago;
import com.andresleonel09.ejerciciomercadopago.Globals;
import com.andresleonel09.ejerciciomercadopago.Models.Banco;
import com.andresleonel09.ejerciciomercadopago.Models.MedioDePago;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

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
        enqueue(new Callback<List<MedioDePago>>() {
            @Override
            public void onResponse(Call<List<MedioDePago>> call, Response<List<MedioDePago>> response) {
                if (response.code() == 200) {
                    Globals.getInstance().setlistMP(response.body());
                }
            }

            @Override
            public void onFailure(Call<List<MedioDePago>> call, Throwable t) {
                Throwable x = t;
            }
        });
    }

    public void getBancos(String public_key, String payment_method_id) {
        apiManager.getBancos(public_key,payment_method_id).
                enqueue(new Callback<List<Banco>>() {
                    @Override
                    public void onResponse(Call<List<Banco>> call, Response<List<Banco>> response) {
                        if (response.code() == 200){
                            Globals.getInstance().setListBancos(response.body());
                        }
                    }

                    @Override
                    public void onFailure(Call<List<Banco>> call, Throwable t) {
                        Throwable x = t;
                    }
                });
    }

    public void getCuotasPago(String public_key, Double amount, String payment_method_id, String issuer_id) {
        apiManager.getCuotasPago(public_key,amount,payment_method_id,issuer_id).
                enqueue(new Callback<List<CuotasPago>>() {
                    @Override
                    public void onResponse(Call<List<CuotasPago>> call, Response<List<CuotasPago>> response) {
                        if (response.code() == 200){
                            Globals.getInstance().setCuotasPago(response.body());
                        }
                    }

                    @Override
                    public void onFailure(Call<List<CuotasPago>> call, Throwable t) {
                        Throwable x = t;
                    }
                });
    }
}
