/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectshiftkerjafibonachi;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sigit Yudhianto
 */
public class Pekerja extends Hari{
    private int i = 0;
    String NM [] ={"AMANDA","BRAM","CHARLES","DONNY","DISTA","ARISTON","TAUFIK","YUSRI","ADITYA","BAGAS"};
    
    public List HitungPekerja(int jmlpekerja) throws CustomException{
        List NamaPekerja = new ArrayList();
            while (i < jmlpekerja) {            
                NamaPekerja.add(NM[i]); 
                i++;
            }
        return NamaPekerja;
    }
    
    public String print(List<String> nm, List<Integer> hr , int jmlpekerja , javax.swing.JTable jTable){
         int x = 0, y = 0;
         List<Object> v = new ArrayList();
         for (int k = 0 , l = 0 ; k < hr.size(); k++, l++) {
             if (k % jmlpekerja == 0) {
                 l = 0;
             }
             x = x + hr.get(k);
             if (hr.get(k) > 1) {
               v.add(new Object[] {nm.get(l),hr.get(k)+ "Hari", "Dari Hari Ke " +y + " Sampai Hari Ke " +x});
//              v.add(nm.get(l) +"\t bekerja selama\t"+hr.get(k)+ 
//                    " hari\t" +" dari hari ke " +y + "     sampai hari ke "+x +"\n");
               y=x+1;
             }else{
                v.add(new Object[] {nm.get(l),hr.get(k), "Dari Kari Ke " +y});   
//                 v.add(nm.get(l) +"\t bekerja selama\t"+hr.get(k)+ 
//                    " hari\t" +" dari hari ke " +y +"\n");
                y=x+1;
             }
         }
         DefaultTableModel oModel = new DefaultTableModel();
         oModel.setColumnIdentifiers(new Object[] {"NAMA PEGAWAI", "LAMA BEKERJA" , "RENTANG WAKTU"});
         for(Object o : v){
             oModel.addRow((Object[])o);
         }
        jTable.setModel(oModel);
        return v.toString();
     }
    

    
}
