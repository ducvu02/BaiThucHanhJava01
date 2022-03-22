package BTH22_03;

public class AppMain {
    public static void main(String[] args) throws Exception {
        System.out.println("1.Class hình chữ nhật ");
        HinhChuNhat hcn = new HinhChuNhat();
        hcn.nhapChieudai();
        hcn.nhapChieurong();
        hcn.tinhChuvi();
        hcn.tinhDientich();
        hcn.inChuvi();
        hcn.inDientich();
    
        person ps = new person();
        ps.NhapPersonID();
        ps.NhapPersonName();
        ps.NhapGender();
        ps.NhapAddress();
        ps.inPersonID();
        ps.inPersonName();
        ps.inGender();
        ps.inAddress();

        Sinhvien sv = new Sinhvien();
        sv.nhapMaSinhVien();
        sv.nhapHoTen();
        sv.nhapDiaChi();
        sv.nhapgioiTinh();
        sv.nhapNgaysinh();
        sv.inMaSinhVien();
        sv.inHoTen();
        sv.inDiaChi();
        sv.ingioiTinh();
        sv.inNgaySinh();

        Phươngtrinhbac2 ptb2 = new Phươngtrinhbac2();
        ptb2.nhapa();
        ptb2.nhapb();
        ptb2.nhapc();
        ptb2.tinhdelta();
        ptb2.indelta();
        ptb2.giaiptb2();

    }
}