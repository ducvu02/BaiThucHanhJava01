package Duma;

public class Employee extends Person {
    protected double luong;
    
    public Employee(){
        
    }
    public Employee(String ten ){
        this.ten=ten;
    }
    protected String loaiNhanVien(){
        return"";
    }
    public void xuatThongTin(){
        System.out.println("----- Nhan Vien : " + ten + "----------");
        System.out.println("-- Loai nhan vien:  "+ loaiNhanVien());
        System.out.println("- Luong: .." + luong +" (VND)");
    }
}
