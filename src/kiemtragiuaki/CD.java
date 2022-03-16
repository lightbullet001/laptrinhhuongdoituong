package kiemtragiuaki;

import java.text.NumberFormat;

public class CD{
    private int iD;
    private String tenCD;
    private String caSi;
    private int soBaiHat;
    private double giaThanh;

    public CD(){

    }

    public CD(int iD, String tenCD, String caSi, int soBaiHat, double giaThanh){
        super();
        this.iD = iD;
        this.tenCD = tenCD;
        this.caSi = caSi;
        this.soBaiHat = soBaiHat;
        this.giaThanh = giaThanh;
    }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public String getTenCD() {
        return tenCD;
    }

    public void setTenCD(String tenCD) {
        this.tenCD = tenCD;
    }

    public String getCaSi() {
        return caSi;
    }

    public void setCaSi(String caSi) {
        this.caSi = caSi;
    }

    public int getSoBaiHat() {
        return soBaiHat;
    }

    public void setSoBaiHat(int soBaiHat) {
        this.soBaiHat = soBaiHat;
    }

    public double getGiaThanh() {
        return giaThanh;
    }

    public void setGiaThanh(double giaThanh) {
        this.giaThanh = giaThanh;
    }

    @Override
    public String toString(){
        return "CD {" + "ID=" +iD + ", TenCD= " +tenCD + ", CaSi= " +caSi + ", SoBaiHat= " +soBaiHat +   ", GiaThanh= " +giaThanh + "} ";
    }
}