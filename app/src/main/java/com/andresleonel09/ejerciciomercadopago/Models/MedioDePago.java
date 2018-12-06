package com.andresleonel09.ejerciciomercadopago.Models;

/**
 * Created by Andres-PC on 2018-12-05.
 */
import java.lang.reflect.Type;
import java.util.List;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MedioDePago {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("payment_type_id")
    @Expose
    private String paymentTypeId;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("secure_thumbnail")
    @Expose
    private String secureThumbnail;
    @SerializedName("thumbnail")
    @Expose
    private String thumbnail;
    @SerializedName("deferred_capture")
    @Expose
    private String deferredCapture;
    @SerializedName("settings")
    @Expose
    private List<Setting> settings = null;
    @SerializedName("additional_info_needed")
    @Expose
    private List<String> additionalInfoNeeded = null;
    @SerializedName("min_allowed_amount")
    @Expose
    private double minAllowedAmount;
    @SerializedName("max_allowed_amount")
    @Expose
    private double maxAllowedAmount;
    @SerializedName("accreditation_time")
    @Expose
    private double accreditationTime;
    @SerializedName("financial_institutions")
    @Expose
    private List<Object> financialInstitutions = null;
    @SerializedName("processing_modes")
    @Expose
    private List<String> processingModes = null;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPaymentTypeId() {
        return paymentTypeId;
    }

    public void setPaymentTypeId(String paymentTypeId) {
        this.paymentTypeId = paymentTypeId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSecureThumbnail() {
        return secureThumbnail;
    }

    public void setSecureThumbnail(String secureThumbnail) {
        this.secureThumbnail = secureThumbnail;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getDeferredCapture() {
        return deferredCapture;
    }

    public void setDeferredCapture(String deferredCapture) {
        this.deferredCapture = deferredCapture;
    }

    public List<Setting> getSettings() {
        return settings;
    }

    public void setSettings(List<Setting> settings) {
        this.settings = settings;
    }

    public List<String> getAdditionalInfoNeeded() {
        return additionalInfoNeeded;
    }

    public void setAdditionalInfoNeeded(List<String> additionalInfoNeeded) {
        this.additionalInfoNeeded = additionalInfoNeeded;
    }

    public double getMinAllowedAmount() {
        return minAllowedAmount;
    }

    public void setMinAllowedAmount(int minAllowedAmount) {
        this.minAllowedAmount = minAllowedAmount;
    }

    public double getMaxAllowedAmount() {
        return maxAllowedAmount;
    }

    public void setMaxAllowedAmount(int maxAllowedAmount) {
        this.maxAllowedAmount = maxAllowedAmount;
    }

    public double getAccreditationTime() {
        return accreditationTime;
    }

    public void setAccreditationTime(int accreditationTime) {
        this.accreditationTime = accreditationTime;
    }

    public List<Object> getFinancialInstitutions() {
        return financialInstitutions;
    }

    public void setFinancialInstitutions(List<Object> financialInstitutions) {
        this.financialInstitutions = financialInstitutions;
    }

    public List<String> getProcessingModes() {
        return processingModes;
    }

    public void setProcessingModes(List<String> processingModes) {
        this.processingModes = processingModes;
    }

    public class Setting {

        @SerializedName("card_number")
        @Expose
        private CardNumber cardNumber;
        @SerializedName("bin")
        @Expose
        private Bin bin;
        @SerializedName("security_code")
        @Expose
        private SecurityCode securityCode;

        public CardNumber getCardNumber() {
            return cardNumber;
        }

        public void setCardNumber(CardNumber cardNumber) {
            this.cardNumber = cardNumber;
        }

        public Bin getBin() {
            return bin;
        }

        public void setBin(Bin bin) {
            this.bin = bin;
        }

        public SecurityCode getSecurityCode() {
            return securityCode;
        }

        public void setSecurityCode(SecurityCode securityCode) {
            this.securityCode = securityCode;
        }


        public class Bin {

            @SerializedName("pattern")
            @Expose
            private String pattern;
            @SerializedName("installments_pattern")
            @Expose
            private String installmentsPattern;
            @SerializedName("exclusion_pattern")
            @Expose
            private Object exclusionPattern;

            public String getPattern() {
                return pattern;
            }

            public void setPattern(String pattern) {
                this.pattern = pattern;
            }

            public String getInstallmentsPattern() {
                return installmentsPattern;
            }

            public void setInstallmentsPattern(String installmentsPattern) {
                this.installmentsPattern = installmentsPattern;
            }

            public Object getExclusionPattern() {
                return exclusionPattern;
            }

            public void setExclusionPattern(Object exclusionPattern) {
                this.exclusionPattern = exclusionPattern;
            }

        }

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
    }
}