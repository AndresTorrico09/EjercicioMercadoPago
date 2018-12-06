package com.andresleonel09.ejerciciomercadopago.Api;

import com.andresleonel09.ejerciciomercadopago.Models.MediosPago;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Query;
import rx.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Andres-PC on 2018-12-05.
 */

public interface MercadoPagoApi {

    @GET("payment_methods")
    Call<List<MediosPago>> getMediosDePago(@Query("public_key") String public_key);

/*    @GET("group/{id}/users")
    Observable<List<User>> groupList(@Path("id") int groupId, @Query("sort") String sort);*/
/*
    @POST("users/new")
    Call<User> createUser(@Body User user);*/
}
