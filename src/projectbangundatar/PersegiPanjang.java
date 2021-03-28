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
public class PersegiPanjang extends Atribut{
    
    Scanner input = new Scanner(System.in);
    
    PersegiPanjang(float p, float l){
        this.panjang = p;
        this.lebar = l;
    }

    void Input(){
        System.out.print("Masukkan panjang persegi panjang : ");
        this.panjang = input.nextInt();
        System.out.print("Masukkan lebar persegi panjang : ");
        this.lebar = input.nextInt();
    }
    
    void LuasPersegiPangjang(){
        Input();
        this.luas = this.panjang*this.lebar;
        System.out.println("Luas persegi panjang : " + this.luas + " cm^2");
    }
    
    void KelilingPersegiPanjang(){
        Input();
        this.keliling = 2 * (this.panjang + this.lebar);
        System.out.println("Keliling persegi panjang " + this.keliling + " cm");
    }
    
    void LuasBangunDatar(){
        System.out.println("a. Luas persegi panjang");
        System.out.println("b. Keliling persegi panjang");
        System.out.print("Masukkan pilihan : ");
        char pilihan = input.next().charAt(0);
        switch (pilihan){
            case 'a':
                LuasPersegiPangjang();
                break;
            case 'b':
                KelilingPersegiPanjang();
                break;
            default:
                System.out.println("INPUTAN ANDA SALAH!!!");
                LuasBangunDatar();
                break;
        }
    }
}




