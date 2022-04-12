package App79;
import App79.sile79.fulltime;
import App79.sile79.partime;
import App79.sile79.ulti.Configs;



public class App79 {
    public static void main(String[] args) {
        
       fulltime sep = new fulltime("Trần Văn Sếp", 0);
        fulltime linh1 = new fulltime("Nguyễn Văn Lính", 0); 
        fulltime linh2 = new fulltime("Lê Thị Lính", 3); 

        
            partime thoiVu = new partime("Phan Thị Thời Vụ", 240); 
        sep.tinhLuong();
        linh1.tinhLuong();
        linh2.tinhLuong();
        thoiVu.tinhLuong();
        
        sep.xuatThongTin();
        linh1.xuatThongTin();
        linh2.xuatThongTin();
        thoiVu.xuatThongTin();

    }
}
