package com.tabhi.covid19tracker;

public class CountryClass  {
    private String flag,country,totalcases,todaycases,active,totaldeaths,todaydeaths,recovered,critical,totaltested,continent,population;

    public CountryClass() {
    }

    public CountryClass(String flag, String country, String totalcases, String todaycases, String active, String totaldeaths, String todaydeaths, String recovered, String critical, String totaltested, String continent, String population) {
        this.flag = flag;
        this.country = country;
        this.totalcases = totalcases;
        this.todaycases = todaycases;
        this.active = active;
        this.totaldeaths = totaldeaths;
        this.todaydeaths = todaydeaths;
        this.recovered = recovered;
        this.critical = critical;
        this.totaltested = totaltested;
        this.continent = continent;
        this.population = population;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTotalcases() {
        return totalcases;
    }

    public void setTotalcases(String totalcases) {
        this.totalcases = totalcases;
    }

    public String getTodaycases() {
        return todaycases;
    }

    public void setTodaycases(String todaycases) {
        this.todaycases = todaycases;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getTotaldeaths() {
        return totaldeaths;
    }

    public void setTotaldeaths(String totaldeaths) {
        this.totaldeaths = totaldeaths;
    }

    public String getTodaydeaths() {
        return todaydeaths;
    }

    public void setTodaydeaths(String todaydeaths) {
        this.todaydeaths = todaydeaths;
    }

    public String getRecovered() {
        return recovered;
    }

    public void setRecovered(String recovered) {
        this.recovered = recovered;
    }

    public String getCritical() {
        return critical;
    }

    public void setCritical(String critical) {
        this.critical = critical;
    }

    public String getTotaltested() {
        return totaltested;
    }

    public void setTotaltested(String totaltested) {
        this.totaltested = totaltested;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }
}
