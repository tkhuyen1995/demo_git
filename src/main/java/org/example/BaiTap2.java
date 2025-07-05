package org.example;

import java.util.Scanner;

public class BaiTap2 {
    static double tongLuong (double soNgay, double luongNgay){
        double tongLuong = soNgay * luongNgay;
        return  tongLuong;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số ngày làm:");
        double soNgay = scanner.nextDouble();
        System.out.println("Nhập lương 1 ngày");
        double luongNgay = scanner.nextDouble();
        double tongLuong = tongLuong(soNgay,luongNgay);
        System.out.println("Tổng lương của bạn là: " + tongLuong);
    }
}
