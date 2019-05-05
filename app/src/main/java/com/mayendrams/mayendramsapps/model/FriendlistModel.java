package com.mayendrams.mayendramsapps.model;

//NIM               : 10116513
//NAMA              : Mayendra Muhammad Shiddiq
//Tanggal Dibuat    : 04-05-2019

public class FriendlistModel {
    private String nama;
    private int photo;

    public FriendlistModel(String nama, int photo) {
        this.nama = nama;
        this.photo = photo;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}
