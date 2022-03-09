package oo;

import java.security.PublicKey;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class HangThucPham{
    private int maHang;
    private String tenHang;
    private Date NSX;
    private Date HSD;
    private double donGia;

    //public String getMaHang() {
    //   return maHang;
    //}

    public void setMaHang(int maHang) {
        if(maHang != ""){
            this.maHang = maHang;
        }else{
            System.out.println("Vui Long Nhap lai !!!");
        }
    }

    //public double getDonGia() {
    //    return donGia;
    //}

    public void setDonGia(Double donGia) {
        if(donGia > 0){
            this.donGia = donGia;
        }
    }

    //public double getTenHang() {
    //    return tenHang;
    //}

    public void setTenHang() {
        if(tenHang != ""){
            this.tenHang = tenHang;
        }else{
            System.out.println("Vui Long Nhap Lai !!!");
        }
    }

    //public void getNSX(){
    //    return NSX;
    //}

    public void setNSX(Date NSX){
        if(NSX != ""){
            this.NSX = NSX;
        }else{
            System.out.println("Vui Long Chon Lai ");
        }
    }

    //public void getHSD(){
    //   return HSD;
    //}

    public void setHSD(Date HSD){
        if(this.HSD.after(this.NSX)){
            this.HSD = HSD;
        }
    }

    public HangThucPham(int maHang, String tenHang, String NSX, String HSD, int donGia){
        this.maHang;
        this.tenHang;
        this.NSX;
        this.HSD;
        this.donGia;
        
    }

    boolean kiemTraHetHan(){
        boolean isHetHan = false;
        Date hienTai = new Date();
        if(this.NSX.before(hienTai)){
            isHetHan = true;
        }else{
            isHetHan = false;
        }
        return isHetHan;
    }
    
    public String toString(){
        String str = "Ma Hang" +this.maHang + "Ten Hang" +this.tenHang;
        SimpleDateFormat ngayViet = new SimpleDateFormat("dd/mm/yyyy");
        str +=
    }
}