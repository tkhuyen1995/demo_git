package org.example;

public class mang {
    public static void main(String[] args) {
//        int num1 = 10;
//        int num2 = 20;
        //khởi tạo giá trị
        int[] numbers = {10,20,30,40};
        String[] name = {"Thành","Tuyến","Giang"};
        System.out.println(name[1]);
        name[2] = "Khải";
        System.out.println(name[2]);

        // độ dài của mảng
        int length = name.length;
        System.out.println("Độ dài của mảng: " + length);

        //duyệt mảng
        for (int i = 0; i < name.length; i++){
            System.out.println("Tên thứ " + (i+1) + ": " + name[i]);
        }

        //duyệt mảng dùng vòng lặp for-each
        for (int number: numbers){
            System.out.println(number);
        }

        //duyệt mảng ngược
        for (int index = numbers.length -1; index >= 0; index-- ){
            System.out.println(numbers[index]);
        }
    }
}
