package com.example.user.lek;

/**
 * Created by User on 15.01.2018.
 */

public class Lek {

    private String nazwa;
    private String zawartosc;

    public Lek(String nazwa, String zawartosc)
    {
        this.nazwa=nazwa;
        this.zawartosc=zawartosc;
    }

    public String getNazwa()
    {
        return this.nazwa;
    }

    public void setNazwa(String nazwa)
    {
        this.nazwa=nazwa;
    }

    public String getZawartosc()
    {
        return this.zawartosc;
    }

    public void setZawartosc(String zawartosc)
    {
        this.zawartosc=zawartosc;
    }
}
