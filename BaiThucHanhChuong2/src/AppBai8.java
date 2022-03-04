import java.util.Scanner;
public class AppBai8 {
    public static void main(String[] args) throws Exception {
        Scanner a = new Scanner(System.in);
        System.out.print("nhập n : ");
		int n=a.nextInt();
		int arr[]=new int [n];
		double sum=0;
		for(int i=0;i<n;i++)
		{
			System.out.print("nhập số thứ "+(i+1)+" :");
			arr[i]=a.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("trung bình cộng là: "+(sum/n));
	
    }
}
