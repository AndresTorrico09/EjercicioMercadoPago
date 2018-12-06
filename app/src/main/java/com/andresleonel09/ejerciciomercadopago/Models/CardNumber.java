package com.andresleonel09.ejerciciomercadopago.Models;

/**
 * Created by Andres-PC on 2018-12-05.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CardNumber {

    @SerializedName("validation")
    @Expose
    private String validation;
    @SerializedName("length")
    @Expose
    private int length;

    public String getValidation() {
        return validation;
    }

    public void setValidation(String validation) {
        this.validation = validation;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

}