package org.example;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
//        System.out.println("Hello World");
//        System.out.println("Hello World");
//        System.out.println("Hello World");
//        System.out.println("Hello World");
//        System.out.println("Hello World");

        //vòng lặp while
//        giá trị ban đầu
//                while(điều kiện){
//                    thực hiện logic
//
//                    thay đổi giá rị ban đầu
//        }
        // In ra 5 lần hello world
//        int i = 1;
//        while (i<=5){
//            System.out.println("Hello World");
//            i++; // i = i + 1 hoặc i += 1
//        }

        //Bai tập 1:
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập n:");
//        int n = scanner.nextInt();
//        int y = 1;
//        while (y <= n){
//            System.out.println("Hello Testing05");
//            y++;
//        }
        //vòng lặp do...while
//        giá trị ban đầu
//                do{
//                    thực hiện logic
//
//                    làm thay đổi giá trị ban đầu
//                }while(điều kiện)
//        int index = 1;
//        do {
//            System.out.println("Giá trị i: " + index);
//            index++;
//        }while (index <= 5);
//
//        //vòng lặp for
//        //for(giá trị khởi tạo; điều kiện; cập nhập giá trị khởi tạo mới;
//        for (int j = 1; j <= 5; j++ ){
//            System.out.println("Giá trị j: " + j);
//        }

        //Bài tập
        System.out.println("Nhập số N:");
        int n = scanner.nextInt();
        int tong = 0;
        for (int k = 0; k <= n; k++){
            tong += k;
        }
        System.out.println("tổng n: " + tong);

        System.out.println("Nhập số N:");
        int n2 = scanner.nextInt();
        int tong2 = 0;
        for (int m = 0; m <= n; m++){
            if (m % 2 == 0){
                tong2 += m;
            }
        }
//        //tổng chẵn
//        for (int m = 0; m <= n; m+=2){
//                tong2 += m;
//        }
//        //tổng lẻ
//        for (int m = 1; m <= n; m+=2){
//                tong2 += m;
//        }
        // chia hết cho 3 => for(int k = 3; k <= n; k+=3){}
        System.out.println("tổng n: " + tong2);
    }
}
