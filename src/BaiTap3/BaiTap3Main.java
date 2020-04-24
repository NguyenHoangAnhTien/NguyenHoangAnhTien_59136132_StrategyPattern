/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;
import java.text.SimpleDateFormat;
import java.text.ParseException;
/**
 *
 * @author PC
 */
public class BaiTap3Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException{
        // TODO code application logic here
        SimpleDateFormat ns = new SimpleDateFormat("dd/MM/yyyy");
        SinhVien Sv1 = new SinhVien(" Anh", ns.parse("25/06/1999"), 2.5f);
        SinhVien Sv2 = new SinhVien("Đức", ns.parse("17/12/1999"), 4.0f);
        SinhVien Sv3 = new SinhVien("Bích", ns.parse("12/04/1999"), 9.0f);
    
        QLSV DanhSachSV = new QLSV();
        DanhSachSV.themSV(Sv1);
        DanhSachSV.themSV(Sv2);
        DanhSachSV.themSV(Sv3);
        DanhSachSV.setSoSanh(new SoSanhTheoTen());
        DanhSachSV.sapXep();
        System.out.println("Danh sách sinh viên xếp theo tên:"+"\n");
        DanhSachSV.inDS();
        DanhSachSV.setSoSanh(new SoSanhDiem());
        DanhSachSV.sapXep();
        System.out.println("Danh sách sinh viên xếp theo điểm:"+"\n");
        DanhSachSV.inDS();
    }
    
}
