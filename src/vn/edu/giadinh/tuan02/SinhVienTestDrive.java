package vn.edu.giadinh.tuan02;

public class SinhVienTestDrive {
    public static void main(String[] args) {
        SinhVien sinhVien;
        sinhVien = new SinhVien();
        sinhVien.mssv = "12345";
        sinhVien.tenSinhVien = "Vịt";
        sinhVien.queQuan = "tphcm";
        sinhVien.tuoi = 18;
        sinhVien.inThongTinSV();
    }
}
