package main;
import Shape.HinhChuNhat;
import Shape.Hinhtron;
import Shape.HinhTru;
import Shape.HinhVuong;

public class App54 {
    public static void main(String[] args) throws Exception {
        Hinhtron hinhTron = new Hinhtron();
        hinhTron.xuatten();
        hinhTron.NhapBanKinh();
        hinhTron.tinhChuVi();
        hinhTron.tinhDienTich();
        hinhTron.inChuVi();
        hinhTron.inDienTich();
 
        HinhTru hinhtru = new HinhTru ();
        hinhtru.xuatten();
        hinhtru.NhapChieucao();
        hinhtru.tinhTheTich();
        hinhtru.inThetich();

        HinhChuNhat hinhchunhat = new HinhChuNhat ();
        hinhchunhat.xuatten();
        hinhchunhat.NhapChieuDai();
        hinhchunhat.NhapChieuRong();
        hinhchunhat.tinhChuvi();
        hinhchunhat.tinhDientich();
        hinhchunhat.inChuVi();
        hinhchunhat.inDienTich();

        HinhVuong hinhvuong = new HinhVuong();
        hinhvuong.xuatten();
        hinhvuong.nhapCanh();
        hinhvuong.tinhChuvi();
        hinhvuong.tinhDientich();
        hinhvuong.inChuVi();
        hinhvuong.inDienTich();
    }

}