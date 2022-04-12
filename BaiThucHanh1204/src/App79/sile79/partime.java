package App79.sile79;
import App79.sile79.ulti.*;
public class partime extends nhanvien {
    private int gioLamViec;

    public partime(String ten, int gioLamViec) {
        this.ten = ten;
        this.gioLamViec = gioLamViec;
    }

    @Override
    public String loaiNhanVien() {
        return "Nhan vien thoi vu";
    }

    public void tinhLuong() {
        luong = Configs.LUONG_NHAN_VIEN_PART_MOI_GIO * gioLamViec;
    }
}
