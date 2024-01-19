package firstProgram;

import firstProgram.Namaku;
import example.namaImport;

public class fungsi {
    public static void main(String[] args){
        int x = 2;
        int y = 3;
        int z = 10;

        Namaku.Indah("Ujang");

        namaImport.Beauty("Rangga ");
        namaImport.Beauty("Jangan Gitu");

        tambah(x,y);
        tambah(x,z);
        tambah(y,z);

    }

    public static int tambah(int a, int b){
        int hasilTambah = a+b;
        System.out.println("Hasil tambah "+a+" dan "+b+" adalah : "+hasilTambah);
        return hasilTambah;
    }
}
