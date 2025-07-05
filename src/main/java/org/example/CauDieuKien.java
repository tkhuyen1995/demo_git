package org.example;

import java.util.Scanner;

public class CauDieuKien {
    public static void main(String[] args) {
        //câu lệnh If
        //if(điều kiện){thực hiện logic"
        //điều kiện đúng
        if(9 > 2){
            System.out.println("Điều kiện đúng");
        }
        //điều kiện sai
        if (2 > 9){
            System.out.println("Đều kiện đúng");
        }

//        Viết chương trình kiểm tra xem hôm nay có phải ngày đi học không
        int day = 4;
        if (day == 4 || day == 8){
            System.out.println("Hôm nay đi học");
        }

        //câu lệnh if ... else
        //if(điều kiện){thực hiện logic1} else{thực hiện logic2}

        int a = 8;
        int b = 10;
        if(a > b){
            System.out.println("Số a > số b");
        }else {
            System.out.println("Số b > số a");
        }

        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập số tuổi:");
//        int age = scanner.nextInt();
//        if (age > 18){
//            System.out.println("Bạn đủ tuổi học đại học");
//        }else {
//            System.out.println("Bạn chưa đủ tuổi");
//        }

        //toán tử 3 ngôi -> điều kiện ? thực hiện logic 1 : thực hiện logic 2
//        String result = (age>18) ? "Bạn đủ tuổi học đại học" : "Bạn chưa đủ tuổi";
//        System.out.println(result);

        //if(điều kiện 1){logic1} else if{điều kiện 2){logic2} else {logic3}
        int c = 10;
        if (c==10){
            System.out.println("Số 10");
        } else if (c==11) {
            System.out.println("Số 11");
        } else if (c==12) {
            System.out.println("Số 12");
        }else {
            System.out.println("Vui lòng nhập lại số");
        }

        //Bai tap
//        System.out.println("Nhập điểm toán:");
//        float toan = scanner.nextFloat();
//        System.out.println("Nhập điểm lý:");
//        float ly = scanner.nextFloat();
//        System.out.println("Nhập điểm hóa");
//        float hoa = scanner.nextFloat();
//
//        float diemTB = (toan+ly+hoa) / 3;
//        System.out.println("Điểm trung bình:" + diemTB);
//
//        if (0 < diemTB && diemTB < 5){
//            System.out.println("Học sinh yếu");
//        } else if (diemTB >= 5.1 && diemTB <= 6) {
//            System.out.println("Học sinh TB");
//        } else if (diemTB >= 6.1 && diemTB <= 7) {
//            System.out.println("Học sinh khá");
//        } else if (diemTB > 7.1 && diemTB <= 8) {
//            System.out.println("học sinh giỏi");
//        } else if (diemTB > 8.1 && diemTB <= 10) {
//            System.out.println("Học sinh xuất sắc");
//        }else {
//            System.out.println("Nhập lại điểm số");
//        }
        //Bai tap2
//        System.out.println("Hãy nhập tên của bạn:");
//        String name = scanner.nextLine();
//        System.out.println("Nhập số kW bạn đã tiêu thụ:");
//        int kW = scanner.nextInt();
//        int payCheck = 0;
//        System.out.println("Xin chào ".concat(name) + "," + "Bạn đã tiêu thụ: " + kW + " kW");
//        if (kW>0 && kW<=50){
//            payCheck = kW * 500;
//        } else if (kW > 50 && kW <= 100) {
//            payCheck = 50 * 500 + (kW - 50) * 650;
//        } else if (kW > 100 && kW <= 200) {
//            payCheck = 50 * 500 + 50 * 650 + (kW - 100) * 850;
//        } else if (kW > 200 && kW <= 350) {
//            payCheck = 50 * 500 + 50 * 650 + 100 * 850 + (kW - 200) * 1100;
//        }else if (kW > 350){
//            payCheck = 50 * 500 + 50 * 650 + 100 * 850 + 150 * 1100 + (kW - 350) * 1300;
//        }else {
//            System.out.println("Vui lòng nhập lại");
//        }
//        System.out.println("Số tiền bạn phải trả là: " + payCheck + "đ");
        //switch case
//        switch (giá trị đem đi so sánh){
//            case giá trị so sánh
//                    thực hiện logic
//                break
//        }
        int d = 15;
        switch (d){
            case 5:
                System.out.println("Số 5");
                break;
            case 10:
                System.out.println("Số 10");
                break;
            default:
                System.out.println("vui lòng kiểm tra lại");
        }

        //lưu ý: lưu ý: nên switch case - so sánh là giá trị cụ thể, điều kiện đơn giản (==)
    }
}
