/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

/**
 *
 * @author PC
 */
public class BaiTap2Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HangHoa hH1 = new HangHoa("Playsation 2", 4600, "PS2 slim SCPH 3000");
        HangHoa hH2 = new HangHoa("PS vita ", 1200, "PS vita 1000 Black 32gb");
        
        GioHang gH1 = new GioHang();
        gH1.themHH(hH1);
        gH1.themHH(hH2);
        gH1.setHinhThucTT(new ThanhToanCOD());
        gH1.inDSHH();
        System.out.println("Tiền thanh toán bằng COD: "
                +gH1.getThanhToan(gH1.getTienHang())+"\n");
        
        GioHang gH2 = new GioHang();
        gH2.themHH(hH1);
        gH2.themHH(hH2);
        gH2.setHinhThucTT(new ThanhToanOnline());
        gH2.inDSHH();
        System.out.println("Tiền thanh toán bằng Online: "
              +gH2.getThanhToan(gH2.getTienHang())+"\n");
    }
    
}
