/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.restfulwebservice.webservice.evler;

import java.util.ArrayList;

/**
 *
 * @author mrgg
 */
public class Evler {
    
    private int id;
    private String yer;

    private int Alan;
    private String Aciklama;
    private int odas;
    private int byas;
    private int kat;
    private int fiyat;
    private String tip;
   private ArrayList <Integer> resimID;
   private ArrayList <String> resimyol;
   private ArrayList <Integer> resimEvID;
   
   public void resimIDekle(int id){
       resimID.add(id);
       
       
   }
   public void resimEvIDekle(int id){
       resimEvID.add(id);
       
       
   }
   public void resimyolekle(String yol){
       resimyol.add(yol);
       
       
   }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getYer() {
        return yer;
    }

    public void setYer(String yer) {
        this.yer = yer;
    }

    public int getAlan() {
        return Alan;
    }

    public void setAlan(int Alan) {
        this.Alan = Alan;
    }

    public String getAciklama() {
        return Aciklama;
    }

    public void setAciklama(String Aciklama) {
        this.Aciklama = Aciklama;
    }

    public int getOdas() {
        return odas;
    }

    public void setOdas(int odas) {
        this.odas = odas;
    }

    public int getByas() {
        return byas;
    }

    public void setByas(int byas) {
        this.byas = byas;
    }

    public int getKat() {
        return kat;
    }

    public void setKat(int kat) {
        this.kat = kat;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }
}



