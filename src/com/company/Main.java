package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        /*
         * Cwiczenia:
         * 1. Z pomoca zaproponowanych funkcji napisz programy podajace
         * odpowiednio sume i minimum podanych przez uzytkownika (lub wygenerowanych) liczb.
         * 2. Napisz funkcje obliczajaca srednia dla podanego (lub
         * wygenerowanego) ciagu liczb.
         */

        int[] tablica = new int[5];
        wczytaj_tablice(tablica, tablica.length);
        wypisz_tablice(tablica, tablica.length);
        System.out.println("\nSuma wynosi: " + suma(tablica, tablica.length));
        System.out.println("\nMinimalna liczba w tablicy wynosi: " + minimum(tablica, tablica.length));
        System.out.println("\nŚrednia wynosi: " + srednia(tablica, tablica.length));

    }

    public static double srednia(int[] tablica, int rozmiar) {
        double srednia = 0;

        for(int i = 0; i<rozmiar; i++) {
            srednia += tablica[i];
        }

        return srednia / tablica.length;
    }

    public static int suma(int[] tablica, int rozmiar) {
        int s = 0;
        for ( int i = 0; i < rozmiar; i++ )
            s += tablica[i];
        return s;
    }

    public static int minimum(int[] tablica, int rozmiar) {
        int min = tablica[0];
        for ( int i = 1; i < rozmiar; i++ )
            if ( tablica[i] < min )
                min = tablica[i];
        return min;
    }

    public static void wczytaj_tablice(int[] tablica, int rozmiar) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        for ( int i = 0; i < rozmiar; i++ ) {
            System.out.println("Podaj liczbe " + (i+1) + ": ");
            tablica[i] = Integer.parseInt(in.readLine());
        }
    }

    public static void wypisz_tablice(int[] tablica, int rozmiar) {
        for ( int i = 0; i < rozmiar; i++ )
            System.out.println("tablica["+i+"] = "+tablica[i]);
    }
}
