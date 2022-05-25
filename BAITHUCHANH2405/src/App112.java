import java.util.Scanner;
import java.util.ArrayList;
public class App112 {
    public static void main(String[] args) throws Exception {
        class SinhVien {
            public String hoTen;
            public int diem;
        }
                Scanner scanner = new Scanner(System.in);
                System.out.println("Nhap vao so sinh vien: ");
                int n = scanner.nextInt();
                ArrayList<SinhVien> danhSach = new ArrayList();
         
                for (int i = 0; i < n; i++) {
                    scanner.nextLine();
                    SinhVien x = new SinhVien();
                    System.out.println("thong tin cua sinh vien thu " + i);
                    System.out.print("Nhap vao hoTen sinh vien: ");
                    x.hoTen = scanner.nextLine();
                    System.out.print("Nhap vao diem sinh vien: ");
                    x.diem = scanner.nextInt();
                    danhSach.add(x);
                }
                for (int i = 0; i < danhSach.size(); i++) {
                    System.out.println("Ten sinh vien " + danhSach.get(i).hoTen + " ||  Diem cua sinh vien: " + danhSach.get(i).diem);
                }
            }          
}
