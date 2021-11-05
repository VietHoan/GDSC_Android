import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KhachHang {
    public String hoTen;
    public int SDT;
    public String diaChi;
    public String email;
    public ArrayList<GioHang> gioHangList;

    public KhachHang(String hoTen, int SDT, String diaChi, String email){
        this.hoTen = hoTen;
        this.SDT = SDT;
        this.diaChi = diaChi;
        this.email = email;
        this.gioHangList = new ArrayList<>();
    }

    public KhachHang() {
        this.gioHangList = new ArrayList<>();
    }


    public void addGioHang(GioHang gioHang){
        this.gioHangList.add(gioHang);
    }

    public void showGioHang(){
        for (int i = 0; i < gioHangList.size(); i++) {
            gioHangList.get(i).outPut();
        }
    }

    public void showKhachHang() {
        System.out.println("Thong tin khach hang : \t \t" +
                "\nHo ten: " + hoTen +
                "\n" + "SDT" + SDT +
                "\n"+ "Dia chi: " + diaChi +
                "\nEmail: " + email+
                "\nGio Hang bao gom: ");
    }

    public void showKhachHangvaGioHang() {
        System.out.println("\nThong tin khach hang : \t \t" +
                "\nHo ten: " + hoTen +
                "\n" + "SDT" + SDT +
                "\n"+ "Dia chi: " + diaChi +
                "\nEmail: " + email+
                "\nGio Hang bao gom: ");
        showGioHang();
    }

    public void nhapKhachHang(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ten: ");
        this.hoTen = sc.nextLine();
        System.out.println("SDT: ");
        this.SDT = Integer.parseInt(sc.nextLine());
        System.out.println("Dia chi: ");
        this.diaChi = sc.nextLine();
        System.out.println("Email: ");
        this.email = sc.nextLine();
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getSDT() {
        return SDT;
    }

    public void setSDT(int SDT) {
        this.SDT = SDT;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<GioHang> getGioHangList() {
        return gioHangList;
    }

    public void setGioHangList(ArrayList<GioHang> gioHangList) {
        this.gioHangList = gioHangList;
    }

}
