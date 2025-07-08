package oop;

//tính kế thừa, để admin kế thừa lại user
public class Admin extends User{
    private String role;

    //constructor để khởi tạo
    public Admin(String name, int age, String soDT, String role){
        super(name,age,soDT);//gọi lại constructor của lớp cha (user)
        this.role=role;
    }
    //tạo phương thức để lấy giá trị
    public String getRole() {
        return role;
    }
    //tạo phương thức update giá trị
    public void setRole(String role) {
        this.role = role;
    }

    public void displayAdminInfo(){
        displayInfo();
        System.out.println("Role: " + role);
    }
}
