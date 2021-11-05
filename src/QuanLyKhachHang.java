import java.util.ArrayList;
import java.util.List;

public class QuanLyKhachHang {
    public ArrayList<KhachHang> khachHangList;

    public QuanLyKhachHang(ArrayList<KhachHang> khachHangList) {
        this.khachHangList = khachHangList;
    }

    public QuanLyKhachHang(){
        this.khachHangList = new ArrayList<>();
    }

    public void addKhachHang(KhachHang khachHang){
        this.khachHangList.add(khachHang);
    }

    @Override
    public String toString() {
        return "Thong tin khach hang" + khachHangList;
    }
}
