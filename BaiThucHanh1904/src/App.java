import Duma.*;
public class App {
    public static void main(String[] args) throws Exception {
       Person ps = new Person();
       Student st = new Student();
       OfflineStudent off = new OfflineStudent();
       OnlineStudent on = new OnlineStudent();
       Employee em = new Employee();
       Customer cu = new Customer();
       VIPCustomer vip = new VIPCustomer();
       ps.nhapDiaChi();
       ps.nhapSoDienThoai();
       ps.nhapTen();
       ps.inDiaChi();
       ps.inSoDienThoai();
       ps.inTen(); 

        st.nhapDiaChi();
        st.nhapMaHocSinh();
        st.nhapSoDienThoai();
        st.nhapTen();
        st.inDiaChi();
        st.inMaHocSinh();
        st.inSoDienThoai();
        st.inTen();

        off.nhapDiaChi();
        off.nhapDiemThi();
        off.nhapMaHocSinh();
        off.nhapSoDienThoai();
        off.nhapTen();
        off.inDiaChi();
        off.inDiemThi();
        off.inMaHocSinh();
        off.inSoDienThoai();
        off.inTen();

        on.nhapDiaChi();
        on.nhapDiemThi();
        on.nhapMaHocSinh();
        on.nhapSoDienThoai();
        on.nhapTen();
        on.inDiaChi();
        on.inDiemThi();
        on.inMaHocSinh();
        on.inSoDienThoai();
        on.inTen();

        em.nhapDiaChi();
        em.nhapSoDienThoai();
        em.nhapDiaChi();
        em.nhapSoDienThoai();
        em.nhapTen();
        em.inDiaChi();
        em.inSoDienThoai();
        em.inTen();

        cu.nhapDiaChi();
        cu.nhapGiaTriDonHang();
        cu.nhapSoDienThoai();
        cu.nhapTen();
        cu.nhapThongTin();
        cu.inDiaChi();
        cu.inSoDienThoai();
        cu.inTen();
        cu.inThongTin();

        vip.nhapDiaChi();
        vip.nhapSoDienThoai();
        vip.nhapTen();
        vip.inDiaChi();
        vip.inSoDienThoai();
        vip.inTen();

    } 
}
