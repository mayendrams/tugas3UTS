package com.mayendrams.mayendramsapps.model;

//NIM               : 10116513
//NAMA              : Mayendra Muhammad Shiddiq
//Tanggal Dibuat    : 04-05-2019

public class GalerryModel {
    private String namaPhoto;
    private int photo;

    public GalerryModel(String namaPhoto, int photo) {
        this.namaPhoto = namaPhoto;
        this.photo = photo;
    }

    public String getNamaPhoto() {

        return namaPhoto;
    }

    public void setNamaPhoto(String namaPhoto) {
        this.namaPhoto = namaPhoto;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}
