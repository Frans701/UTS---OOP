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
public class Persegi extends Atribut{
    
    Scanner input = new Scanner(System.in);

    Persegi(float s){
        this.sisi = s;
    }
    
    void Input(){
        System.out.print("Msukkan sisi persegi : ");
        this.sisi = input.nextInt();
    }
    
    void LuasPersegi(){
        Input();
        this.luas = this.sisi*this.sisi;
        System.out.println("Luas persegi : " + this.luas + " cm^2");
    }
  
    void KelilingPersegi(){
        Input();
        this.keliling = 4*this.sisi;
        System.out.println("Keliling persegi : " + this.keliling + " cm");
    }
    
    void LuasBangunDatar(){
        System.out.println("a. Luas persegi");
        System.out.println("b. Keliling persegi");
        System.out.print("Masukkan pilihan : ");
        char pilihan = input.next().charAt(0);
        switch (pilihan){
            case 'a':
                LuasPersegi();
                break;
            case 'b':
                KelilingPersegi();
                break;
            default:
                System.out.println("INPUTAN ANDA SALAH!!!");
                LuasBangunDatar();
                break;
        }
    }
}
