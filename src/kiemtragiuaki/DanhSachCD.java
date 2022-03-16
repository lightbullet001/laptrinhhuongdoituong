package kiemtragiuaki;

import java.util.ArrayList;

public class DanhSachCD{
    private ArrayList<CD> arrCD ;
    
    public DanhSachCD(){
        arrCD = new ArrayList<CD>();
    }
    
    public DanhSachCD(ArrayList<CD> arrCD){
        super();
        this.arrCD = arrCD;
    }

    public void ThemCD(CD cd){
        arrCD.add(cd);
    }

    public int SoLuongCD(){
        return arrCD.size();
    }

    public int TongTien(){
        int tong=0;
        for(int i = 0 ; i < arrCD.size(); i++)
        {
            tong+= arrCD.get(i).getGiaThanh();
        }
        return tong;
    }

    public void ListCD(){
        for(int i = 0 ; i < arrCD.size(); i++)
        {
            System.out.println(arrCD.get(i).toString());
        }
    }
}