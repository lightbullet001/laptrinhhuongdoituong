package oo;

public class HinhChuNhat{
    private int chieudai;
    private int chieurong;

    public int getChieuDai() {
        return chieudai;
    }

    public void setChieuDai() {
        this.chieudai = chieudai;
    }

    public int getChieuRong() {
        return chieurong;
    }

    public void setChieuRong() {
        this.chieurong = chieurong;
    }

    public int ChuVi(){
        int chuvi = (chieudai + chieurong)*2;
    }

    public int DienTich() {
        int dientich = chieudai *chieurong;
    }
    public void xuat() {
        System.out.println("Chieu Dai:" +chieudai);
        System.out.println("Chieu Rong: " +chieurong);
        System.out.println("Chu Vi: " +ChuVi());
        System.out.println("Dien Tich: " +DienTich());
    }
}