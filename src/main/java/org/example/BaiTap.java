package org.example;

import java.util.Scanner;

public class BaiTap {
    public static void main(String[] args) {
        //yêu cầu viết chương trình cho tính lương cho phép người dùng nhập vào tên, lương 1 ngày, tổng số ngày làm và in kết quả ra màn hình
        //lương một ngày là 10đ làm 28 > 280đ
        Scanner scanner = new Scanner(System.in);

//        //Nhập tên
//        System.out.println("Nhập tên nhân viên:");
//        String name = scanner.nextLine();
//
//        //Nhập lương 1 ngày
//        System.out.println("Nhập lương 1 ngày:");
//        int salaryDaily = scanner.nextInt();
//
//        //Tổng số ngày làm
//        System.out.println("Nhập số ngày làm:");
//        int workDay = scanner.nextInt();
//
//        int totalSalary = salaryDaily*workDay;
//        //Xuất ra màn hình
//        System.out.println("Xin chào " + name + "," + "tổng lương của bạn: " + totalSalary +"đ");

          //Viết chương trình cho phép người dùng nhập điểm toán lý hóa, tính điểm trung bình và xuất ra màn hình

        //Nhập đểm toán
        System.out.println("Nhập điểm toán: ");
        float diemToan = scanner.nextInt();

        //Nhập điểm lý
        System.out.println("Nhập điểm lý: ");
        float diemLy = scanner.nextInt();

        //Nhập điểm hóa
        System.out.println("Nhập điểm hóa: ");
        float diemHoa = scanner.nextInt();

        float diemTB = (diemToan+diemLy+diemHoa)/3;

        //In ra màn hình
        System.out.println("Điểm trung bình: " + diemTB);
    }
}
