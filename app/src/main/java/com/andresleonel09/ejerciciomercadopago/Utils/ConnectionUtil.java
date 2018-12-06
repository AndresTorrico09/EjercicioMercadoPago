package com.andresleonel09.ejerciciomercadopago.Utils;

import android.content.Context;
import android.net.ConnectivityManager;

/**
 * Created by atorrico on 6/12/2018.
 */

public class ConnectionUtil {

    public static boolean isInternetAvailable (Context context) {
        try {
            final ConnectivityManager connectivityManager = ((ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE));
            return connectivityManager.getActiveNetworkInfo() != null && connectivityManager.getActiveNetworkInfo().isConnected();

        } catch (Exception e) {
            return false;
        }
    }

}