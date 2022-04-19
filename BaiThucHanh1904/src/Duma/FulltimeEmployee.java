package Duma;

public class FulltimeEmployee  extends Employee {
    private int gioLamViec;
   
   public FulltimeEmployee(String ten,int tuoi, int gioLamViec){
       this.ten=ten;
       this.gioLamViec=gioLamViec;
      
   }
   @Override
   public String loaiNhanVien(){
       return "Nhan vien chinh thuc";
   }
   public void tinhLuong(){
        luong= Configs.LUONG_NHAN_VIEN_FULL_TIME * gioLamViec;
}
}
