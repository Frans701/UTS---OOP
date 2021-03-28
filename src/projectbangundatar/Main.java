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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        Volume V = new Volume();

        System.out.println("Program menghitung bangun datar dan volume");
        System.out.println("a. menghitung bangun datar ");
        System.out.println("b. menghitung bangun ruang ");
        System.out.print("Masukkan pilihan : ");
        char pilihan = input.next().charAt(0);
        switch(pilihan){
            case 'a' :
                BangunDatar MenghitungBangunDatar = new BangunDatar();
                MenghitungBangunDatar.AllBangunDatar();
                break;
            case 'b':
                System.out.println("a. Kubus");
                System.out.println("b. Balok");
                System.out.println("c. Tabung");
                System.out.print("masukkan pilihan : ");
                pilihan = input.next().charAt(0);
                switch(pilihan){
                    case 'a':
                        V.Kubus();
                        System.out.println("Volume kubus : "+ V.getVolume() + " cm^3");
                        break;
                    case 'b':
                        V.Balok();
                        System.out.println("volume balok : "+ V.getVolume() + "ystem.out.println(\"volume bal cm^3");
                        break;
                    case 'c':
                        V.Tabung();
                        System.out.println("Volume tabung : "+ V.getVolume() + " cm^3");
                        break;
                    default :
                        System.out.println("INPUTAN ANDA SALAH!!!");
                        break;
                }
                break;
            default:
                System.out.println("INPUTAN ANDA SALAH!!!");
                break;
        }
    }
 
}
