package Duma;
import java.util.Scanner;
public class Person {

    public String ten;
    public String soDienThoai;
    public String diaChi;
    public String gioiTinh;
    Scanner scanner = new Scanner(System.in);
    public Person(){

    }

    public void nhapSoDienThoai(){
        System.out.println("Nhap so dien thoai: ");
        soDienThoai = scanner.nextLine();
    }

    public void inSoDienThoai(){
        System.out.println("So dien thoai: " + soDienThoai);
    }

    public void nhapTen(){
        System.out.println("Nhap ten: ");
        ten = scanner.nextLine();
    }

    public void inTen(){
        System.out.println("Ten: " + ten);
    }

    public void nhapDiaChi(){
        System.out.println("Nhap dia chi: ");
        diaChi = scanner.nextLine();
    }

    public void inDiaChi(){
        System.out.println("Dia chi: " + diaChi);
    }
}
