package Shape;
import java.util.Scanner;
public class HinhChuNhat extends hinhhoc {
     Scanner sc = new Scanner(System.in);
    public float dai;
    public float rong;
    public HinhChuNhat() {
        ten = " Hình Chữ Nhật";
    }
    public void NhapChieuDai() {
        System.out.println("chiều dài = ");
      
        dai = sc.nextFloat();
    }
    public void NhapChieuRong() {
        System.out.println("chiều rộng = ");
      
        rong = sc.nextFloat();
    }   
    public void tinhChuvi() {
        chuvi = 2 * ( dai + rong );
    }
    public void tinhDientich() {
        dientich = dai * rong;
    }
}
