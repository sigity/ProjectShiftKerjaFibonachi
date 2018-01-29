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
public class ProjectShiftKerjaFibonachi {
    

    /**
     * @param args the command line arguments
     * 
     */
     public static int methodFibonacci(int n)
    {   
        if(n <=0 || n<=1){
           return n; 
        }else{
            return methodFibonacci(n-2) + methodFibonacci(n-1) ;
        }
            
    }
     
     public static void  Hitung(){
         int sum = 0;
         int i =0;
         int selisih = 0;
         List onjlist = new ArrayList();
//         for (int i = 0; i < 30; i++) {
//             onjlist.add(methodFibonacci(i));
////             onjlist.add(i);
//             sum = sum + methodFibonacci(i);
//         }
//         System.out.println(sum);
//         System.out.println(onjlist);
         while (sum < 1000){
//             onjlist.add(methodFibonacci(i));
             sum = sum + methodFibonacci(i);
             onjlist.add(methodFibonacci(i));
//             System.out.println(sum);
             if (sum > 1000) { //500 adalah angka sesuai dari inputan
                 selisih = sum - 1000;
                 System.out.println("selesihnya "+ selisih);
//                 onjlist.add(methodFibonacci(i)-selisih);
                   onjlist.set(i, methodFibonacci(i)-selisih);
                }
             i++;
         }
         System.out.println(sum);
         System.out.println(onjlist);
     }
    
    public static void main(String[] args) {
        // TODO code application logic here
//        System.out.println("Jumlah Deret Fibonacci:");
//        Scanner inputFibonacci = new Scanner(System.in);
//        
//        int fibonacciCount = inputFibonacci.nextInt();
//        int sum =0 ;
//        
//        for (int ii=0; ii < fibonacciCount; ii++)
//        {
//            System.out.println("perulangan ke " +ii);
//            System.out.println("Bilangan Fibonacci: " + methodFibonacci(ii));
//            sum = sum + methodFibonacci(ii);
//            System.out.println("jumlah bilangan : " +sum);
//            
//            
//        }
        Hitung();

        
        
    }
    
}
