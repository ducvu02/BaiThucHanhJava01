import java.util.Scanner;
public class AppBai2 {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
    int a;
    System.out.print("Nhap so :");
    a=sc.nextInt();
    if(a%2==0)
    {
      System.out.print(a+":la so chan :");
    }
    else {
      System.out.print(a+":la so le :");
    }
    }    
}
