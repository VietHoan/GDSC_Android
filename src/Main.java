import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<KhachHang> quanLyKhachHangArrayList = new ArrayList<>();
        ArrayList<SanPham> sanPhamArrayList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        SanPham ao = new Ao(1,"Ao 1","Tee-1","Coc tay",150,3,"nho","dai");
        SanPham ao2 = new Ao(2,"Ao 2","Tee-2","Coc tay",100,3,"nho","dai");
        SanPham ao3 = new Ao(3,"Ao 3","Tee-3","Coc tay",50,3,"nho","dai");
        SanPham ao4 = new Ao(4,"Ao 4","Tee-4","Coc tay",10,3,"nho","dai");
        SanPham quan = new Quan(10,"Quan ","Tee-10","Coc tay",200,3,"nho",80);
        SanPham quan2 = new Quan(11,"Quan 2","Tee-11","Coc tay",600,3,"nho",90);
        SanPham quan3 = new Quan(12,"Quan 3","Tee-12","Coc tay",50,3,"nho",60);

        sanPhamArrayList.add(ao);
        sanPhamArrayList.add(ao2);
        sanPhamArrayList.add(ao3);
        sanPhamArrayList.add(ao4);
        sanPhamArrayList.add(quan);
        sanPhamArrayList.add(quan2);
        sanPhamArrayList.add(quan3);

        int choose;
        do{
            menuQuanLy();
            System.out.println("Choose");
            choose = Integer.parseInt(sc.nextLine());
            switch (choose){
                case 1:
                    KhachHang khachHang = new KhachHang();
                    GioHang gioHang = new GioHang("Hom nay","Chua thanh toan");
                    khachHang.nhapKhachHang();
                    int chooseKhachHang;
                    do {
                        menuKhachHang();
                        chooseKhachHang = Integer.parseInt(sc.nextLine());
                        switch (chooseKhachHang){
                            case 1:
                                showAllSanPham(sanPhamArrayList);
                                break;
                            case 2:
                                System.out.println("Nhap mã sản phẩm: ");
                                int chooseMaSanPham = Integer.parseInt(sc.nextLine());
                                for (int i = 0; i < sanPhamArrayList.size(); i++) {
                                    if(sanPhamArrayList.get(i).getMaSanPham() == chooseMaSanPham){
                                        gioHang.addSanPham(sanPhamArrayList.get(i));
                                        System.out.println("Add sản phẩm thành công");
                                        break;
                                    }
                                }
                                break;
                            case 3:
                                int maSpXoa;
                                System.out.println("Nhap ma sv can xoa: ");
                                maSpXoa = Integer.parseInt(sc.nextLine());
                                gioHang.deleteSp(maSpXoa);
                                break;
                            case 4:
                                gioHang.showSanPham();
                                System.out.println("Gia tien: " + gioHang.checkTien());
                                break;
                            case 5:
                                khachHang.addGioHang(gioHang);
                                khachHang.showKhachHangvaGioHang();
                                System.out.println("-------------");
                                System.out.println(quanLyKhachHangArrayList.size());
                                quanLyKhachHangArrayList.add(khachHang);
                                System.out.println("---------------");
                                System.out.println(quanLyKhachHangArrayList.size());
                                break;
                            default:
                                System.out.println("Chon sai roi!!");
                                break;
                        }
                    }while (!(chooseKhachHang == 5));
                    break;
                case 2:
                    System.out.println("Nhập tên khách hàng cần tìm: ");
                    String tenKHcantim = sc.nextLine();
                    for (int i = 0; i < quanLyKhachHangArrayList.size(); i++) {
                        if (quanLyKhachHangArrayList.get(i).getHoTen().equals(tenKHcantim)){
                            quanLyKhachHangArrayList.get(i).showKhachHangvaGioHang();
                            break;
                        }
                    }
                    break;
                case 3:
                    System.out.println("Tất cả thông tin của các khách hang: ");
                    Iterator<KhachHang> khachHangIterator = quanLyKhachHangArrayList.iterator();
                    while (khachHangIterator.hasNext()){
                        KhachHang khachHang1 = khachHangIterator.next();
                        khachHang1.showKhachHangvaGioHang();
                    }
                    break;
                case 4:
                    System.out.println("Nhập tên khách hàng cần xem giỏ hàng: ");
                    String gioHangcanxem = sc.nextLine();
                    for (int i = 0; i < quanLyKhachHangArrayList.size(); i++) {
                        if (quanLyKhachHangArrayList.get(i).getHoTen().equals(gioHangcanxem)){
                            quanLyKhachHangArrayList.get(i).showGioHang();
                        }
                    }
                case 5:
                    break;
                default:
                    System.out.println("Chọn sai rồi, mời chọn lại");
            }

        }while (!(choose ==5));

    }
    static void menuQuanLy(){
        System.out.println("\n1. Nhập thông tin khách hàng");
        System.out.println("2. Tìm kiếm khách hàng");
        System.out.println("3. Xem thông tin khách hàng");
        System.out.println("4. Xem giỏ hàng của khách hàng");
        System.out.println("5. Kết thúc");
    }

    static void menuKhachHang(){
        System.out.println("\n1. Xem tất cả sản phẩm");
        System.out.println("2. Nhập sản phẩm bạn muốn thêm vào giỏ hàng");
        System.out.println("3. Nhập sản phẩm bạn muốn xóa khỏi giỏ hàng");
        System.out.println("4. Xem giỏ hàng của bạn và xem hóa đơn");
        System.out.println("5. Kết thúc và thanh toán hóa đơn");

    }

    static void showAllSanPham(ArrayList<SanPham> sanPhamArrayList){
        for (int i = 0; i <sanPhamArrayList.size(); i++) {
            System.out.println(sanPhamArrayList.get(i));
        }
    }
}
