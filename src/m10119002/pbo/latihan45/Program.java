/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m10119002.pbo.latihan45;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Firman Sahita
 * KELAS    : IF-1
 * NIM      : 10119002
 * Deskripsi Program : Program ini berisi program cetak nama
 * (OBJECT ORIENTED)
 * 
 */
public class Program {
    private static Scanner scanner = new Scanner(System.in);
    private static String input = new String();
    private static boolean status;
    private static Printer printer = new Printer();
	
    private static boolean cekParsing(String test) {
        try {
            Integer.parseInt(test);
            return true;
        } catch (NumberFormatException ex) {
            System.err.println("Pastikan tidak mengandung huruf atau simbol!");
            return false;
        } catch (Exception ex) {
            System.err.println("System error");
            return false;
        }
    }
    
    private static boolean masukkanJumlahCetak() {
        System.out.print("Mau cetak nama berapa kali? : ");
        input = scanner.nextLine();
        return cekParsing(input);
    }
    
    public static void masukkanData() {
        System.out.print("Masukkan nama anda : ");
        input = scanner.nextLine();
        printer.setNama(input);
        status = false;
        while(!status) status = masukkanJumlahCetak();
        printer.setJmlCetak(Integer.parseInt(input));
    }
    
    public static void main(String[] args) {
        System.out.println("=====Aplikasi Pencetak Nama======");
        masukkanData();
        printer.cetak(printer.getNama());
        printer.cetak(printer.getJmlCetak(), printer.getNama());
    }
}
