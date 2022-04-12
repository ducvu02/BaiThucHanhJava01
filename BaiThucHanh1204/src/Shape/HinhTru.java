package Shape;
import java.util.Scanner;
public class HinhTru extends Hinhtron {
     Scanner sc = new Scanner(System.in);
    public float chieucao;
    public HinhTru() {
        ten = "Hình Trụ";
    }
    public void NhapChieucao() {
        NhapBanKinh();
        System.out.println("Chiều cao = ");
      
        chieucao = sc.nextFloat(); 
    }
    public void tinhTheTich() {
        tinhDienTich();
       thetich = dientich * chieucao; 
    }
}
