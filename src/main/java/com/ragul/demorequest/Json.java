package com.ragul.demorequest;

import org.joda.time.DateTime;

public class Json {
    private String policyNumber;
    private int alphanumeric;
    private int topupPlan;
    private DateTime topupDate;
    private int premium;
    private int premiumWithTaxes;

    public Json(String policyNumber, int alphanumeric, int topupPlan, DateTime topupDate, int premium, int premiumWithTaxes) {
        this.policyNumber = policyNumber;
        this.alphanumeric = alphanumeric;
        this.topupPlan = topupPlan;
        this.topupDate = topupDate;
        this.premium = premium;
        this.premiumWithTaxes = premiumWithTaxes;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public int getAlphanumeric() {
        return alphanumeric;
    }

    public void setAlphanumeric(int alphanumeric) {
        this.alphanumeric = alphanumeric;
    }

    public int getTopupPlan() {
        return topupPlan;
    }

    public void setTopupPlan(int topupPlan) {
        this.topupPlan = topupPlan;
    }

    public DateTime getTopupDate() {
        return topupDate;
    }

    public void setTopupDate(DateTime topupDate) {
        this.topupDate = topupDate;
    }

    public int getPremium() {
        return premium;
    }

    public void setPremium(int premium) {
        this.premium = premium;
    }

    public int getPremiumWithTaxes() {
        return premiumWithTaxes;
    }

    public void setPremiumWithTaxes(int premiumWithTaxes) {
        this.premiumWithTaxes = premiumWithTaxes;
    }
}
