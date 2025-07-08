package oop.BaiTap;

public class NhanVienVanPhong extends NhanVien {
    //thuoc tinh

    //constructor
    public NhanVienVanPhong(String name, int id, double soGioLamViec){
        super(name, id, soGioLamViec);
    }

    @Override
    public double tinhTongLuong() {
        return getSoGioLamViec() * 5000;
    }
}
