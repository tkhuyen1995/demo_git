package oop.BaiTap2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số lượng tài khoản");
        int n = scanner.nextInt();

        TaiKhoan[] danhSachTaiKhoan = new TaiKhoan[n];

        for (int i = 0; i <=n; i++ ){
            System.out.println("Tài khoản thứ: " + (i+1) );
            //Người dùng xác nhận loại tài khoản
            System.out.println("Loại tài khoản: 1-tiết kiệm, 2-thanh toán");
            int loai = scanner.nextInt();

            System.out.println("Số tài khoản");
            String soTK = scanner.nextLine();

            System.out.println("Chủ tài khoản");
            String chuTK = scanner.nextLine();

            System.out.println("Số dư");
            double soDu = scanner.nextDouble();
        }
    }
}
