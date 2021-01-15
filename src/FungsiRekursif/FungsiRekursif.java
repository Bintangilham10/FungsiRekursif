
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bintang.Ilham
 */
public class FungsiRekursif {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {       
        //membuat objek scan dari class library scanner//
        Scanner masukan = new Scanner(System.in);
        
        //deklarasi variabel//
        int bil, hasil;
        
        //menbuat perintah inputan user//
        //yang berisi nilai/value dari inputan user di objek masukan/input
        //lalu nextInt() membuat baris baru angka dibawah 
        System.out.print("Masukkan suatu bilagan : ");
        bil  = masukan.nextInt();
        
        //rumus hasil
        hasil = faktorial(bil);
        
        //menampilkan output hasil//
        System.out.println("Nilai faktorial "+ bil +" adalah "+ hasil);
    }
    
    //fungsi rekursif yang memanggil nilainya sendiri//
    private static int faktorial(int a){
        if (a == 1){
            return 1;}
        else
            return (a*faktorial(a-1));
    }
    
}
