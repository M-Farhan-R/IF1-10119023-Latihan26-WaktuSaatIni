/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package if1.pkg10119023.latihan26.waktusaatini;

/**
 *
 * @author 
 * NAMA              : Muhammad Farhan R <farhan.10119023@mahasiswa.unikom.ac.id>
 * KELAS             : IF1
 * NIM               : 10119023
 * Deskripsi Program :
 *
 */
import java.text.SimpleDateFormat;
import java.util.Date;
public class IF110119023Latihan26WaktuSaatIni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SimpleDateFormat format = new SimpleDateFormat("EEEE, dd MMM yyyy hh:mm:ss");
        Date date = new Date();
        System.out.println(format.format(date));
    }

}
