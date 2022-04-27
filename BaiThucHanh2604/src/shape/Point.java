package shape;

public class Point {
    public double x;
    public double y;
    public double c;
    public String name;

    public double ab ,bc, cd,ac,ad;
    public Point(){}
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return x;
    }
    public double getAB() {
        return ab;
    }

    public double getAC() {
        return ac;
    }
    public double getBC() {
        return bc;
    }

    public void setAB( double AB) {
        this.ab=AB;
    }
    public void setAC( double AC) {
        this.ac=AC;
    }
    public void setBC( double BC) {
        this.bc=BC;
    }
    public void setX(double x){
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }
    public void setPointXY(String name,double x, double y){
        this.name=name;
        this.x = x;
        this.y = y;
    }
    public void setCXY(char c,double x,double y){
        this.c=c;
        this.x=x;
        this.y=y;
    }
    public void getPointXY(){
        System.out.println("Diem "+name+" co toa do la: " + name+"("+x  +";" +y+")");     
    }

}
