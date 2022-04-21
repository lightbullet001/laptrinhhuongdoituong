package kiemtracuoiki;

import java.util.Date;

public class HangSanhSu extends HangHoa{
    private Date ngayNhapKho;
    private String nhasanxuat;

    public HangSanhSu(String mahang, String tenhanghoa, double soluong, double dongia, Date ngayNhapKho,
            String nhasanxuat) {
        super(mahang, tenhanghoa, soluong, dongia);
        this.ngayNhapKho = ngayNhapKho;
        this.nhasanxuat = nhasanxuat;
    }





    public Date getNgayNhapKho() {
        return ngayNhapKho;
    }

    public void setNgayNhapKho(Date ngayNhapKho) {
        this.ngayNhapKho = ngayNhapKho;
    }

    

    public String getNhasanxuat() {
        return nhasanxuat;
    }





    public void setNhasanxuat(String nhasanxuat) {
        this.nhasanxuat = nhasanxuat;
    }





    @Override
    public String toString() {
        return "HangSanhSu [ngayNhapKho=" + ngayNhapKho + ", nhasanxuat=" + nhasanxuat + "]" + super.toString();
    }

    
}