/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectshiftkerjafibonachi;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sigit Yudhianto
 */
public class Hari {
    private int i= 0, sum = 0, selisih =0;

    public int MFibonacci(int n){
        if (n <= 0 || n<=1) {
            return n;
        }else{
        return MFibonacci(n-2) + MFibonacci(n-1);   
        }
    }
    
    public List HitungHari(int hari){
        List listhari = new ArrayList();
        while (sum < hari) {            
            sum= sum + MFibonacci(i);
            listhari.add(MFibonacci(i));
            if (sum > hari) {
                selisih = sum- hari;
                listhari.set(i,MFibonacci(i)-selisih);
            }
            i++;
        }
        return listhari;
    }
}
