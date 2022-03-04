import java.util.Scanner;
public class AppBai3 {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int namsinh,tuoi;
        System.out.print("Nhap ten : ");
        String ten = sc.nextLine();
        System.out.print("Nhap nam : ");
        namsinh = sc.nextInt();
        tuoi=2022-namsinh;
            if(tuoi<16){
                System.out.print("\nBan " + ten + " dang o do tuoi vi thanh nien");
            }
            else if(tuoi>=16 && tuoi<18){
                System.out.print("\nBan " + ten + " dang o do tuoi truong thanh");
            }
            else
                System.out.print("\nban " + ten + " da gia");
        
    }    
}
