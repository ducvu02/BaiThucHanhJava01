package Duma;
import java.util.Scanner;
public class Student extends Person {
    public String maHocSinh;
    Scanner sc = new Scanner(System.in);
    public Student(){

    }
    
    public void nhapMaHocSinh(){
        System.out.println("Nhap ma hoc sinh: ");
        maHocSinh = sc.nextLine();
    }

    public void inMaHocSinh(){
        System.out.println("Ma hoc sinh: " + maHocSinh);
    }
    
}
