/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TahunLahir;

import java.util.Calendar;

/**
 *
 * @author 
 * Aris Prabowo
 * IF10K 10119914
 */
public class Age {
    private int yearBirth;
    private int yearNow;
    private String red;
    
    public Age(int yearNow){
        this.yearNow = yearNow;
    }
    public int getYearBirth(){
        return yearBirth;
    }
    public void setYearBirth(int yearBirth){
        this.yearBirth = yearBirth;
    }
    public int getYearNow(){
        return yearNow;
    }
    public int hitungUmur(){
        return getYearNow()-getYearBirth();
    }
    public String tandanyaKamu(int umur){
        if(umur >= 0 && umur <= 5){
            this.red = "Lagi Lucu-lucunya";
        } else if(umur > 5 && umur <= 10){
            this.red = "Masih Anak-anak";
        }else if(umur > 10 && umur<=13){
            this.red = "Masih Remaja";
        }else if(umur> 13 && umur <=19){
            this.red = "Alay";
        }else if(umur> 19 && umur<=29){
            this.red = "Lagi Galau Nyari Jodoh";
        }else if(umur> 29 && umur<=35){
            this.red = "Lagi Sibuk Nyari Uang";
        }else if(umur> 35 && umur<=150){
            this.red = "Sudah Tua";
        }else{
            this.red = "Tidak Terdeteksi Di Kehidupan";
        }
        return this.red;
    }
}
