package buoi9;

public class Cho extends DongVat{
// 1.Tự động thừa hưởng của cha(DongVat)
// 2.bổ sung thêm đặc trưng như thuộc tính, phương thức
    public void duoiMeo(){
        System.out.println("Đuôi Mèo....");
    }
// 3.Thừa kế ghi đè
@Override
    public void keu(){
        System.out.println("Cho Keu....");
    }

@Override
    public void an(){
        System.out.println("Cho an com, xuong....");
    }
}