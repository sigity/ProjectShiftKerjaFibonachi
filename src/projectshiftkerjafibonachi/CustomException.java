/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectshiftkerjafibonachi;

/**
 *
 * @author USER
 */
public class CustomException extends Exception{
    /**
     * method yang merupakan turunan dari kelas Exception
     * @param pesan bernilai String dengan tipe akses super
     */
    public CustomException(String pesan) {
         super(pesan);
         
    }
}
