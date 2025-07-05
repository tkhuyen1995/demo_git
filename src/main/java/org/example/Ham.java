package org.example;

public class Ham {
    //hàm được định nghĩa ở đây
    //có 2 loại hàm
    //hàm không có giá trị trả về (hàm thực hiện logic)
    //static void tenHam(){}
    static void greeting(){
        System.out.println("Hello World");
    }

    //hàm có giá trị trả về
    //static <kiểu dữ liệu> tenHam(truyền dữ liệu){}
    static double dtb(double diemToan, double diemLy, double diemHoa){
        double dtb = (diemToan+diemLy+diemHoa)/3;
        return dtb;
    }
    public static void main(String[] args) {
        greeting();
        double a = 7;
        double b = 8;
        double c = 9;
        double dtb = dtb(a,b,c);
        System.out.println(dtb);
    }
}
