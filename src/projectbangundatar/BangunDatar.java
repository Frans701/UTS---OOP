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
public class BangunDatar extends Atribut{
    
    void AllBangunDatar(){
    
        Persegi P = new Persegi(s);
        PersegiPanjang PP = new PersegiPanjang(p, l);
        Segitiga S = new Segitiga();
        Scanner input = new Scanner(System.in);

        System.out.println("a. Persegi");
        System.out.println("b. Persegi Panjang");
        System.out.println("c. Segitiga");
        System.out.print("masukkan pilihan : ");
        char pilihan = input.next().charAt(0);
        switch(pilihan){
        case 'a':
            P.LuasBangunDatar();
            break;
        case 'b':
            PP.LuasBangunDatar();
            break;
        case 'c':
            S.LuasBangunDatar();
            break;
        default :
            System.out.println("INPUTAN ANDA SALAH!!!");
            AllBangunDatar();
        }
    }
 
}
