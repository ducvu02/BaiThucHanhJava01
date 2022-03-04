import java.util.Scanner;
public class AppBai6 {
    public static void main(String[] args) throws Exception {
        Scanner a = new Scanner(System.in);
        int n,giaithua=1;
		do {
			System.out.println("nhập vào 1 số nguyên dương: ");
			n=a.nextInt();
		}
		while(n<=0);
		for(int i=1;i<=n;i++)
		{
			giaithua=giaithua*i;
		}
		System.out.println("giai thừa số vừa nhập là: "+giaithua);
		 // TODO code application logic here
    }
}
