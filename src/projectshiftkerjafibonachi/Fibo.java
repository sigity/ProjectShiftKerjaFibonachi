/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectshiftkerjafibonachi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
         String [] namapegawai={"donny","april","nathan","donnay","kris","simatupang","sijambut","kalangkabut"};
         int i = 0;
         while (i< jmlpegawai) {             
             pg.add(namapegawai[i]);
             i++;
         }
         return pg;
     }

     
     public static void main(String[] args) {
     
         System.out.println("masukan jumlah hari");
         Scanner SC = new Scanner(System.in); //bikin scanner 1 saja
         Integer jmInteger = SC.nextInt();
         List<Integer> rs=  Hitung(jmInteger);
//         System.out.println(rs.size());
         
         System.out.println("masukan jumlah pekerja");
//         Scanner jml = new Scanner(System.in);
         Integer jmlpekerja = SC.nextInt();
         System.out.println("============================================================");
//         String [] pekerja = new String[jmlpekerja];
//         for (int g = 0; g < pekerja.length; g++) {
//             System.out.println("pekerja ke " +g);
//             pekerja[g]= SC.next();
//         }
         List<String> nm = pegawai(jmlpekerja);
         int x = 0;
         int y = 0;
         for (int k = 0, l= 0; k < rs.size(); k++, l++) {
             if (k % jmlpekerja == 0) {
                 l = 0;
             }
            x= x + rs.get(k);
            
//            }
            if (rs.get(k) > 1)
            {
            System.out.println(nm.get(l) +" bekerja selama "+ rs.get(k) + 
                    " hari" +"   dari hari ke " +y+ " samapai hari ke "+x );
            y=x+1;
            }else{
                System.out.println(nm.get(l) +" bekerja selama "+ rs.get(k) + 
                    " hari" +"   dari hari ke " +y);
                y=x+1;
            }
         }  
         
    }
}
