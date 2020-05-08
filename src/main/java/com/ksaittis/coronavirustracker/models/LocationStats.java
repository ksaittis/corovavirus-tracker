package com.ksaittis.coronavirustracker.models;

public class LocationStats {

    private String state;
    private String country;
    private int latestReportedTotal;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getLatestReportedTotal() {
        return latestReportedTotal;
    }

    public void setLatestReportedTotal(int latestReportedTotal) {
        this.latestReportedTotal = latestReportedTotal;
    }
}
