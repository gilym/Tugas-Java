
package main;
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int temp;
     
        System.out.println("-------------------------");
        System.out.println("Program Konversi Suhu Air");
        System.out.println("-------------------------\n");
        System.out.println("Input Data");
        System.out.println("----------");
        
        System.out.print("Suhu Dalam Selsius  = ");double input = Input.nextDouble();
       Konversi kvs = new Konversi ();
       kvs.c = input;
      
        
        do{ 
        System.out.println("Opsi");
        System.out.println("----------\n");
        System.out.println("1.Lihat Data Konversi ");
        System.out.println("2.Edit Data Konversi ");
         System.out.println("3.Exit");
        System.out.print("Masukan Opsi  = ");int pil = Input.nextInt();
        temp=pil;
        switch(pil){
            case 1 : kvs.hitung(); break;
            
            case 2 : System.out.println("\n\nInput Data");
                     System.out.println("----------");
                     System.out.print("Suhu Dalam Selsius  = ");double input1 = Input.nextDouble();
                      kvs.c = input1;
                     break;
            case 3 : System.out.println("\n\nTerima Kasih :) ");break;
            
            default : System.out.println("Opsi Tidak Ada , Mohon Masukan Opsi Dengan Benar");
            
            
        }
       
        
    }while( temp !=3);
    
}
}