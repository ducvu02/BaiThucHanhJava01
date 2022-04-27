import shape.Point;
import shape.Triangle;
import shape.Quadrilateral;
public class App2604 {
    public static void main(String[] args) throws Exception {
        Point p1 = new Point(1 ,2);
        Point p2 = new Point(2,3);
        Point p3 = new Point(3 ,4);
        Point p4 = new Point(4,5);
        Triangle T = new Triangle();
        Quadrilateral Q = new Quadrilateral();
      T.check();
      Q.check();
    }
}
