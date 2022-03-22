package BTH22_03;
import java.util.Scanner;
public class HinhTron {
    public  void main(String[] args) throws Exception {
        

    }
            final float PI = 3.14f;

            float r;
            float chuvi;
            float dientich;
            void nhapBankinh () {
                System.out.println("Hãy nhập vào Bán Kính Hình Tròn: ");
                Scanner scanner = new Scanner(System.in);
                r = scanner.nextFloat();
                scanner.close();
            }
          
        public void tinhChuVi () {
                chuvi = 2 * PI * r;
            }
           public void tinhDienTich () {
                dientich = PI * r * r;
            }
            public void inChuVi () {
                System.out.println("Chu vi hinh tron: " +chuvi);
            }
            public void inDienTich () {
                System.out.println("Dien tich hinh tron: " +dientich);
            }
          
        }