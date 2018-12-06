package com.andresleonel09.ejerciciomercadopago;

import android.app.Application;
import android.content.res.Configuration;

import com.andresleonel09.ejerciciomercadopago.Api.ApiManager;
import com.andresleonel09.ejerciciomercadopago.Api.MercadoPagoApi;
import com.andresleonel09.ejerciciomercadopago.Api.MercadoPagoService;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Andres-PC on 2018-12-05.
 */

public class MercadoPagoAplication extends Application {

    public static final String BASE_URL = "https://api.mercadopago.com/v1/";
    public static final String PUBLIC_KEY = "444a9ef5-8a6b-429f-abdf-587639155d88";

    private MercadoPagoApi api;

    @Override
    public void onCreate() {
        super.onCreate();

        api = provideMercadoPagoApi();
        ApiManager apiManager = new ApiManager(api);
        MercadoPagoService.getInstance().init(this, apiManager);

        //Inicio el servicio de busqueda de medio de pago
        MercadoPagoService.getInstance().getMediosDePago(PUBLIC_KEY);
    }

    private MercadoPagoApi provideMercadoPagoApi() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit.create(MercadoPagoApi.class);
    }

    // Called by the system when the device configuration changes while your component is running.
    // Overriding this method is totally optional!
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

    // This is called when the overall system is running low on memory,
    // and would like actively running processes to tighten their belts.
    // Overriding this method is totally optional!
    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }
}
