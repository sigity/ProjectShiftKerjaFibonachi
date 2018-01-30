/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectshiftkerjafibonachi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Sigit Yudhianto
 */
public class Fibo {
//    static List<Integer> onjlist ;
    
    
     public static int methodFibonacci(int n)
    {   
        if(n <=0 || n<=1){
           return n; 
        }else{
            return methodFibonacci(n-2) + methodFibonacci(n-1) ;
        }
            
    }
     
     public static List  Hitung(int hari){
         List<Integer> onjlist= new ArrayList();
         int sum = 0 , i = 0, selisih = 0;
         
         while (sum < hari){
             sum = sum + methodFibonacci(i);
             onjlist.add(methodFibonacci(i));
             if (sum > hari) { //500 adalah angka sesuai dari inputan
                 selisih = sum - hari;
//                 System.out.println("selesihnya "+ selisih);
                 onjlist.set(i,methodFibonacci(i)-selisih);
//                 onjlist.remove(i);
                }
             i++;
         }
//         System.out.println(onjlist);
         return onjlist;
     }
     
     public static List pegawai(int jmlpegawai){
         List<String> pg = new ArrayList();
         String [] namapegawai={"donny","april","nathan","donnay","kris","simatupang","situmorang","kalangkabut","andre","gadis"};
         int i = 0;
         while (i< jmlpegawai) {             
             pg.add(namapegawai[i]);
             i++;
         }
         return pg;
     }
     
     static  void print(List<String> nm, List<Integer> hr , int jmlpekerja){
         int x = 0, y = 0;
         for (int k = 0 , l = 0 ; k < hr.size(); k++, l++) {
             if (k % jmlpekerja == 0) {
                 l = 0;
             }
             x = x + hr.get(k);
             if (hr.get(k) > 1) {
                 System.out.println(nm.get(l) +" bekerja selama "+ hr.get(k) + 
                    " hari" +"   dari hari ke " +y+ " samapai hari ke "+x );
                 y=x+1;
             }else{
                 System.out.println(nm.get(l) +" bekerja selama "+ hr.get(k) + 
                    " hari" +"   dari hari ke " +y);
                y=x+1;
             }
         }
     }
     
     static boolean validasiHari (int jmInteger) throws CustomException{
         if (jmInteger < 100){
             JOptionPane.showMessageDialog(null, "Bekerja minimal 100 Hari!!", "ERROR", JOptionPane.ERROR_MESSAGE);
             throw new CustomException("Jumlah hari bekerja harus minimal 100 hari!");
         }
         return true;
     }
     
     static boolean validasiPekerja (int jmlpekerja) throws CustomException{
         if (jmlpekerja < 2){
             JOptionPane.showMessageDialog(null, "Jumlah minimal pekerja adalah 2 orang!!", "ERROR", JOptionPane.ERROR_MESSAGE);
             throw new CustomException("Jumlah Pekerja minimal 2 orang!");
         }
         return true;
     }
     
     public static void main(String[] args) throws CustomException {
         Scanner SC = new Scanner(System.in); //bikin scanner 1 saja
         System.out.println("masukan jumlah hari");
         Integer jmInteger = SC.nextInt();
         List<Integer> hr=  Hitung(jmInteger);
         validasiHari(jmInteger);
         System.out.println("masukan jumlah pekerja");
         Integer jmlpekerja = SC.nextInt();
         validasiPekerja(jmlpekerja);
         System.out.println("========================================================================");
         List<String> nm = pegawai(jmlpekerja);
         print(nm, hr, jmlpekerja);
    }
}
