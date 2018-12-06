package com.andresleonel09.ejerciciomercadopago.Models;

/**
 * Created by Andres-PC on 2018-12-05.
 */
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SecurityCode {

    @SerializedName("length")
    @Expose
    private int length;
    @SerializedName("card_location")
    @Expose
    private String cardLocation;
    @SerializedName("mode")
    @Expose
    private String mode;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getCardLocation() {
        return cardLocation;
    }

    public void setCardLocation(String cardLocation) {
        this.cardLocation = cardLocation;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

}