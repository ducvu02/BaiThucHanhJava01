
import sile71.hinhtron;
public class App71 {
    public static void main(String[] args) throws Exception {
    hinhtron Hinhtron = new hinhtron();
    Hinhtron.setBankinh(10);
    float chuVi = Hinhtron.tinhChuVi();
    float dienTich = Hinhtron.tinhDienTich();
    System.out.println("Chu vi hình tròn: " + chuVi + "; Và diện tích: " + dienTich);
    }
}