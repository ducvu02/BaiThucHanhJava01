package App79.sile79;
import App79.sile79.ulti.*;
public class fulltime extends nhanvien {
    private int ngayLamThem;
    private int loaiChucVu;

    public fulltime(String ten, int ngayLamThem) {
        this.ten = ten;
        this.ngayLamThem = ngayLamThem;
    }

    public void setLoaiChucVu(int loaiChucVu) {
        this.loaiChucVu = loaiChucVu;
    }

    @Override
    public String loaiNhanVien() {
        return "Nhan vien toan thoi gian";
    }

    public void tinhLuong() {
        luong = Configs.LUONG_NHAN_VIEN_FULL_LINH ;
    }
}
