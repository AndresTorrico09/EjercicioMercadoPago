package com.andresleonel09.ejerciciomercadopago;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Spinner;

import com.andresleonel09.ejerciciomercadopago.Api.MercadoPagoApi;
import com.andresleonel09.ejerciciomercadopago.Api.MercadoPagoService;
import com.andresleonel09.ejerciciomercadopago.Models.MediosPago;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.HttpException;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class MediosDePagoActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medios_de_pago);

        Globals g = Globals.getInstance();
        ArrayList<ItemData> list=new ArrayList<>();

        for (MediosPago m : g.getlistMP()) {
            list.add(new ItemData(m.getName()));
        }

        Spinner sp=(Spinner)findViewById(R.id.spinner);
        SpinnerAdapter adapter=new SpinnerAdapter(this, R.layout.layout_combo,R.id.txt,list);
        sp.setAdapter(adapter);





        //OTRA FORMA DE LLAMAR A LAS APIs

/*
        String BASE_URL = "https://api.mercadopago.com/v1/";

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();

        MercadoPagoApi apiService = retrofit.create(MercadoPagoApi.class);

        // Get the observable User object
        try{
            Observable<List<MediosPago>> call = apiService.getMediosDePago("444a9ef5-8a6b-429f-abdf-587639155d88");
            // To define where the work is done, we can use `observeOn()` with Retrofit
            // This means the result is handed to the subscriber on the main thread
            call.subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(new Subscriber<List<MediosPago>>() {
                        @Override
                        public void onNext(List<MediosPago> user) {
                            String u = "";
                        }

                        @Override
                        public void onCompleted() {
                            String a = "";
                        }

                        @Override
                        public void onError(Throwable e) {
                            // cast to retrofit.HttpException to get the response code
                            Throwable exx = e;
                        }
                    });
        }catch (Exception e){
            Exception exx = e;
        }
*/




    }
}
