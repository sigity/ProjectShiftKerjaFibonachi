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
public class Pekerja extends Hari{
    private int i = 0;
    String NM [] ={"AMANDA","BRAM","CHARLES","DONNY","DISTA","ARISTON","TAUFIK","YUSRI","ADITYA","BAGAS"};
    
    public List HitungPekerja(int jmlpekerja){
        List NamaPekerja = new ArrayList();
        while (i < jmlpekerja) {            
            NamaPekerja.add(NM[i]); 
            i++;
        }
        return NamaPekerja;
    }
    
    public String print(List<String> nm, List<Integer> hr , int jmlpekerja){
         int x = 0, y = 0;
         List<String> v = new ArrayList();
         for (int k = 0 , l = 0 ; k < hr.size(); k++, l++) {
             if (k % jmlpekerja == 0) {
                 l = 0;
             }
             x = x + hr.get(k);
             if (hr.get(k) > 1) {
                   
              v.add(nm.get(l) +" bekerja selama "+ hr.get(k) + 
                    " hari" +"   dari hari ke " +y + " samapai hari ke "+x +"\n");
               y=x+1;
             }else{
                   
                 v.add(nm.get(l) +" bekerja selama "+ hr.get(k) + 
                    " hari" +"   dari hari ke " +y +"\n");
                y=x+1;
             }
         }
        return v.toString();
     }
    

    
}
