package kiemtracuoiki;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class HangHoaTestDrive{
    public static void main(String[] args) throws ParseException {
        DSHangHoa dsHangHoa = new DSHangHoa();
        SimpleDateFormat ngay = new SimpleDateFormat("dd/MM/yyyy");
		

        dsHangHoa.danhSachHangHoa();
        Scanner sc = new Scanner(System.in);

        int suluachon;
        do {
            System.out.println("------------MENU CHUC NANG-------------");
            System.out.println("=1=======Them Hang Hoa==========");
            System.out.println("=2======Xoa Hang Hoa==========");
            System.out.println("=3======Sua Hang Hoa==========");
            System.out.println("=4=======Tim Kiem Hang Hoa===========");
            System.out.println("=5======In Danh Sach==========");
            System.out.println("==============Thoát=============");
            System.out.print("Nhap Lua Chon: ");
            suluachon = sc.nextInt();
            switch (suluachon) {
                case 1:
                String nhapTiep = null;
                do {
                    System.out.print("Nhap ma hang: ");
                    String mahang = sc.nextLine();
                    System.out.print("Nhap ten hang hoa: ");
                    String tenhanghoa = sc.nextLine();
                    System.out.print("Nhap so luong: ");
                    Double soluong = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Nhap don gia: ");
                    double dongia = sc.nextDouble();
                    System.out.print("Nhap loai hang(1 - Thuc Pham , 2 - Sanh Su , 3 - Dien May ): ");
                    int loai = sc.nextInt();
                    sc.nextLine();
        
                    if (loai == 1) {
                        System.out.print("Nhap ngay san xuat");
                        Date nSX = ngay.parse(sc.nextLine());
                        System.out.print("Nhap han su dung");
                        Date hSD = ngay.parse(sc.nextLine());
                        HangThucPham hangTP = new HangThucPham(mahang, tenhanghoa, soluong, dongia, nSX, hSD);
                        dsHangHoa.them(hangTP);
                        dsHangHoa.inDanhSach();
                    }else{
                        if (loai == 2) {
                            System.out.println("Nhap ngay nhap kho: ");
                            Date ngayNhapKho = ngay.parse(sc.nextLine());
                            System.out.println("Nhap nha san xuat: ");
                            String nhaSX = sc.nextLine();
                            HangSanhSu hangSanhSu = new HangSanhSu(mahang, tenhanghoa, soluong, dongia, ngayNhapKho, nhaSX);
                            dsHangHoa.them(hangSanhSu);
                            dsHangHoa.inDanhSach();
                        }else{
                            if (loai == 3){
                                System.out.println("Nhap cong suat: ");
                                Double congsuat = sc.nextDouble();
                                System.out.println("Nhap Bao hanh: ");
                                int baohanh = sc.nextInt();
                                sc.nextLine();
                                HangDienMay hangDienMay = new HangDienMay(mahang, tenhanghoa, soluong, dongia, congsuat, baohanh);
                                dsHangHoa.them(hangDienMay);
                                dsHangHoa.inDanhSach();
                            }
                        }
                    }
                    System.out.print("Ban co muon nhap nua khong Y/N>>");
                    
                    nhapTiep = sc.nextLine();
                } while (nhapTiep.equals("Y"));
                break;
            case 2:
                System.out.println("Hang Hoa Can Xoa: ");
                String hangCanXoa = sc.nextLine();
                HangHoa xoa = dsHangHoa.timKiemHangHoaTheoMa(hangCanXoa);
                dsHangHoa.xoa(xoa);
                dsHangHoa.inDanhSach();
                    break;
            
            case 3:
            System.out.println("Hang Hoa Can Sua: ");
            String hangCanSua = sc.nextLine();
            HangHoa sua = dsHangHoa.timKiemHangHoaTheoMa(hangCanSua);
            dsHangHoa.xoa(sua);
            dsHangHoa.inDanhSach();
            
                    System.out.print("Nhap ma hang: ");
                    String mahang = sc.nextLine();
                    System.out.print("Nhap ten hang hoa: ");
                    String tenhanghoa = sc.nextLine();
                    System.out.print("Nhap so luong: ");
                    Double soluong = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Nhap don gia: ");
                    double dongia = sc.nextDouble();
                    System.out.print("Nhap loai hang(1 - Hang thuc pham, 2 - Hang sanh su, 3 - Hang dien may): ");
                    int loai = sc.nextInt();
                    sc.nextLine();
        
                    if (loai == 1) {
                        System.out.print("Nhap ngay san xuat");
                        Date nSX = ngay.parse(sc.nextLine());
                        System.out.print("Nhap han su dung");
                        Date hSD = ngay.parse(sc.nextLine());
                        HangThucPham hangTP = new HangThucPham(mahang, tenhanghoa, soluong, dongia, nSX, hSD);
                        dsHangHoa.them(hangTP);
                        dsHangHoa.inDanhSach();
                    }else{
                        if (loai == 2) {
                            System.out.println("Nhap ngay nhap kho: ");
                            Date ngayNhapKho = ngay.parse(sc.nextLine());
                            System.out.println("Nhap nha san xuat: ");
                            String nhaSX = sc.nextLine();
                            HangSanhSu hangSanhSu = new HangSanhSu(mahang, tenhanghoa, soluong, dongia, ngayNhapKho, nhaSX);
                            dsHangHoa.them(hangSanhSu);
                            dsHangHoa.inDanhSach();
                        }else{
                            if (loai == 3){
                                System.out.println("Nhap cong suat: ");
                                Double congsuat = sc.nextDouble();
                                System.out.println("Nhap Bao hanh: ");
                                int baohanh = sc.nextInt();
                                sc.nextLine();
                                HangDienMay hangDienMay = new HangDienMay(mahang, tenhanghoa, soluong, dongia, congsuat, baohanh);
                                dsHangHoa.them(hangDienMay);
                                dsHangHoa.inDanhSach();
                            }
                        }
                    }
                        break;
            
            case 4:
            System.out.println("Ma Hang Hoa Can Tra Cuu: ");
            String maHang = sc.nextLine();
            HangHoa tracuu = dsHangHoa.timKiemHangHoaTheoMa(maHang);
            System.out.println(tracuu);
                    break;
            
            
            case 5:
                dsHangHoa.inDanhSach();

                        break;
            
            
            default:
                System.out.println("Vui Long Chon Lai");

                    break;
            }
            
        } while (suluachon != 0);
    }
}    