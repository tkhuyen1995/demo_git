package org.example;

public class ToanTu {
    public static void main(String[] args) {
        //cộng, trừ, nhân, chia

        int a = 10;
        int b = 15;

        //tổng
        int sum = a + b;
        //hiệu
        int minus = a - b;
        //tích
        int multiply = a * b;
        //thương
        int divided = a / b;
        //chia lấy dư
        int layPhanDu = a % b;

//        System.out.println("Tổng: " + sum);
//        System.out.println("Hiệu: " + minus);
//        System.out.println("Tích: " + multiply);
//        System.out.println("Thương: " + divided);
//        System.out.println("Dư: " + layPhanDu);

        //tiền tố và hậu tố
        //tiền tố
        System.out.println(++a); // a = a + 1
        //hậu tố
        int c = 10;
        int d = c;
        System.out.println(d++);
        System.out.println(d);

        //toán tử so sánh
        // so sánh giá trị ( == )
        int e = 10;
        int f = 15;
        boolean soSanh = (e == f);
        System.out.println(soSanh); //false

        //so sánh không bằng ( != )
        boolean soSanhKhongBang = (e != f);
        System.out.println(soSanhKhongBang); //true
        // so sánh > < >= <=

        // toán tử logic
        //and(&&)
        boolean rs1 = (10 == 10) && (15 == 15); //tất cả điều kiện đều đúng thì trả ra true, chỉ 1 cái sai trả ra false
        System.out.println(rs1);

        //or(||) nằm phía trên nút enter
        boolean rs2 = (10 == 15) || (15 == 15) || (10 == 8); // Chỉ cần 1 cái đúng là true
        System.out.println(rs2);

        // phủ định: !
        boolean rs3 = !(2>1);
        System.out.println(rs3);
    }
}
