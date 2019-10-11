
package project.scanner;

import java.util.Scanner;
public class ProjectScanner {

  
    public static void main(String[] args) {
        
        
        //Defenisi Variable
       int jawaban = 46;
       int tebakkan;
      
                        
        //Membuat objeck dari class scanne
       Scanner input = new Scanner(System.in);
                
                
        // Tampilkan input
        
        System.out.println("Danang bekerja sebagai kurir di sebuah perusahaan pengiriman barang di Bandung selama 5 jam per hari dan 6 hari dalam seminggu. Danang mendapat upah sebesar Rp 3.500 per jam dan uang lembur sebesar Rp 5.000/ jam. Jika dalam 4 minggu Danang menerima uang sebesar Rp 650.000, berapakah lama lemburnya?");
        System.out.print("jwabannya adalah ");
        tebakkan = input.nextInt();
 
        System.out.println("jawaban anda " + tebakkan);
    
    
    
    }
    
    
}
