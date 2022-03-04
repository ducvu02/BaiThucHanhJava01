import java.util.Scanner;
public class AppBai5 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n ,sum =0; 
        do{
             System.out.print("Nhap so : ");
	     n=sc.nextInt();
	     sum+=n;
        }
      while( sum < 100);
		System.out.println("Tong cac so vua nhap la : "+sum);
    }    
}
