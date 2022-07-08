package com.laboratorio.lab2.models;

import javax.persistence.*;

@Entity
@Table(name = "Aqui2")
public class TablaModel {
    
    @Column
    @Id
    private String id;
    @Column
    private String series_name;
    @Column
    private String series_code;
    @Column
    private String country_name;
    @Column
    private String country_code;
    @Column
    private String yr2010;
    @Column
    private String yr2011;
    @Column
    private String yr2012;
    @Column
    private String yr2013;
    @Column
    private String yr2014;
    @Column
    private String yr2015;
    @Column
    private String yr2016;
    @Column
    private String yr2017;
    @Column
    private String yr2018;
    @Column
    private String yr2019;
    @Column
    private String yr2020;
    
    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }


    public String getSeries_name() {
        return series_name;
    }


    public void setSeries_name(String series_name) {
        this.series_name = series_name;
    }


    public String getSeries_code() {
        return series_code;
    }


    public void setSeries_code(String series_code) {
        this.series_code = series_code;
    }


    public String getCountry_name() {
        return country_name;
    }


    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }


    public String getCountry_code() {
        return country_code;
    }


    public void setCountry_code(String country_code) {
        this.country_code = country_code;
    }


    public String getYr2010() {
        return yr2010;
    }


    public void setYr2010(String yr2010) {
        this.yr2010 = yr2010;
    }


    public String getYr2011() {
        return yr2011;
    }


    public void setYr2011(String yr2011) {
        this.yr2011 = yr2011;
    }


    public String getYr2012() {
        return yr2012;
    }


    public void setYr2012(String yr2012) {
        this.yr2012 = yr2012;
    }


    public String getYr2013() {
        return yr2013;
    }


    public void setYr2013(String yr2013) {
        this.yr2013 = yr2013;
    }


    public String getYr2014() {
        return yr2014;
    }


    public void setYr2014(String yr2014) {
        this.yr2014 = yr2014;
    }


    public String getYr2015() {
        return yr2015;
    }


    public void setYr2015(String yr2015) {
        this.yr2015 = yr2015;
    }


    public String getYr2016() {
        return yr2016;
    }


    public void setYr2016(String yr2016) {
        this.yr2016 = yr2016;
    }


    public String getYr2017() {
        return yr2017;
    }


    public void setYr2017(String yr2017) {
        this.yr2017 = yr2017;
    }


    public String getYr2018() {
        return yr2018;
    }


    public void setYr2018(String yr2018) {
        this.yr2018 = yr2018;
    }


    public String getYr2019() {
        return yr2019;
    }


    public void setYr2019(String yr2019) {
        this.yr2019 = yr2019;
    }


    public String getYr2020() {
        return yr2020;
    }


    public void setYr2020(String yr2020) {
        this.yr2020 = yr2020;
    }


    @Override
    public String toString() {
		return "Datos [id=" + id + ", series_name=" + series_name + ", series_code=" + series_code + ", country_name=" +
         country_name + ", country_code=" + country_code + ", yr2010=" + yr2010 + ", yr2011=" + yr2011 + ", yr2012=" + yr2012 + 
         ", yr2013=" + yr2013 + ", yr2014=" + yr2014 + ", yr2015=" + yr2015 + ", yr2016=" + yr2016 + ", yr2017=" + yr2017 + 
         ", yr2018=" + yr2018 + ", yr2019=" + yr2019+ ", yr2020=" + yr2020 + "]";
	}
    
}
