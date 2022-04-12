package Shape;
import java.util.Scanner;
public class HinhVuong extends HinhChuNhat {
    Scanner sc = new Scanner(System.in);
    public HinhVuong() {
        ten = "hình vuông";
    }
    public void nhapCanh() {
        System.out.println("cạnh = ");
     
        dai = rong = sc.nextFloat(); 
    }
    
}
