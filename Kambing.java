/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kambing;

/**
 *
 * @author Lenovo
 * Nama : Tassyakur Pasya
 * Kelas : IF-01
 * NIM : 10118009
 * Matkul : PBO-01
 */
public class Kambing {

    public void tambahKambing() {
        //Deklarasi variabel lokal
        int jumlahKambing = 5;
        
        jumlahKambing = jumlahKambing +3;
        System.out.println("Jumlah Kambing setelah ditambah: "+jumlahKambing);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Kambing kambingJantan = new Kambing();
        kambingJantan.tambahKambing();
    }
    
}
