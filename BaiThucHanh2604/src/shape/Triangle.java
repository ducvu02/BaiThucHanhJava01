package shape;
import java.util.Scanner;
public class Triangle extends Point {
    Scanner sc = new Scanner(System.in );
    public double getdodai2diem(Point A, Point B){
        double kq=(Math.sqrt((B.x-A.x)*(B.x-A.x) + (B.y-A.y)*(B.y-A.y)));
        return kq;
    }
    public  void check(){
        System.out.println("Nhập điểm ax");
        double ax = sc.nextDouble();  
        System.out.println("Nhập điểm ay");
        double ay = sc.nextDouble();   
        System.out.println("Nhập điểm bx");
        double bx = sc.nextDouble();   
        System.out.println("Nhập điểm by");
        double by = sc.nextDouble();  
        System.out.println("Nhập điểm cx");
        double cx = sc.nextDouble();
        System.out.println("Nhập điểm cy");
        double cy = sc.nextDouble();
        
        sc.close();
        
        double ab=(Math.sqrt((bx-ax)*(bx-ax) + (by-ay)*(by-ay)));
        double bc=(Math.sqrt((cx-bx)*(cx-bx) + (cy-by)*(cy-by)));
        double ac=(Math.sqrt((cx-ax)*(cx-ax) + (cy-ay)*(cy-ay)));

        System.out.println(ab);
        System.out.println(bc);
        System.out.println(ac);
        if(ax==bx && ay==by|| bx ==cx && by==cy || cx == ax && cy == ay){
            System.out.println("Không tạo thành tam giác");
        }else if(ab==bc&&ab==ac&&ac==bc){
            System.out.println("Tam giác đều");
        }else if(ab==bc||ab==ac||ac==bc){
            System.out.println("Tam giác cân");
        }else{
            System.out.println("Tam giác thường");
        }      
    }
}
