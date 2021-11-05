import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GioHang {
    public String thoigianTao;
    public String trangThai;
    public ArrayList<SanPham> arrayListSanPham;
    SanPham sanPham;

    public GioHang(String thoigianTao, String trangThai) {
        this.thoigianTao = thoigianTao;
        this.trangThai = trangThai;
        this.arrayListSanPham = new ArrayList<>();
    }

    public void addSanPham(SanPham sanPham){
        this.arrayListSanPham.add(sanPham);
    }

    public void showSanPham(){
        for (int i = 0; i < arrayListSanPham.size(); i++) {
            System.out.println(arrayListSanPham.get(i));
        }
    }

    public void outPut() {
        System.out.println("---Thong tin gio hang:---" +
                "\n" + "Thoi gian tao: " + thoigianTao +
                "\n" + "Trang thai :" + trangThai);
        showSanPham();
    }

    public void deleteSp( int maSp){
        Iterator<SanPham> sanPhamIterator = arrayListSanPham.iterator();
        while (sanPhamIterator.hasNext()){
            SanPham sanPham = sanPhamIterator.next();
            if(sanPham.getMaSanPham() == maSp){
                sanPhamIterator.remove();
                break;
            }
        }
    }

    public int getSizeSanPham(){
        return arrayListSanPham.size();
    }

    public String getThoigianTao() {
        return thoigianTao;
    }

    public void setThoigianTao(String thoigianTao) {
        this.thoigianTao = thoigianTao;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public ArrayList<SanPham> getArrayListSanPham() {
        return arrayListSanPham;
    }

    public void setArrayListSanPham(ArrayList<SanPham> arrayListSanPham) {
        this.arrayListSanPham = arrayListSanPham;
    }

}
