/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

/**
 *
 * @author PC
 */
public class BaiTap1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        context KQ=new context();
        KQ.setTinhtoan(new Cong());
        System.out.println(" 75 + 12 = "+KQ.tinh(75, 12));
        KQ.setTinhtoan(new Tru());
        System.out.println(" 54 - 78 = "+KQ.tinh(54, 78));
    }
    
}
