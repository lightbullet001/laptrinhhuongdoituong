package oo;

import java.utill.Scanner

public class CustomerTestDrive{
    public static void main(String[] args) {
        Customer customer;
        customer = new Customer();

        Scanner input = new Scanner(System.in);
        
        System.out.println("Nhập tên khách: ");
        String x = input.nextLine();
        customer.nhapten(x);
        
        System.out.println("Nhap dia chi: ");
        String y = input.nextLine();
        customer.nhapdiachi(y);
        
        customer.show();
    }
}