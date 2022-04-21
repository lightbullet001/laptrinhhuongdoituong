package kiemtracuoiki;


public class HangDienMay extends HangHoa {
    
    private double congsuat;
    private double baohanh;
    
    public HangDienMay(String mahang, String tenhanghoa, double soluong, double dongia, double congsuat, double baohanh) {
        super(mahang, tenhanghoa, soluong, dongia);
        this.congsuat = congsuat;
        this.baohanh = baohanh;
    }

    public double getCongsuat() {
        return congsuat;
    }

    public void setCongsuat(double congsuat) {
        this.congsuat = congsuat;
    }

    public double getBaohanh() {
        return baohanh;
    }

    public void setBaohanh(double baohanh) {
        this.baohanh = baohanh;
    }

    @Override
    public String toString() {
        return "HangDienMay [baohanh=" + baohanh + ", congsuat=" + congsuat + "]" +super.toString();
    }

    

}