package Duma;

public class ParttimeEmployee extends Employee {
    private int gioLamViec;
   
   public ParttimeEmployee(String ten, int gioLamViec){
       this.ten=ten;
       this.gioLamViec=gioLamViec;
      
   }
   @Override
   public String loaiNhanVien(){
       return "Nhan vien lam theo gio";
   }
   public void tinhLuong(){
    luong = Configs.LUONG_NHAN_VIEN_PART_TIME_MOI_GIO* gioLamViec;
   }
}
