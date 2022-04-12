package Shape;
import java.util.Scanner;
public class Hinhtron extends hinhhoc {
    Scanner sc = new Scanner(System.in);
    public float bankinh;
    public Hinhtron(){
        ten = "Hình Tròn ";
    }
    public void NhapBanKinh() {
        System.out.println("bán kính = ");
       
        bankinh = sc.nextFloat();
    }
    public void tinhChuVi() {
        chuvi = 2 * PI * bankinh;
    }
    public void tinhDienTich() {
        dientich = PI * bankinh * bankinh;
    }
}
