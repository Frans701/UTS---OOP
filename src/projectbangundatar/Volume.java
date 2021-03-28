/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar;

import java.util.Scanner;

/**
 *
 * @author FZVXXV
 */
public class Volume extends Atribut{
    
    private float volume;
   
    Scanner input = new Scanner(System.in);

    void Kubus(){
        System.out.print("Masukkan sisi : ");
        this.sisi = input.nextInt();
        this.volume = this.sisi * this.sisi * this.sisi;
    }
    
    void Balok(){
        System.out.print("Masukkan sisi panjang : ");
        this.panjang = input.nextInt();
        System.out.print("Masukkan sisi panjang : ");
        this.lebar = input.nextInt();
        System.out.print("Masukkan sisi panjang : ");
        this.tinggi = input.nextInt();
        this.volume =this. panjang * this.lebar * this.tinggi;
    }
    
    void Tabung(){
        System.out.print("Masukkan jari - jari : ");
        this.r = input.nextInt();
        System.out.print("Masukkan tinggi : ");
        this.tinggi = input.nextInt();   
        this.volume = this.phi * this.r * this.r * this.tinggi;
    }
    
    public float getVolume(){
        return this.volume;
    }
}


