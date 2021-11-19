package vn.edu.giadinh.tuan02;

import java.util.Date;

public class SinhVien {
    //Thuộc tính 

    String mssv;
    String tenSinhVien;
    int tuoi;

    String queQuan;

    Date ngaySinh;
    

    //2.Phương thức - method - function
    //<kiểu trả về> <tên hàm> <(danh sách tham số)>{......}
    void inThongTinSV(){
        System.out.print("Mã số sinh viên: " + mssv);
        System.out.print("Tên sinh viên: " + tenSinhVien);
        System.out.print("Tuổi sinh viên là: " + tuoi);
        System.out.print("Quên quán sinh viên là: " + queQuan);
    }
}
    
