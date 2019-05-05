package com.mayendrams.mayendramsapps.model;

//NIM               : 10116513
//NAMA              : Mayendra Muhammad Shiddiq
//Tanggal Dibuat    : 04-05-2019

public class DailyModel {
    private String pukul;
    private String deskripsi;
    private int photo;


    public DailyModel(String pukul, String deskripsi, int photo) {
        this.pukul = pukul;
        this.deskripsi = deskripsi;
        this.photo = photo;
    }

    public String getPukul() {
        return pukul;
    }

    public void setPukul(String pukul) {
        this.pukul = pukul;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}
