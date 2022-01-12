package oo;

public class Account {
// Data    
    int account_number = 12975;
    int account_balance = 50000;
        
// Function
    void show(){
    System.out.println("Thông Tin Tài Khoản: ");
    System.out.println("Account Number: " +account_number);
    System.out.println("Account Balance: " +account_balance);
    }

    void deposite (int depositeAmount){
        account_balance +=depositeAmount;
    }

    void withdraw (int withdrawAmount){
        account_balance -=withdrawAmount;
    }
}
