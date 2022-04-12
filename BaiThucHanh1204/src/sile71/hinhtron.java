package sile71;
 public class hinhtron {
 private final float PI = 3.14f;
 private float bankinh;
 public float getBanKinh() {
     return bankinh;
 }    
 public void setBankinh(float bankinh){
     this.bankinh = bankinh;

 }
 public float tinhChuVi(){
     return 2 * PI * bankinh;
 }
 public float tinhDienTich(){
     return PI *bankinh *bankinh;
 
}
}
