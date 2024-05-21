/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.family;

/**
 *
 * @author A C E R
 */
public class Family {

   public static void main(String[] args) {
        Person bapakEdi = new Parent("Tangguh Edijanto", "Magelang", "15 September 1967", "PNS", "Jawa Tengah, Magelang", "081804109277", "Laki-laki");
        Person ibuAri = new Parent("Ari Winarsih", "Magelang", "12 Juni 1973", "PNS", "Jawa Tengah, Magelang", "08179837210", "Perempuan");
        Person alief = new Child("Alief Rizky Widjanarko", "Magelang", "04 April 2004", "Pelajar/Mahasiswa", "Magelang", "085900248124", "Laki-laki");
        Person alya = new Child("Alya Rizkika Meita Ardianti", "Magelang", "16 Mei 2008", "Pelajar", "Magelang", "087719801715", "Perempuan");

        System.out.println("Keluarga ku:");
        System.out.println("------ Bapak ------");
        System.out.println(bapakEdi.getDetails());

        System.out.println("------ Ibu ------");
        System.out.println(ibuAri.getDetails());

        Person[] anak = new Person[]{alief, alya};

        System.out.println("Mereka berdua memiliki 2 anak:");
        for (int i = 0; i < anak.length; i++) {
            if (anak[i] instanceof Child) {
                String jenisKelamin = (i == 0) ? "perempuan" : "laki-laki";
                int anakKe = i + 1;
                System.out.println("Anak ke-" + anakKe + " yaitu anak " + jenisKelamin);
                System.out.println(anak[i].getDetails());

                if (i == 0) {
                    System.out.println();
                }
            }
        }
    }
}