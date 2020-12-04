package com.minr;

import java.util.Scanner;

/*
 * @author
 * Nama              : M Ikhlas N R
 * Kelas             : IF-1
 * NIM               : 10119022
 * Deskripsi Program : Program Tabungan
 *
 */
public class Main {
    public static void main(String[] args) {
        int saldoAwal, tarikTunai;

        Scanner userInput = new Scanner(System.in);

        System.out.println("=====Program Penarikan uang======");
        System.out.print("Masukkan Saldo Awal : ");
        saldoAwal = userInput.nextInt();

        Tabungan nasabah1 = new Tabungan(saldoAwal);

        System.out.print("Jumlah uang yang diambil : ");
        tarikTunai = userInput.nextInt();

        System.out.printf("Saldo Anda Sekarang : %d", nasabah1.ambilUang(tarikTunai));
    }
}
