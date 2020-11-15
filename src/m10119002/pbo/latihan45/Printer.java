/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m10119002.pbo.latihan45;

/**
 *
 * @author
 * NAMA     : Firman Sahita
 * KELAS    : IF-1
 * NIM      : 10119002
 * Deskripsi Program : Class untuk objek Printer
 * 
 * 
 */
public class Printer {
    private int jmlCetak;
    private String nama;
    
    public int getJmlCetak() {return this.jmlCetak;}
    public void setJmlCetak(int jmlCetak) {this.jmlCetak = jmlCetak;}
    public String getNama() {return this.nama;}
    public void setNama(String nama) {this.nama = nama;}
    public void cetak(String nama)
    {System.out.println("Nama Anda : ".concat(this.nama));}
    public void cetak(int jmlCetak, String nama) {
        System.out.println("Hasil Cetak :");
        for(int i=0; i<jmlCetak; i++)
            System.out.println(Integer.toString(i+1).concat(". ").concat(nama));
    }
}
