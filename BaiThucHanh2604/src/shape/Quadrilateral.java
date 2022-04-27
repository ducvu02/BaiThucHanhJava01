package shape;
import java.util.Scanner;
public class Quadrilateral extends Point {
    Scanner sc = new Scanner(System.in );
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
        System.out.println("Nhập điểm dx");
        double dx = sc.nextDouble();
        System.out.println("Nhập điểm dy");
        double dy = sc.nextDouble();
        sc.close();
        double ab=(Math.sqrt((bx-ax)*(bx-ax) + (by-ay)*(by-ay)));
        double bc=(Math.sqrt((cx-bx)*(cx-bx) + (cy-by)*(cy-by)));
        double cd=(Math.sqrt((dx-cx)*(dx-cx) + (dy-cy)*(dy-cy)));
        double ad=(Math.sqrt((dx-ax)*(dx-ax) + (dy-ay)*(dy-ay)));

        if(ax==bx && ay==by|| bx ==cx && by==cy || cx == dx && cy == dy || ax == dx &&ay==dy){
            System.out.println("Không phải hình tứ giác");
        }else if(ab==cd&&bc==ad){
            System.out.println("Không phải hình chữ nhật");
        }else if(ab==bc && bc==cd && cd==ad) {
            System.out.println("Không phải hình vuông");
        }
            
    }
}
