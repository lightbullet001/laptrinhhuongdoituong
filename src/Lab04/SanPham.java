package Lab04;

public class SanPham{
    private String tenSP;
    private double donGia;
    private double giamGia;

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia() {
        this.donGia = donGia;
    }

    public double getGiamGia() {
        return giamGia;
    }

    public void setGiamGia() {
        this.giamGia = giamGia;
    }

    public SanPham(String tenSP, double donGia, double giamGia) {
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    private double getThueNhapKhau() {
        return donGia * 0.1;
    }

    public void xuat() {
        System.out.println("Ten San Pham: " +tenSP);
        System.out.println("Don Gia: " +donGia);
        System.out.println("Giam Gia: " +giamGia);
        System.out.println("Thue Nhap Khau: " +getThueNhapKhau());
    }
}