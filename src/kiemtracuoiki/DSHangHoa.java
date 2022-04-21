package kiemtracuoiki;

import java.util.List;
import java.util.ArrayList;
public class DSHangHoa{
    private List<HangHoa> danhSach = new ArrayList<>();

    //Co so dl co san

    public static ArrayList<HangHoa> danhSachHangHoa(){
        ArrayList<HangHoa> dsHangHoa = new ArrayList<HangHoa>();
        dsHangHoa.add(new HangHoa("VN01", "Trung Ga", 50, 12000));
        dsHangHoa.add(new HangHoa("VN02", "Ca rot", 40, 10000));
        dsHangHoa.add(new HangHoa("VN03", "khoai lang", 50, 9000));
        dsHangHoa.add(new HangHoa("VN04", "Tu lanh Sharp", 20, 15000000));
        dsHangHoa.add(new HangHoa("VN05", "May giat Panasonic", 25, 6000000));
        dsHangHoa.add(new HangHoa("VN06", "May lanh Samsung", 40, 18000000));
        dsHangHoa.add(new HangHoa("VN07", "Chen sanh", 100, 12000));
        dsHangHoa.add(new HangHoa("VN08", "Muong su", 60, 15000));
        dsHangHoa.add(new HangHoa("VN09", "Dia su", 100, 8000));
        dsHangHoa.add(new HangHoa("VN10", "Binh sanh", 45, 18000));
        return dsHangHoa;
    }

    public void them(HangHoa hangHoa){
        danhSach.add(hangHoa);
    }

    public void inDanhSach(){
        for (HangHoa hangHoa:danhSach){
            System.out.println(hangHoa);
        }
    }

    public void xoa(HangHoa hangHoa){
        danhSach.remove(hangHoa);
    }

    public void suaHangHoa(int ViTri, HangHoa hangHoa){
        danhSach.set(ViTri, hangHoa);
    }

    public HangHoa timKiemHangHoaTheoMa(String maHang){
        
        HangHoa hangHoa = null;

        for (HangHoa h : danhSach) {
            if(h.getMahang().equals(maHang)){
                hangHoa = h;
            }
        }

        return hangHoa;

    }

}   