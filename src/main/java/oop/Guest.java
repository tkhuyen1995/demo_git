package oop;

import java.security.SecureRandom;

// tính đa hình: khả năng của một đối tượng có nhiều hình thái - cùng một phương thức nhưng có nhiều xử lý khác nhau
public class Guest extends User {
    private String email;
    public Guest(String name, int age, String soDT, String email){
        super(name, age, soDT);
        this.email = email;
    }

    @Override
    public void displayInfo(){
        System.out.println("Email: "+email);
    }

    @Override
    public void welcomeMessage(){
        System.out.println("Welcome Guest " +getName()+" limit feature access");
    }
}
