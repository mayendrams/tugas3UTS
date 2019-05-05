package com.mayendrams.mayendramsapps.model;

//NIM               : 10116513
//NAMA              : Mayendra Muhammad Shiddiq
//Tanggal Dibuat    : 04-05-2019

public class MusicModel {
    private String namamusik;
    private int musik;
    private int play;
    private int lanjut;
    private int pause;
    private int stop;

    public int getPlay() {
        return play;
    }

    public MusicModel(String namamusik, int musik, int play, int lanjut, int pause, int stop) {
        this.namamusik = namamusik;
        this.musik = musik;
        this.play = play;
        this.lanjut = lanjut;
        this.pause = pause;
        this.stop = stop;
    }

    public void setPlay(int play) {
        this.play = play;
    }

    public int getLanjut() {
        return lanjut;
    }

    public void setLanjut(int lanjut) {
        this.lanjut = lanjut;
    }

    public int getPause() {
        return pause;
    }

    public void setPause(int pause) {
        this.pause = pause;
    }

    public int getStop() {
        return stop;
    }

    public void setStop(int stop) {
        this.stop = stop;
    }





    public String getNamamusik() {
        return namamusik;
    }

    public void setNamamusik(String namamusik) {
        this.namamusik = namamusik;
    }

    public int getMusik() {
        return musik;
    }

    public void setMusik(int musik) {
        this.musik = musik;
    }
}
