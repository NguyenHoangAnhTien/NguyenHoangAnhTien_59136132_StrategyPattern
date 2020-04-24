/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

/**
 *
 * @author PC
 */
public class SoSanhDiem implements ISoSanh<SinhVien>{
    @Override
    public int soSanh(SinhVien o1, SinhVien o2) {
        if(o1.getdiemTB()> o2.getdiemTB()) {
            return 1;
        }
        else if(o1.getdiemTB() == o2.getdiemTB()) {
            return 0;
        }
        else if(o1.getdiemTB() < o2.getdiemTB()){
            return -1;
        }
        return 0;
    }
}
