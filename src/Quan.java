public class Quan extends SanPham{
    public String daiTay;
    public int vongNguc;

    public Quan(int maSanPham, String loaiSanPham, String tenSanPham, String mota, int giatien, int size, String daiTay, int vongNguc) {
        super(maSanPham, loaiSanPham, tenSanPham, mota, giatien, size);
        this.daiTay = daiTay;
        this.vongNguc = vongNguc;
    }

    public Quan(String daiTay, int vongNguc) {
        this.daiTay = daiTay;
        this.vongNguc = vongNguc;
    }

    public String getDaiTay() {
        return daiTay;
    }

    public void setDaiTay(String daiTay) {
        this.daiTay = daiTay;
    }

    public int getVongNguc() {
        return vongNguc;
    }

    public void setVongNguc(int vongNguc) {
        this.vongNguc = vongNguc;
    }
    @Override
    public String toString() {
        return "Ma San Pham: " + maSanPham +
                ", Loai San Pham: " + loaiSanPham +
                ", Ten San Pham: " + tenSanPham +
                ", Mo Ta: " + mota +
                ", Gia Tien:" + giatien +
                ", Size: " + size +
                ", Dai tay: " + daiTay +
                ", Vong nguc: " + vongNguc;
    }
}
