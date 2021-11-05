public class Ao extends SanPham{
    public String rongTui;
    public String daiQuan;

    public Ao(int maSanPham, String loaiSanPham, String tenSanPham, String mota, int giatien, int size, String rongTui, String daiQuan) {
        super(maSanPham, loaiSanPham, tenSanPham, mota, giatien, size);
        this.rongTui = rongTui;
        this.daiQuan = daiQuan;
    }

    public Ao(String rongTui, String daiQuan) {
        this.rongTui = rongTui;
        this.daiQuan = daiQuan;
    }

    public String getRongTui() {
        return rongTui;
    }

    public void setRongTui(String rongTui) {
        this.rongTui = rongTui;
    }

    public String getDaiQuan() {
        return daiQuan;
    }

    public void setDaiQuan(String daiQuan) {
        this.daiQuan = daiQuan;
    }

    @Override
    public String toString() {
        return "Ma San Pham: " + maSanPham +
                ", Loai San Pham: " + loaiSanPham +
                ", Ten San Pham: " + tenSanPham +
                ", Mo Ta: " + mota +
                ", Gia Tien:" + giatien +
                ", Size: " + size +
                ", Rong Tui: " + rongTui +
                ", Dai Quan: " + daiQuan;
    }
}
