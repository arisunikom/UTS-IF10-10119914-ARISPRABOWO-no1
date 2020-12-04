/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TahunLahir;
import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author 
 * Aris Prabowo
 * IF10K 10119914
 */
public class Main {
    public static void main(String[] args) {
        var keyboard = new Scanner(System.in);
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        Age age = new Age(currentYear);
        System.out.println("Masukan Tahun Lahir Anda: ");
        int tahunLahir = keyboard.nextInt();
        age.setYearBirth(tahunLahir);
        System.out.println("\n=====Hasil Perhitungan Umur=====");
        System.out.println("Tahun lahir anda: "+age.getYearBirth());
        System.out.println("Hari ini tahun: "+age.getYearNow());
        System.out.println("Umur Kamu Sampai Hari ini: "+age.hitungUmur());
        System.out.println("Tandanya Kamu: "+age.tandanyaKamu(age.hitungUmur()));
    }
    
}
