package oop;
//tính trừu tượng là định nghĩa 1 hành vi trong lớp đối tượng chưa hoàn chỉnh
public abstract class BaseUser {
    private String name;
    private int age;

    public BaseUser(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    //định nghĩa ra những phuương thức trừu tượng
    //(không có nội dung, yêu cầu lớp định nghĩa

    public abstract void showMessage();
}
