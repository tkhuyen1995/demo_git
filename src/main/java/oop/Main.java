package oop;

public class Main {
    public static void main(String[] args) {
        //tạo ra một đối tượng là User
        User user = new User("Thành",18,"1234123412");
        user.displayInfo();
        user.setName("Giang");
        user.setAge(27);
        user.displayInfo();
        user.welcomeMessage();

        //tạo ra một đối tuượng admin
        Admin admin = new Admin("An",20,"123123123","admin");
        admin.displayAdminInfo();

        Guest guest = new Guest("Tuyến",18,"123412123","tuyen@gmail.com");
        guest.displayInfo();
        guest.welcomeMessage();

        BaseUser user1 = new NormalUser("Linh",18);
        user1.showMessage();
    }
}
