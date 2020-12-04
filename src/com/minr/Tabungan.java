package com.minr;

public class Tabungan {
    private int saldo;

    public Tabungan(int saldo){
        this.saldo = saldo;
    }

    public int ambilUang(int jumlah){
        this.saldo -= jumlah;
        return this.saldo;
    }
}
