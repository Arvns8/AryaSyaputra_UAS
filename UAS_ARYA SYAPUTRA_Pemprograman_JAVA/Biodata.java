import java.io.*; 

public class Biodata{
    public static void main(String[] args){
        //Variable Biodata
        String namalengkap = "Arya Syaputra";
        String nim = "211011450482";
        String programstudi = "Teknik Informatika";
        String ruangkelas = "04 TPLE 002";
        String semester = "4";
        String nohp = "089507946724";
        String foto = "D:\\kaMPUS\\Kartu_Ujian\\UAS.jpg";

        //output Biodata
        System.out.println("UAS PEMROGRAMAN 1 JAVA PROGRAMING");
        System.out.printf("%-15s : %s%n", "Nama Lengkap", namalengkap);
        System.out.printf("%-15s : %s%n", "NIM", nim);
        System.out.printf("%-15s : %s%n", "Program Studi", programstudi);
        System.out.printf("%-15s : %s%n", "Ruang Kelas", ruangkelas);
        System.out.printf("%-15s : %s%n", "Semester", semester);
        System.out.printf("%-15s : %s%n", "No HP", nohp);
        System.out.printf("%-15s : %s%n", "Foto", foto);


    }
}