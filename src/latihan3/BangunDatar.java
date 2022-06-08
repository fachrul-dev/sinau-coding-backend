package latihan3;

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class BangunDatar {

    public static void main (String [] args){
        {

            Hitung hitung = new Hitung();
            Scanner input = new Scanner(System.in);
            double a;
            System.out.println("Menghitung Luas Bangun Datar");
            System.out.println("1=> Persegi \n2.=> Persegi Panjang \n3.=> Lingkaran \n4.=> Segitiga \n");
            System.out.println("Masukkan pilihan = ");
            a = input.nextDouble();
            int masukan = 0;
            if (a==1)
                hitung.persegi();
            else if (a == 2)
                hitung.p_panjang();

            else if (a == 3)
                hitung.lingkaran();
            else if (a == 4)
                hitung.segitiga();
            else
                System.out.println("pilihan salah");
        }
    }
}