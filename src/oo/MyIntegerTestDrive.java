package oo;

public class MyIntegerTestDrive{
    public static void main(String[] args) {
        MyInteger myInteger;
        myInteger = new MyInteger(5);

        myInteger.increament();

        MyInteger myInteger2;
        myInteger2 = new MyInteger(3);


        System.out.println(myInteger.greaterThan(myInteger2));
        System.out.println(myInteger.lessThan(myInteger2));
    }
}