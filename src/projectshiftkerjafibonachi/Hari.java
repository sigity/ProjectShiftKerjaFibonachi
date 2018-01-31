/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectshiftkerjafibonachi;

import java.util.ArrayList;
import java.util.List;

/**
 * kelas hari
 * @author Sigit Yudhianto
 */
public class Hari {
    
    private int i= 0, sum = 0, selisih =0;
    
    /**
     * Method Mfibonaci digunakan untuk menentukan bilangan fibonacci
     * @param n
     * @return MFibonacci (n-2) + MFibonacci(n-1) 
     * membutuhkan inputan berupa integer 
     * dan akan mengeluarkan output menjumlahkan 2 bilangan sebelum n dengan 1 bilangan sebelumnya
     */
    public int MFibonacci(int n){
        if (n <= 0 || n<=1) {
            return n;
        }else{
        return MFibonacci(n-2) + MFibonacci(n-1);   
        }
    }
    /**
     * Method HitungHari digunakan untuk mentukan semua deret fibonasi dan di simpan dalam array list
     * @param hari
     * @return
     * @throws CustomException 
     */
    public List HitungHari(int hari) throws CustomException{
        Validasi.validasiHari(hari);
        List<Integer> listhari = new ArrayList();
        while (sum < hari) {            
            sum= sum + MFibonacci(i);
            listhari.add(MFibonacci(i));
            if (sum > hari) {
                selisih = sum- hari;
                listhari.set(i,MFibonacci(i)-selisih);
            }
            i++;
        }
        System.out.println(listhari.size());
        return listhari;
    }
}
