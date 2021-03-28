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
public class Segitiga extends Atribut{
    
    Scanner input = new Scanner(System.in);
        
    void LuasSegitiga(){
        System.out.print("Masukkan alas segitiga : ");
        this.alas = input.nextInt();
        System.out.print("Masukkan tinggi segitiga : ");
        this.tinggi = input.nextInt();
        this.luas = (int) (0.5 * (this.alas * this.tinggi));
        System.out.println("Luas segitiga : " + this.luas + " cm^2");
    }
    
    void KelilingSegitiga(){
        System.out.print("Masukkan sisi a : ");
        a = input.nextInt();
        System.out.print("Masukkan sisi b : ");
        b = input.nextInt();
        System.out.print("Masukkan sisi c : ");
        c = input.nextInt();
        this.keliling = this.a + this.b + this.c;
        System.out.println("Keliling segitiga : " + this.keliling + " cm");
    }
    
    void LuasBangunDatar(){
        System.out.println("a. Luas segitiga");
        System.out.println("b. Keliling segitiga");
        System.out.print("masukkan pilihan : ");
        char pilihan = input.next().charAt(0);
        switch (pilihan){
            case 'a':
                LuasSegitiga();
                break;
            case 'b':
                KelilingSegitiga();
                break;
            default:
                System.out.println("INPUTAN ANDA SALAH!!!");
                LuasBangunDatar();
                break;
        }
    }
}








