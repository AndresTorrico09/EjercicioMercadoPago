package com.andresleonel09.ejerciciomercadopago.Api;

import com.andresleonel09.ejerciciomercadopago.Models.Banco;
import com.andresleonel09.ejerciciomercadopago.Models.CuotasPago;
import com.andresleonel09.ejerciciomercadopago.Models.MedioDePago;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Query;
import retrofit2.http.GET;

/**
 * Created by Andres-PC on 2018-12-05.
 */

public interface MercadoPagoApi {

    @GET("payment_methods")
    Call<List<MedioDePago>> getMediosDePago(@Query("public_key") String public_key);

    @GET("payment_methods/card_issuers")
    Call<List<Banco>> getBancos(@Query("public_key") String public_key
                               ,@Query("payment_method_id") String payment_method_id);

    @GET("payment_methods/installments")
    Call<CuotasPago> getCuotasPago(@Query("public_key") String public_key
                                   , @Query("amount") String amount
                                   , @Query("payment_method_id") String payment_method_id
                                   , @Query("issuer.id") String issuer_id);
}
