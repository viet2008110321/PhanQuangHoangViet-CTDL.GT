package vn.edu.giadinh.tuan02;

import java.util.Scanner;

public class CTMinhHoaNhap {
    
    public static void main(String[] args) {
            Scanner bienNhap;//biếm tham chiếu đối tượng
            double diemMonCTDLGT;
            //tạo đối tượng
            //toán tử new
            //Hàm tạo của lớp Scanner
            bienNhap = new Scanner(System.in);
            System.out.print("Nhập vào điểm môn CTDLGT: ");
            diemMonCTDLGT = bienNhap.nextDouble();

            System.out.println("điểm vừa nhập vào là: " + diemMonCTDLGT);

            String chuoi = new String("Hé lô");

            //double diemMonCTDLGT;

    }
}
