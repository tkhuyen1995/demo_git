package oop.BaiTap2;

public class TaiKhoanTietKiem extends TaiKhoan{
    //thuộc tính
    private double laiSuat;

    //constructor
    public TaiKhoanTietKiem(String soTaiKhoan, String chuTaiKhoan, double soDu, double laiSuat){
        super(soTaiKhoan, chuTaiKhoan, soDu);
        this.laiSuat=laiSuat;
    }

    //phương thức

    @Override
    public double tinhLai() {
        return getSoDu() * laiSuat;
    }
}
