
import java.util.Scanner;

public class Chuong3_Bai1 {
    public static void main(String[] args) {
        double sogio,sotien,tienluong;
        while(true){
            System.out.print("Nhap vao so gio lam viec: ");
            sogio= new Scanner(System.in).nextDouble();
            if (sogio<=40){
                break;
            }
            else{
                System.out.println("So gio lam viec vuot qua 40h/tuan");
            }
        }
        while(true){
            System.out.print("Nhap vao so tien tra cho nhan vien moi gio: ");
            sotien= new Scanner(System.in).nextDouble();
            if(sotien>=25000){
               break;
            }
            else{
                System.out.println("Muc luong duoc tra thap hon muc toi thieu 25k/h");
            }
        }
        tienluong=sogio*sotien;
        System.out.println("So tien phai tra cho nhan vien la: "+tienluong);
            
    }
    
}

    

