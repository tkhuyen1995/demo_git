package org.example;

import java.util.Scanner;

public class Main {
    //snippet
    public static void main(String[] args) {
        //lệnh xuất
        System.out.println("Hello Testing05");
        System.out.println("Hello Mentor");

        //snippet lệnh xuất - gõ sout
        System.out.println("Hello Cybersoft");

        //comment nhanh  - ctrl + / hoặc macbook command + /

        //lệnh nhập
        Scanner scanner = new Scanner(System.in);

        //Biến - nơi lưu trữ dữ liệu
        //<kiểu dữ liệu><tên biến> = <giá trị khởi tạo>

        //kiểu dữ liệu dạng primative value: byte, short, int, long, float, char, boolean, double, ....
        //kiểu dữ liệu tham số: string, array, class, object, và interface

        int age = 18;
        double salary = 1000.15;
        String name1 = "Khuyên";
        boolean isLogin = true; //false

        //hằng số - giá trị không dổi
        final double pi = 3.14159;

        //yêu cầu: cho phép người dùng vào tên mình và xuất ra màn hình
        //ô nhập
//        System.out.println("Nhập tên người dùng: ");
        //nhận giá trị người dùng nhập vào và gắn biến
//        String name = scanner.nextLine();
        //xuất ra màn hình
//        System.out.println("Xin chào: " + name);

        //yêu cầu: viết chương trình cho sinh viên nhập vào tên, lớp, tuổi(scanner.nextInt()) và in ra màn hình
        //nhập tên sinh viên
        System.out.println("Nhập tên sinh viên: ");
        String ten = scanner.nextLine();

//        //nhập lớp
//        System.out.println("Nhập lớp: ");
//        String lop = scanner.nextLine();
//
//        //nhập số tuổi
//        System.out.println("Nhập số tuổi: ");
//        int tuoi = scanner.nextInt();
//
//        //Xuất ra maàn hình
//        System.out.println("Xin chào " + ten + "," + " hiện đang " + tuoi + " tuổi" + "," + " học lớp " + lop);

        //Quy tắc đặc biến
        //bắt buộc bắt đâu = chữ cái, không được bắt đầu = số, không có dấu tiếng việt
        //Không được đặt trùng với từ khóa của java(public, class, void, static, ...)
        //Đặt tên theo quy tắc camel case => hoten => hoTen, tongluong => tongLuong

    }
}