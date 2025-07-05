package org.example;

import java.util.Scanner;

public class BaiTap3 {
    static double dtb(double diemToan, double diemLy,double diemHoa){
        double dtb = (diemToan+diemLy+diemHoa)/3;
        return dtb;
    }

    static String xepLoai(double dtb){
        String result = "";
        if (0 < dtb && dtb < 5){
            result = "Học sinh yếu";
        } else if (dtb >= 5.1 && dtb <= 6) {
            result = "Học sinh TB";
        } else if (dtb >= 6.1 && dtb <= 7) {
            result = "Học sinh khá";
        } else if (dtb > 7.1 && dtb <= 8) {
            result = "Học sinh giỏi";
        } else if (dtb > 8.1 && dtb <= 10) {
            result = "Học sinh xuất sắc";
        }else {
            result = "Nhập lại điểm số";
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập điểm toán:");
        double diemToan = scanner.nextDouble();
        System.out.println("Nhập điểm lý:");
        double diemLy = scanner.nextDouble();
        System.out.println("Nhập điểm Hóa:");
        double diemHoa = scanner.nextDouble();
        double dtb = dtb(diemToan,diemLy,diemHoa);
        String xepLoai = xepLoai(dtb);
        System.out.println(dtb);
        System.out.println(xepLoai);
    }
}
