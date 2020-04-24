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
public class SoSanhTheoTen implements ISoSanh<SinhVien>{
    @Override
    public int soSanh(SinhVien o1, SinhVien o2) {
        return o2.gethoTen().compareTo(o1.gethoTen());
    }

}
