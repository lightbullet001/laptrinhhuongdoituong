package kiemtracuoiki;

import java.util.Date;

public class HangThucPham extends HangHoa {
    
    private Date NSX;
    private Date HSD;
    
    public HangThucPham(String mahang, String tenhanghoa, double soluong, double dongia, Date nSX, Date hSD) {
        super(mahang, tenhanghoa, soluong, dongia);
        NSX = nSX;
        HSD = hSD;
    }

    public Date getNSX() {
        return NSX;
    }

    public void setNSX(Date nSX) {
        NSX = nSX;
    }

    public Date getHSD() {
        return HSD;
    }

    public void setHSD(Date hSD) {
        HSD = hSD;
    }

    @Override
    public String toString() {
        return "HangThucPham [HSD=" + HSD + ", NSX=" + NSX + "]" + super.toString();
    }

    
}