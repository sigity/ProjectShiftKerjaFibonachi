/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectshiftkerjafibonachi;

import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class Validasi {
    
    static boolean validasiHari (int jmInteger) throws CustomException{
         if (jmInteger < 100){
             JOptionPane.showMessageDialog(null, "Bekerja minimal 100 Hari!!", "ERROR", JOptionPane.ERROR_MESSAGE);
             throw new CustomException("Jumlah hari bekerja harus minimal 100 hari!");
         }
         return true;
     }
     
     static boolean validasiPekerja (int jmlpekerja) throws CustomException{
         if (jmlpekerja < 2 || jmlpekerja>10 ){
             JOptionPane.showMessageDialog(null, "Jumlah minimal pekerja adalah 2 orang!!", "ERROR", JOptionPane.ERROR_MESSAGE);
             throw new CustomException("Jumlah Pekerja minimal 2 orang!");
         }
         return true;
     }
}
