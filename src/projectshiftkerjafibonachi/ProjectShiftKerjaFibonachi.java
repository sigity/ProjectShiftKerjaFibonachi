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

//    void print(List<String> nm, List<Integer> hr , int jmlpekerja){
//         int x = 0, y = 0;
//         for (int k = 0 , l = 0 ; k < hr.size(); k++, l++) {
//             if (k % jmlpekerja == 0) {
//                 l = 0;
//             }
//             x = x + hr.get(k);
//             if (hr.get(k) > 1) {
//                 System.out.println(nm.get(l) +" bekerja selama "+ hr.get(k) + 
//                    " hari" +"   dari hari ke " +y+ " samapai hari ke "+x );
//                 y=x+1;
//             }else{
//                 System.out.println(nm.get(l) +" bekerja selama "+ hr.get(k) + 
//                    " hari" +"   dari hari ke " +y);
//                y=x+1;
//             }
//         }
//     }
    
    
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
        Scanner SC = new Scanner(System.in); //bikin scanner 1 saja
        System.out.println("masukan jumlah pekerja");
        Integer jmlpekerja = SC.nextInt();
        
        Pekerja pekerja= new Pekerja();
        List pk = pekerja.HitungPekerja(jmlpekerja);
        System.out.println("masukan jumlah hari");
        Integer jmlhari = SC.nextInt();
        Hari h=new Pekerja();
//        h.HitungHari(jmlhari);
        List hr = h.HitungHari(jmlhari);
        
        pekerja.print(pk, hr, jmlpekerja);
    }
    
}
