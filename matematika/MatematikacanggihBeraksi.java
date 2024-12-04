/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matematika;

/**
 *
 * @author Dinda Rosa
 */
public class MatematikacanggihBeraksi {
    public static void main(String[] args){
        MatematikaCanggih Call = new MatematikaCanggih();
        
        Call.setPertambahan(23, 34);
        System.out.println("Hasil penjumlahan =" + Call.mat);
        Call.setPertambahan(3.4, 4.9);
        System.out.println("Hasil penjumlahan =" + Call.operasiDouble);
        Call.setPertambahan(12, 28, 14);
        System.out.println("Hasil penjumlahan =" + Call.mat);
        Call.setPertambahan(12.5, 28.7, 14.2);
        System.out.println("Hasil penjumlahan =" + Call.operasiDouble);
        
        Call.setPengurangan(54, 30);
        System.out.println("Hasil pengurangan =" + Call.mat);
        Call.setPengurangan(5.4, 3.0);
        System.out.println("Hasil pengurangan =" + Call.operasiDouble);
        Call.setPengurangan(45, 10, 1.2);
        System.out.println("Hasil pengurangan =" + Call.mat);
        Call.setPengurangan(4.5, 1.0, 1.2);
        System.out.println("Hasil pengurangan =" + Call.operasiDouble);
        
        Call.setPerkalian(23, 34);
        System.out.println("Hasil perkalian =" + Call.mat);
        Call.setPerkalian(2.3, 3.4);
        System.out.println("Hasil perkalian =" + Call.operasiDouble);
        Call.setPerkalian(24, 10, 12);
        System.out.println("Hasil perkalian =" + Call.mat);
        Call.setPerkalian(45, 15, 25);
        System.out.println("Hasil perkalian =" + Call.operasiDouble);
        
        Call.setPembagian(50, 10);
        System.out.println("Hasil pembagian =" + Call.mat);
        Call.setPembagian(5.0, 1.0);
        System.out.println("Hasil pembagian =" + Call.operasiDouble);
        Call.setPembagian(50, 62, 21);
        System.out.println("Hasil pembagian =" + Call.operasiDouble);
        Call.setPembagian(5.0, 6.2, 2.1);
        System.out.println("Hasil pembagian =" + Call.operasiDouble);
      
        Call.setModulus(30, 41);
        System.out.println("Hasil modulus =" + Call.Modulus);
        Call.setModulus(3.0, 4.1);
        System.out.println("Hasil modulus =" + Call.operasiModulus);
        Call.setModulus(23, 50, 10);
        System.out.println("Hasil modulus =" + Call.Modulus);
        Call.setModulus(65, 27, 15);
        System.out.println("Hasil modulus =" + Call.operasiModulus);
    }
}
