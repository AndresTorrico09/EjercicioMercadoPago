package com.andresleonel09.ejerciciomercadopago.Models;

/**
 * Created by atorrico on 6/12/2018.
 */

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CuotasPago {

    @SerializedName("payment_method_id")
    @Expose
    private String paymentMethodId;
    @SerializedName("payment_type_id")
    @Expose
    private String paymentTypeId;
    @SerializedName("issuer")
    @Expose
    private Issuer issuer;
    @SerializedName("processing_mode")
    @Expose
    private String processingMode;
    @SerializedName("merchant_account_id")
    @Expose
    private Object merchantAccountId;
    @SerializedName("payer_costs")
    @Expose
    private List<PayerCost> payerCosts = null;

    public String getPaymentMethodId() {
        return paymentMethodId;
    }

    public void setPaymentMethodId(String paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }

    public String getPaymentTypeId() {
        return paymentTypeId;
    }

    public void setPaymentTypeId(String paymentTypeId) {
        this.paymentTypeId = paymentTypeId;
    }

    public Issuer getIssuer() {
        return issuer;
    }

    public void setIssuer(Issuer issuer) {
        this.issuer = issuer;
    }

    public String getProcessingMode() {
        return processingMode;
    }

    public void setProcessingMode(String processingMode) {
        this.processingMode = processingMode;
    }

    public Object getMerchantAccountId() {
        return merchantAccountId;
    }

    public void setMerchantAccountId(Object merchantAccountId) {
        this.merchantAccountId = merchantAccountId;
    }

    public List<PayerCost> getPayerCosts() {
        return payerCosts;
    }

    public void setPayerCosts(List<PayerCost> payerCosts) {
        this.payerCosts = payerCosts;
    }

    public class Issuer {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("secure_thumbnail")
        @Expose
        private String secureThumbnail;
        @SerializedName("thumbnail")
        @Expose
        private String thumbnail;

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

    }

    public class PayerCost {

        @SerializedName("installments")
        @Expose
        private int installments;
        @SerializedName("installment_rate")
        @Expose
        private float installmentRate;
        @SerializedName("discount_rate")
        @Expose
        private int discountRate;
        @SerializedName("labels")
        @Expose
        private List<String> labels = null;
        @SerializedName("installment_rate_collector")
        @Expose
        private List<String> installmentRateCollector = null;
        @SerializedName("min_allowed_amount")
        @Expose
        private int minAllowedAmount;
        @SerializedName("max_allowed_amount")
        @Expose
        private int maxAllowedAmount;
        @SerializedName("recommended_message")
        @Expose
        private String recommendedMessage;
        @SerializedName("installment_amount")
        @Expose
        private float installmentAmount;
        @SerializedName("total_amount")
        @Expose
        private float totalAmount;

        public int getInstallments() {
            return installments;
        }

        public void setInstallments(int installments) {
            this.installments = installments;
        }

        public float getInstallmentRate() {
            return installmentRate;
        }

        public void setInstallmentRate(float installmentRate) {
            this.installmentRate = installmentRate;
        }

        public int getDiscountRate() {
            return discountRate;
        }

        public void setDiscountRate(int discountRate) {
            this.discountRate = discountRate;
        }

        public List<String> getLabels() {
            return labels;
        }

        public void setLabels(List<String> labels) {
            this.labels = labels;
        }

        public List<String> getInstallmentRateCollector() {
            return installmentRateCollector;
        }

        public void setInstallmentRateCollector(List<String> installmentRateCollector) {
            this.installmentRateCollector = installmentRateCollector;
        }

        public int getMinAllowedAmount() {
            return minAllowedAmount;
        }

        public void setMinAllowedAmount(int minAllowedAmount) {
            this.minAllowedAmount = minAllowedAmount;
        }

        public int getMaxAllowedAmount() {
            return maxAllowedAmount;
        }

        public void setMaxAllowedAmount(int maxAllowedAmount) {
            this.maxAllowedAmount = maxAllowedAmount;
        }

        public String getRecommendedMessage() {
            return recommendedMessage;
        }

        public void setRecommendedMessage(String recommendedMessage) {
            this.recommendedMessage = recommendedMessage;
        }

        public float getInstallmentAmount() {
            return installmentAmount;
        }

        public void setInstallmentAmount(float installmentAmount) {
            this.installmentAmount = installmentAmount;
        }

        public float getTotalAmount() {
            return totalAmount;
        }

        public void setTotalAmount(float totalAmount) {
            this.totalAmount = totalAmount;
        }

    }

}