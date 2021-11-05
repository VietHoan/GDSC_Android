import java.util.ArrayList;

public class SanPham {
    public int maSanPham;
    public String loaiSanPham;
    public String tenSanPham;
    public String mota;
    public int giatien;
    public int size;

    public SanPham(int maSanPham, String loaiSanPham, String tenSanPham, String mota, int giatien, int size) {
        this.maSanPham = maSanPham;
        this.loaiSanPham = loaiSanPham;
        this.tenSanPham = tenSanPham;
        this.mota = mota;
        this.giatien = giatien;
        this.size = size;
    }

    public SanPham() {
    }

    public int getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(int maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getLoaiSanPham() {
        return loaiSanPham;
    }

    public void setLoaiSanPham(String loaiSanPham) {
        this.loaiSanPham = loaiSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public int getGiatien() {
        return giatien;
    }

    public void setGiatien(int giatien) {
        this.giatien = giatien;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
