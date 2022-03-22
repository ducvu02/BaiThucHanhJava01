package BTH22_03;
import java.util.Scanner;
public class Sinhvien {
    public Scanner scanner = new Scanner(System.in);
    String MaSinhVien;
    String HoTen;
    Boolean gioiTinh;
    String Diachi;
    String NgaySinh;

    void nhapMaSinhVien() {
        System.out.println("Nhập Ma Sinh Vien: ");
        MaSinhVien = scanner.nextLine();
    }

    void nhapHoTen() {
        System.out.println("Nhập Ho Ten: ");
        HoTen = scanner.nextLine();
    }

    void nhapgioiTinh() {
        System.out.println("Nhập gioi tinh ");
        gioiTinh = scanner.nextBoolean();

    }

    void nhapDiaChi() {
        System.out.println("Nhập Dia chi:  ");
        Diachi = scanner.nextLine();
    }

    void nhapNgaysinh() {
        System.out.println("Nhập ngay sinh:  ");
        NgaySinh = scanner.nextLine();

    }

    void inMaSinhVien() {
        System.out.println("Ma sinh vien la: " + MaSinhVien);
    }

    void inHoTen() {
        System.out.println("Ho ten la: " + HoTen);
    }

    void ingioiTinh() {
        System.out.println("Gioi tinh la: " + gioiTinh);
    }

    void inDiaChi() {
        System.out.println("Dia chi la: " + Diachi);
    }

    void inNgaySinh() {
        System.out.println("Ngay sinh la: " + NgaySinh);
    }

}