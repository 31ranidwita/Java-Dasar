package com.tutorial;

import java.util.Scanner;

public class Tugas {
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);
        int number1, number2, choice, hasil=0;

        System.out.println("Kalkulator Sederhana Switch Case");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Pembagian");
        System.out.println("4. Perkalian");
        System.out.println("5. Sisa Bagi");
        System.out.println("=================================");

        // input angka
        System.out.print("Masukkan Angka Pertama : ");
        number1 = input.nextInt();
        System.out.print("Masukkan Angka Kedua : ");
        number2 = input.nextInt();

        // pilih operasi
        System.out.print("Masukkan Operasi : ");
        choice = input.nextInt();

        switch (choice){
            case 1 : hasil = number1 + number2;
            break;
            case 2 : hasil = number1 - number2;
            break;
            case 3 : hasil = number1 / number2;
            break;
            case 4 : hasil = number1 * number2;
            break;
            case 5 : hasil = number1 % number2;
            break;
            default : System.out.println("Pilihan Tidak Tersedia. Baca Kembali Menu!");
        }
        System.out.println("Hasil : " + hasil);
    }
}