package structured;

import java.util.Scanner;

public class bankstructure {
    static int account_number = 193478;
    static int account_balance = 0;

    public static void main(String[] args) {
        
        Scanner nhapvao = new Scanner(System.in);

// tien gui
        System.out.println("Nhập tiền cần gửi: ");
        int soTien =  nhapvao.nextInt();
        account_balance += soTien;
        show();
        
        void show{
            System.out.println("Thông Tin Tài Khoản: ");
            System.out.println("Account Number: " +account_number);
            System.out.println("Account Balance: " +account_balance);
    }
}