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
    static List<Integer> onjlist ;
    
    
     public static int methodFibonacci(int n)
    {   
        if(n <=0 || n<=1){
           return n; 
        }else{
            return methodFibonacci(n-2) + methodFibonacci(n-1) ;
        }
            
    }
     
     public static void  Hitung(int hari){
         int sum = 0 , i = 0, selisih = 0;
         onjlist= new ArrayList();
         while (sum < hari){
             
             sum = sum + methodFibonacci(i);
             onjlist.add(methodFibonacci(i));
             if (sum > hari) { //500 adalah angka sesuai dari inputan
                 selisih = sum - hari;
                 System.out.println("selesihnya "+ selisih);
                 onjlist.set(i,methodFibonacci(i)-selisih);
//                 onjlist.remove(i);
                }
             i++;
         }
         System.out.println(onjlist);
     }
     

     
     public static void main(String[] args) {
     
         System.out.println("masukan jumlah hari");
         Scanner jmlhari = new Scanner(System.in);
         Integer jmInteger = jmlhari.nextInt();
         Hitung(jmInteger);
         System.out.println(onjlist.size());
         
         System.out.println("masukan jumlah pekerja");
         Scanner jml = new Scanner(System.in);
         Integer jmlpekerja = jml.nextInt();
         String [] pekerja = new String[jmlpekerja];
         for (int g = 0; g < pekerja.length; g++) {
             System.out.println("pekerja ke " +g);
             pekerja[g]= jml.next();
         }
         int x = 0;
         int y = 0;
         for (int k = 0, l= 0; k < onjlist.size(); k++, l++) {
             if (k % jmlpekerja == 0) {
                 l = 0;
             }
//             System.out.println(pekerja[l] +" bekerja selama "+ onjlist.get(k) + " hari" +"dari hari ke ");
//            if (onjlist.get(k) > 1)
//            {
            x= x + onjlist.get(k);
            
//            }
            if (onjlist.get(k) > 1)
            {
            System.out.println(pekerja[l] +" bekerja selama "+ onjlist.get(k) + 
                    " hari" +"   dari hari ke " +y+ " samapai hari ke "+x );
            y=x+1;
            }
            else
            {
                System.out.println(pekerja[l] +" bekerja selama "+ onjlist.get(k) + 
                    " hari" +"   dari hari ke " +y);
                y=x+1;
            }
         }  
    }
}
