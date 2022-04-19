package Duma;
import java.util.Scanner;
public class OfflineStudent extends Student{
    public int diemThiOff;
    Scanner sc = new Scanner(System.in);
    public OfflineStudent(){

    }
    
    public void nhapDiemThi(){
        System.out.println("Diem thi = " + diemThiOff);
        diemThiOff = sc.nextInt();
    }

    public void inDiemThi(){
        System.out.println("Diem thi: " + diemThiOff);
    }
}
