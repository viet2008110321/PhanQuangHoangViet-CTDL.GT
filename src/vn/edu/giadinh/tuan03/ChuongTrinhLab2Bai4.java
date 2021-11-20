package vn.edu.giadinh.tuan03;

import java.util.Scanner;

public class ChuongTrinhLab2Bai4 {
    public static void main(String[] args) {
    System.out.println("==========MENU==========");
    System.out.println(">>1. Giải phương trình bậc 1");
    System.out.println(">>2. Giải phương trình bậc 2");
    System.out.println(">>3.    Tính Tiền Điện      ");
    System.out.println("==========MENU==========");
    int suLuaChon;
    System.out.println("Lựa chọn Chức năng: ");
    Scanner bienNhap;
    bienNhap = new Scanner(System.in);
    suLuaChon = bienNhap.nextInt();
    
    switch(suLuaChon){
        case 1: giaiPTBac1(); break; 
        case 2: giaiPTbac2(); break; 
        case 3: tinhtiendien(); break; 
        default: System.out.println("Chức năng khác");
    }
}

    static void giaiPTBac1(){
        System.out.println("Triển khai code giải pt bậc 1....");
        
    }

    static void giaiPTbac2(){
        System.out.println("Triển khai code giải pt bậc 2....");
        
    }

    static void tinhtiendien(){
        System.out.println("Triển khai code tính tiền điện....");
        
    }
}
