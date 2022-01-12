package oo;

import java.util.Scanner;

public class Customer{
// data
String name;
int address;

//funtion

void show(){
    System.out.println("Tên Khách Hàng: " +name);
    System.out.println("Địa Chỉ Khách Hàng: " +address);
}

void nhapten(String nhaptenkhach){
    name = nhaptenkhach;
}

void nhapdiachi(int nhapdiachikhach){
    address = nhapdiachikhach;
}

}