package oo;

public class SinhVien{
// thuộc tính
String ten = "Khoa";
int mssv = 012345;
int lop;
String khoa = "CNTT";
String nganh = "MMT";

//phương thức
void show(){
    System.out.println("Thông Tin Sinh Viên:");
    System.out.println("Tên Sinh Viên: " +ten);
    System.out.println("Mã Sinh Viên: " +mssv);
    System.out.println("Khoa Đang Học: " +khoa);
    System.out.println("Ngành Học:" +nganh);
}

void thi(){
    System.out.println("Đăng Kí Môn Thi: LTHĐT");
}

void hoatdong(){
    System.out.println("Tham Gia Hoạt Động: Sinh Viên GDU");
}

void hoc(){
    System.out.println("Đăng Kí Học: LTHĐT");
}

}