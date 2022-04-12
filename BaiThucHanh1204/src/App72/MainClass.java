package App72;

public class MainClass {
    public static void main(String[] args) throws Exception {
        sinhvien sinhvien1 = new sinhvien();
        sinhvien sinhvien2 = new sinhvien();
        sinhvien1.setTen("");
        sinhvien1.setTuoi(23);

        sinhvien2.setTen("Peter");
        sinhvien2.setTuoi(17);
        System.out.println("Sinh viên 1 có tên: " + sinhvien1.getTen() + ", tuổi:" + sinhvien1.getTuoi());
        System.out.println("Sinh viên 2 có tên: " + sinhvien2.getTen() + ", tuổi:" + sinhvien2.getTuoi());
}
}
