/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;
import java.util.ArrayList;
import java.util.List;
        
/**
 *
 * @author PC
 */
public class GioHang {
    IThanhToan hinhThucTT;
    List<HangHoa> dsHH = new ArrayList<>();
    private int tienHang; 
    public void setHinhThucTT(IThanhToan hinhThucTT) {
        this.hinhThucTT = hinhThucTT;
    }
    public void inDSHH() {
        for(HangHoa hangHoa: dsHH) {
            System.out.println(hangHoa.inHH());
        }
        System.out.println("Tiền hàng: "+tienHang);
    }
    public double getThanhToan(int tienHang) {
        return hinhThucTT.thanhToan(tienHang);
    }
    public void themHH(HangHoa hangHoa) {
        dsHH.add(hangHoa);
        tienHang = tienHang + hangHoa.getGia();
    }
    public int getTienHang() {
        return tienHang;
    }
}
