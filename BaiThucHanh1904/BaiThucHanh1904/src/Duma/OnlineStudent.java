package Duma;
import java.util.Scanner;
public class OnlineStudent extends Student {
    public int diemThiOn;
    Scanner sc = new Scanner(System.in);
    public OnlineStudent(){

    }
    
    public void nhapDiemThi(){
        System.out.println("Nhap diem thi: ");
        diemThiOn = sc.nextInt();
    }

    public void inDiemThi(){
        System.out.println("Diem thi: " + diemThiOn);
    }
}
