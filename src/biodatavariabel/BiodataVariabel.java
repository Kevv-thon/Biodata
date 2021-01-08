/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biodatavariabel;

/**
 *
 * @author LENOVO
 */
public class BiodataVariabel {

    private static BiodataVariabel datasiswa;
    int NIS;
    String Nama;
    String Jurusan;
    String Sekolah;
    String Tempatlahir;
    String Tanggal;
    String Kelamin;
    String Alamat;
    String motto;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BiodataVariabel.datasiswa = new  BiodataVariabel();
        datasiswa.Nama = "Kevin Bramasta A.W";
        datasiswa.NIS = 27045;
        datasiswa.Tempatlahir = "Malang";
        datasiswa.Tanggal = "27-04-2005";
        datasiswa.Kelamin = "Laki-laki";
        datasiswa.Alamat = "Jl. Simpang Kepuh A-10";
        datasiswa.motto = "Man Jadda Wad Jadda";
        
        System.out.println("Nama             : "+datasiswa.Nama);
        System.out.println("NIS              : "+datasiswa.NIS);
        System.out.println("Tempat lahir     : "+datasiswa.Tempatlahir);
        System.out.println("Tanggal lahir    : "+datasiswa.Tanggal);
        System.out.println("Jenis Kelamin    : "+datasiswa.Kelamin);
        System.out.println("Alamat di Malang : "+datasiswa.Alamat);
        System.out.println("Motto Hidup      : "+datasiswa.motto);
        
        
    }
    
}
