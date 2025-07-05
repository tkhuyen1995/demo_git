package org.example;

import java.util.Scanner;

public class Chuoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //độ dài của chuỗi
        String greet = "Hello CyberSoft";
        System.out.println(greet.length());

        //Chuyển đổi chuỗi thành chữ hoa hoặc chữ thường
        System.out.println(greet.toUpperCase());// chữ hoa
        System.out.println(greet.toLowerCase());// chữ thường

        //nôi chuỗi
        System.out.println("Lời chào " + greet);
        System.out.println("Lời chào ".concat(greet));

    }

}
